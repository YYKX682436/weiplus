package r45;

/* loaded from: classes7.dex */
public class fh extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374330d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f374331e;

    /* renamed from: f, reason: collision with root package name */
    public int f374332f;

    /* renamed from: g, reason: collision with root package name */
    public r45.fd7 f374333g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374334h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374335i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374336m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374337n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh)) {
            return false;
        }
        r45.fh fhVar = (r45.fh) fVar;
        return n51.f.a(this.BaseRequest, fhVar.BaseRequest) && n51.f.a(this.f374330d, fhVar.f374330d) && n51.f.a(java.lang.Integer.valueOf(this.f374331e), java.lang.Integer.valueOf(fhVar.f374331e)) && n51.f.a(java.lang.Integer.valueOf(this.f374332f), java.lang.Integer.valueOf(fhVar.f374332f)) && n51.f.a(this.f374333g, fhVar.f374333g) && n51.f.a(this.f374334h, fhVar.f374334h) && n51.f.a(this.f374335i, fhVar.f374335i) && n51.f.a(this.f374336m, fhVar.f374336m) && n51.f.a(this.f374337n, fhVar.f374337n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374330d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f374331e);
            fVar.e(4, this.f374332f);
            r45.fd7 fd7Var = this.f374333g;
            if (fd7Var != null) {
                fVar.i(5, fd7Var.computeSize());
                this.f374333g.writeFields(fVar);
            }
            java.lang.String str = this.f374334h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f374335i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f374336m;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f374337n;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f374331e) + b36.f.e(4, this.f374332f);
            r45.fd7 fd7Var2 = this.f374333g;
            if (fd7Var2 != null) {
                i18 += b36.f.i(5, fd7Var2.computeSize());
            }
            java.lang.String str5 = this.f374334h;
            if (str5 != null) {
                i18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f374335i;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f374336m;
            if (str7 != null) {
                i18 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f374337n;
            return str8 != null ? i18 + b36.f.j(12, str8) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.fh fhVar = (r45.fh) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 11) {
            fhVar.f374336m = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 12) {
            fhVar.f374337n = aVar2.k(intValue);
            return 0;
        }
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
                    fhVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ad7 ad7Var = new r45.ad7();
                    if (bArr3 != null && bArr3.length > 0) {
                        ad7Var.parseFrom(bArr3);
                    }
                    fhVar.f374330d.add(ad7Var);
                }
                return 0;
            case 3:
                fhVar.f374331e = aVar2.g(intValue);
                return 0;
            case 4:
                fhVar.f374332f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.fd7 fd7Var3 = new r45.fd7();
                    if (bArr4 != null && bArr4.length > 0) {
                        fd7Var3.parseFrom(bArr4);
                    }
                    fhVar.f374333g = fd7Var3;
                }
                return 0;
            case 6:
                fhVar.f374334h = aVar2.k(intValue);
                return 0;
            case 7:
                fhVar.f374335i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
