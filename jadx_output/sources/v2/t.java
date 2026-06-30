package v2;

/* loaded from: classes15.dex */
public abstract class t extends v2.i {

    /* renamed from: i0, reason: collision with root package name */
    public java.util.ArrayList f432740i0 = new java.util.ArrayList();

    public abstract void A();

    @Override // v2.i
    public void p() {
        this.f432740i0.clear();
        super.p();
    }

    @Override // v2.i
    public void r(u2.c cVar) {
        super.r(cVar);
        int size = this.f432740i0.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((v2.i) this.f432740i0.get(i17)).r(cVar);
        }
    }

    @Override // v2.i
    public void v(int i17, int i18) {
        this.O = i17;
        this.P = i18;
        int size = this.f432740i0.size();
        for (int i19 = 0; i19 < size; i19++) {
            ((v2.i) this.f432740i0.get(i19)).v(this.I + this.O, this.f432648J + this.P);
        }
    }

    @Override // v2.i
    public void y() {
        super.y();
        java.util.ArrayList arrayList = this.f432740i0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            v2.i iVar = (v2.i) this.f432740i0.get(i17);
            iVar.v(this.M + this.O, this.N + this.P);
            if (!(iVar instanceof v2.j)) {
                iVar.y();
            }
        }
    }
}
