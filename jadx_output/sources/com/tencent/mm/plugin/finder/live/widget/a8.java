package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f117742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.tencent.mm.plugin.finder.live.widget.i8 i8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117742e = i8Var;
        this.f117743f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.a8(this.f117742e, this.f117743f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117741d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f117741d = 1;
            if (kotlinx.coroutines.k1.b(600L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        sf2.e0 e0Var = this.f117742e.H;
        e0Var.getClass();
        java.lang.String content = this.f117743f;
        kotlin.jvm.internal.o.g(content, "content");
        if (kotlin.jvm.internal.o.b(content, ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233879h)) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "have search content:" + content + '!');
        } else {
            e0Var.f407114p = content;
            com.tencent.mm.plugin.finder.live.widget.i8 i8Var = e0Var.f407111m;
            if (i8Var != null) {
                i8Var.j0(true);
            }
            ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233881j = 0;
            ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233880i = null;
            new ek2.k2(((mm2.e1) e0Var.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) e0Var.business(mm2.e1.class)).f328985o, xy2.c.e(e0Var.O6()), ((mm2.e1) e0Var.business(mm2.e1.class)).f328983m, content, ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233880i, new sf2.d0(e0Var, content)).l().f(e0Var.N6());
        }
        return jz5.f0.f302826a;
    }
}
