package r45;

/* loaded from: classes9.dex */
public class hf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376111d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376112e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376113f;

    /* renamed from: g, reason: collision with root package name */
    public int f376114g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376115h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ae f376116i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f376118n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hf3)) {
            return false;
        }
        r45.hf3 hf3Var = (r45.hf3) fVar;
        return n51.f.a(this.BaseRequest, hf3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f376111d), java.lang.Integer.valueOf(hf3Var.f376111d)) && n51.f.a(this.f376112e, hf3Var.f376112e) && n51.f.a(this.f376113f, hf3Var.f376113f) && n51.f.a(java.lang.Integer.valueOf(this.f376114g), java.lang.Integer.valueOf(hf3Var.f376114g)) && n51.f.a(this.f376115h, hf3Var.f376115h) && n51.f.a(this.f376116i, hf3Var.f376116i) && n51.f.a(this.f376117m, hf3Var.f376117m) && n51.f.a(java.lang.Boolean.valueOf(this.f376118n), java.lang.Boolean.valueOf(hf3Var.f376118n));
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
            fVar.e(2, this.f376111d);
            java.lang.String str = this.f376112e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f376113f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f376114g);
            com.tencent.mm.protobuf.g gVar = this.f376115h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            r45.ae aeVar = this.f376116i;
            if (aeVar != null) {
                fVar.i(7, aeVar.computeSize());
                this.f376116i.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f376117m;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            fVar.a(10, this.f376118n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f376111d);
            java.lang.String str3 = this.f376112e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f376113f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            int e17 = i18 + b36.f.e(5, this.f376114g);
            com.tencent.mm.protobuf.g gVar3 = this.f376115h;
            if (gVar3 != null) {
                e17 += b36.f.b(6, gVar3);
            }
            r45.ae aeVar2 = this.f376116i;
            if (aeVar2 != null) {
                e17 += b36.f.i(7, aeVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f376117m;
            if (gVar4 != null) {
                e17 += b36.f.b(9, gVar4);
            }
            return e17 + b36.f.a(10, this.f376118n);
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
        r45.hf3 hf3Var = (r45.hf3) objArr[1];
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
                    hf3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                hf3Var.f376111d = aVar2.g(intValue);
                return 0;
            case 3:
                hf3Var.f376112e = aVar2.k(intValue);
                return 0;
            case 4:
                hf3Var.f376113f = aVar2.k(intValue);
                return 0;
            case 5:
                hf3Var.f376114g = aVar2.g(intValue);
                return 0;
            case 6:
                hf3Var.f376115h = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.parseFrom(bArr2);
                    }
                    hf3Var.f376116i = aeVar3;
                }
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                hf3Var.f376117m = aVar2.d(intValue);
                return 0;
            case 10:
                hf3Var.f376118n = aVar2.c(intValue);
                return 0;
        }
    }
}
