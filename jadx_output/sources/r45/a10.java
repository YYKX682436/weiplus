package r45;

/* loaded from: classes8.dex */
public class a10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f369620d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369621e;

    /* renamed from: f, reason: collision with root package name */
    public long f369622f;

    /* renamed from: g, reason: collision with root package name */
    public long f369623g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369624h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369625i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369626m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369627n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tw4 f369628o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f369629p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a10)) {
            return false;
        }
        r45.a10 a10Var = (r45.a10) fVar;
        return n51.f.a(this.BaseResponse, a10Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f369620d), java.lang.Integer.valueOf(a10Var.f369620d)) && n51.f.a(this.f369621e, a10Var.f369621e) && n51.f.a(java.lang.Long.valueOf(this.f369622f), java.lang.Long.valueOf(a10Var.f369622f)) && n51.f.a(java.lang.Long.valueOf(this.f369623g), java.lang.Long.valueOf(a10Var.f369623g)) && n51.f.a(this.f369624h, a10Var.f369624h) && n51.f.a(this.f369625i, a10Var.f369625i) && n51.f.a(this.f369626m, a10Var.f369626m) && n51.f.a(this.f369627n, a10Var.f369627n) && n51.f.a(this.f369628o, a10Var.f369628o) && n51.f.a(this.f369629p, a10Var.f369629p);
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
            fVar.e(2, this.f369620d);
            java.lang.String str = this.f369621e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f369622f);
            fVar.h(5, this.f369623g);
            java.lang.String str2 = this.f369624h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f369625i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f369626m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f369627n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            r45.tw4 tw4Var = this.f369628o;
            if (tw4Var != null) {
                fVar.i(10, tw4Var.computeSize());
                this.f369628o.writeFields(fVar);
            }
            java.lang.String str6 = this.f369629p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f369620d);
            java.lang.String str7 = this.f369621e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int h17 = i18 + b36.f.h(4, this.f369622f) + b36.f.h(5, this.f369623g);
            java.lang.String str8 = this.f369624h;
            if (str8 != null) {
                h17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f369625i;
            if (str9 != null) {
                h17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f369626m;
            if (str10 != null) {
                h17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f369627n;
            if (str11 != null) {
                h17 += b36.f.j(9, str11);
            }
            r45.tw4 tw4Var2 = this.f369628o;
            if (tw4Var2 != null) {
                h17 += b36.f.i(10, tw4Var2.computeSize());
            }
            java.lang.String str12 = this.f369629p;
            return str12 != null ? h17 + b36.f.j(11, str12) : h17;
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
        r45.a10 a10Var = (r45.a10) objArr[1];
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
                    a10Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                a10Var.f369620d = aVar2.g(intValue);
                return 0;
            case 3:
                a10Var.f369621e = aVar2.k(intValue);
                return 0;
            case 4:
                a10Var.f369622f = aVar2.i(intValue);
                return 0;
            case 5:
                a10Var.f369623g = aVar2.i(intValue);
                return 0;
            case 6:
                a10Var.f369624h = aVar2.k(intValue);
                return 0;
            case 7:
                a10Var.f369625i = aVar2.k(intValue);
                return 0;
            case 8:
                a10Var.f369626m = aVar2.k(intValue);
                return 0;
            case 9:
                a10Var.f369627n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tw4Var3.parseFrom(bArr2);
                    }
                    a10Var.f369628o = tw4Var3;
                }
                return 0;
            case 11:
                a10Var.f369629p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
