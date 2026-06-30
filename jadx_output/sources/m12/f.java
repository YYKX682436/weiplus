package m12;

/* loaded from: classes2.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f322832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f322833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f322834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f322835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.Set set, long j17, java.util.List list, kotlinx.coroutines.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322832d = set;
        this.f322833e = j17;
        this.f322834f = list;
        this.f322835g = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m12.f(this.f322832d, this.f322833e, this.f322834f, this.f322835g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        m12.f fVar = (m12.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Long l17 = new java.lang.Long(this.f322833e);
        java.util.Set set = this.f322832d;
        set.remove(l17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new frame encoded(");
        java.util.List list = this.f322834f;
        sb6.append(list.size() - set.size());
        sb6.append('/');
        sb6.append(list.size());
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoEmojiGenerator", sb6.toString());
        boolean isEmpty = set.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isEmpty) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f322835g.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        return f0Var;
    }
}
