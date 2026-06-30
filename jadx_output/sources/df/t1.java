package df;

/* loaded from: classes7.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f229553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(df.w1 w1Var, yz5.a aVar) {
        super(0);
        this.f229552d = w1Var;
        this.f229553e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f229552d;
        sb6.append(w1Var.f229580d);
        sb6.append(" updateSkylineRuntimeInfo");
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        com.tencent.skyline.jni.SkylineRuntimeInfo skylineRuntimeInfo = (com.tencent.skyline.jni.SkylineRuntimeInfo) this.f229553e.invoke();
        if (skylineRuntimeInfo != null) {
            com.tencent.skyline.SkylineRuntime skylineRuntime = w1Var.f229582f;
            if (skylineRuntime != null) {
                skylineRuntime.updateRuntimeInfo(w1Var.f229580d, skylineRuntimeInfo);
            }
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "updateSkylineRuntimeInfo finished", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
