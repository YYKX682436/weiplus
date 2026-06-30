package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class u30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f119935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c40 f119936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f119937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.c40 c40Var, boolean z17) {
        super(2, continuation);
        this.f119935d = hVar;
        this.f119936e = c40Var;
        this.f119937f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.u30(this.f119935d, continuation, this.f119936e, this.f119937f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.u30 u30Var = (com.tencent.mm.plugin.finder.live.widget.u30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u30Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f119935d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f397424e) : null;
        rm0.j jVar2 = aVar2.f454379a;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null;
        java.lang.String str = jVar2 != null ? jVar2.f397426g : null;
        com.tencent.mm.plugin.finder.live.widget.c40 c40Var = this.f119936e;
        com.tencent.mars.xlog.Log.w(c40Var.A(), "requestMicReplayStatus failed,errorType:" + num + ",errorCode:" + num2 + ",errorMsg:" + str);
        boolean z17 = false;
        if (jVar2 != null && jVar2.f397425f == -200434) {
            z17 = true;
        }
        if (z17) {
            c40Var.J(dk2.na.f233811m);
            android.content.Context context = c40Var.f118381d;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.ov6);
            e4Var.b(com.tencent.mm.R.raw.icons_outlined_error);
            e4Var.c();
        } else if (this.f119937f) {
            c40Var.J(dk2.na.f233807f);
            android.content.Context context2 = c40Var.f118381d;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.ov_);
            e4Var2.b(com.tencent.mm.R.raw.icons_outlined_error);
            e4Var2.c();
        } else {
            c40Var.F(0L);
        }
        return jz5.f0.f302826a;
    }
}
