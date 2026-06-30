package sr2;

/* loaded from: classes2.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(sr2.y2 y2Var) {
        super(1);
        this.f411683d = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sr2.y2 y2Var = this.f411683d;
        y2Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/mbaFe7RILhvY87XI");
        j45.l.j(y2Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
