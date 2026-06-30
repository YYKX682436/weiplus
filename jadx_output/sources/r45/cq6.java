package r45;

/* loaded from: classes4.dex */
public class cq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371791d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371792e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371793f;

    /* renamed from: g, reason: collision with root package name */
    public int f371794g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f371795h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371796i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cq6)) {
            return false;
        }
        r45.cq6 cq6Var = (r45.cq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371791d), java.lang.Integer.valueOf(cq6Var.f371791d)) && n51.f.a(this.f371792e, cq6Var.f371792e) && n51.f.a(this.f371793f, cq6Var.f371793f) && n51.f.a(java.lang.Integer.valueOf(this.f371794g), java.lang.Integer.valueOf(cq6Var.f371794g)) && n51.f.a(this.f371795h, cq6Var.f371795h) && n51.f.a(this.f371796i, cq6Var.f371796i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371791d);
            java.lang.String str = this.f371792e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371793f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f371794g);
            r45.cu5 cu5Var = this.f371795h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f371795h.writeFields(fVar);
            }
            java.lang.String str3 = this.f371796i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371791d) + 0;
            java.lang.String str4 = this.f371792e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f371793f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f371794g);
            r45.cu5 cu5Var2 = this.f371795h;
            if (cu5Var2 != null) {
                e18 += b36.f.i(5, cu5Var2.computeSize());
            }
            java.lang.String str6 = this.f371796i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.cq6 cq6Var = (r45.cq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cq6Var.f371791d = aVar2.g(intValue);
                return 0;
            case 2:
                cq6Var.f371792e = aVar2.k(intValue);
                return 0;
            case 3:
                cq6Var.f371793f = aVar2.k(intValue);
                return 0;
            case 4:
                cq6Var.f371794g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    cq6Var.f371795h = cu5Var3;
                }
                return 0;
            case 6:
                cq6Var.f371796i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
