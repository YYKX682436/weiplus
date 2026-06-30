package xm3;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f455316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455315d = mvvmList;
        this.f455316e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.g0(this.f455315d, this.f455316e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.g0 g0Var = (xm3.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455315d;
        java.util.ArrayList arrayList = mvvmList.f152066p;
        arrayList.clear();
        arrayList.addAll(this.f455316e);
        mvvmList.l(xm3.i.f455324g, false);
        return jz5.f0.f302826a;
    }
}
