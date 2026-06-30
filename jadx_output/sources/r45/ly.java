package r45;

/* loaded from: classes9.dex */
public class ly extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379961e;

    /* renamed from: f, reason: collision with root package name */
    public int f379962f;

    /* renamed from: g, reason: collision with root package name */
    public long f379963g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379964h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379965i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ay f379966m;

    /* renamed from: n, reason: collision with root package name */
    public r45.zw4 f379967n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f379968o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f379969p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379970q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379971r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379972s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ly)) {
            return false;
        }
        r45.ly lyVar = (r45.ly) fVar;
        return n51.f.a(this.BaseResponse, lyVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379960d), java.lang.Integer.valueOf(lyVar.f379960d)) && n51.f.a(this.f379961e, lyVar.f379961e) && n51.f.a(java.lang.Integer.valueOf(this.f379962f), java.lang.Integer.valueOf(lyVar.f379962f)) && n51.f.a(java.lang.Long.valueOf(this.f379963g), java.lang.Long.valueOf(lyVar.f379963g)) && n51.f.a(this.f379964h, lyVar.f379964h) && n51.f.a(this.f379965i, lyVar.f379965i) && n51.f.a(this.f379966m, lyVar.f379966m) && n51.f.a(this.f379967n, lyVar.f379967n) && n51.f.a(this.f379968o, lyVar.f379968o) && n51.f.a(this.f379969p, lyVar.f379969p) && n51.f.a(this.f379970q, lyVar.f379970q) && n51.f.a(this.f379971r, lyVar.f379971r) && n51.f.a(this.f379972s, lyVar.f379972s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379969p;
        java.util.LinkedList linkedList2 = this.f379968o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379960d);
            java.lang.String str = this.f379961e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f379962f);
            fVar.h(5, this.f379963g);
            java.lang.String str2 = this.f379964h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f379965i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.ay ayVar = this.f379966m;
            if (ayVar != null) {
                fVar.i(8, ayVar.computeSize());
                this.f379966m.writeFields(fVar);
            }
            r45.zw4 zw4Var = this.f379967n;
            if (zw4Var != null) {
                fVar.i(9, zw4Var.computeSize());
                this.f379967n.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            java.lang.String str4 = this.f379970q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f379971r;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f379972s;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f379960d);
            java.lang.String str7 = this.f379961e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f379962f) + b36.f.h(5, this.f379963g);
            java.lang.String str8 = this.f379964h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f379965i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            r45.ay ayVar2 = this.f379966m;
            if (ayVar2 != null) {
                e17 += b36.f.i(8, ayVar2.computeSize());
            }
            r45.zw4 zw4Var2 = this.f379967n;
            if (zw4Var2 != null) {
                e17 += b36.f.i(9, zw4Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
            java.lang.String str10 = this.f379970q;
            if (str10 != null) {
                g17 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f379971r;
            if (str11 != null) {
                g17 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f379972s;
            return str12 != null ? g17 + b36.f.j(14, str12) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.ly lyVar = (r45.ly) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    lyVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lyVar.f379960d = aVar2.g(intValue);
                return 0;
            case 3:
                lyVar.f379961e = aVar2.k(intValue);
                return 0;
            case 4:
                lyVar.f379962f = aVar2.g(intValue);
                return 0;
            case 5:
                lyVar.f379963g = aVar2.i(intValue);
                return 0;
            case 6:
                lyVar.f379964h = aVar2.k(intValue);
                return 0;
            case 7:
                lyVar.f379965i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ay ayVar3 = new r45.ay();
                    if (bArr3 != null && bArr3.length > 0) {
                        ayVar3.parseFrom(bArr3);
                    }
                    lyVar.f379966m = ayVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.zw4 zw4Var3 = new r45.zw4();
                    if (bArr4 != null && bArr4.length > 0) {
                        zw4Var3.parseFrom(bArr4);
                    }
                    lyVar.f379967n = zw4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.wr6 wr6Var = new r45.wr6();
                    if (bArr5 != null && bArr5.length > 0) {
                        wr6Var.parseFrom(bArr5);
                    }
                    lyVar.f379968o.add(wr6Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.kl6 kl6Var = new r45.kl6();
                    if (bArr6 != null && bArr6.length > 0) {
                        kl6Var.parseFrom(bArr6);
                    }
                    lyVar.f379969p.add(kl6Var);
                }
                return 0;
            case 12:
                lyVar.f379970q = aVar2.k(intValue);
                return 0;
            case 13:
                lyVar.f379971r = aVar2.k(intValue);
                return 0;
            case 14:
                lyVar.f379972s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
