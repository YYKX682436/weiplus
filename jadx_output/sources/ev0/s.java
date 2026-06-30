package ev0;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.t f256877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ev0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256877d = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ev0.s(this.f256877d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ev0.s sVar = (ev0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "stop play");
        ev0.t tVar = this.f256877d;
        ev0.b bVar = tVar.f256879b;
        if (bVar != null) {
            bVar.stop();
        }
        ev0.b bVar2 = tVar.f256879b;
        if (bVar2 != null) {
            bVar2.recycle();
        }
        tVar.f256879b = null;
        tVar.f256880c = null;
        return jz5.f0.f302826a;
    }
}
