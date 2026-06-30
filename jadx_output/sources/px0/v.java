package px0;

/* loaded from: classes5.dex */
public final class v implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358811d;

    public v(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358811d = materialImportPreviewFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.r41 r41Var;
        rx0.a aVar = (rx0.a) obj;
        int ordinal = aVar.f400903a.ordinal();
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358811d;
        if (ordinal == 0) {
            rx0.d dVar = aVar.f400904b;
            r45.d01 d01Var = dVar != null ? dVar.f400914c : null;
            if (d01Var != null) {
                kotlinx.coroutines.l.d(materialImportPreviewFragment.f69643d, null, null, new px0.k(d01Var, materialImportPreviewFragment, null), 3, null);
                return;
            } else {
                int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
                materialImportPreviewFragment.getClass();
                return;
            }
        }
        if (ordinal != 1) {
            return;
        }
        int i18 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
        materialImportPreviewFragment.getClass();
        rx0.c cVar = aVar.f400905c;
        if (cVar == null || (r41Var = cVar.f400911c) == null) {
            return;
        }
        com.tencent.maas.camstudio.MJAIGCQueryResponse mJAIGCQueryResponse = cVar.f400910b;
        if (kotlin.jvm.internal.o.b(mJAIGCQueryResponse != null ? mJAIGCQueryResponse.getTaskID() : null, materialImportPreviewFragment.f69655s)) {
            kotlinx.coroutines.l.d(materialImportPreviewFragment.f69643d, null, null, new px0.l(materialImportPreviewFragment, r41Var, null), 3, null);
        }
    }
}
