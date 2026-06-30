package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118880d = m10Var;
        this.f118881e = str;
        this.f118882f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.l00(this.f118880d, this.f118881e, this.f118882f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.l00) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118880d;
        dk2.xf W0 = m10Var.f119001c.W0();
        if (W0 == null) {
            return null;
        }
        ((dk2.r4) W0).T(java.lang.System.currentTimeMillis(), new com.tencent.mm.plugin.finder.live.widget.k00(m10Var, this.f118881e, this.f118882f));
        return jz5.f0.f302826a;
    }
}
