package pc3;

/* loaded from: classes6.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase f353406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase magicBrushServiceContextBase) {
        super(0);
        this.f353406d = magicBrushServiceContextBase;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.k4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.magicbrush.i4.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        return new pc3.t(this.f353406d, (jc3.c0) c17, (jc3.y) c18);
    }
}
