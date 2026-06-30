package yo4;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, yz5.q qVar) {
        super(2);
        this.f464271d = multiVideoFullScreenPluginLayout;
        this.f464272e = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            if (!(str == null || str.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "download music success, " + str);
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = str;
                kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yo4.m0(this.f464271d, h0Var, str, this.f464272e, null), 2, null);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "download music failed");
        this.f464271d.B.z();
        return jz5.f0.f302826a;
    }
}
