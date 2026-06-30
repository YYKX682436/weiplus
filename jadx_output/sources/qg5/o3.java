package qg5;

/* loaded from: classes9.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363112e = context;
        this.f363113f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qg5.o3 o3Var = new qg5.o3(this.f363112e, this.f363113f, continuation);
        o3Var.f363111d = obj;
        return o3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f363112e;
        java.lang.Object systemService = context.getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (clipboardManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoCopyChatRecordsFSC", "getClipboardManager failed");
            return f0Var;
        }
        android.content.ClipDescription clipDescription = new android.content.ClipDescription("", new java.lang.String[]{"text/plain"});
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("com.tencent.mm.intent.extra.WECHAT_CHAT_RECORDS_PROVIDER_SESSION_ID", this.f363113f);
        java.lang.String packageName = context.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        intent.putExtra("com.tencent.mm.intent.extra.WECHAT_PACKAGE_NAME", packageName);
        clipboardManager.setPrimaryClip(new android.content.ClipData(clipDescription, new android.content.ClipData.Item("", intent, android.net.Uri.EMPTY)));
        return f0Var;
    }
}
