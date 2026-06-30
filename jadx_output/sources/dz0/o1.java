package dz0;

/* loaded from: classes5.dex */
public final class o1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244958d;

    public o1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC) {
        this.f244958d = maasSdkUIC;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        dz0.k kVar = this.f244958d.f69785f;
        if (kVar != null) {
            java.lang.Float f17 = new java.lang.Float(floatValue);
            if (!(!java.lang.Float.isNaN(f17.floatValue()))) {
                f17 = null;
            }
            kVar.A(f17 != null ? f17.floatValue() : 0.0f);
        }
        return jz5.f0.f302826a;
    }
}
