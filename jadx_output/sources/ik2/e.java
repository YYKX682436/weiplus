package ik2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f291885a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f291886b;

    /* renamed from: c, reason: collision with root package name */
    public hq0.e0 f291887c;

    public e() {
        ((oe0.x) i95.n0.c(oe0.x.class)).getClass();
        this.f291885a = "wxe208ce76dfa39515";
    }

    public final void a(android.content.Context context, java.lang.String finderUserName, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetSurfaceMgr", "createFrameSetRoot now:" + this.f291887c);
        if (this.f291887c == null) {
            this.f291887c = ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).wi(new java.lang.Object(), context, new oe0.u(finderUserName, j17, null, null, null, null, null, null, 252, null));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetSurfaceMgr", "createFrameSetRoot done now:" + this.f291887c);
        }
    }

    public final void b() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetSurfaceMgr", "unMount");
        hq0.e0 e0Var = this.f291887c;
        if (e0Var != null && (str = e0Var.f282984e) != null) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(str);
        }
        this.f291887c = null;
    }
}
