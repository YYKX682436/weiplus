package rh1;

/* loaded from: classes7.dex */
public class c extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f395627x;

    public c(ak3.c cVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(cVar);
        this.f395627x = o6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
    }

    @Override // jk3.b
    public void B(boolean z17) {
        j();
        super.B(z17);
    }

    @Override // jk3.b
    public boolean F(int i17) {
        return i17 != 3;
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        j();
        return super.U(i17, z17);
    }

    @Override // jk3.b, jk3.e
    public boolean c(int i17) {
        return i17 != 3;
    }

    @Override // jk3.b, jk3.e
    public void j() {
        try {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = this.f395627x.u0();
            if (u07 != null) {
                this.f300077a.v0().set(5, u07.f77280f);
                this.f300077a.v0().set(0, u07.f77279e);
                if (this.f395627x.f74805p.f77281g == 1) {
                    this.f300077a.v0().set(8, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9));
                } else if (this.f395627x.f74805p.f77281g == 2) {
                    this.f300077a.v0().set(8, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8));
                } else {
                    this.f300077a.v0().set(8, null);
                }
                r45.n8 n8Var = new r45.n8();
                n8Var.set(0, u07.f77278d);
                n8Var.set(1, u07.f47278x);
                n8Var.set(2, java.lang.Integer.valueOf(u07.f77281g));
                n8Var.set(3, java.lang.Integer.valueOf(u07.f47284z));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskHelper", "fillMultiTaskInfo username:%s,appid:%s,versionType:%d", n8Var.getString(1), n8Var.getString(0), java.lang.Integer.valueOf(n8Var.getInteger(2)));
                this.f300077a.field_data = n8Var.toByteArray();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e17.getMessage());
        }
    }

    @Override // jk3.b
    public boolean v() {
        return false;
    }

    @Override // jk3.b
    public boolean x() {
        return ((rh1.e) this.f300111d).g();
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        super.y(i17, str);
    }
}
