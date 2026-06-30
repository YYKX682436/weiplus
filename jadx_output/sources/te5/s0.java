package te5;

/* loaded from: classes9.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f418745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f418746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(rd5.d dVar, yb5.d dVar2) {
        super(0);
        this.f418745d = dVar;
        this.f418746e = dVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        java.lang.String b17 = ic5.f.f290437c.b(this.f418745d.f394254d.f445300b);
        com.tencent.mm.ui.chatting.component.v4 v4Var = (com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) this.f418746e.f460708c.a(sb5.b0.class));
        v4Var.getClass();
        java.util.Map map = v4Var.f200114f;
        kotlin.jvm.internal.o.g(map, "<this>");
        com.tencent.mm.ui.chatting.component.p4 p4Var = (com.tencent.mm.ui.chatting.component.p4) ((java.util.LinkedHashMap) map).get(b17);
        if (p4Var == null || (list = p4Var.f199673b) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(v4Var.f198580d.u().d1(), ((java.lang.Number) it.next()).longValue());
            if (k17 != null) {
                arrayList.add(k17);
            }
        }
        return arrayList;
    }
}
