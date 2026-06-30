package rk4;

/* loaded from: classes8.dex */
public final class c1 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396574a;

    public c1(yz5.l lVar) {
        this.f396574a = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "buyWCCoin onFailed, errorType = " + i17 + ", errorCode = " + i18 + ", errorMsg = " + str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f396574a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(-1L, "buyWCCoin fail!", new byte[0]))));
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f396574a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(0L, "", new byte[0]))));
    }
}
