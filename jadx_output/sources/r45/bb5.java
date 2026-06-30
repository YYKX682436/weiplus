package r45;

/* loaded from: classes4.dex */
public class bb5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370656d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370657e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370658f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kq6 f370659g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bb5)) {
            return false;
        }
        r45.bb5 bb5Var = (r45.bb5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370656d), java.lang.Integer.valueOf(bb5Var.f370656d)) && n51.f.a(this.f370657e, bb5Var.f370657e) && n51.f.a(this.f370658f, bb5Var.f370658f) && n51.f.a(this.f370659g, bb5Var.f370659g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370656d);
            java.lang.String str = this.f370657e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370658f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.kq6 kq6Var = this.f370659g;
            if (kq6Var != null) {
                fVar.i(4, kq6Var.computeSize());
                this.f370659g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370656d) + 0;
            java.lang.String str3 = this.f370657e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f370658f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            r45.kq6 kq6Var2 = this.f370659g;
            return kq6Var2 != null ? e17 + b36.f.i(4, kq6Var2.computeSize()) : e17;
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
        r45.bb5 bb5Var = (r45.bb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bb5Var.f370656d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bb5Var.f370657e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bb5Var.f370658f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.kq6 kq6Var3 = new r45.kq6();
            if (bArr != null && bArr.length > 0) {
                kq6Var3.parseFrom(bArr);
            }
            bb5Var.f370659g = kq6Var3;
        }
        return 0;
    }
}
