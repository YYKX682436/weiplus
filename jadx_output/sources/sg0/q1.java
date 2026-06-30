package sg0;

/* loaded from: classes8.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String str) {
        super(1);
        this.f407784d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        sg0.k1 it = (sg0.k1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!kotlin.jvm.internal.o.b(it.f407739b, this.f407784d)) {
            java.lang.ref.WeakReference weakReference = it.f407738a;
            if ((weakReference != null ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) weakReference.get() : null) != null) {
                z17 = false;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
