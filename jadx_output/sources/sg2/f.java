package sg2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final sg2.f f407895d = new sg2.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#clearOldPath ROOT_PATH_OLD=");
        java.lang.String str = sg2.x.f407956b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderGesturesFilesManager", sb6.toString());
        com.tencent.mm.vfs.w6.f(str);
        com.tencent.mars.xlog.Log.i("FinderGesturesFilesManager", "#clearOldPath done");
        return jz5.f0.f302826a;
    }
}
