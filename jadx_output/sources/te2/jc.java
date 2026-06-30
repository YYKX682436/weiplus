package te2;

/* loaded from: classes10.dex */
public abstract class jc implements te2.kc {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f418149d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f418150e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f418151f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f418152g;

    /* renamed from: h, reason: collision with root package name */
    public te2.lc f418153h;

    /* renamed from: i, reason: collision with root package name */
    public bm2.x8 f418154i;

    public jc(android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f418149d = context;
        this.f418150e = liveData;
        this.f418151f = statusMonitor;
        this.f418152g = basePlugin;
    }

    @Override // te2.l0
    public boolean D2(int i17, r45.xg7 xg7Var) {
        return false;
    }

    public abstract java.lang.String c();

    public abstract void f(yz5.l lVar);

    @Override // fs2.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onAttach(te2.lc callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(c(), "onAttach - start");
        this.f418153h = callback;
        callback.b();
        h();
        com.tencent.mars.xlog.Log.i(c(), "onAttach - complete");
    }

    public abstract void h();

    public final void i(java.lang.String songName, yz5.l lVar) {
        kotlin.jvm.internal.o.g(songName, "songName");
        gk2.e eVar = this.f418150e;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).m7()) {
            android.content.Context context = this.f418149d;
            db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.d5j));
            return;
        }
        ((mm2.s2) eVar.a(mm2.s2.class)).f329407i.postValue(java.lang.Boolean.FALSE);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_SING_SONG_NAME", songName);
        if (lVar != null) {
            lVar.invoke(bundle);
        }
        this.f418152g.f113325g.statusChange(qo0.b.S1, bundle);
    }

    public void m() {
        com.tencent.mars.xlog.Log.i(c(), "showMusicView - start load data");
        te2.l0.A0(this, false, null, new te2.ic(this), 3, null);
        te2.lc lcVar = this.f418153h;
        if (lcVar != null) {
            lcVar.c(true);
        }
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mars.xlog.Log.i(c(), "onDetach");
        this.f418153h = null;
        this.f418154i = null;
    }

    @Override // te2.l0
    public void u5(boolean z17, r45.xg7 xg7Var, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f418152g.W0() == null) {
            callback.invoke(0);
        } else {
            f(callback);
        }
    }
}
