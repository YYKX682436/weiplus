package xm3;

/* loaded from: classes4.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f455331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(yz5.l lVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455329d = lVar;
        this.f455330e = mvvmList;
        this.f455331f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.i0(this.f455329d, this.f455330e, this.f455331f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.i0 i0Var = (xm3.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455330e;
        this.f455329d.invoke(mvvmList.f152066p);
        mvvmList.l(xm3.i.f455322e, this.f455331f);
        return jz5.f0.f302826a;
    }
}
