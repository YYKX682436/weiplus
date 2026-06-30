package lw0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw0.l f321535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lw0.l lVar) {
        super(1);
        this.f321535d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo = (com.tencent.maas.moviecomposing.segments.GeographicInfo) obj;
        if (geographicInfo != null) {
            lw0.l lVar = this.f321535d;
            lw0.c cVar = (lw0.c) lVar.f69240i;
            if (cVar != null) {
                cVar.setWhereText(geographicInfo.getName());
            }
            lVar.r7(geographicInfo);
        }
        return jz5.f0.f302826a;
    }
}
