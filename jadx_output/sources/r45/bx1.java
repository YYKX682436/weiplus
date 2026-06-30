package r45;

/* loaded from: classes4.dex */
public class bx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f371111d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371112e;

    /* renamed from: f, reason: collision with root package name */
    public long f371113f;

    /* renamed from: g, reason: collision with root package name */
    public long f371114g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371115h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371116i;

    /* renamed from: m, reason: collision with root package name */
    public int f371117m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371118n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bx1)) {
            return false;
        }
        r45.bx1 bx1Var = (r45.bx1) fVar;
        return n51.f.a(this.BaseRequest, bx1Var.BaseRequest) && n51.f.a(this.f371111d, bx1Var.f371111d) && n51.f.a(this.f371112e, bx1Var.f371112e) && n51.f.a(java.lang.Long.valueOf(this.f371113f), java.lang.Long.valueOf(bx1Var.f371113f)) && n51.f.a(java.lang.Long.valueOf(this.f371114g), java.lang.Long.valueOf(bx1Var.f371114g)) && n51.f.a(this.f371115h, bx1Var.f371115h) && n51.f.a(this.f371116i, bx1Var.f371116i) && n51.f.a(java.lang.Integer.valueOf(this.f371117m), java.lang.Integer.valueOf(bx1Var.f371117m)) && n51.f.a(this.f371118n, bx1Var.f371118n);
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
            r45.kv0 kv0Var = this.f371111d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f371111d.writeFields(fVar);
            }
            java.lang.String str = this.f371112e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f371113f);
            fVar.h(5, this.f371114g);
            java.lang.String str2 = this.f371115h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f371116i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f371117m);
            com.tencent.mm.protobuf.g gVar2 = this.f371118n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f371111d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f371112e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f371113f) + b36.f.h(5, this.f371114g);
            java.lang.String str4 = this.f371115h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f371116i;
            if (gVar3 != null) {
                h17 += b36.f.b(7, gVar3);
            }
            int e17 = h17 + b36.f.e(8, this.f371117m);
            com.tencent.mm.protobuf.g gVar4 = this.f371118n;
            return gVar4 != null ? e17 + b36.f.b(9, gVar4) : e17;
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
        r45.bx1 bx1Var = (r45.bx1) objArr[1];
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
                    bx1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    bx1Var.f371111d = kv0Var3;
                }
                return 0;
            case 3:
                bx1Var.f371112e = aVar2.k(intValue);
                return 0;
            case 4:
                bx1Var.f371113f = aVar2.i(intValue);
                return 0;
            case 5:
                bx1Var.f371114g = aVar2.i(intValue);
                return 0;
            case 6:
                bx1Var.f371115h = aVar2.k(intValue);
                return 0;
            case 7:
                bx1Var.f371116i = aVar2.d(intValue);
                return 0;
            case 8:
                bx1Var.f371117m = aVar2.g(intValue);
                return 0;
            case 9:
                bx1Var.f371118n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
