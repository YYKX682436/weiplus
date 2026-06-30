package zf0;

/* loaded from: classes12.dex */
public final class t0 implements xf0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472545d;

    public t0(zf0.v0 v0Var) {
        this.f472545d = v0Var;
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        kotlin.jvm.internal.o.g(event, "event");
        zf0.v0 v0Var = this.f472545d;
        java.lang.Integer e17 = qi3.c.e(v0Var, false, 1, null);
        if (e17 != null) {
            e17.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " cancel download origin video");
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(event.f454166a.f454177e);
        }
    }
}
