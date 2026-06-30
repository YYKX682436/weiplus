package r45;

/* loaded from: classes9.dex */
public class rm5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.il f385013d;

    /* renamed from: e, reason: collision with root package name */
    public int f385014e;

    /* renamed from: f, reason: collision with root package name */
    public long f385015f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385016g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rm5)) {
            return false;
        }
        r45.rm5 rm5Var = (r45.rm5) fVar;
        return n51.f.a(this.f385013d, rm5Var.f385013d) && n51.f.a(java.lang.Integer.valueOf(this.f385014e), java.lang.Integer.valueOf(rm5Var.f385014e)) && n51.f.a(java.lang.Long.valueOf(this.f385015f), java.lang.Long.valueOf(rm5Var.f385015f)) && n51.f.a(this.f385016g, rm5Var.f385016g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.il ilVar = this.f385013d;
            if (ilVar != null) {
                fVar.i(1, ilVar.computeSize());
                this.f385013d.writeFields(fVar);
            }
            fVar.e(2, this.f385014e);
            fVar.h(3, this.f385015f);
            java.lang.String str = this.f385016g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.il ilVar2 = this.f385013d;
            int i18 = (ilVar2 != null ? 0 + b36.f.i(1, ilVar2.computeSize()) : 0) + b36.f.e(2, this.f385014e) + b36.f.h(3, this.f385015f);
            java.lang.String str2 = this.f385016g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.rm5 rm5Var = (r45.rm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rm5Var.f385014e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                rm5Var.f385015f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rm5Var.f385016g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.il ilVar3 = new r45.il();
            if (bArr != null && bArr.length > 0) {
                ilVar3.parseFrom(bArr);
            }
            rm5Var.f385013d = ilVar3;
        }
        return 0;
    }
}
