package r45;

/* loaded from: classes4.dex */
public class lj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379529d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ef7 f379530e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379531f;

    /* renamed from: g, reason: collision with root package name */
    public int f379532g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj6)) {
            return false;
        }
        r45.lj6 lj6Var = (r45.lj6) fVar;
        return n51.f.a(this.f379529d, lj6Var.f379529d) && n51.f.a(this.f379530e, lj6Var.f379530e) && n51.f.a(this.f379531f, lj6Var.f379531f) && n51.f.a(java.lang.Integer.valueOf(this.f379532g), java.lang.Integer.valueOf(lj6Var.f379532g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379529d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ef7 ef7Var = this.f379530e;
            if (ef7Var != null) {
                fVar.i(2, ef7Var.computeSize());
                this.f379530e.writeFields(fVar);
            }
            java.lang.String str2 = this.f379531f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f379532g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f379529d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.ef7 ef7Var2 = this.f379530e;
            if (ef7Var2 != null) {
                j17 += b36.f.i(2, ef7Var2.computeSize());
            }
            java.lang.String str4 = this.f379531f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f379532g);
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
        r45.lj6 lj6Var = (r45.lj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lj6Var.f379529d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                lj6Var.f379531f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lj6Var.f379532g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ef7 ef7Var3 = new r45.ef7();
            if (bArr != null && bArr.length > 0) {
                ef7Var3.parseFrom(bArr);
            }
            lj6Var.f379530e = ef7Var3;
        }
        return 0;
    }
}
