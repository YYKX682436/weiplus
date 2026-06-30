package kh;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.f0 f307784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kh.f0 f0Var, java.lang.String str) {
        super(0);
        this.f307784d = f0Var;
        this.f307785e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            this.f307784d.f307793d.run();
            return jz5.f0.f302826a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.ChoreographerTracker", e17, "run err: " + e17.getMessage(), new java.lang.Object[0]);
            ap.a.a(1, "errTrackChoreographer", e17, null, "errAction", "run", this.f307785e, e17.getMessage());
            throw e17;
        }
    }
}
