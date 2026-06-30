package r45;

/* loaded from: classes4.dex */
public class xx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390567d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390568e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390569f;

    /* renamed from: g, reason: collision with root package name */
    public int f390570g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ay f390571h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390572i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390573m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390574n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390575o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f390576p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xx)) {
            return false;
        }
        r45.xx xxVar = (r45.xx) fVar;
        return n51.f.a(this.BaseResponse, xxVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390567d), java.lang.Integer.valueOf(xxVar.f390567d)) && n51.f.a(this.f390568e, xxVar.f390568e) && n51.f.a(this.f390569f, xxVar.f390569f) && n51.f.a(java.lang.Integer.valueOf(this.f390570g), java.lang.Integer.valueOf(xxVar.f390570g)) && n51.f.a(this.f390571h, xxVar.f390571h) && n51.f.a(this.f390572i, xxVar.f390572i) && n51.f.a(this.f390573m, xxVar.f390573m) && n51.f.a(this.f390574n, xxVar.f390574n) && n51.f.a(this.f390575o, xxVar.f390575o) && n51.f.a(this.f390576p, xxVar.f390576p);
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
            fVar.e(2, this.f390567d);
            java.lang.String str = this.f390568e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390569f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f390570g);
            r45.ay ayVar = this.f390571h;
            if (ayVar != null) {
                fVar.i(6, ayVar.computeSize());
                this.f390571h.writeFields(fVar);
            }
            java.lang.String str3 = this.f390572i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f390573m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f390574n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f390575o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f390576p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390567d);
            java.lang.String str8 = this.f390568e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f390569f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            int e17 = i18 + b36.f.e(5, this.f390570g);
            r45.ay ayVar2 = this.f390571h;
            if (ayVar2 != null) {
                e17 += b36.f.i(6, ayVar2.computeSize());
            }
            java.lang.String str10 = this.f390572i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f390573m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f390574n;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f390575o;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f390576p;
            return str14 != null ? e17 + b36.f.j(11, str14) : e17;
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
        r45.xx xxVar = (r45.xx) objArr[1];
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
                    xxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xxVar.f390567d = aVar2.g(intValue);
                return 0;
            case 3:
                xxVar.f390568e = aVar2.k(intValue);
                return 0;
            case 4:
                xxVar.f390569f = aVar2.k(intValue);
                return 0;
            case 5:
                xxVar.f390570g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ay ayVar3 = new r45.ay();
                    if (bArr2 != null && bArr2.length > 0) {
                        ayVar3.parseFrom(bArr2);
                    }
                    xxVar.f390571h = ayVar3;
                }
                return 0;
            case 7:
                xxVar.f390572i = aVar2.k(intValue);
                return 0;
            case 8:
                xxVar.f390573m = aVar2.k(intValue);
                return 0;
            case 9:
                xxVar.f390574n = aVar2.k(intValue);
                return 0;
            case 10:
                xxVar.f390575o = aVar2.k(intValue);
                return 0;
            case 11:
                xxVar.f390576p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
