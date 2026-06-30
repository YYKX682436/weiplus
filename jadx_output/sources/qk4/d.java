package qk4;

/* loaded from: classes10.dex */
public final class d implements pk4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk4.f f364439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk4.a f364440b;

    public d(qk4.f fVar, qk4.a aVar) {
        this.f364439a = fVar;
        this.f364440b = aVar;
    }

    public void a() {
        qk4.f fVar = this.f364439a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f364448f;
        qk4.a aVar = this.f364440b;
        concurrentHashMap.remove(aVar);
        fVar.f364447e.add(aVar);
        kk4.v player = ((com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) aVar).getPlayer();
        if (player != null) {
            player.f308584i = null;
        }
        com.tencent.mars.xlog.Log.i(fVar.f364446d, "recycle videoView " + aVar.hashCode() + " idleViews:" + fVar.f364447e.size() + " busyVideoViewMap:" + fVar.f364448f.size());
    }
}
