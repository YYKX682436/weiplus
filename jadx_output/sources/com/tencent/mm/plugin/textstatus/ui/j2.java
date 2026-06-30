package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class j2 extends com.tencent.mm.plugin.textstatus.ui.e0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f173995e;

    /* renamed from: f, reason: collision with root package name */
    public final bi4.h1 f173996f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.textstatus.ui.StatusPostEntryButton f173997g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f173998h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f173999i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.b2 f174000m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(android.content.Context mContext, bi4.h1 req) {
        super(mContext);
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(req, "req");
        this.f173995e = mContext;
        this.f173996f = req;
        this.f173999i = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f174000m = new com.tencent.mm.plugin.textstatus.ui.b2(this);
    }

    public static final void b(com.tencent.mm.plugin.textstatus.ui.j2 j2Var, yz5.a aVar) {
        java.lang.Object m521constructorimpl;
        j2Var.getClass();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            super.dismiss();
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.MultipleTextStatusCardDialog", m524exceptionOrNullimpl, "finishDismissAndCallback: super.dismiss failed", new java.lang.Object[0]);
        }
        j2Var.i();
        aVar.invoke();
    }

    public static final void c(com.tencent.mm.plugin.textstatus.ui.j2 j2Var, java.lang.String str) {
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "onClickSetStatusButton");
        android.content.Context context = j2Var.f173995e;
        com.tencent.mm.plugin.textstatus.ui.e2 e2Var = new com.tencent.mm.plugin.textstatus.ui.e2(context instanceof android.app.Activity ? (android.app.Activity) context : null, j2Var, str);
        if (j2Var.f173998h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissWithCompletion: already dismissing, just run onEnd");
            e2Var.invoke();
            return;
        }
        j2Var.f173998h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissWithCompletion: start, preset=" + j2Var.e().f21047a);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).U6();
        android.widget.LinearLayout linearLayout = j2Var.f173821d;
        android.os.Handler handler = j2Var.f173999i;
        if (linearLayout != null) {
            boolean[] zArr = {false};
            com.tencent.mm.plugin.textstatus.ui.a2 a2Var = new com.tencent.mm.plugin.textstatus.ui.a2(zArr, j2Var, e2Var);
            handler.postDelayed(a2Var, j2Var.e().f21048b + 100);
            j2Var.h(linearLayout, j2Var.e(), new com.tencent.mm.plugin.textstatus.ui.z1(zArr, j2Var, a2Var, e2Var));
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            super.dismiss();
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        handler.post(new com.tencent.mm.plugin.textstatus.ui.y1(j2Var, e2Var));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f173998h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismiss: already dismissing, skip");
            return;
        }
        this.f173998h = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismiss: ");
        bi4.n0 f17 = f();
        sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", sb6.toString());
        android.content.Context context = this.f173995e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).U6();
        android.widget.LinearLayout linearLayout = this.f173821d;
        if (linearLayout != null) {
            h(linearLayout, e(), null);
        }
        super.dismiss();
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ni();
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity != null) {
            this.f174000m.x8(mMFragmentActivity);
        }
    }

    public final bi4.g1 e() {
        bi4.g1 g1Var = this.f173996f.f21052d;
        return g1Var == null ? new bi4.g1(bi4.f1.f21041d, 0L, 2, null) : g1Var;
    }

    public final bi4.n0 f() {
        android.content.Context context = this.f173995e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).P6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final void h(android.view.View view, bi4.g1 g1Var, yz5.a aVar) {
        sa5.m mVar;
        int ordinal = g1Var.f21047a.ordinal();
        if (ordinal == 0) {
            mVar = new sa5.m(0, 1, null);
            mVar.i(new sa5.u(sa5.s.f405370a));
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            mVar = new sa5.m(0, 1, null);
            mVar.i(new sa5.u(sa5.r.f405369a));
        }
        long j17 = g1Var.f21048b;
        if (aVar == null) {
            sa5.d.b(view, mVar, j17, null);
        } else {
            sa5.d.b(view, mVar, j17, new com.tencent.mm.plugin.textstatus.ui.g2(aVar));
        }
    }

    public final void i() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ni();
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        android.content.Context context = this.f173995e;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity != null) {
            this.f174000m.x8(mMFragmentActivity);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.e0, android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.e0, android.app.Dialog
    public void show() {
        sa5.l lVar;
        super.show();
        android.widget.LinearLayout linearLayout = this.f173821d;
        if (linearLayout == null) {
            return;
        }
        bi4.g1 e17 = e();
        com.tencent.mm.plugin.textstatus.ui.h2 h2Var = new com.tencent.mm.plugin.textstatus.ui.h2(this);
        int ordinal = e17.f21047a.ordinal();
        if (ordinal == 0) {
            lVar = new sa5.l(0.0f, 1, null);
            lVar.i(new sa5.t(0.0f, 0.0f, sa5.s.f405370a, 3, null));
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lVar = new sa5.l(0.0f, 1, null);
            lVar.i(new sa5.t(0.0f, 0.0f, sa5.r.f405369a, 3, null));
        }
        sa5.d.a(linearLayout, lVar, e17.f21048b, new com.tencent.mm.plugin.textstatus.ui.f2(h2Var));
    }
}
