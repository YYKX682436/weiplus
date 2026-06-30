package vm1;

/* loaded from: classes8.dex */
public final class r implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438047a;

    public r(yz5.l lVar) {
        this.f438047a = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "buyWCCoin onFailed, errorType = " + i17 + ", errorCode = " + i18 + ", errorMsg = " + str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f438047a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(-1L, "buyWCCoin fail!", new byte[0]))));
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f438047a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(0L, "", new byte[0]))));
    }
}
