package ni2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.h0 f337282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ni2.h0 h0Var) {
        super(1);
        this.f337282d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        aj2.d it = (aj2.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof aj2.e) {
            ni2.h0 h0Var = this.f337282d;
            if (h0Var.f337316r.f211363x) {
                java.lang.String str3 = h0Var.f337319u;
                java.lang.String str4 = "";
                km2.q qVar = ((aj2.e) it).f5302a;
                if (qVar == null || (str = qVar.f309170a) == null) {
                    str = "";
                }
                h0Var.e(!kotlin.jvm.internal.o.b(str3, str));
                if (qVar != null && (str2 = qVar.f309170a) != null) {
                    str4 = str2;
                }
                h0Var.f337319u = str4;
                bj2.b bVar = h0Var.B;
                java.util.LinkedList linkedList = bVar.f21147f;
                if (linkedList != null) {
                    bVar.b(h0Var.f337322x == 2 ? 4 : 2, linkedList, str4);
                }
                java.util.Iterator it6 = ((java.util.ArrayList) ((jz5.n) h0Var.D).getValue()).iterator();
                while (true) {
                    java.lang.String str5 = null;
                    if (!it6.hasNext()) {
                        break;
                    }
                    aj2.a aVar = (aj2.a) it6.next();
                    km2.q qVar2 = aVar.f5292d;
                    if (qVar2 != null) {
                        str5 = qVar2.f309170a;
                    }
                    aVar.f5293e = kotlin.jvm.internal.o.b(str5, h0Var.f337319u);
                }
                aj2.f fVar = h0Var.E;
                if (fVar == null) {
                    kotlin.jvm.internal.o.o("focusSelectAdapter");
                    throw null;
                }
                fVar.notifyDataSetChanged();
            }
        }
        return jz5.f0.f302826a;
    }
}
