package et2;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f256580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ et2.e f256581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, et2.e eVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256580d = mMFragmentActivity;
        this.f256581e = eVar;
        this.f256582f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new et2.d(this.f256580d, this.f256581e, this.f256582f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        et2.d dVar = (et2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f256580d;
        int taskId = mMFragmentActivity.getTaskId();
        java.lang.Integer num = new java.lang.Integer(taskId);
        et2.e eVar = this.f256581e;
        eVar.f256585b.put(new java.lang.Integer(this.f256582f), num);
        eVar.getClass();
        if (kotlin.jvm.internal.o.b(mMFragmentActivity.getClass().getSimpleName(), "FinderHomeAffinityUI")) {
            eVar.f256588e = taskId;
        }
        com.tencent.mars.xlog.Log.i("FinderJumpDataManager", "[getTaskIdAsync] taskId=" + taskId + ", finderTaskId=" + eVar.f256588e);
        return jz5.f0.f302826a;
    }
}
