package ku3;

/* loaded from: classes3.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f312223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(ku3.m4 m4Var) {
        super(2);
        this.f312223d = m4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem item = (com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem) obj2;
        kotlin.jvm.internal.o.g(item, "item");
        ku3.m4 m4Var = this.f312223d;
        int i17 = m4Var.f312328q;
        int i18 = item.f155704e;
        if (i18 != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuFilterPlugin", "select type >> " + i18);
            ou3.h hVar = ou3.h.f348944e;
            boolean z17 = i18 != 0;
            zt3.a aVar = m4Var.f312318d;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PARAM_1_PARCELABLE", item);
            zt3.a.V6(aVar, 5, z17, bundle, false, false, 24, null);
            m4Var.f312328q = i18;
        }
        return jz5.f0.f302826a;
    }
}
