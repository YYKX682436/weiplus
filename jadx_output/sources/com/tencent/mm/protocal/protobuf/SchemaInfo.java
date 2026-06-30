package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class SchemaInfo extends com.tencent.mm.protobuf.e {
    public SchemaInfo() {
        super(com.tencent.mm.protobuf.i.u(1, "universal_link"), com.tencent.mm.protobuf.i.u(2, "scheme"), com.tencent.mm.protobuf.i.u(3, "appstore_link"), com.tencent.mm.protobuf.i.u(4, "android_universal_link"), com.tencent.mm.protobuf.i.u(5, "android_appstore_scheme"), com.tencent.mm.protobuf.i.u(6, "android_package"), com.tencent.mm.protobuf.i.u(7, "android_app_public_key"), com.tencent.mm.protobuf.i.u(8, "download_app_id"), com.tencent.mm.protobuf.i.i(9, "jump_type"), com.tencent.mm.protobuf.i.u(10, "app_name"), com.tencent.mm.protobuf.i.r(11, "android_app_info", r45.t7.class));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.SchemaInfo create() {
        return new com.tencent.mm.protocal.protobuf.SchemaInfo();
    }

    public final r45.t7 getAndroid_app_info() {
        return (r45.t7) getCustom(10);
    }

    public final java.lang.String getAndroid_app_public_key() {
        return getString(6);
    }

    public final java.lang.String getAndroid_appstore_scheme() {
        return getString(4);
    }

    public final java.lang.String getAndroid_package() {
        return getString(5);
    }

    public final java.lang.String getAndroid_universal_link() {
        return getString(3);
    }

    public final java.lang.String getApp_name() {
        return getString(9);
    }

    public final java.lang.String getAppstore_link() {
        return getString(2);
    }

    public final java.lang.String getDownload_app_id() {
        return getString(7);
    }

    public final int getJump_type() {
        return getInteger(8);
    }

    public final java.lang.String getScheme() {
        return getString(1);
    }

    public final java.lang.String getUniversal_link() {
        return getString(0);
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setAndroid_app_info(r45.t7 t7Var) {
        set(10, t7Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setAndroid_app_public_key(java.lang.String str) {
        set(6, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setAndroid_appstore_scheme(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setAndroid_package(java.lang.String str) {
        set(5, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setAndroid_universal_link(java.lang.String str) {
        set(3, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setApp_name(java.lang.String str) {
        set(9, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setAppstore_link(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setDownload_app_id(java.lang.String str) {
        set(7, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setJump_type(int i17) {
        set(8, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setScheme(java.lang.String str) {
        set(1, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo setUniversal_link(java.lang.String str) {
        set(0, str);
        return this;
    }
}
