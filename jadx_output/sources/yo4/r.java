package yo4;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        super(2);
        this.f464305d = multiVideoFullScreenPluginLayout;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        if (intValue != intValue2) {
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464305d;
            java.lang.Object obj3 = multiVideoFullScreenPluginLayout.H.f175730d.get(intValue);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            com.tencent.mm.plugin.vlog.model.u0 u0Var = multiVideoFullScreenPluginLayout.H;
            u0Var.f175730d.remove(intValue);
            u0Var.f175730d.add(intValue2, (java.lang.String) obj3);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "user change image index from:" + intValue + " to:" + intValue2);
        }
        return jz5.f0.f302826a;
    }
}
