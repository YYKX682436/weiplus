package xs2;

/* loaded from: classes3.dex */
public final class q0 extends xs2.e {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f456368h;

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f456369i;

    /* renamed from: j, reason: collision with root package name */
    public final xs2.f0 f456370j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f456371k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.View bulletView, gk2.e buContext, xs2.f0 danmakuConfig) {
        super(bulletView, buContext, danmakuConfig);
        kotlin.jvm.internal.o.g(bulletView, "bulletView");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(danmakuConfig, "danmakuConfig");
        this.f456368h = bulletView;
        this.f456369i = buContext;
        this.f456370j = danmakuConfig;
        this.f456371k = "ReplayBulletManager";
    }

    @Override // xs2.e, xs2.o
    public void a(int i17) {
        long j17 = i17 * 1000;
        boolean z17 = this.f456319f;
        java.lang.String str = this.f456371k;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "no attach seek seek: timeStamp = " + i17);
            m(j17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek: timeStamp = ");
        sb6.append(i17);
        sb6.append(",currentTime:");
        sb6.append(this.f456318e);
        sb6.append(", ");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f456369i.a(mm2.c1.class)).f328846n;
        sb6.append(finderObject != null ? cm2.a.f43328a.x(finderObject, -1) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        i().f438852d.seek(j17);
        m(j17);
        i().f438852d.U4();
    }

    @Override // xs2.e, xs2.o
    public vp.x b() {
        return i();
    }

    @Override // xs2.o
    public void c(java.util.List list, java.lang.String source) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f456371k, "before addReplayDanmaku, size:" + i().f438852d.E6() + "; add size = " + list.size() + ", source = " + source + '!');
        vp.x i17 = i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof r45.z12) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            int i18 = 0;
            if (!it.hasNext()) {
                i17.f438852d.k1(arrayList2, false, false);
                return;
            }
            r45.z12 z12Var = (r45.z12) it.next();
            wp.a f57 = i().f5(0, z12Var);
            xp.a aVar = this.f456370j.f456328c;
            f57.f448345p = aVar != null ? aVar.f455809g : 3000;
            r45.t12 t12Var = (r45.t12) z12Var.getCustom(0);
            if (t12Var != null) {
                i18 = t12Var.getInteger(17);
            }
            f57.f448335f = i18 * 1000;
            arrayList2.add(f57);
        }
    }

    @Override // xs2.e, xs2.o
    public void d(java.util.List list) {
        super.d(list);
        if (this.f456318e >= 0) {
            i().n(0L);
        }
    }

    @Override // xs2.e, xs2.o
    public void e(float f17, boolean z17) {
        int a17 = this.f456370j.a(!z17, f17);
        xp.d.f().f455844a = a17;
        com.tencent.mars.xlog.Log.i(this.f456371k, "changeSpeed: duration=" + a17 + ", ratio=" + f17 + ", isLandscape=" + z17);
        i().j5();
    }

    @Override // xs2.e, xs2.o
    public void f(long j17, long j18) {
        if (this.f456319f) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f456369i.a(mm2.c1.class)).f328846n;
            if (finderObject != null) {
                cm2.a.f43328a.x(finderObject, -1);
            }
            if (this.f456318e == -1) {
                i().n(j17);
            }
            m(j17);
        }
    }

    @Override // xs2.e, xs2.o
    public void g(java.util.List list, long j17, boolean z17) {
        if (!this.f456319f || i().isPlaying()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restart: timeStamp = ");
        sb6.append(j17);
        sb6.append(", ");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f456369i.a(mm2.c1.class)).f328846n;
        sb6.append(finderObject != null ? cm2.a.f43328a.x(finderObject, -1) : null);
        com.tencent.mars.xlog.Log.i(this.f456371k, sb6.toString());
        if (list != null) {
            c(list, "restart");
        }
        i().n(j17);
        if (z17) {
            i().f(false);
        }
    }

    @Override // xs2.e
    public java.lang.String j() {
        return this.f456371k;
    }

    @Override // xs2.e, xs2.o
    public void onDetach() {
        super.onDetach();
    }
}
