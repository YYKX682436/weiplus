package pc3;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase f353405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase magicBrushServiceContextBase) {
        super(2);
        this.f353405d = magicBrushServiceContextBase;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String eventName = (java.lang.String) obj;
        java.lang.String data = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase.f147890f;
        this.f353405d.a().e(eventName, data);
        return jz5.f0.f302826a;
    }
}
