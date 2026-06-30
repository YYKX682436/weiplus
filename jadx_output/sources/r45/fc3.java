package r45;

/* loaded from: classes8.dex */
public class fc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f374196d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f374197e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374198f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374199g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374200h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374201i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374202m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374203n;

    /* renamed from: o, reason: collision with root package name */
    public int f374204o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fc3)) {
            return false;
        }
        r45.fc3 fc3Var = (r45.fc3) fVar;
        return n51.f.a(this.BaseRequest, fc3Var.BaseRequest) && n51.f.a(this.f374196d, fc3Var.f374196d) && n51.f.a(java.lang.Integer.valueOf(this.f374197e), java.lang.Integer.valueOf(fc3Var.f374197e)) && n51.f.a(this.f374198f, fc3Var.f374198f) && n51.f.a(this.f374199g, fc3Var.f374199g) && n51.f.a(this.f374200h, fc3Var.f374200h) && n51.f.a(this.f374201i, fc3Var.f374201i) && n51.f.a(this.f374202m, fc3Var.f374202m) && n51.f.a(this.f374203n, fc3Var.f374203n) && n51.f.a(java.lang.Integer.valueOf(this.f374204o), java.lang.Integer.valueOf(fc3Var.f374204o));
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
            fVar.g(2, 8, this.f374196d);
            fVar.e(3, this.f374197e);
            java.lang.String str = this.f374198f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f374199g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f374200h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f374201i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f374202m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f374203n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f374204o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, this.f374196d) + b36.f.e(3, this.f374197e);
            java.lang.String str7 = this.f374198f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f374199g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f374200h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f374201i;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f374202m;
            if (str11 != null) {
                i18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f374203n;
            if (str12 != null) {
                i18 += b36.f.j(9, str12);
            }
            return i18 + b36.f.e(10, this.f374204o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374196d.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.fc3 fc3Var = (r45.fc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    fc3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hu huVar = new r45.hu();
                    if (bArr3 != null && bArr3.length > 0) {
                        huVar.parseFrom(bArr3);
                    }
                    fc3Var.f374196d.add(huVar);
                }
                return 0;
            case 3:
                fc3Var.f374197e = aVar2.g(intValue);
                return 0;
            case 4:
                fc3Var.f374198f = aVar2.k(intValue);
                return 0;
            case 5:
                fc3Var.f374199g = aVar2.k(intValue);
                return 0;
            case 6:
                fc3Var.f374200h = aVar2.k(intValue);
                return 0;
            case 7:
                fc3Var.f374201i = aVar2.k(intValue);
                return 0;
            case 8:
                fc3Var.f374202m = aVar2.k(intValue);
                return 0;
            case 9:
                fc3Var.f374203n = aVar2.k(intValue);
                return 0;
            case 10:
                fc3Var.f374204o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
