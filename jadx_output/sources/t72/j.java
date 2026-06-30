package t72;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f416069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f416070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.util.Set set, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416069d = set;
        this.f416070e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t72.j(this.f416069d, this.f416070e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        t72.j jVar = (t72.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveBindTagTask] tags = ");
        java.util.Set set = this.f416069d;
        sb6.append(set);
        sb6.append(", localId = ");
        long j17 = this.f416070e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagsManager", sb6.toString());
        t72.l.f416072g.putStringSet("fav_tags_prefix_" + j17, set);
        return jz5.f0.f302826a;
    }
}
