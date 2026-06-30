package h31;

/* loaded from: classes9.dex */
public final class q implements m31.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f278426a;

    public q(h31.r rVar) {
        this.f278426a = rVar;
    }

    @Override // m31.o0
    public void a(java.lang.String templateId, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        j31.e eVar = j31.e.f297392a;
        if (i17 < j31.e.f297395d) {
            java.util.ArrayList arrayList = (java.util.ArrayList) j31.e.f297394c;
            arrayList.set(i17, java.lang.Integer.valueOf(((java.lang.Number) arrayList.get(i17)).intValue() + 1));
        }
        eVar.c(5, this.f278426a.f278445s);
    }
}
