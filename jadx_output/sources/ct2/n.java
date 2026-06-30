package ct2;

/* loaded from: classes10.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ct2.o f222293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f222294b;

    public n(ct2.o oVar, yz5.l lVar) {
        this.f222293a = oVar;
        this.f222294b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        ct2.o oVar = this.f222293a;
        if (i17 == 0 && fVar.f70616b == 0) {
            oVar.f222298i = ((r45.lr1) fVar.f70618d).getByteString(3);
            boolean z17 = true;
            oVar.f222300n = ((r45.lr1) fVar.f70618d).getBoolean(1);
            oVar.f222296g.addAll(((r45.lr1) fVar.f70618d).getList(2));
            java.lang.String string = ((r45.lr1) fVar.f70618d).getString(4);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                oVar.f222299m = ((r45.lr1) fVar.f70618d).getString(4);
                java.util.LinkedList list = ((r45.lr1) fVar.f70618d).getList(6);
                kotlin.jvm.internal.o.f(list, "getResolution_node_list(...)");
                oVar.f222297h = list;
                yz5.l lVar = this.f222294b;
                if (lVar != null) {
                    java.lang.String str = oVar.f222299m;
                    kotlin.jvm.internal.o.d(str);
                    lVar.invoke(str);
                }
            }
        } else {
            java.lang.String str2 = oVar.f222295f;
        }
        return jz5.f0.f302826a;
    }
}
