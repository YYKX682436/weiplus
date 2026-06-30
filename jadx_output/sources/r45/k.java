package r45;

/* loaded from: classes9.dex */
public class k extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378236d;

    /* renamed from: e, reason: collision with root package name */
    public int f378237e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378238f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r1 f378239g;

    /* renamed from: h, reason: collision with root package name */
    public long f378240h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378241i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378242m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378243n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378244o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f378245p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f378246q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k)) {
            return false;
        }
        r45.k kVar = (r45.k) fVar;
        return n51.f.a(this.BaseRequest, kVar.BaseRequest) && n51.f.a(this.f378236d, kVar.f378236d) && n51.f.a(java.lang.Integer.valueOf(this.f378237e), java.lang.Integer.valueOf(kVar.f378237e)) && n51.f.a(this.f378238f, kVar.f378238f) && n51.f.a(this.f378239g, kVar.f378239g) && n51.f.a(java.lang.Long.valueOf(this.f378240h), java.lang.Long.valueOf(kVar.f378240h)) && n51.f.a(this.f378241i, kVar.f378241i) && n51.f.a(this.f378242m, kVar.f378242m) && n51.f.a(this.f378243n, kVar.f378243n) && n51.f.a(this.f378244o, kVar.f378244o) && n51.f.a(java.lang.Boolean.valueOf(this.f378245p), java.lang.Boolean.valueOf(kVar.f378245p)) && n51.f.a(this.f378246q, kVar.f378246q);
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
            java.lang.String str = this.f378236d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f378237e);
            java.lang.String str2 = this.f378238f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r1 r1Var = this.f378239g;
            if (r1Var != null) {
                fVar.i(5, r1Var.computeSize());
                this.f378239g.writeFields(fVar);
            }
            fVar.h(6, this.f378240h);
            java.lang.String str3 = this.f378241i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f378242m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f378243n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f378244o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.a(11, this.f378245p);
            fVar.g(12, 8, this.f378246q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f378236d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f378237e);
            java.lang.String str8 = this.f378238f;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            r45.r1 r1Var2 = this.f378239g;
            if (r1Var2 != null) {
                e17 += b36.f.i(5, r1Var2.computeSize());
            }
            int h17 = e17 + b36.f.h(6, this.f378240h);
            java.lang.String str9 = this.f378241i;
            if (str9 != null) {
                h17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f378242m;
            if (str10 != null) {
                h17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f378243n;
            if (str11 != null) {
                h17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f378244o;
            if (str12 != null) {
                h17 += b36.f.j(10, str12);
            }
            return h17 + b36.f.a(11, this.f378245p) + b36.f.g(12, 8, this.f378246q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378246q.clear();
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
        r45.k kVar = (r45.k) objArr[1];
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
                    kVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                kVar.f378236d = aVar2.k(intValue);
                return 0;
            case 3:
                kVar.f378237e = aVar2.g(intValue);
                return 0;
            case 4:
                kVar.f378238f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr3 != null && bArr3.length > 0) {
                        r1Var3.parseFrom(bArr3);
                    }
                    kVar.f378239g = r1Var3;
                }
                return 0;
            case 6:
                kVar.f378240h = aVar2.i(intValue);
                return 0;
            case 7:
                kVar.f378241i = aVar2.k(intValue);
                return 0;
            case 8:
                kVar.f378242m = aVar2.k(intValue);
                return 0;
            case 9:
                kVar.f378243n = aVar2.k(intValue);
                return 0;
            case 10:
                kVar.f378244o = aVar2.k(intValue);
                return 0;
            case 11:
                kVar.f378245p = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bc6 bc6Var = new r45.bc6();
                    if (bArr4 != null && bArr4.length > 0) {
                        bc6Var.parseFrom(bArr4);
                    }
                    kVar.f378246q.add(bc6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
