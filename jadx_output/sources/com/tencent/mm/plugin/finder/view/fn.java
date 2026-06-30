package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class fn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f132114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f132115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.lz0 f132116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e1 f132117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f132119i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132120m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(zy2.dc dcVar, android.os.Bundle bundle, r45.lz0 lz0Var, com.tencent.mm.plugin.finder.view.e1 e1Var, com.tencent.mm.plugin.finder.view.e3 e3Var, boolean z17, yz5.l lVar) {
        super(0);
        this.f132114d = dcVar;
        this.f132115e = bundle;
        this.f132116f = lz0Var;
        this.f132117g = e1Var;
        this.f132118h = e3Var;
        this.f132119i = z17;
        this.f132120m = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.cb cbVar;
        r45.cb cbVar2;
        r45.bb bbVar;
        zy2.dc newContact = this.f132114d;
        kotlin.jvm.internal.o.f(newContact, "$newContact");
        android.os.Bundle extra = this.f132115e;
        kotlin.jvm.internal.o.g(extra, "extra");
        ya2.b2 b2Var = (ya2.b2) newContact;
        extra.putString("Avatar", b2Var.getAvatarUrl());
        extra.putString("Nickname", b2Var.z0());
        r45.hz0 hz0Var = b2Var.field_extInfo;
        extra.putInt("Sex", hz0Var != null ? hz0Var.getInteger(3) : 0);
        extra.putLong("contactId", b2Var.systemRowid);
        r45.hz0 hz0Var2 = b2Var.field_extInfo;
        java.lang.String string = hz0Var2 != null ? hz0Var2.getString(1) : null;
        if (string == null) {
            string = "";
        }
        extra.putString("Province", string);
        r45.hz0 hz0Var3 = b2Var.field_extInfo;
        java.lang.String string2 = hz0Var3 != null ? hz0Var3.getString(2) : null;
        if (string2 == null) {
            string2 = "";
        }
        extra.putString("City", string2);
        r45.hz0 hz0Var4 = b2Var.field_extInfo;
        if (hz0Var4 == null) {
            hz0Var4 = new r45.hz0();
        }
        java.lang.String string3 = hz0Var4.getString(0);
        extra.putString("Country", string3 != null ? string3 : "");
        extra.putString("Signature", b2Var.A0());
        r45.mz0 mz0Var = b2Var.field_privacyInfo;
        extra.putInt("isNotRec", (mz0Var == null || (bbVar = (r45.bb) mz0Var.getCustom(1)) == null) ? 0 : bbVar.getInteger(0));
        extra.putInt("isBlackList", b2Var.F0());
        r45.mz0 mz0Var2 = b2Var.field_privacyInfo;
        extra.putInt("isShieldHisLike", (mz0Var2 == null || (cbVar2 = (r45.cb) mz0Var2.getCustom(0)) == null) ? 0 : cbVar2.getInteger(0));
        r45.mz0 mz0Var3 = b2Var.field_privacyInfo;
        extra.putInt("isShieldMyLike", (mz0Var3 == null || (cbVar = (r45.cb) mz0Var3.getCustom(0)) == null) ? 0 : cbVar.getInteger(1));
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        koVar.e(this.f132116f.getString(0), extra);
        this.f132117g.a();
        android.view.View rootView = this.f132118h.f131959f;
        kotlin.jvm.internal.o.f(rootView, "rootView");
        com.tencent.mm.plugin.finder.view.ko.a(koVar, rootView, extra, this.f132119i, this.f132120m);
        return jz5.f0.f302826a;
    }
}
