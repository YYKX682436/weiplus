package pr4;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.FragmentActivity f357987a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f357988b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f357989c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f357990d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f357991e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f357992f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f357993g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f357994h;

    public e(androidx.fragment.app.FragmentActivity context, java.lang.String title, java.lang.String str, java.util.List priceTiers, java.lang.String protocolWording, java.util.List tips) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(priceTiers, "priceTiers");
        kotlin.jvm.internal.o.g(protocolWording, "protocolWording");
        kotlin.jvm.internal.o.g(tips, "tips");
        this.f357987a = context;
        this.f357988b = title;
        this.f357989c = str;
        this.f357990d = priceTiers;
        this.f357991e = protocolWording;
        this.f357992f = tips;
        this.f357994h = "";
        java.lang.String string = context.getString(com.tencent.mm.R.string.lhq);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.lhr);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.lhs);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String format = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{"https://kf.qq.com/touch/product/WXDB_app.html"}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f357992f = kz5.n0.t0(tips, kz5.c0.i(string, string2, format));
    }
}
