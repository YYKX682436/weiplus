package h03;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f277891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277891d = activity;
        this.f277892e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h03.i(this.f277891d, this.f277892e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h03.i iVar = (h03.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity activity = this.f277891d;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f277892e);
            intent.putExtra("forceHideShare", true);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent.putExtra("convertActivityFromTranslucent", true), null);
        }
        return jz5.f0.f302826a;
    }
}
