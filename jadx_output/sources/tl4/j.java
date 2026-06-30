package tl4;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.l f420316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f420317e;

    public j(tl4.l lVar, bw5.jq0 jq0Var) {
        this.f420316d = lVar;
        this.f420317e = jq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qk.b9 b9Var = (qk.b9) i95.n0.c(qk.b9.class);
        tl4.l lVar = this.f420316d;
        com.tencent.unit_rc.WeakPtr weakPtr = lVar.f420321e;
        bw5.eq0 appId = lVar.f420320d;
        ef0.q3 q3Var = (ef0.q3) b9Var;
        q3Var.getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        bw5.jq0 playingInfo = this.f420317e;
        kotlin.jvm.internal.o.g(playingInfo, "playingInfo");
        java.util.Iterator it = q3Var.f252306d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ting.media.TingMediaBrowserService) ((rl4.b) it.next())).i(weakPtr, appId, playingInfo);
        }
    }
}
