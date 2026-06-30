package e22;

/* loaded from: classes14.dex */
public final class d1 extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f246633d = kotlinx.coroutines.z0.b();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f246634e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f246635f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f246636g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.i0 f246637h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f246638i;

    /* renamed from: m, reason: collision with root package name */
    public final x0.i0 f246639m;

    public d1() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f246635f = n0.s4.c(bool, null, 2, null);
        this.f246636g = n0.s4.c(bool, null, 2, null);
        this.f246637h = new x0.i0();
        this.f246638i = n0.s4.c(bool, null, 2, null);
        this.f246639m = new x0.i0();
        P6();
    }

    public static final java.util.List N6(e22.d1 d1Var, java.util.List list) {
        d1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = ((com.tencent.mm.protocal.protobuf.FinderObject) next).getObjectDesc();
            if (objectDesc != null && objectDesc.getMediaType() == 4) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            if (((com.tencent.mm.protocal.protobuf.FinderObject) next2).getPrivateFlag() == 0) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public final void O6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("next, isEnded: ");
        n0.v2 v2Var = this.f246635f;
        sb6.append(v2Var);
        sb6.append(", isLoading: ");
        n0.v2 v2Var2 = this.f246636g;
        sb6.append(v2Var2);
        ot5.g.c("MicroMsg.FindersFeedViewModel", sb6.toString());
        if (((java.lang.Boolean) ((n0.q4) v2Var).getValue()).booleanValue() || ((java.lang.Boolean) ((n0.q4) v2Var2).getValue()).booleanValue()) {
            return;
        }
        ((n0.q4) v2Var2).setValue(java.lang.Boolean.TRUE);
        kotlinx.coroutines.l.d(this.f246633d, null, null, new e22.b1(this, null), 3, null);
    }

    public final void P6() {
        this.f246636g.setValue(java.lang.Boolean.TRUE);
        this.f246638i.setValue(java.lang.Boolean.FALSE);
        kotlinx.coroutines.l.d(this.f246633d, null, null, new e22.c1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        kotlinx.coroutines.z0.e(this.f246633d, null, 1, null);
    }
}
