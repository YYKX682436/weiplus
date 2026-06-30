package hc2;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f280335a = jz5.h.b(hc2.m.f280330d);

    public static final void a(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), z17 ? "fonts/WeChatSansSS-Medium.ttf" : "fonts/WeChatSansStd-Medium.ttf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderExt", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    public static final void b(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/WeChatSansStd-Regular.ttf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderExt", "setTypeface() Exception:" + e17.getMessage());
        }
    }
}
