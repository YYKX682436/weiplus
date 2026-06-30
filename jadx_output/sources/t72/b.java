package t72;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t72.b f416040a = new t72.b();

    /* renamed from: b, reason: collision with root package name */
    public static final l75.k0 f416041b;

    static {
        f416041b = c82.e.d() ? c82.e.f39668a.c() : c82.e.f39668a.a();
    }

    public final int a(t72.a favTagInfo) {
        kotlin.jvm.internal.o.g(favTagInfo, "favTagInfo");
        o75.c cVar = new o75.c(o75.b.f343584e, java.lang.String.valueOf(favTagInfo.getPrimaryKeyValue()), "MicroMsg.SDK.BaseFavTagInfo");
        cVar.f343590d = favTagInfo;
        int a17 = new m75.b(favTagInfo, cVar, dm.q3.f239392q, "MicroMsg.SDK.BaseFavTagInfo").a(f416041b);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[delete] result = " + a17 + ", id = " + favTagInfo.field_id + ", name = " + favTagInfo.field_name);
        return a17;
    }

    public final long b(t72.a favTagInfo) {
        kotlin.jvm.internal.o.g(favTagInfo, "favTagInfo");
        o75.c cVar = new o75.c(o75.b.f343582c, java.lang.String.valueOf(favTagInfo.getPrimaryKeyValue()), "MicroMsg.SDK.BaseFavTagInfo");
        cVar.f343590d = favTagInfo;
        long a17 = new m75.c(favTagInfo, true, cVar, dm.q3.f239392q, "MicroMsg.SDK.BaseFavTagInfo").a(f416041b);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[insert] result = " + a17 + ", id = " + favTagInfo.field_id + ", name = " + favTagInfo.field_name);
        return a17;
    }

    public final java.util.List c() {
        p75.n0 n0Var = dm.q3.f239384f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.i0 g17 = dm.q3.f239384f.g(linkedList);
        g17.f352657d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[queryAll] sql = " + a17);
        return a17.k(f416041b, t72.a.class);
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p75.n0 n0Var = dm.q3.f239384f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.i0 g17 = dm.q3.f239384f.g(linkedList);
        g17.f352657d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[queryAll] sql = " + a17);
        java.util.Iterator it = ((java.util.ArrayList) a17.k(f416041b, t72.a.class)).iterator();
        while (it.hasNext()) {
            t72.a aVar = (t72.a) it.next();
            arrayList.add(aVar.field_name);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[queryAll] tag id = " + aVar.field_id + ", tag name = " + aVar.field_name);
        }
        return arrayList;
    }

    public final t72.a e(int i17) {
        p75.n0 n0Var = dm.q3.f239384f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m0 i18 = dm.q3.f239385g.i(java.lang.Integer.valueOf(i17));
        p75.i0 g17 = dm.q3.f239384f.g(linkedList);
        g17.f352657d = i18;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[queryById] sql = " + a17 + ", id = " + i17);
        return (t72.a) a17.o(f416041b, t72.a.class);
    }

    public final t72.a f(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        p75.n0 n0Var = dm.q3.f239384f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m0 j17 = dm.q3.f239386h.j(name);
        p75.i0 g17 = dm.q3.f239384f.g(linkedList);
        g17.f352657d = j17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[queryByName] sql = " + a17 + ", name = " + name);
        return (t72.a) a17.o(f416041b, t72.a.class);
    }

    public final int g(t72.a favTagInfo) {
        kotlin.jvm.internal.o.g(favTagInfo, "favTagInfo");
        o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(favTagInfo.getPrimaryKeyValue()), "MicroMsg.SDK.BaseFavTagInfo");
        cVar.f343590d = favTagInfo;
        int a17 = new m75.e(favTagInfo, cVar, dm.q3.f239392q, "MicroMsg.SDK.BaseFavTagInfo").a(f416041b);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[update] result = " + a17 + ", id = " + favTagInfo.field_id + ", name = " + favTagInfo.field_name);
        return a17;
    }
}
