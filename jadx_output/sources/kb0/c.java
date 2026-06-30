package kb0;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0.g f306193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kb0.g gVar) {
        super(0);
        this.f306193d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kb0.g gVar = this.f306193d;
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (com.tencent.mm.pluginsdk.ui.otherway.w wVar : gVar.f306199c) {
            java.lang.String c17 = gVar.c(wVar, i17);
            if (c17 != null) {
                gVar.f306207k.put(gVar.b(wVar), java.lang.Integer.valueOf(i17));
                i17++;
                arrayList.add(c17);
            }
        }
        return kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
    }
}
