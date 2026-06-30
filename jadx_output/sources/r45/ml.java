package r45;

/* loaded from: classes9.dex */
public class ml extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380611d;

    /* renamed from: e, reason: collision with root package name */
    public int f380612e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380613f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380614g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380615h;

    /* renamed from: i, reason: collision with root package name */
    public int f380616i;

    /* renamed from: m, reason: collision with root package name */
    public int f380617m;

    /* renamed from: n, reason: collision with root package name */
    public int f380618n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f380619o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public long f380620p;

    /* renamed from: q, reason: collision with root package name */
    public int f380621q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ml)) {
            return false;
        }
        r45.ml mlVar = (r45.ml) fVar;
        return n51.f.a(this.BaseRequest, mlVar.BaseRequest) && n51.f.a(this.f380611d, mlVar.f380611d) && n51.f.a(java.lang.Integer.valueOf(this.f380612e), java.lang.Integer.valueOf(mlVar.f380612e)) && n51.f.a(this.f380613f, mlVar.f380613f) && n51.f.a(this.f380614g, mlVar.f380614g) && n51.f.a(this.f380615h, mlVar.f380615h) && n51.f.a(java.lang.Integer.valueOf(this.f380616i), java.lang.Integer.valueOf(mlVar.f380616i)) && n51.f.a(java.lang.Integer.valueOf(this.f380617m), java.lang.Integer.valueOf(mlVar.f380617m)) && n51.f.a(java.lang.Integer.valueOf(this.f380618n), java.lang.Integer.valueOf(mlVar.f380618n)) && n51.f.a(this.f380619o, mlVar.f380619o) && n51.f.a(java.lang.Long.valueOf(this.f380620p), java.lang.Long.valueOf(mlVar.f380620p)) && n51.f.a(java.lang.Integer.valueOf(this.f380621q), java.lang.Integer.valueOf(mlVar.f380621q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380619o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f380611d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f380612e);
            java.lang.String str = this.f380613f;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f380614g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f380615h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f380616i);
            fVar.e(9, this.f380617m);
            fVar.e(10, this.f380618n);
            fVar.g(17, 8, linkedList);
            fVar.h(18, this.f380620p);
            fVar.e(22, this.f380621q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f380611d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(3, this.f380612e);
            java.lang.String str4 = this.f380613f;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            java.lang.String str5 = this.f380614g;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f380615h;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f380616i) + b36.f.e(9, this.f380617m) + b36.f.e(10, this.f380618n) + b36.f.g(17, 8, linkedList) + b36.f.h(18, this.f380620p) + b36.f.e(22, this.f380621q);
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
        r45.ml mlVar = (r45.ml) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                mlVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mlVar.f380611d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            mlVar.f380612e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 17) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.si siVar = new r45.si();
                if (bArr3 != null && bArr3.length > 0) {
                    siVar.parseFrom(bArr3);
                }
                mlVar.f380619o.add(siVar);
            }
            return 0;
        }
        if (intValue == 18) {
            mlVar.f380620p = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 22) {
            mlVar.f380621q = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                mlVar.f380613f = aVar2.k(intValue);
                return 0;
            case 6:
                mlVar.f380614g = aVar2.k(intValue);
                return 0;
            case 7:
                mlVar.f380615h = aVar2.k(intValue);
                return 0;
            case 8:
                mlVar.f380616i = aVar2.g(intValue);
                return 0;
            case 9:
                mlVar.f380617m = aVar2.g(intValue);
                return 0;
            case 10:
                mlVar.f380618n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
