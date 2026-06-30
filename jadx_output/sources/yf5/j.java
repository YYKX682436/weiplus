package yf5;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f461889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f461891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yf5.m mVar, java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461889d = mVar;
        this.f461890e = str;
        this.f461891f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf5.j(this.f461889d, this.f461890e, this.f461891f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yf5.j jVar = (yf5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yf5.m mVar = this.f461889d;
        java.lang.String str = mVar.f461908b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitDelete, ");
        java.lang.String str2 = this.f461890e;
        sb6.append(str2);
        sb6.append(", version: ");
        int i17 = this.f461891f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = mVar.f461907a.f461962f;
        if (mvvmList != null) {
            mvvmList.s(str2);
        }
        java.util.HashMap hashMap = mVar.f461911e;
        yf5.x xVar = new yf5.x();
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.b2(str2);
        xVar.f461995d = l4Var;
        hashMap.put(str2, new yf5.f(xVar, xm3.i.f455323f, i17));
        return jz5.f0.f302826a;
    }
}
