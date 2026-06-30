package id2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(id2.v1 v1Var) {
        super(1);
        this.f290870d = v1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dl2.g gVar = (dl2.g) obj;
        if (gVar != null) {
            int i17 = gVar.f235220a;
            id2.v1 v1Var = this.f290870d;
            v1Var.L = i17;
            v1Var.W6(null);
            long j17 = gVar.f235221b;
            ((android.widget.TextView) ((jz5.n) v1Var.f290838h).getValue()).setText(java.lang.String.valueOf(j17));
            v1Var.H = j17;
            java.util.LinkedList<dl2.f> linkedList = gVar.f235222c;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (dl2.f fVar : linkedList) {
                boolean z17 = fVar.f235195a;
                r45.n30 n30Var = fVar.f235196b;
                if (!z17) {
                    n30Var.set(1, 0);
                }
                arrayList.add(n30Var);
            }
            v1Var.D = new java.util.LinkedList(arrayList);
            ((id2.q) ((jz5.n) v1Var.B).getValue()).x();
        }
        return jz5.f0.f302826a;
    }
}
