package pf1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final pf1.c f353775a;

    public h(pf1.c view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f353775a = view;
    }

    public static void a(pf1.h hVar, java.lang.String str, android.webkit.ValueCallback valueCallback, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            valueCallback = null;
        }
        hVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.d5.b(new pf1.g(hVar, str, valueCallback));
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String invokeHandler(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            return "";
        }
        pf1.q qVar = (pf1.q) this.f353775a;
        qVar.getClass();
        return qVar.f353790f.B(str, str2, i17);
    }
}
