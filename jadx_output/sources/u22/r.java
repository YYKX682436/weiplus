package u22;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: p, reason: collision with root package name */
    public static final u22.l f424006p = new u22.l(null);

    /* renamed from: q, reason: collision with root package name */
    public static final r45.p64 f424007q = new r45.p64();

    /* renamed from: r, reason: collision with root package name */
    public static final r45.p64 f424008r = new r45.p64();

    /* renamed from: s, reason: collision with root package name */
    public static final r45.p64 f424009s = new r45.p64();

    /* renamed from: t, reason: collision with root package name */
    public static final r45.p64 f424010t = new r45.p64();

    /* renamed from: u, reason: collision with root package name */
    public static final r45.p64 f424011u = new r45.p64();

    /* renamed from: v, reason: collision with root package name */
    public static final r45.p64 f424012v = new r45.p64();

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f424013a;

    /* renamed from: b, reason: collision with root package name */
    public final u22.d f424014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f424015c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f424016d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f424017e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f424018f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f424019g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f424020h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f424021i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f424022j;

    /* renamed from: k, reason: collision with root package name */
    public int f424023k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f424024l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f424025m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f424026n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f424027o;

    public r(im5.b lifeCycleKeeper, u22.d callback) {
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f424013a = lifeCycleKeeper;
        this.f424014b = callback;
        this.f424015c = 2;
        this.f424017e = true;
        this.f424019g = true;
        this.f424023k = 1;
        this.f424024l = new java.util.LinkedList();
        this.f424025m = new java.util.LinkedList();
        this.f424026n = new java.util.LinkedList();
        this.f424027o = new java.util.LinkedList();
    }

    public final void a(r45.p64 info) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Iterator it = this.f424024l.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((r45.p64) obj2).f382792d, info.f382792d)) {
                    break;
                }
            }
        }
        r45.p64 p64Var = (r45.p64) obj2;
        java.util.LinkedList linkedList = this.f424025m;
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b(((r45.p64) next).f382792d, info.f382792d)) {
                obj = next;
                break;
            }
        }
        r45.p64 p64Var2 = (r45.p64) obj;
        if (p64Var != null) {
            if (p64Var2 == null) {
                linkedList.add(p64Var);
            }
        } else if (p64Var2 == null) {
            java.lang.String str = info.f382792d;
            if (str == null || f424006p.a(info)) {
                linkedList.add(info);
            } else {
                u22.m mVar = new u22.m(this);
                boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
                im5.b bVar = this.f424013a;
                if (n17) {
                    new x85.f(bVar, str, mVar);
                } else {
                    new x85.i(bVar, str, mVar);
                }
            }
        }
        d();
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", "loadMore: " + this.f424018f + ", " + this.f424017e);
        if (!this.f424017e || this.f424018f) {
            return;
        }
        this.f424018f = true;
        int i17 = this.f424023k;
        byte[] bArr = this.f424016d;
        byte[] bArr2 = this.f424022j;
        im5.b bVar = this.f424013a;
        u22.o oVar = new u22.o(this);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            new x85.n(i17, bArr, bArr2, bVar, oVar);
            return;
        }
        pq5.g l17 = new x85.b(i17, bArr, bArr2).l();
        l17.H(new x85.l(oVar));
        if (bVar != null) {
            l17.f(bVar);
        }
    }

    public final void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processMore: ");
        java.util.LinkedList linkedList = this.f424026n;
        sb6.append(linkedList.size());
        sb6.append(", ");
        java.util.LinkedList linkedList2 = this.f424027o;
        sb6.append(linkedList2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", sb6.toString());
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        int i17 = 0;
        if (linkedList.size() > 0) {
            linkedList3.add(new t85.d(f424010t, 0, 0, 6, null));
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            int i18 = 0;
            for (java.lang.Object obj : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList.add(new t85.d((r45.p64) obj, i19, 2));
                i18 = i19;
            }
            linkedList3.addAll(arrayList);
            linkedList3.add(new t85.d(f424011u, 0, 0, 6, null));
        }
        if (linkedList2.size() > 0) {
            linkedList3.add(new t85.d(f424012v, 0, 0, 6, null));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (java.lang.Object obj2 : linkedList2) {
                int i27 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(new t85.d((r45.p64) obj2, i27, 3));
                i17 = i27;
            }
            linkedList3.addAll(arrayList2);
        }
        u22.k kVar = (u22.k) this.f424014b;
        kVar.getClass();
        pm0.v.L("StickerPanelCallbackWrapper_onMore", true, new u22.g(kVar, linkedList3));
    }

    public final void d() {
        pm0.v.X(new u22.q(this));
    }

    public final void e() {
        java.util.LinkedList linkedList = this.f424026n;
        linkedList.clear();
        v85.e eVar = v85.e.f434103a;
        java.util.LinkedList lensInfoList = v85.e.f434108f.f383710d;
        kotlin.jvm.internal.o.f(lensInfoList, "lensInfoList");
        linkedList.addAll(lensInfoList);
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", "updateHistory: " + linkedList.size());
        c();
    }
}
