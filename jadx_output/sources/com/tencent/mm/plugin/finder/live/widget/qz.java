package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qz implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f119562d;

    @Override // l81.p0
    public java.lang.String a() {
        try {
            cl0.g gVar = new cl0.g(this.f119562d);
            gVar.r("usePushAnimation", true);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.d(gVar2);
            return gVar2;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveVisitorGameTeamWidget", e17, "extraData toJsonString", new java.lang.Object[0]);
            return "{}";
        }
    }

    public java.lang.String toString() {
        return a();
    }
}
