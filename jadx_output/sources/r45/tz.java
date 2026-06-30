package r45;

/* loaded from: classes9.dex */
public class tz extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386872e;

    /* renamed from: f, reason: collision with root package name */
    public long f386873f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386874g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386875h;

    /* renamed from: i, reason: collision with root package name */
    public int f386876i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386877m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386878n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tz)) {
            return false;
        }
        r45.tz tzVar = (r45.tz) fVar;
        return n51.f.a(this.BaseRequest, tzVar.BaseRequest) && n51.f.a(this.f386871d, tzVar.f386871d) && n51.f.a(this.f386872e, tzVar.f386872e) && n51.f.a(java.lang.Long.valueOf(this.f386873f), java.lang.Long.valueOf(tzVar.f386873f)) && n51.f.a(this.f386874g, tzVar.f386874g) && n51.f.a(this.f386875h, tzVar.f386875h) && n51.f.a(java.lang.Integer.valueOf(this.f386876i), java.lang.Integer.valueOf(tzVar.f386876i)) && n51.f.a(this.f386877m, tzVar.f386877m) && n51.f.a(this.f386878n, tzVar.f386878n);
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
            java.lang.String str = this.f386871d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386872e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f386873f);
            java.lang.String str3 = this.f386874g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f386875h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f386876i);
            java.lang.String str5 = this.f386877m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f386878n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f386871d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f386872e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int h17 = i18 + b36.f.h(4, this.f386873f);
            java.lang.String str9 = this.f386874g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f386875h;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            int e17 = h17 + b36.f.e(7, this.f386876i);
            java.lang.String str11 = this.f386877m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f386878n;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.tz tzVar = (r45.tz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    tzVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                tzVar.f386871d = aVar2.k(intValue);
                return 0;
            case 3:
                tzVar.f386872e = aVar2.k(intValue);
                return 0;
            case 4:
                tzVar.f386873f = aVar2.i(intValue);
                return 0;
            case 5:
                tzVar.f386874g = aVar2.k(intValue);
                return 0;
            case 6:
                tzVar.f386875h = aVar2.k(intValue);
                return 0;
            case 7:
                tzVar.f386876i = aVar2.g(intValue);
                return 0;
            case 8:
                tzVar.f386877m = aVar2.k(intValue);
                return 0;
            case 9:
                tzVar.f386878n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
