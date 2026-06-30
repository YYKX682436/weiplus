package lf4;

/* loaded from: classes4.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(boolean z17, lf4.j1 j1Var) {
        super(0);
        this.f318496d = z17;
        this.f318497e = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.j1 j1Var = this.f318497e;
        boolean z17 = this.f318496d;
        if (z17) {
            int size = j1Var.f318422i.size();
            int i17 = j1Var.f318426p;
            if (i17 >= 0 && i17 < size) {
                java.util.ArrayList arrayList = j1Var.f318422i;
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                int size2 = arrayList2.size();
                int i18 = j1Var.f318427q;
                if (i18 >= 0 && i18 < size2) {
                    arrayList2.remove(i18);
                    java.util.ArrayList arrayList3 = j1Var.f318431u;
                    java.lang.Object obj2 = arrayList3.get(j1Var.f318426p);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    java.lang.String str = (java.lang.String) obj2;
                    j1Var.o(str, arrayList2);
                    if (arrayList2.isEmpty()) {
                        arrayList.remove(arrayList2);
                        arrayList3.remove(j1Var.f318426p);
                        j1Var.f318423m.remove(j1Var.f318426p);
                        j1Var.f318424n.remove(str);
                    }
                }
            }
        }
        ((sf4.a1) j1Var.f318419f).b(z17);
        j1Var.f318426p = -1;
        j1Var.f318427q = -1;
        return jz5.f0.f302826a;
    }
}
