package k03;

/* loaded from: classes8.dex */
public final class j implements io.flutter.plugin.platform.PlatformView {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f303122d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f303123e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f303124f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f303125g;

    public j(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.BinaryMessenger messenger) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(messenger, "messenger");
        java.lang.Object obj = map != null ? map.get("query") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        this.f303122d = str == null ? "" : str;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(messenger, "com.tencent.websearch/sug_platform_view_" + i17);
        this.f303123e = methodChannel;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-1);
        this.f303124f = linearLayout;
        float f17 = context.getResources().getDisplayMetrics().density;
        int i18 = (int) (16 * f17);
        int i19 = (int) (24 * f17);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(a(this.f303122d));
        textView.setTextColor(android.graphics.Color.parseColor("#999999"));
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        textView.setPadding(i18, i19, i18, i19);
        this.f303125g = textView;
        linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        methodChannel.setMethodCallHandler(new k03.i(this));
        methodChannel.invokeMethod("onSectionOrderChanged", java.util.Collections.singletonMap("isWebSearchTop", java.lang.Boolean.TRUE));
    }

    public final java.lang.String a(java.lang.String str) {
        if (r26.n0.N(str)) {
            return "[Sug PlatformView] 等待输入...";
        }
        return "[Sug PlatformView] query=\"" + str + "\"\n(Stub: 待接入真实 sug CGI)";
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.f303123e.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f303124f;
    }
}
