package r45;

/* loaded from: classes4.dex */
public class pp3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383286d;

    /* renamed from: e, reason: collision with root package name */
    public int f383287e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383288f;

    /* renamed from: g, reason: collision with root package name */
    public int f383289g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383290h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383291i;

    /* renamed from: m, reason: collision with root package name */
    public int f383292m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pp3)) {
            return false;
        }
        r45.pp3 pp3Var = (r45.pp3) fVar;
        return n51.f.a(this.BaseRequest, pp3Var.BaseRequest) && n51.f.a(this.f383286d, pp3Var.f383286d) && n51.f.a(java.lang.Integer.valueOf(this.f383287e), java.lang.Integer.valueOf(pp3Var.f383287e)) && n51.f.a(this.f383288f, pp3Var.f383288f) && n51.f.a(java.lang.Integer.valueOf(this.f383289g), java.lang.Integer.valueOf(pp3Var.f383289g)) && n51.f.a(this.f383290h, pp3Var.f383290h) && n51.f.a(this.f383291i, pp3Var.f383291i) && n51.f.a(java.lang.Integer.valueOf(this.f383292m), java.lang.Integer.valueOf(pp3Var.f383292m));
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
            java.lang.String str = this.f383286d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f383287e);
            java.lang.String str2 = this.f383288f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f383289g);
            java.lang.String str3 = this.f383290h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f383291i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f383292m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f383286d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f383287e);
            java.lang.String str6 = this.f383288f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f383289g);
            java.lang.String str7 = this.f383290h;
            if (str7 != null) {
                e18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f383291i;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            return e18 + b36.f.e(8, this.f383292m);
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
        r45.pp3 pp3Var = (r45.pp3) objArr[1];
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
                    pp3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pp3Var.f383286d = aVar2.k(intValue);
                return 0;
            case 3:
                pp3Var.f383287e = aVar2.g(intValue);
                return 0;
            case 4:
                pp3Var.f383288f = aVar2.k(intValue);
                return 0;
            case 5:
                pp3Var.f383289g = aVar2.g(intValue);
                return 0;
            case 6:
                pp3Var.f383290h = aVar2.k(intValue);
                return 0;
            case 7:
                pp3Var.f383291i = aVar2.k(intValue);
                return 0;
            case 8:
                pp3Var.f383292m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
