package r45;

/* loaded from: classes8.dex */
public class uc3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f387211d;

    /* renamed from: e, reason: collision with root package name */
    public int f387212e;

    /* renamed from: f, reason: collision with root package name */
    public int f387213f;

    /* renamed from: g, reason: collision with root package name */
    public int f387214g;

    /* renamed from: h, reason: collision with root package name */
    public int f387215h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f387216i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc3)) {
            return false;
        }
        r45.uc3 uc3Var = (r45.uc3) fVar;
        return n51.f.a(this.f387211d, uc3Var.f387211d) && n51.f.a(java.lang.Integer.valueOf(this.f387212e), java.lang.Integer.valueOf(uc3Var.f387212e)) && n51.f.a(java.lang.Integer.valueOf(this.f387213f), java.lang.Integer.valueOf(uc3Var.f387213f)) && n51.f.a(java.lang.Integer.valueOf(this.f387214g), java.lang.Integer.valueOf(uc3Var.f387214g)) && n51.f.a(java.lang.Integer.valueOf(this.f387215h), java.lang.Integer.valueOf(uc3Var.f387215h)) && n51.f.a(java.lang.Integer.valueOf(this.f387216i), java.lang.Integer.valueOf(uc3Var.f387216i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f387211d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f387211d.writeFields(fVar);
            }
            fVar.e(2, this.f387212e);
            fVar.e(3, this.f387213f);
            fVar.e(4, this.f387214g);
            fVar.e(5, this.f387215h);
            fVar.e(6, this.f387216i);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f387211d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.computeSize()) : 0) + b36.f.e(2, this.f387212e) + b36.f.e(3, this.f387213f) + b36.f.e(4, this.f387214g) + b36.f.e(5, this.f387215h) + b36.f.e(6, this.f387216i);
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
        r45.uc3 uc3Var = (r45.uc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    uc3Var.f387211d = du5Var3;
                }
                return 0;
            case 2:
                uc3Var.f387212e = aVar2.g(intValue);
                return 0;
            case 3:
                uc3Var.f387213f = aVar2.g(intValue);
                return 0;
            case 4:
                uc3Var.f387214g = aVar2.g(intValue);
                return 0;
            case 5:
                uc3Var.f387215h = aVar2.g(intValue);
                return 0;
            case 6:
                uc3Var.f387216i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
