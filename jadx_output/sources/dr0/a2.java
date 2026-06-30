package dr0;

/* loaded from: classes12.dex */
public final class a2 extends dr0.j2 {
    public a2() {
        super(5);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f242440b.a() || !mm.k.j(mm.k.N, null, 1, null)) {
            return false;
        }
        dr0.p1 a17 = dr0.p1.f242489d.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a17.i(context)) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-appStandby");
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingAppStandby");
        if (a()) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        return null;
    }
}
