package r45;

/* loaded from: classes11.dex */
public class hv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f376467d;

    /* renamed from: e, reason: collision with root package name */
    public int f376468e;

    /* renamed from: f, reason: collision with root package name */
    public long f376469f;

    /* renamed from: g, reason: collision with root package name */
    public int f376470g;

    /* renamed from: h, reason: collision with root package name */
    public long f376471h;

    /* renamed from: i, reason: collision with root package name */
    public int f376472i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hv3)) {
            return false;
        }
        r45.hv3 hv3Var = (r45.hv3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f376467d), java.lang.Long.valueOf(hv3Var.f376467d)) && n51.f.a(java.lang.Integer.valueOf(this.f376468e), java.lang.Integer.valueOf(hv3Var.f376468e)) && n51.f.a(java.lang.Long.valueOf(this.f376469f), java.lang.Long.valueOf(hv3Var.f376469f)) && n51.f.a(java.lang.Integer.valueOf(this.f376470g), java.lang.Integer.valueOf(hv3Var.f376470g)) && n51.f.a(java.lang.Long.valueOf(this.f376471h), java.lang.Long.valueOf(hv3Var.f376471h)) && n51.f.a(java.lang.Integer.valueOf(this.f376472i), java.lang.Integer.valueOf(hv3Var.f376472i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f376467d);
            fVar.e(2, this.f376468e);
            fVar.h(3, this.f376469f);
            fVar.e(4, this.f376470g);
            fVar.h(5, this.f376471h);
            fVar.e(6, this.f376472i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f376467d) + 0 + b36.f.e(2, this.f376468e) + b36.f.h(3, this.f376469f) + b36.f.e(4, this.f376470g) + b36.f.h(5, this.f376471h) + b36.f.e(6, this.f376472i);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.hv3 hv3Var = (r45.hv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hv3Var.f376467d = aVar2.i(intValue);
                return 0;
            case 2:
                hv3Var.f376468e = aVar2.g(intValue);
                return 0;
            case 3:
                hv3Var.f376469f = aVar2.i(intValue);
                return 0;
            case 4:
                hv3Var.f376470g = aVar2.g(intValue);
                return 0;
            case 5:
                hv3Var.f376471h = aVar2.i(intValue);
                return 0;
            case 6:
                hv3Var.f376472i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
