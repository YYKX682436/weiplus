package r45;

/* loaded from: classes9.dex */
public class yt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391341d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391342e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391343f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391344g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391345h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391346i;

    /* renamed from: m, reason: collision with root package name */
    public int f391347m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391348n;

    /* renamed from: o, reason: collision with root package name */
    public int f391349o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391350p;

    /* renamed from: q, reason: collision with root package name */
    public r45.iu f391351q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f391352r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yt)) {
            return false;
        }
        r45.yt ytVar = (r45.yt) fVar;
        return n51.f.a(this.f391341d, ytVar.f391341d) && n51.f.a(this.f391342e, ytVar.f391342e) && n51.f.a(this.f391343f, ytVar.f391343f) && n51.f.a(this.f391344g, ytVar.f391344g) && n51.f.a(this.f391345h, ytVar.f391345h) && n51.f.a(this.f391346i, ytVar.f391346i) && n51.f.a(java.lang.Integer.valueOf(this.f391347m), java.lang.Integer.valueOf(ytVar.f391347m)) && n51.f.a(this.f391348n, ytVar.f391348n) && n51.f.a(java.lang.Integer.valueOf(this.f391349o), java.lang.Integer.valueOf(ytVar.f391349o)) && n51.f.a(this.f391350p, ytVar.f391350p) && n51.f.a(this.f391351q, ytVar.f391351q) && n51.f.a(this.f391352r, ytVar.f391352r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391341d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391342e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391343f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f391344g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f391345h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f391346i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f391347m);
            java.lang.String str7 = this.f391348n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f391349o);
            java.lang.String str8 = this.f391350p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            r45.iu iuVar = this.f391351q;
            if (iuVar != null) {
                fVar.i(11, iuVar.computeSize());
                this.f391351q.writeFields(fVar);
            }
            java.lang.String str9 = this.f391352r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f391341d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f391342e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f391343f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f391344g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f391345h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f391346i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            int e17 = j17 + b36.f.e(7, this.f391347m);
            java.lang.String str16 = this.f391348n;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            int e18 = e17 + b36.f.e(9, this.f391349o);
            java.lang.String str17 = this.f391350p;
            if (str17 != null) {
                e18 += b36.f.j(10, str17);
            }
            r45.iu iuVar2 = this.f391351q;
            if (iuVar2 != null) {
                e18 += b36.f.i(11, iuVar2.computeSize());
            }
            java.lang.String str18 = this.f391352r;
            return str18 != null ? e18 + b36.f.j(12, str18) : e18;
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
        r45.yt ytVar = (r45.yt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ytVar.f391341d = aVar2.k(intValue);
                return 0;
            case 2:
                ytVar.f391342e = aVar2.k(intValue);
                return 0;
            case 3:
                ytVar.f391343f = aVar2.k(intValue);
                return 0;
            case 4:
                ytVar.f391344g = aVar2.k(intValue);
                return 0;
            case 5:
                ytVar.f391345h = aVar2.k(intValue);
                return 0;
            case 6:
                ytVar.f391346i = aVar2.k(intValue);
                return 0;
            case 7:
                ytVar.f391347m = aVar2.g(intValue);
                return 0;
            case 8:
                ytVar.f391348n = aVar2.k(intValue);
                return 0;
            case 9:
                ytVar.f391349o = aVar2.g(intValue);
                return 0;
            case 10:
                ytVar.f391350p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    ytVar.f391351q = iuVar3;
                }
                return 0;
            case 12:
                ytVar.f391352r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
