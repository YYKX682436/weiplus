package m31;

/* loaded from: classes9.dex */
public abstract class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f323134d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final int f323135e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f323136f = 2;

    /* renamed from: g, reason: collision with root package name */
    public final int f323137g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final m31.b f323138h = new m31.b(this);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323139i = "";

    public final java.lang.String x(android.content.Context context, int i17) {
        if (i17 == this.f323137g) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.n5y, this.f323139i);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.akh, this.f323139i);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
