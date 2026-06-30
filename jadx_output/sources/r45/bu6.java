package r45;

/* loaded from: classes12.dex */
public class bu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371069d;

    /* renamed from: e, reason: collision with root package name */
    public int f371070e;

    /* renamed from: f, reason: collision with root package name */
    public int f371071f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f371072g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371073h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371074i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f371075m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371076n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371077o;

    /* renamed from: p, reason: collision with root package name */
    public int f371078p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bu6)) {
            return false;
        }
        r45.bu6 bu6Var = (r45.bu6) fVar;
        return n51.f.a(this.BaseRequest, bu6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371069d), java.lang.Integer.valueOf(bu6Var.f371069d)) && n51.f.a(java.lang.Integer.valueOf(this.f371070e), java.lang.Integer.valueOf(bu6Var.f371070e)) && n51.f.a(java.lang.Integer.valueOf(this.f371071f), java.lang.Integer.valueOf(bu6Var.f371071f)) && n51.f.a(this.f371072g, bu6Var.f371072g) && n51.f.a(this.f371073h, bu6Var.f371073h) && n51.f.a(this.f371074i, bu6Var.f371074i) && n51.f.a(this.f371075m, bu6Var.f371075m) && n51.f.a(this.f371076n, bu6Var.f371076n) && n51.f.a(this.f371077o, bu6Var.f371077o) && n51.f.a(java.lang.Integer.valueOf(this.f371078p), java.lang.Integer.valueOf(bu6Var.f371078p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f371069d);
            fVar.e(3, this.f371070e);
            fVar.e(4, this.f371071f);
            r45.cu5 cu5Var = this.f371072g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f371072g.writeFields(fVar);
            }
            java.lang.String str = this.f371073h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f371074i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.cu5 cu5Var2 = this.f371075m;
            if (cu5Var2 != null) {
                fVar.i(8, cu5Var2.computeSize());
                this.f371075m.writeFields(fVar);
            }
            java.lang.String str3 = this.f371076n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f371077o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f371078p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371069d) + b36.f.e(3, this.f371070e) + b36.f.e(4, this.f371071f);
            r45.cu5 cu5Var3 = this.f371072g;
            if (cu5Var3 != null) {
                i18 += b36.f.i(5, cu5Var3.computeSize());
            }
            java.lang.String str5 = this.f371073h;
            if (str5 != null) {
                i18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f371074i;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            r45.cu5 cu5Var4 = this.f371075m;
            if (cu5Var4 != null) {
                i18 += b36.f.i(8, cu5Var4.computeSize());
            }
            java.lang.String str7 = this.f371076n;
            if (str7 != null) {
                i18 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f371077o;
            if (str8 != null) {
                i18 += b36.f.j(10, str8);
            }
            return i18 + b36.f.e(11, this.f371078p);
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
        r45.bu6 bu6Var = (r45.bu6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    bu6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bu6Var.f371069d = aVar2.g(intValue);
                return 0;
            case 3:
                bu6Var.f371070e = aVar2.g(intValue);
                return 0;
            case 4:
                bu6Var.f371071f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    bu6Var.f371072g = cu5Var5;
                }
                return 0;
            case 6:
                bu6Var.f371073h = aVar2.k(intValue);
                return 0;
            case 7:
                bu6Var.f371074i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    bu6Var.f371075m = cu5Var6;
                }
                return 0;
            case 9:
                bu6Var.f371076n = aVar2.k(intValue);
                return 0;
            case 10:
                bu6Var.f371077o = aVar2.k(intValue);
                return 0;
            case 11:
                bu6Var.f371078p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
