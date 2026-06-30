package wh5;

/* loaded from: classes12.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f446109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wh5.v f446110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l70.d f446111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wh5.g0 g0Var, l70.d dVar, wh5.v vVar, l70.d dVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446108d = g0Var;
        this.f446109e = dVar;
        this.f446110f = vVar;
        this.f446111g = dVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wh5.y(this.f446108d, this.f446109e, this.f446110f, this.f446111g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wh5.y yVar = (wh5.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashSet d76 = this.f446108d.d7();
        wh5.g0 g0Var = this.f446108d;
        l70.d dVar = this.f446109e;
        wh5.v vVar = this.f446110f;
        l70.d dVar2 = this.f446111g;
        synchronized (d76) {
            if (g0Var.d7().add(dVar.f316804e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar.f316804e);
                com.tencent.mars.xlog.Log.i("MediaGallery.ChatLiveStateManager", "cancel download image, mediaInfo id: " + vVar.getId() + " level: " + vVar.f446098c + " downloadMediaId: " + dVar.f316804e);
            }
            if (g0Var.d7().add(dVar2.f316804e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar2.f316804e);
                com.tencent.mars.xlog.Log.i("MediaGallery.ChatLiveStateManager", "cancel download video, mediaInfo id: " + vVar.getId() + " level: " + vVar.f446098c + " downloadMediaId: " + dVar2.f316804e);
            }
        }
        return jz5.f0.f302826a;
    }
}
