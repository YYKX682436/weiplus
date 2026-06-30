package dk2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f234085a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public long f234086b;

    public final void a(r45.tt1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        try {
            r45.b32 b32Var = (r45.b32) resp.getCustom(1);
            java.util.List list = b32Var != null ? b32Var.f370496d : null;
            if (list == null) {
                list = kz5.p0.f313996d;
            }
            java.util.ArrayList arrayList = this.f234085a;
            arrayList.clear();
            arrayList.addAll(list);
            this.f234086b = resp.getLong(2);
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPanelData", "updateMusicInfo version:" + this.f234086b + ", size:" + arrayList.size());
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicPanelData updateMusicInfo");
        }
    }
}
