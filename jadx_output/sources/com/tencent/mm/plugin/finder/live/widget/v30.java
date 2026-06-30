package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class v30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f120033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f120034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.c40 c40Var, boolean z17) {
        super(2, continuation);
        this.f120032d = hVar;
        this.f120033e = c40Var;
        this.f120034f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.v30(this.f120032d, continuation, this.f120033e, this.f120034f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.v30 v30Var = (com.tencent.mm.plugin.finder.live.widget.v30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v30Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.jt1 jt1Var = (r45.jt1) ((xg2.i) this.f120032d).f454393b;
        com.tencent.mm.plugin.finder.live.widget.c40 c40Var = this.f120033e;
        dk2.na B = c40Var.B(jt1Var);
        java.lang.String A = c40Var.A();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMicReplayStatus success,status = ");
        sb6.append(B);
        sb6.append(",isFirstRequest = ");
        boolean z17 = this.f120034f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(A, sb6.toString());
        if (z17 && B == dk2.na.f233808g) {
            c40Var.J(dk2.na.f233807f);
            android.content.Context context = c40Var.f118381d;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.ov_);
            e4Var.b(com.tencent.mm.R.raw.icons_outlined_error);
            e4Var.c();
        } else {
            c40Var.J(B);
            if (z17 && (B == dk2.na.f233809h || B == dk2.na.f233810i)) {
                android.content.Context context2 = c40Var.f118381d;
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.ov7);
                e4Var2.b(com.tencent.mm.R.raw.check_mark_regular);
                e4Var2.c();
            }
            if (B == dk2.na.f233809h) {
                c40Var.F(jt1Var.getInteger(2) * 1000);
            } else if (B == dk2.na.f233808g || B == dk2.na.f233811m) {
                android.content.Context context3 = c40Var.f118381d;
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context3);
                e4Var3.f211776c = context3.getString(com.tencent.mm.R.string.ov6);
                e4Var3.b(com.tencent.mm.R.raw.icons_outlined_error);
                e4Var3.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
