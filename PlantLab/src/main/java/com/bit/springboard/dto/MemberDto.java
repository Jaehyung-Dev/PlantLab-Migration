package com.bit.springboard.dto;

public class MemberDto {
    private int memId = 2;
    private String loginId;
    private String password;
    private String memName;
    private String memNickname;
    private String memEmail;
    private String address;
    private String picture;
    private int checkCnt;
    private String zipcode;
    private String addr;
    private String addrDetail;

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemNickname() {
        return memNickname;
    }

    public void setMemNickname(String memNickname) {
        this.memNickname = memNickname;
    }

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getCheckCnt() {
        return checkCnt;
    }

    public void setCheckCnt(int checkCnt) {
        this.checkCnt = checkCnt;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "memId=" + memId +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", memName='" + memName + '\'' +
                ", memNickname='" + memNickname + '\'' +
                ", memEmail='" + memEmail + '\'' +
                ", address='" + address + '\'' +
                ", picture='" + picture + '\'' +
                ", checkCnt=" + checkCnt +
                ", zipcode='" + zipcode + '\'' +
                ", addr='" + addr + '\'' +
                ", addrDetail='" + addrDetail + '\'' +
                '}';
    }
}

