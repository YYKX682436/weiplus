package va3;

/* loaded from: classes12.dex */
public class g0 implements w25.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f434289a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f434290b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f434291c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f434292d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f434293e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f434294f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f434295g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public int f434296h = 300;

    /* renamed from: i, reason: collision with root package name */
    public int f434297i = 300;

    public g0() {
        a();
    }

    public void a() {
        va3.i0 Ni = va3.j0.Ni();
        java.util.ArrayList arrayList = (java.util.ArrayList) Ni.f434311g;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (equals((w25.i) it.next())) {
                return;
            }
        }
        arrayList.add(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "addMapCallBack " + arrayList.size());
        if (arrayList.size() == 1) {
            gm0.j1.d().a(me1.b.CTRL_INDEX, Ni);
        }
    }
}
