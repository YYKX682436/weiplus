package r45;

/* loaded from: classes2.dex */
public class te1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386344d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386345e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f386346f;

    /* renamed from: g, reason: collision with root package name */
    public int f386347g;

    /* renamed from: h, reason: collision with root package name */
    public int f386348h;

    /* renamed from: i, reason: collision with root package name */
    public long f386349i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te1)) {
            return false;
        }
        r45.te1 te1Var = (r45.te1) fVar;
        return n51.f.a(this.f386344d, te1Var.f386344d) && n51.f.a(this.f386345e, te1Var.f386345e) && n51.f.a(this.f386346f, te1Var.f386346f) && n51.f.a(java.lang.Integer.valueOf(this.f386347g), java.lang.Integer.valueOf(te1Var.f386347g)) && n51.f.a(java.lang.Integer.valueOf(this.f386348h), java.lang.Integer.valueOf(te1Var.f386348h)) && n51.f.a(java.lang.Long.valueOf(this.f386349i), java.lang.Long.valueOf(te1Var.f386349i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386344d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386345e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f386346f;
            if (finderContact != null) {
                fVar.i(3, finderContact.computeSize());
                this.f386346f.writeFields(fVar);
            }
            fVar.e(4, this.f386347g);
            fVar.e(5, this.f386348h);
            fVar.h(6, this.f386349i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386344d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f386345e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f386346f;
            if (finderContact2 != null) {
                j17 += b36.f.i(3, finderContact2.computeSize());
            }
            return j17 + b36.f.e(4, this.f386347g) + b36.f.e(5, this.f386348h) + b36.f.h(6, this.f386349i);
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
        r45.te1 te1Var = (r45.te1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                te1Var.f386344d = aVar2.k(intValue);
                return 0;
            case 2:
                te1Var.f386345e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                    if (bArr != null && bArr.length > 0) {
                        finderContact3.parseFrom(bArr);
                    }
                    te1Var.f386346f = finderContact3;
                }
                return 0;
            case 4:
                te1Var.f386347g = aVar2.g(intValue);
                return 0;
            case 5:
                te1Var.f386348h = aVar2.g(intValue);
                return 0;
            case 6:
                te1Var.f386349i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
