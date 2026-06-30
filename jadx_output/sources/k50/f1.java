package k50;

/* loaded from: classes3.dex */
public final class f1 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f304209d;

    /* renamed from: e, reason: collision with root package name */
    public final t21.v2 f304210e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f304211f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f304212g;

    public f1(java.util.List usernameList, t21.v2 videoInfo, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        this.f304209d = usernameList;
        this.f304210e = videoInfo;
        this.f304211f = f9Var;
        this.f304212g = str;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        if (r1Var != null) {
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.v2 h17 = t21.d3.h(r1Var.f445529a);
            if (h17 == null || h17.f415011i != 199) {
                return;
            }
            java.lang.String d17 = h17.d();
            t21.v2 videoInfo = this.f304210e;
            if (kotlin.jvm.internal.o.b(d17, videoInfo.d())) {
                com.tencent.mm.storage.f9 f9Var = this.f304211f;
                java.lang.String str = this.f304212g;
                java.util.List usernameList = this.f304209d;
                kotlin.jvm.internal.o.g(usernameList, "usernameList");
                kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new k50.c1(usernameList, f9Var, videoInfo, str, null), 3, null);
            }
        }
    }
}
