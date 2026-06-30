package z51;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.p f470196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z51.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470196d = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z51.n(this.f470196d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        z51.n nVar = (z51.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        z51.p pVar = this.f470196d;
        pVar.f470209p = true;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = pVar.f470200g;
        if (thumbPlayerViewContainer == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        a61.c cVar = pVar.f470204k;
        if (cVar != null) {
            thumbPlayerViewContainer.setVideoPath(cVar.f1721c);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("sourceConfig");
        throw null;
    }
}
