package q33;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f359946d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f359947e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f359948f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f359949g;

    /* renamed from: h, reason: collision with root package name */
    public int f359950h;

    /* renamed from: i, reason: collision with root package name */
    public int f359951i;

    /* renamed from: m, reason: collision with root package name */
    public int f359952m;

    /* renamed from: n, reason: collision with root package name */
    public int f359953n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f359954o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f359955p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f359956q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof q33.f)) {
            return false;
        }
        q33.f fVar2 = (q33.f) fVar;
        return n51.f.a(this.f359946d, fVar2.f359946d) && n51.f.a(this.f359947e, fVar2.f359947e) && n51.f.a(this.f359948f, fVar2.f359948f) && n51.f.a(this.f359949g, fVar2.f359949g) && n51.f.a(java.lang.Integer.valueOf(this.f359950h), java.lang.Integer.valueOf(fVar2.f359950h)) && n51.f.a(java.lang.Integer.valueOf(this.f359951i), java.lang.Integer.valueOf(fVar2.f359951i)) && n51.f.a(java.lang.Integer.valueOf(this.f359952m), java.lang.Integer.valueOf(fVar2.f359952m)) && n51.f.a(java.lang.Integer.valueOf(this.f359953n), java.lang.Integer.valueOf(fVar2.f359953n)) && n51.f.a(this.f359954o, fVar2.f359954o) && n51.f.a(this.f359955p, fVar2.f359955p) && n51.f.a(this.f359956q, fVar2.f359956q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f359946d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f359947e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f359948f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f359949g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f359950h);
            fVar.e(6, this.f359951i);
            fVar.e(7, this.f359952m);
            fVar.e(8, this.f359953n);
            java.lang.String str5 = this.f359954o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f359955p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f359956q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f359946d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f359947e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f359948f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f359949g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int e17 = j17 + b36.f.e(5, this.f359950h) + b36.f.e(6, this.f359951i) + b36.f.e(7, this.f359952m) + b36.f.e(8, this.f359953n);
            java.lang.String str12 = this.f359954o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f359955p;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f359956q;
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
        q33.f fVar2 = (q33.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f359946d = aVar2.k(intValue);
                return 0;
            case 2:
                fVar2.f359947e = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f359948f = aVar2.k(intValue);
                return 0;
            case 4:
                fVar2.f359949g = aVar2.k(intValue);
                return 0;
            case 5:
                fVar2.f359950h = aVar2.g(intValue);
                return 0;
            case 6:
                fVar2.f359951i = aVar2.g(intValue);
                return 0;
            case 7:
                fVar2.f359952m = aVar2.g(intValue);
                return 0;
            case 8:
                fVar2.f359953n = aVar2.g(intValue);
                return 0;
            case 9:
                fVar2.f359954o = aVar2.k(intValue);
                return 0;
            case 10:
                fVar2.f359955p = aVar2.k(intValue);
                return 0;
            case 11:
                fVar2.f359956q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
