package vm1;

/* loaded from: classes8.dex */
public final class z implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438080a;

    public z(yz5.l lVar) {
        this.f438080a = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "getWeCoinBalance onFailed, errorType: " + i17 + ", errorCode: " + i18 + ", msg: " + str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f438080a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(-1L, "getWCCoinBalance fail!", new byte[0]))));
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(data, "data");
        bw5.jp0 jp0Var = new bw5.jp0();
        jp0Var.f29078d = data.f374585d;
        jp0Var.f29079e[1] = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f438080a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(0L, "", jp0Var.toByteArray()))));
    }
}
