package rk4;

/* loaded from: classes11.dex */
public final class w4 implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.e70 f397037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397038b;

    public w4(bw5.e70 e70Var, yz5.l lVar) {
        this.f397037a = e70Var;
        this.f397038b = lVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        yz5.l lVar = this.f397038b;
        if (obj != null && (obj instanceof com.tencent.mm.protocal.protobuf.FinderObject)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMediaInfo success, tid:");
            java.lang.String tid = this.f397037a.getTid();
            kotlin.jvm.internal.o.d(tid);
            sb6.append((java.lang.Object) jz5.x.a(r26.q0.c(tid)));
            rk4.k5.e(sb6.toString(), "TingFinderSourcePlugin");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(((com.tencent.mm.protocal.protobuf.FinderObject) obj).toByteArray())));
            return;
        }
        rk4.k5.d("requestMediaInfo fail, errType: " + i17 + ", errCode: " + i18, "TingFinderSourcePlugin");
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("errType: " + i17 + ", errCode: " + i18)))));
    }
}
