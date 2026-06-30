package xn0;

/* loaded from: classes3.dex */
public final class i extends com.tencent.mm.network.a0 {

    /* renamed from: f, reason: collision with root package name */
    public static int f455426f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f455427g;

    /* renamed from: d, reason: collision with root package name */
    public static final xn0.i f455424d = new xn0.i();

    /* renamed from: e, reason: collision with root package name */
    public static xn0.e f455425e = xn0.e.f455412f;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f455428h = jz5.h.b(xn0.h.f455423d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f455429i = jz5.h.b(xn0.g.f455422d);

    @Override // com.tencent.mm.network.b0
    public void Xe(boolean z17, int i17) {
        f455427g = z17;
        f455426f = i17;
    }

    public final xn0.e d(int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        xn0.e eVar = f455425e;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.HashMap) ((jz5.n) f455428h).getValue()).get(java.lang.Integer.valueOf(i17));
        if (arrayList == null) {
            return eVar;
        }
        int size = arrayList.size();
        if (size >= 3) {
            java.util.Iterator it = arrayList.iterator();
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            i28 = 0;
            while (it.hasNext()) {
                kn0.e eVar2 = ((xn0.f) it.next()).f455420a;
                int i47 = eVar2.f309521s;
                i37 += i47;
                i38 += eVar2.f309514l;
                i39 += eVar2.f309510h;
                i28 = java.lang.Math.max(i28, i47);
            }
            i18 = i37 / size;
            i19 = i38 / size;
            i27 = i39 / size;
            java.util.Iterator it6 = arrayList.iterator();
            i29 = 0;
            while (it6.hasNext()) {
                int i48 = ((xn0.f) it6.next()).f455420a.f309510h - i27;
                i29 += i48 * i48;
            }
            double sqrt = java.lang.Math.sqrt(i29 / size);
            if (i28 <= 25) {
                eVar = xn0.e.f455413g;
            } else if (i18 <= 45) {
                eVar = sqrt < ((double) i27) * 0.1d ? xn0.e.f455414h : xn0.e.f455415i;
            } else if (i18 > 450 && sqrt > i27 * 0.5d) {
                eVar = xn0.e.f455416m;
            }
        } else {
            i18 = 0;
            i19 = 0;
            i27 = 0;
            i28 = 0;
            i29 = 0;
        }
        int i49 = 0;
        if (size > 0) {
            i49 = ((xn0.f) arrayList.get(0)).f455421b;
            if (i49 >= 10) {
                eVar = xn0.e.f455411e.a(java.lang.Math.max(eVar.f455419d, 5));
            } else if (i49 >= 3) {
                eVar = xn0.e.f455411e.a(java.lang.Math.max(eVar.f455419d, 4));
            } else if (i49 > 1) {
                eVar = xn0.e.f455411e.a(java.lang.Math.max(eVar.f455419d, 3));
            }
        }
        if (f455427g && i49 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Live.FLVNetworkInfo", "Poor network from mars, lastRTT:" + f455426f + ", preQuality:" + eVar);
            eVar = xn0.e.f455411e.a(java.lang.Math.max(eVar.f455419d, 4));
        }
        if (com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a) == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Live.FLVNetworkInfo", "network down, lastRTT:" + f455426f + ", preQuality:" + eVar);
            eVar = xn0.e.f455417n;
        }
        jz5.g gVar = f455429i;
        xn0.c cVar = (xn0.c) ((java.util.HashMap) ((jz5.n) gVar).getValue()).get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            cVar = new xn0.c();
        }
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        ((java.util.HashMap) ((jz5.n) gVar).getValue()).put(java.lang.Integer.valueOf(i17), cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.Live.FLVNetworkInfo", "videoQualityLevel:" + i17 + ",cnt:" + size + ", blockCnt:" + i49 + ", quality:" + eVar + ", maxJitter:" + i28 + ", avgJitter:" + i18 + ", avgSpeed:" + i19 + ", avgFps:" + i27 + ", fpsVar:" + i29);
        return eVar;
    }
}
