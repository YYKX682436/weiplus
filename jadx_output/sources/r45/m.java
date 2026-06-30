package r45;

/* loaded from: classes9.dex */
public class m extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380016d;

    /* renamed from: e, reason: collision with root package name */
    public long f380017e;

    /* renamed from: g, reason: collision with root package name */
    public int f380019g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380020h;

    /* renamed from: i, reason: collision with root package name */
    public r45.r1 f380021i;

    /* renamed from: m, reason: collision with root package name */
    public long f380022m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380023n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380024o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380025p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380026q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f380027r;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f380018f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f380028s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m)) {
            return false;
        }
        r45.m mVar = (r45.m) fVar;
        return n51.f.a(this.BaseRequest, mVar.BaseRequest) && n51.f.a(this.f380016d, mVar.f380016d) && n51.f.a(java.lang.Long.valueOf(this.f380017e), java.lang.Long.valueOf(mVar.f380017e)) && n51.f.a(this.f380018f, mVar.f380018f) && n51.f.a(java.lang.Integer.valueOf(this.f380019g), java.lang.Integer.valueOf(mVar.f380019g)) && n51.f.a(this.f380020h, mVar.f380020h) && n51.f.a(this.f380021i, mVar.f380021i) && n51.f.a(java.lang.Long.valueOf(this.f380022m), java.lang.Long.valueOf(mVar.f380022m)) && n51.f.a(this.f380023n, mVar.f380023n) && n51.f.a(this.f380024o, mVar.f380024o) && n51.f.a(this.f380025p, mVar.f380025p) && n51.f.a(this.f380026q, mVar.f380026q) && n51.f.a(java.lang.Boolean.valueOf(this.f380027r), java.lang.Boolean.valueOf(mVar.f380027r)) && n51.f.a(this.f380028s, mVar.f380028s);
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
            java.lang.String str = this.f380016d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f380017e);
            fVar.g(5, 8, this.f380018f);
            fVar.e(7, this.f380019g);
            java.lang.String str2 = this.f380020h;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            r45.r1 r1Var = this.f380021i;
            if (r1Var != null) {
                fVar.i(9, r1Var.computeSize());
                this.f380021i.writeFields(fVar);
            }
            fVar.h(10, this.f380022m);
            java.lang.String str3 = this.f380023n;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f380024o;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f380025p;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f380026q;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            fVar.a(15, this.f380027r);
            fVar.g(16, 8, this.f380028s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str7 = this.f380016d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int h17 = i18 + b36.f.h(3, this.f380017e) + b36.f.g(5, 8, this.f380018f) + b36.f.e(7, this.f380019g);
            java.lang.String str8 = this.f380020h;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            r45.r1 r1Var2 = this.f380021i;
            if (r1Var2 != null) {
                h17 += b36.f.i(9, r1Var2.computeSize());
            }
            int h18 = h17 + b36.f.h(10, this.f380022m);
            java.lang.String str9 = this.f380023n;
            if (str9 != null) {
                h18 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f380024o;
            if (str10 != null) {
                h18 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f380025p;
            if (str11 != null) {
                h18 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f380026q;
            if (str12 != null) {
                h18 += b36.f.j(14, str12);
            }
            return h18 + b36.f.a(15, this.f380027r) + b36.f.g(16, 8, this.f380028s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f380018f.clear();
            this.f380028s.clear();
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
        r45.m mVar = (r45.m) objArr[1];
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
                    mVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                mVar.f380016d = aVar2.k(intValue);
                return 0;
            case 3:
                mVar.f380017e = aVar2.i(intValue);
                return 0;
            case 4:
            case 6:
            default:
                return -1;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.o oVar = new r45.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar.parseFrom(bArr3);
                    }
                    mVar.f380018f.add(oVar);
                }
                return 0;
            case 7:
                mVar.f380019g = aVar2.g(intValue);
                return 0;
            case 8:
                mVar.f380020h = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr4 != null && bArr4.length > 0) {
                        r1Var3.parseFrom(bArr4);
                    }
                    mVar.f380021i = r1Var3;
                }
                return 0;
            case 10:
                mVar.f380022m = aVar2.i(intValue);
                return 0;
            case 11:
                mVar.f380023n = aVar2.k(intValue);
                return 0;
            case 12:
                mVar.f380024o = aVar2.k(intValue);
                return 0;
            case 13:
                mVar.f380025p = aVar2.k(intValue);
                return 0;
            case 14:
                mVar.f380026q = aVar2.k(intValue);
                return 0;
            case 15:
                mVar.f380027r = aVar2.c(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.bc6 bc6Var = new r45.bc6();
                    if (bArr5 != null && bArr5.length > 0) {
                        bc6Var.parseFrom(bArr5);
                    }
                    mVar.f380028s.add(bc6Var);
                }
                return 0;
        }
    }
}
