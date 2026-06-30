package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ac extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f173726d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f173727e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f173728f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f173729g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f173730h;

    /* renamed from: i, reason: collision with root package name */
    public tj4.e f173731i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f173732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f173726d = "MicroMsg.TextStatusGroupPageDataUIC";
        this.f173727e = new java.util.ArrayList();
        this.f173730h = new java.util.ArrayList();
        this.f173732m = new java.util.ArrayList();
    }

    public final void O6(boolean z17) {
        androidx.recyclerview.widget.f2 f2Var;
        java.util.List N = ai4.m0.f5173a.N();
        if (N.isEmpty()) {
            return;
        }
        int size = this.f173730h.size();
        boolean Q6 = (this.f173730h.isEmpty() || !(kz5.n0.X(this.f173730h) instanceof jj4.b)) ? Q6(this.f173730h, N) : Q6(this.f173730h, N);
        com.tencent.mars.xlog.Log.i(this.f173726d, "dealCardActivityDataForMultiplePublish:needUpdate=" + Q6 + ", selfStatusListSize=" + N.size() + ", oldSize=" + size + ", newSize=" + this.f173730h.size());
        if (Q6 && z17 && (f2Var = this.f173728f) != null) {
            f2Var.notifyDataSetChanged();
        }
    }

    public final void P6(java.lang.String statusId) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        com.tencent.mars.xlog.Log.i(this.f173726d, "deleteStatusById: ".concat(statusId));
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.textstatus.ui.w1 O6 = ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).O6();
        com.tencent.mm.plugin.textstatus.ui.yb ybVar = new com.tencent.mm.plugin.textstatus.ui.yb(statusId);
        if (O6 != null) {
            O6.d(ybVar, new com.tencent.mm.plugin.textstatus.ui.xb(this, O6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0202 A[LOOP:9: B:98:0x01c6->B:113:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q6(java.util.ArrayList r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.ac.Q6(java.util.ArrayList, java.util.List):boolean");
    }
}
