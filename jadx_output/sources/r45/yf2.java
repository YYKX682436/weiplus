package r45;

/* loaded from: classes2.dex */
public class yf2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f391034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391035e;

    /* renamed from: f, reason: collision with root package name */
    public int f391036f;

    /* renamed from: g, reason: collision with root package name */
    public long f391037g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fz2 f391038h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yf2)) {
            return false;
        }
        r45.yf2 yf2Var = (r45.yf2) fVar;
        return n51.f.a(this.f391034d, yf2Var.f391034d) && n51.f.a(this.f391035e, yf2Var.f391035e) && n51.f.a(java.lang.Integer.valueOf(this.f391036f), java.lang.Integer.valueOf(yf2Var.f391036f)) && n51.f.a(java.lang.Long.valueOf(this.f391037g), java.lang.Long.valueOf(yf2Var.f391037g)) && n51.f.a(this.f391038h, yf2Var.f391038h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f391034d;
            if (finderContact != null) {
                fVar.i(1, finderContact.computeSize());
                this.f391034d.writeFields(fVar);
            }
            java.lang.String str = this.f391035e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391036f);
            fVar.h(4, this.f391037g);
            r45.fz2 fz2Var = this.f391038h;
            if (fz2Var != null) {
                fVar.i(5, fz2Var.computeSize());
                this.f391038h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f391034d;
            int i18 = finderContact2 != null ? 0 + b36.f.i(1, finderContact2.computeSize()) : 0;
            java.lang.String str2 = this.f391035e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f391036f) + b36.f.h(4, this.f391037g);
            r45.fz2 fz2Var2 = this.f391038h;
            return fz2Var2 != null ? e17 + b36.f.i(5, fz2Var2.computeSize()) : e17;
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
        r45.yf2 yf2Var = (r45.yf2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                if (bArr != null && bArr.length > 0) {
                    finderContact3.parseFrom(bArr);
                }
                yf2Var.f391034d = finderContact3;
            }
            return 0;
        }
        if (intValue == 2) {
            yf2Var.f391035e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yf2Var.f391036f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            yf2Var.f391037g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.fz2 fz2Var3 = new r45.fz2();
            if (bArr2 != null && bArr2.length > 0) {
                fz2Var3.parseFrom(bArr2);
            }
            yf2Var.f391038h = fz2Var3;
        }
        return 0;
    }
}
