package r45;

/* loaded from: classes4.dex */
public class gs4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375513d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375515f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375516g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375517h;

    /* renamed from: i, reason: collision with root package name */
    public long f375518i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375519m;

    /* renamed from: n, reason: collision with root package name */
    public t45.n0 f375520n;

    /* renamed from: o, reason: collision with root package name */
    public r45.at4 f375521o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gs4)) {
            return false;
        }
        r45.gs4 gs4Var = (r45.gs4) fVar;
        return n51.f.a(this.BaseResponse, gs4Var.BaseResponse) && n51.f.a(this.f375513d, gs4Var.f375513d) && n51.f.a(this.f375514e, gs4Var.f375514e) && n51.f.a(this.f375515f, gs4Var.f375515f) && n51.f.a(this.f375516g, gs4Var.f375516g) && n51.f.a(this.f375517h, gs4Var.f375517h) && n51.f.a(java.lang.Long.valueOf(this.f375518i), java.lang.Long.valueOf(gs4Var.f375518i)) && n51.f.a(this.f375519m, gs4Var.f375519m) && n51.f.a(this.f375520n, gs4Var.f375520n) && n51.f.a(this.f375521o, gs4Var.f375521o);
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
            java.lang.String str = this.f375513d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375514e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375515f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375516g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f375517h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.h(7, this.f375518i);
            java.lang.String str6 = this.f375519m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            t45.n0 n0Var = this.f375520n;
            if (n0Var != null) {
                fVar.i(9, n0Var.computeSize());
                this.f375520n.writeFields(fVar);
            }
            r45.at4 at4Var = this.f375521o;
            if (at4Var != null) {
                fVar.i(10, at4Var.computeSize());
                this.f375521o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str7 = this.f375513d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f375514e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f375515f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f375516g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f375517h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int h17 = i18 + b36.f.h(7, this.f375518i);
            java.lang.String str12 = this.f375519m;
            if (str12 != null) {
                h17 += b36.f.j(8, str12);
            }
            t45.n0 n0Var2 = this.f375520n;
            if (n0Var2 != null) {
                h17 += b36.f.i(9, n0Var2.computeSize());
            }
            r45.at4 at4Var2 = this.f375521o;
            return at4Var2 != null ? h17 + b36.f.i(10, at4Var2.computeSize()) : h17;
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
        r45.gs4 gs4Var = (r45.gs4) objArr[1];
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
                    gs4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                gs4Var.f375513d = aVar2.k(intValue);
                return 0;
            case 3:
                gs4Var.f375514e = aVar2.k(intValue);
                return 0;
            case 4:
                gs4Var.f375515f = aVar2.k(intValue);
                return 0;
            case 5:
                gs4Var.f375516g = aVar2.k(intValue);
                return 0;
            case 6:
                gs4Var.f375517h = aVar2.k(intValue);
                return 0;
            case 7:
                gs4Var.f375518i = aVar2.i(intValue);
                return 0;
            case 8:
                gs4Var.f375519m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    t45.n0 n0Var3 = new t45.n0();
                    if (bArr2 != null && bArr2.length > 0) {
                        n0Var3.parseFrom(bArr2);
                    }
                    gs4Var.f375520n = n0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.at4 at4Var3 = new r45.at4();
                    if (bArr3 != null && bArr3.length > 0) {
                        at4Var3.parseFrom(bArr3);
                    }
                    gs4Var.f375521o = at4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
