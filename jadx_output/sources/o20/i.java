package o20;

/* loaded from: classes14.dex */
public final class i implements o20.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk4.b f342382a;

    /* renamed from: b, reason: collision with root package name */
    public final q20.l f342383b;

    /* renamed from: c, reason: collision with root package name */
    public o20.t f342384c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f342385d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f342386e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f342387f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f342388g;

    /* renamed from: h, reason: collision with root package name */
    public final o20.h f342389h;

    public i() {
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kk4.b Ai = ((cf0.q) qVar).Ai(context);
        this.f342382a = Ai;
        this.f342383b = new q20.j();
        this.f342384c = o20.l.f342392a;
        this.f342385d = new java.util.concurrent.CopyOnWriteArrayList();
        this.f342386e = new java.util.concurrent.CopyOnWriteArrayList();
        this.f342387f = new java.util.concurrent.CopyOnWriteArrayList();
        this.f342388g = jz5.h.b(o20.g.f342380d);
        ((kk4.v) Ai).f308585j = true;
        kk4.v vVar = (kk4.v) Ai;
        vVar.G(new o20.a(this));
        vVar.f308596u = new o20.b(this);
        vVar.f308597v = new o20.c(this);
        vVar.f308595t = new o20.d(this);
        vVar.D(new o20.e(this));
        vVar.K = new o20.f(this);
        this.f342389h = new o20.h(this);
    }

    public void a() {
        if (kz5.z.G(new o20.t[]{o20.q.f342397a}, this.f342384c)) {
            c(this.f342389h);
        }
        kk4.b.i(this.f342382a, false, false, 3, null);
    }

    public void b() {
        ((kk4.v) this.f342382a).recycle();
        this.f342385d.clear();
        this.f342387f.clear();
        f(o20.r.f342398a);
        ((q20.j) this.f342383b).b();
    }

    public void c(o20.u listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f342385d;
        if (copyOnWriteArrayList.contains(listener)) {
            copyOnWriteArrayList.remove(listener);
        }
    }

    public void d(bw5.w9 videoInfo) {
        java.lang.Object obj;
        bw5.v9 v9Var;
        java.lang.Object obj2;
        java.lang.Object obj3;
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        java.util.LinkedList linkedList = videoInfo.f34614d;
        jz5.f0 f0Var = null;
        if (((java.lang.Boolean) ((jz5.n) this.f342388g).getValue()).booleanValue()) {
            kotlin.jvm.internal.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((bw5.v9) obj2).f34222g == 2) {
                        break;
                    }
                }
            }
            v9Var = (bw5.v9) obj2;
            if (v9Var == null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it6.next();
                        if (((bw5.v9) obj3).f34222g == 1) {
                            break;
                        }
                    }
                }
                v9Var = (bw5.v9) obj3;
                if (v9Var == null) {
                    v9Var = (bw5.v9) kz5.n0.Z(linkedList);
                }
            }
        } else {
            kotlin.jvm.internal.o.d(linkedList);
            java.util.Iterator it7 = linkedList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it7.next();
                    if (((bw5.v9) obj).f34222g == 1) {
                        break;
                    }
                }
            }
            v9Var = (bw5.v9) obj;
            if (v9Var == null) {
                v9Var = (bw5.v9) kz5.n0.Z(linkedList);
            }
        }
        if (v9Var != null) {
            java.lang.String str = v9Var.f34225m[1] ? v9Var.f34219d : "";
            kotlin.jvm.internal.o.f(str, "getUrl(...)");
            p20.j jVar = new p20.j(str);
            ((kk4.v) this.f342382a).B(new dk4.a(jVar.b(), jVar.a(), jVar.f351423a, 0, 0));
            f(o20.m.f342393a);
            int i17 = v9Var.f34221f;
            int i18 = v9Var.f34220e;
            java.util.Iterator it8 = this.f342386e.iterator();
            while (it8.hasNext()) {
                ((com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView) ((com.tencent.mm.feature.ecs.product.player.EcsVideoView) ((o20.w) it8.next())).f65933d).m(i17, i18);
            }
            java.lang.String str2 = videoInfo.f34616f[2] ? videoInfo.f34615e : "";
            kotlin.jvm.internal.o.f(str2, "getVideoHeadImg(...)");
            java.util.Iterator it9 = this.f342387f.iterator();
            while (it9.hasNext()) {
                ((com.tencent.mm.feature.ecs.product.player.EcsVideoView) ((o20.v) it9.next())).b(str2);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("EcsPlayer", "未找到合适的视频数据源");
            f(new o20.k(new o20.d0(-1, -1, "未找到合适的视频数据源", null, 8, null)));
        }
    }

    public void e() {
        ((q20.j) this.f342383b).onStart();
        kk4.v vVar = (kk4.v) this.f342382a;
        if (!(vVar.f308579d == 3)) {
            vVar.O();
            return;
        }
        o20.h listener = this.f342389h;
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f342385d.add(listener);
    }

    public final void f(o20.t tVar) {
        o20.t tVar2 = this.f342384c;
        if (kotlin.jvm.internal.o.b(tVar2, tVar)) {
            return;
        }
        this.f342384c = tVar;
        java.util.Iterator it = this.f342385d.iterator();
        while (it.hasNext()) {
            ((o20.u) it.next()).a(tVar2, tVar);
        }
    }
}
