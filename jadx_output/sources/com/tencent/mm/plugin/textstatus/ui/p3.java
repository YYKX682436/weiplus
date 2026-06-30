package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f174160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f174161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f174162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var, mj4.h hVar, boolean z17) {
        super(0);
        this.f174160d = q3Var;
        this.f174161e = hVar;
        this.f174162f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f174160d;
        boolean l17 = q3Var.f174189d.l(524288);
        android.content.Context context = q3Var.f174197n;
        cj4.l1 l1Var = q3Var.C;
        mj4.h hVar = this.f174161e;
        if (l17) {
            mj4.h t17 = hVar != null ? ai4.m0.f5173a.G().t(((mj4.k) hVar).l()) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBtnMore: onClick item expired=");
            sb6.append(t17 != null ? java.lang.Boolean.valueOf(((mj4.k) t17).w()) : null);
            com.tencent.mars.xlog.Log.i(q3Var.f174190e, sb6.toString());
            if (t17 == null || !(!((mj4.k) t17).w())) {
                l1Var.h(context, hVar);
            } else {
                l1Var.a(context, hVar);
            }
        } else {
            if (q3Var.f174189d.l(1048576) && this.f174162f) {
                l1Var.a(context, hVar);
                qj4.s.m(qj4.s.f363958a, q3Var.f174197n, 37L, null, this.f174161e, 0L, 0L, 0L, 0L, null, null, r6.f21067g, 1012, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
