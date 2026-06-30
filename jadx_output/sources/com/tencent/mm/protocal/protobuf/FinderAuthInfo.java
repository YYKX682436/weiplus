package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class FinderAuthInfo extends com.tencent.mm.protobuf.e {
    public FinderAuthInfo() {
        super(com.tencent.mm.protobuf.i.u(1, "realName"), com.tencent.mm.protobuf.i.i(2, "authIconType"), com.tencent.mm.protobuf.i.u(3, "authProfession"), com.tencent.mm.protobuf.i.r(4, "authGenerator", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.u(5, "detailLink"), com.tencent.mm.protobuf.i.u(6, "appName"), com.tencent.mm.protobuf.i.u(7, "authIconUrl"), com.tencent.mm.protobuf.i.i(8, "customer_type"), com.tencent.mm.protobuf.i.i(9, "auth_verify_identity"), com.tencent.mm.protobuf.i.i(10, "verify_status"), com.tencent.mm.protobuf.i.u(11, "unauth_profession"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderAuthInfo create() {
        return new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
    }

    public final java.lang.String getAppName() {
        return getString(5);
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact getAuthGenerator() {
        return (com.tencent.mm.protocal.protobuf.FinderContact) getCustom(3);
    }

    public final int getAuthIconType() {
        return getInteger(1);
    }

    public final java.lang.String getAuthIconUrl() {
        return getString(6);
    }

    public final java.lang.String getAuthProfession() {
        return getString(2);
    }

    public final int getAuth_verify_identity() {
        return getInteger(8);
    }

    public final int getCustomer_type() {
        return getInteger(7);
    }

    public final java.lang.String getDetailLink() {
        return getString(4);
    }

    public final java.lang.String getRealName() {
        return getString(0);
    }

    public final java.lang.String getUnauth_profession() {
        return getString(10);
    }

    public final int getVerify_status() {
        return getInteger(9);
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setAppName(java.lang.String str) {
        set(5, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setAuthGenerator(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        set(3, finderContact);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setAuthIconType(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setAuthIconUrl(java.lang.String str) {
        set(6, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setAuthProfession(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setAuth_verify_identity(int i17) {
        set(8, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setCustomer_type(int i17) {
        set(7, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setDetailLink(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setRealName(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setUnauth_profession(java.lang.String str) {
        set(10, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo setVerify_status(int i17) {
        set(9, java.lang.Integer.valueOf(i17));
        return this;
    }
}
