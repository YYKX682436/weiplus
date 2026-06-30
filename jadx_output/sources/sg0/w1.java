package sg0;

/* loaded from: classes8.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final sg0.w1 f407848d = new sg0.w1();

    public w1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        sg0.k1 it = (sg0.k1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.ref.WeakReference weakReference = it.f407738a;
        return java.lang.Boolean.valueOf((weakReference != null ? (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) weakReference.get() : null) == null);
    }
}
