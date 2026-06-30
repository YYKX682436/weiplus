package mm2;

/* loaded from: classes3.dex */
public final class l0 extends mm2.e {

    /* renamed from: s, reason: collision with root package name */
    public static final mm2.h0 f329206s = new mm2.h0(null);

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f329207f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f329208g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f329209h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329210i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.g0 f329211m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329212n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.g0 f329213o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329214p;

    /* renamed from: q, reason: collision with root package name */
    public mm2.i0 f329215q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f329216r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329207f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c).plus(new kotlinx.coroutines.x0("cheer_animation_preload")));
        this.f329209h = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329210i = liveMutableData;
        this.f329211m = liveMutableData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329212n = liveMutableData2;
        this.f329213o = liveMutableData2;
        this.f329214p = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final java.lang.String N6(r45.i30 i30Var) {
        if (i30Var != null) {
            java.lang.String string = i30Var.getString(0);
            if (!(string == null || string.length() == 0)) {
                c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(i30Var.getString(0));
                kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
                return ((c61.p2) ybVar).bj("ec_cheer_animation_dir", a17);
            }
        }
        return "";
    }

    public final void O6(mm2.i0 originCheerInfo, java.util.LinkedList linkedList) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(originCheerInfo, "originCheerInfo");
        this.f329215q = originCheerInfo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCheerAnimationInfo: ");
        if (linkedList != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[ ");
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb7.append(f329206s.b((r45.nn1) it.next()));
            }
            sb7.append(" ]");
            str = sb7.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", sb6.toString());
        if (linkedList != null) {
            java.util.ArrayList arrayList = this.f329209h;
            arrayList.clear();
            arrayList.addAll(linkedList);
            boolean z17 = false;
            r45.nn1 nn1Var = (r45.nn1) kz5.n0.a0(linkedList, 0);
            kotlinx.coroutines.r2 r2Var = this.f329208g;
            if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
                z17 = true;
            }
            if (z17 || nn1Var == null) {
                com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", "checkPreload is doing, return");
            } else {
                this.f329208g = kotlinx.coroutines.l.d(this.f329207f, kotlinx.coroutines.q1.f310570c, null, new mm2.k0(nn1Var, this, null), 2, null);
            }
        }
    }

    public final void P6(r45.lk1 lk1Var) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCheerSwitch isPluginActive: ");
        sb6.append(this.f329216r);
        sb6.append(" info: ");
        if (lk1Var != null) {
            str = "can_display: " + lk1Var.getBoolean(0) + " resource_id: " + lk1Var.getLong(1) + " speed: " + lk1Var.getDouble(2);
        } else {
            str = null;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", sb6.toString());
        if (this.f329216r && lk1Var != null) {
            java.util.Iterator it = this.f329209h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.nn1) obj).getLong(6) == lk1Var.getLong(1)) {
                        break;
                    }
                }
            }
            r45.nn1 nn1Var = (r45.nn1) obj;
            this.f329210i.postValue(nn1Var != null ? new mm2.j0(nn1Var, lk1Var.getBoolean(0), lk1Var.getDouble(2), lk1Var.getLong(3)) : null);
        }
    }
}
