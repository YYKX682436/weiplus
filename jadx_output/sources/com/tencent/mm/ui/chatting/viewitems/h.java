package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f204065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f204067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.c f204068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f204069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yb5.d dVar, long j17, zy2.c cVar, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204066e = dVar;
        this.f204067f = j17;
        this.f204068g = cVar;
        this.f204069h = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.h(this.f204066e, this.f204067f, this.f204068g, this.f204069h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204065d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.app.Activity g17 = this.f204066e.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            long j17 = this.f204067f;
            java.lang.String string = this.f204068g.f477359b.getString(12);
            if (string == null) {
                string = "";
            }
            android.widget.ImageView imageView = this.f204069h;
            this.f204065d = 1;
            if (((com.tencent.mm.feature.finder.live.v4) w0Var).wj(g17, j17, string, imageView, 2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
