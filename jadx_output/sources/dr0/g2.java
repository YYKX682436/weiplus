package dr0;

/* loaded from: classes12.dex */
public final class g2 extends dr0.j2 {
    public g2() {
        super(8);
    }

    @Override // dr0.j2
    public boolean a() {
        return dr0.j2.f242440b.a();
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingManual");
        if (a()) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        return null;
    }
}
