package mn2;

/* loaded from: classes10.dex */
public final class q0 implements c50.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f330092a = "FinderDownloader@" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f330093b = new java.util.concurrent.ConcurrentHashMap();

    public static final void b(c50.z0 z0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, mn2.q0 q0Var, java.lang.String str, int i17) {
        z0Var.a(finderItem.getId(), i17, "");
        q0Var.f330093b.remove(str);
    }

    public void c(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        dn.m mVar = (dn.m) this.f330093b.remove(mediaId);
        if (mVar != null) {
            ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            Di.j(field_mediaId, new mn2.p0(this, mVar));
            com.tencent.mars.xlog.Log.i(this.f330092a, "stopDownloadFinderVideo " + mVar);
        }
    }
}
