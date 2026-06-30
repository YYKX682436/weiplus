package hu3;

/* loaded from: classes5.dex */
public final class m implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285154d;

    public m(hu3.n0 n0Var) {
        this.f285154d = n0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        boolean z17 = cVar.f475588b;
        hu3.n0 n0Var = this.f285154d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "select none filter");
            kotlinx.coroutines.l.d(n0Var.f285163g, null, null, new hu3.l(n0Var, null), 3, null);
            return;
        }
        android.os.Bundle bundle = cVar.f475589c;
        com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem improveRecordMaasFilterItem = bundle != null ? (com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem) bundle.getParcelable("PARAM_1_PARCELABLE") : null;
        if (improveRecordMaasFilterItem == null) {
            return;
        }
        kotlinx.coroutines.l.d(n0Var.f285163g, null, null, new hu3.k(improveRecordMaasFilterItem, n0Var, null), 3, null);
    }
}
