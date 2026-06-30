package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class a1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f153382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f153383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153384c;

    public a1(com.tencent.mm.plugin.profile.e0 e0Var, boolean z17, com.tencent.mm.ui.base.preference.r rVar) {
        this.f153384c = e0Var;
        this.f153382a = z17;
        this.f153383b = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        boolean z17 = this.f153382a;
        com.tencent.mm.ui.base.preference.r rVar = this.f153383b;
        com.tencent.mm.plugin.profile.e0 e0Var = this.f153384c;
        if (z17) {
            e0Var.v(rVar, obj);
        }
        e0Var.w(rVar, obj);
    }
}
