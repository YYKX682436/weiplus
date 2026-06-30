package lu0;

/* loaded from: classes5.dex */
public final class a extends au0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.maas.imagestudio.MJImageLayer layer) {
        super(layer);
        kotlin.jvm.internal.o.g(layer, "layer");
    }

    @Override // au0.b, au0.c
    public boolean a() {
        return ((com.tencent.maas.imagestudio.MJImageLayer) this.f14053a).getLayerType() != com.tencent.maas.imagestudio.b.None;
    }

    @Override // au0.c
    public bu0.b b() {
        com.tencent.maas.imagestudio.b layerType = ((com.tencent.maas.imagestudio.MJImageLayer) this.f14053a).getLayerType();
        kotlin.jvm.internal.o.f(layerType, "getLayerType(...)");
        int ordinal = layerType.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? bu0.b.f24476d : bu0.b.f24478f : bu0.b.f24480h : bu0.b.f24479g : bu0.b.f24477e;
    }

    @Override // au0.c
    public com.tencent.maas.base.MJID c() {
        com.tencent.maas.base.MJID of6 = com.tencent.maas.base.MJID.of(((com.tencent.maas.imagestudio.MJImageLayer) this.f14053a).getLayerID());
        kotlin.jvm.internal.o.f(of6, "of(...)");
        return of6;
    }

    @Override // au0.c
    public float d() {
        return ((com.tencent.maas.imagestudio.MJImageLayer) this.f14053a).getLayerRotation();
    }

    @Override // au0.c
    public boolean isEnable() {
        return ((com.tencent.maas.imagestudio.MJImageLayer) this.f14053a).getLayerType() != com.tencent.maas.imagestudio.b.None;
    }
}
