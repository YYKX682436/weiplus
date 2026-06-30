package yo4;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, yz5.q qVar) {
        super(2);
        this.f464251d = multiVideoPluginLayout;
        this.f464252e = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "download music success, " + str);
            int i17 = com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout.M1;
            this.f464251d.y(str, this.f464252e);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiVideoPluginLayout", "download music failed");
        }
        return jz5.f0.f302826a;
    }
}
