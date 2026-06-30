package d21;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f225783j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f225784k = "";

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f225785a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f225786b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225789e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225790f;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f225787c = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f225791g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f225792h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f225793i = new java.util.LinkedList();

    public c(java.util.Map map) {
        this.f225785a = map;
    }

    public boolean a() {
        java.util.Map map = this.f225785a;
        if (map == null || map.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseNewXmlMsg", "values == null || values.size() == 0 ");
            return false;
        }
        if (map.containsKey(".sysmsg.$type")) {
            this.f225788d = (java.lang.String) map.get(".sysmsg.$type");
        }
        java.lang.String str = ".sysmsg." + this.f225788d + ".text";
        f225783j = str;
        if (map.containsKey(str)) {
            this.f225789e = (java.lang.String) map.get(f225783j);
        }
        java.lang.String str2 = ".sysmsg." + this.f225788d + ".link.scene";
        f225784k = str2;
        if (map.containsKey(str2)) {
            this.f225790f = (java.lang.String) map.get(f225784k);
        }
        return b();
    }

    public abstract boolean b();

    public c(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        this.f225785a = map;
        this.f225786b = f9Var;
    }
}
