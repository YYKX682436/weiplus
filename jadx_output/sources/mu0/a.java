package mu0;

/* loaded from: classes5.dex */
public final class a implements bu0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.MJImageLayer f331333a;

    public a(com.tencent.maas.imagestudio.MJImageLayer layer) {
        kotlin.jvm.internal.o.g(layer, "layer");
        this.f331333a = layer;
    }

    @Override // bu0.a
    public java.lang.String a() {
        java.lang.String placeholder = this.f331333a.getPlaceholder();
        return placeholder == null ? "" : placeholder;
    }

    @Override // bu0.a
    public boolean c(java.lang.String materialID) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        return this.f331333a.e(materialID);
    }

    @Override // bu0.a
    public java.lang.String d() {
        return this.f331333a.getMaterialID();
    }
}
