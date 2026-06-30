package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class a6 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f172930d;

    public a6() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.c(-1, "is_sys_teen_mode_open"), com.tencent.mm.protobuf.i.c(-1, "is_close_with_sys"), com.tencent.mm.protobuf.i.c(-1, "is_sys_age_change"), com.tencent.mm.protobuf.i.c(-1, "is_only_sys_age_change")});
        this.f172930d = appendAttrs;
        super.set__serialName("teenmode_intro_data");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{bool, java.lang.Boolean.TRUE, bool, bool});
    }

    public boolean j() {
        return super.getBoolean(this.f172930d + 1);
    }

    public boolean k() {
        return super.getBoolean(this.f172930d + 3);
    }

    public boolean l() {
        return super.getBoolean(this.f172930d + 2);
    }

    public boolean n() {
        return super.getBoolean(this.f172930d + 0);
    }

    public void o(boolean z17) {
        super.set(this.f172930d + 1, java.lang.Boolean.valueOf(z17));
    }

    public void p(boolean z17) {
        super.set(this.f172930d + 3, java.lang.Boolean.valueOf(z17));
    }

    public void q(boolean z17) {
        super.set(this.f172930d + 2, java.lang.Boolean.valueOf(z17));
    }

    public void r(boolean z17) {
        super.set(this.f172930d + 0, java.lang.Boolean.valueOf(z17));
    }
}
