package q10;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f359513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f359514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f359513d = h0Var;
        this.f359514e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.f359513d.f310123d;
        if (!(str == null || str.length() == 0) && !this.f359514e.f310112d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBProfileUtil", "uploadFile coroutine cancelled, cancel cronet taskId=" + str);
            try {
                com.tencent.mars.cdn.CronetLogic.cancelCronetTask(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile cancelCronetTask error: " + th6.getMessage());
            }
        }
        return jz5.f0.f302826a;
    }
}
