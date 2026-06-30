package sr2;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f411616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sr2.o oVar) {
        super(1);
        this.f411616d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sr2.o oVar = this.f411616d;
        oVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://ad.weixin.qq.com/pdf.html?post_id=U2FsdGVkX1+eLpg6lni/bsBHdEgonVf3L06aSrxhqhE=");
        j45.l.j(oVar.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
