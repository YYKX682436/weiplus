package so4;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.i1 f410768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f410769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f410770f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.vlog.model.i1 i1Var, kotlin.jvm.internal.h0 h0Var, java.lang.Object obj) {
        super(2);
        this.f410768d = i1Var;
        this.f410769e = h0Var;
        this.f410770f = obj;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFrames finish, timeMs:");
        sb6.append(longValue);
        sb6.append(", bitmap:");
        sb6.append(bitmap);
        sb6.append(", size:[");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append(", ");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append("], source size:[");
        sb6.append(this.f410768d.f175627l.f397509k);
        sb6.append(", ");
        sb6.append(this.f410768d.f175627l.f397510l);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", sb6.toString());
        this.f410769e.f310123d = bitmap;
        java.lang.Object obj3 = this.f410770f;
        synchronized (obj3) {
            try {
                obj3.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LocalEffectManager", e17, "", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
