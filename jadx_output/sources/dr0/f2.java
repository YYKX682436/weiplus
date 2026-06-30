package dr0;

/* loaded from: classes12.dex */
public final class f2 extends dr0.j2 {
    public f2() {
        super(3);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f242440b.a()) {
            return false;
        }
        if (com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground()) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-deepBg");
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingDeepBg");
        if (a()) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        return null;
    }
}
