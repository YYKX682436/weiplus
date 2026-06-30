package vm1;

/* loaded from: classes11.dex */
public final class o implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.e70 f438038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438039b;

    public o(bw5.e70 e70Var, yz5.l lVar) {
        this.f438038a = e70Var;
        this.f438039b = lVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        yz5.l lVar = this.f438039b;
        if (obj != null && (obj instanceof com.tencent.mm.protocal.protobuf.FinderObject)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMediaInfo success, tid:");
            java.lang.String tid = this.f438038a.getTid();
            kotlin.jvm.internal.o.d(tid);
            sb6.append((java.lang.Object) jz5.x.a(r26.q0.c(tid)));
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizAudioFinderSourcePlugin", sb6.toString());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(((com.tencent.mm.protocal.protobuf.FinderObject) obj).toByteArray())));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizAudioFinderSourcePlugin", "requestMediaInfo fail, errType: " + i17 + ", errCode: " + i18);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("errType: " + i17 + ", errCode: " + i18)))));
    }
}
