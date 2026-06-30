package zf0;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zf0.v0 v0Var, java.lang.String str, vf0.o2 o2Var) {
        super(1);
        this.f472409d = v0Var;
        this.f472410e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472409d.id() + " invokeOnCancellation");
        ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Ri(this.f472410e);
        vf0.o2 o2Var = vf0.o2.f436242d;
        return jz5.f0.f302826a;
    }
}
