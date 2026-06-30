package r45;

/* loaded from: classes9.dex */
public class s extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public int f385340f;

    /* renamed from: g, reason: collision with root package name */
    public int f385341g;

    /* renamed from: h, reason: collision with root package name */
    public int f385342h;

    /* renamed from: i, reason: collision with root package name */
    public long f385343i;

    /* renamed from: m, reason: collision with root package name */
    public long f385344m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385345n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f385346o;

    /* renamed from: p, reason: collision with root package name */
    public int f385347p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f385348q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385350s;

    /* renamed from: d, reason: collision with root package name */
    public int f385338d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385339e = "请求不成功，请稍候再试";

    /* renamed from: r, reason: collision with root package name */
    public boolean f385349r = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s)) {
            return false;
        }
        r45.s sVar = (r45.s) fVar;
        return n51.f.a(this.BaseResponse, sVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385338d), java.lang.Integer.valueOf(sVar.f385338d)) && n51.f.a(this.f385339e, sVar.f385339e) && n51.f.a(java.lang.Integer.valueOf(this.f385340f), java.lang.Integer.valueOf(sVar.f385340f)) && n51.f.a(java.lang.Integer.valueOf(this.f385341g), java.lang.Integer.valueOf(sVar.f385341g)) && n51.f.a(java.lang.Integer.valueOf(this.f385342h), java.lang.Integer.valueOf(sVar.f385342h)) && n51.f.a(java.lang.Long.valueOf(this.f385343i), java.lang.Long.valueOf(sVar.f385343i)) && n51.f.a(java.lang.Long.valueOf(this.f385344m), java.lang.Long.valueOf(sVar.f385344m)) && n51.f.a(this.f385345n, sVar.f385345n) && n51.f.a(this.f385346o, sVar.f385346o) && n51.f.a(java.lang.Integer.valueOf(this.f385347p), java.lang.Integer.valueOf(sVar.f385347p)) && n51.f.a(this.f385348q, sVar.f385348q) && n51.f.a(java.lang.Boolean.valueOf(this.f385349r), java.lang.Boolean.valueOf(sVar.f385349r)) && n51.f.a(this.f385350s, sVar.f385350s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385338d);
            java.lang.String str = this.f385339e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f385340f);
            fVar.e(5, this.f385341g);
            fVar.e(6, this.f385342h);
            fVar.h(7, this.f385343i);
            fVar.h(8, this.f385344m);
            java.lang.String str2 = this.f385345n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f385346o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f385347p);
            r45.tw4 tw4Var = this.f385348q;
            if (tw4Var != null) {
                fVar.i(12, tw4Var.computeSize());
                this.f385348q.writeFields(fVar);
            }
            fVar.a(13, this.f385349r);
            java.lang.String str4 = this.f385350s;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f385338d);
            java.lang.String str5 = this.f385339e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f385340f) + b36.f.e(5, this.f385341g) + b36.f.e(6, this.f385342h) + b36.f.h(7, this.f385343i) + b36.f.h(8, this.f385344m);
            java.lang.String str6 = this.f385345n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            java.lang.String str7 = this.f385346o;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            int e18 = e17 + b36.f.e(11, this.f385347p);
            r45.tw4 tw4Var2 = this.f385348q;
            if (tw4Var2 != null) {
                e18 += b36.f.i(12, tw4Var2.computeSize());
            }
            int a17 = e18 + b36.f.a(13, this.f385349r);
            java.lang.String str8 = this.f385350s;
            return str8 != null ? a17 + b36.f.j(14, str8) : a17;
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
        r45.s sVar = (r45.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    sVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                sVar.f385338d = aVar2.g(intValue);
                return 0;
            case 3:
                sVar.f385339e = aVar2.k(intValue);
                return 0;
            case 4:
                sVar.f385340f = aVar2.g(intValue);
                return 0;
            case 5:
                sVar.f385341g = aVar2.g(intValue);
                return 0;
            case 6:
                sVar.f385342h = aVar2.g(intValue);
                return 0;
            case 7:
                sVar.f385343i = aVar2.i(intValue);
                return 0;
            case 8:
                sVar.f385344m = aVar2.i(intValue);
                return 0;
            case 9:
                sVar.f385345n = aVar2.k(intValue);
                return 0;
            case 10:
                sVar.f385346o = aVar2.k(intValue);
                return 0;
            case 11:
                sVar.f385347p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tw4Var3.parseFrom(bArr2);
                    }
                    sVar.f385348q = tw4Var3;
                }
                return 0;
            case 13:
                sVar.f385349r = aVar2.c(intValue);
                return 0;
            case 14:
                sVar.f385350s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
