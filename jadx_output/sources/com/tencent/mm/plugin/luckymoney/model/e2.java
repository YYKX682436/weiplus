package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f145256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f2 f145257f;

    public e2(com.tencent.mm.plugin.luckymoney.model.f2 f2Var, java.lang.String str, long j17) {
        this.f145257f = f2Var;
        this.f145255d = str;
        this.f145256e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.xv3 xv3Var;
        com.tencent.mm.plugin.luckymoney.model.f2 f2Var = this.f145257f;
        android.view.View view = f2Var.f145269c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.f(f2Var.f145270d, this.f145255d, f2Var.f145271e);
        r45.wv3 wv3Var = f2Var.f145272f;
        if (wv3Var == null || (xv3Var = wv3Var.f389501g) == null) {
            return;
        }
        int i17 = f2Var.f145270d;
        long j17 = this.f145256e;
        if (i17 == 11) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.G, 1, 8, java.lang.Long.valueOf(j17));
        } else if (i17 == 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.F, 1, 7, java.lang.Long.valueOf(j17));
        }
    }
}
