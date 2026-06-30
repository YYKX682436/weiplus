package r45;

/* loaded from: classes9.dex */
public class y10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390700d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390701e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390702f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r65 f390703g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f390705i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390706m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390707n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390708o;

    /* renamed from: p, reason: collision with root package name */
    public r45.w10 f390709p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y10)) {
            return false;
        }
        r45.y10 y10Var = (r45.y10) fVar;
        return n51.f.a(this.BaseResponse, y10Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390700d), java.lang.Integer.valueOf(y10Var.f390700d)) && n51.f.a(this.f390701e, y10Var.f390701e) && n51.f.a(this.f390702f, y10Var.f390702f) && n51.f.a(this.f390703g, y10Var.f390703g) && n51.f.a(this.f390704h, y10Var.f390704h) && n51.f.a(java.lang.Boolean.valueOf(this.f390705i), java.lang.Boolean.valueOf(y10Var.f390705i)) && n51.f.a(this.f390706m, y10Var.f390706m) && n51.f.a(this.f390707n, y10Var.f390707n) && n51.f.a(this.f390708o, y10Var.f390708o) && n51.f.a(this.f390709p, y10Var.f390709p);
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
            fVar.e(2, this.f390700d);
            java.lang.String str = this.f390701e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390702f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r65 r65Var = this.f390703g;
            if (r65Var != null) {
                fVar.i(5, r65Var.computeSize());
                this.f390703g.writeFields(fVar);
            }
            java.lang.String str3 = this.f390704h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(7, this.f390705i);
            java.lang.String str4 = this.f390706m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f390707n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f390708o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            r45.w10 w10Var = this.f390709p;
            if (w10Var != null) {
                fVar.i(11, w10Var.computeSize());
                this.f390709p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390700d);
            java.lang.String str7 = this.f390701e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f390702f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            r45.r65 r65Var2 = this.f390703g;
            if (r65Var2 != null) {
                i18 += b36.f.i(5, r65Var2.computeSize());
            }
            java.lang.String str9 = this.f390704h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            int a17 = i18 + b36.f.a(7, this.f390705i);
            java.lang.String str10 = this.f390706m;
            if (str10 != null) {
                a17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f390707n;
            if (str11 != null) {
                a17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f390708o;
            if (str12 != null) {
                a17 += b36.f.j(10, str12);
            }
            r45.w10 w10Var2 = this.f390709p;
            return w10Var2 != null ? a17 + b36.f.i(11, w10Var2.computeSize()) : a17;
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
        r45.y10 y10Var = (r45.y10) objArr[1];
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
                    y10Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                y10Var.f390700d = aVar2.g(intValue);
                return 0;
            case 3:
                y10Var.f390701e = aVar2.k(intValue);
                return 0;
            case 4:
                y10Var.f390702f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r65 r65Var3 = new r45.r65();
                    if (bArr2 != null && bArr2.length > 0) {
                        r65Var3.parseFrom(bArr2);
                    }
                    y10Var.f390703g = r65Var3;
                }
                return 0;
            case 6:
                y10Var.f390704h = aVar2.k(intValue);
                return 0;
            case 7:
                y10Var.f390705i = aVar2.c(intValue);
                return 0;
            case 8:
                y10Var.f390706m = aVar2.k(intValue);
                return 0;
            case 9:
                y10Var.f390707n = aVar2.k(intValue);
                return 0;
            case 10:
                y10Var.f390708o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.w10 w10Var3 = new r45.w10();
                    if (bArr3 != null && bArr3.length > 0) {
                        w10Var3.parseFrom(bArr3);
                    }
                    y10Var.f390709p = w10Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
