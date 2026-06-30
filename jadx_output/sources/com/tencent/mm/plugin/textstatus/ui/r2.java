package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class r2 implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.s2 f174237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174238b;

    public r2(com.tencent.mm.plugin.textstatus.ui.s2 s2Var, android.content.Context context) {
        this.f174237a = s2Var;
        this.f174238b = context;
    }

    @Override // bi4.m0
    public void a(int i17, java.lang.Object obj) {
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.tencent.mm.plugin.textstatus.ui.s2 s2Var = this.f174237a;
        s2Var.getClass();
        android.content.Context context = this.f174238b;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(uj4.e.class);
        if (eVar != null) {
            mj4.h hVar = s2Var.f174266n;
            java.lang.String l17 = hVar != null ? ((mj4.k) hVar).l() : null;
            if (l17 == null || r26.n0.N(l17)) {
                com.tencent.mars.xlog.Log.i(eVar.f428417d, "syncUpdateLike: failed");
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = eVar.V6();
            if (V6 != null) {
                V6.f173782p.put(l17, java.lang.Boolean.valueOf(booleanValue));
            }
            com.tencent.mm.plugin.textstatus.ui.n2 U6 = eVar.U6();
            if (U6 != null) {
                ((cj4.i1) U6.C).c0();
            }
        }
    }
}
