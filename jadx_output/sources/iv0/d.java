package iv0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(iv0.w wVar) {
        super(2);
        this.f295063d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mv0.b bVar;
        int intValue = ((java.lang.Number) obj).intValue();
        mv0.a data = (mv0.a) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        iv0.w wVar = this.f295063d;
        iv0.c cVar = (iv0.c) wVar.f69240i;
        if (cVar != null) {
            iv0.b bVar2 = wVar.f295093q;
            bVar2.getClass();
            java.util.ArrayList arrayList = bVar2.f275970d;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((mv0.a) it.next()).f331529c) {
                    break;
                }
                i17++;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                java.lang.Object remove = arrayList.remove(intValue2);
                kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                arrayList.add(intValue2, mv0.a.a((mv0.a) remove, null, 0, false, 3, null));
                bVar2.notifyItemChanged(intValue2);
            }
            arrayList.remove(intValue);
            arrayList.add(intValue, mv0.a.a(data, null, 0, true, 3, null));
            bVar2.notifyItemChanged(intValue);
            com.tencent.maas.moviecomposing.c cVar2 = data.f331527a.f331530a;
            ex0.a0 a0Var = wVar.p7().f276642r;
            if (cVar2 != ((a0Var == null || (bVar = a0Var.f257103m) == null) ? null : bVar.f331530a)) {
                pf5.e.launchUI$default(wVar, null, null, new iv0.q(wVar, data, cVar, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
