package r45;

/* loaded from: classes9.dex */
public class bu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371055d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371056e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371057f;

    /* renamed from: g, reason: collision with root package name */
    public int f371058g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371059h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f371060i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371061m;

    /* renamed from: n, reason: collision with root package name */
    public int f371062n;

    /* renamed from: o, reason: collision with root package name */
    public int f371063o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bu)) {
            return false;
        }
        r45.bu buVar = (r45.bu) fVar;
        return n51.f.a(this.f371055d, buVar.f371055d) && n51.f.a(this.f371056e, buVar.f371056e) && n51.f.a(this.f371057f, buVar.f371057f) && n51.f.a(java.lang.Integer.valueOf(this.f371058g), java.lang.Integer.valueOf(buVar.f371058g)) && n51.f.a(this.f371059h, buVar.f371059h) && n51.f.a(this.f371060i, buVar.f371060i) && n51.f.a(this.f371061m, buVar.f371061m) && n51.f.a(java.lang.Integer.valueOf(this.f371062n), java.lang.Integer.valueOf(buVar.f371062n)) && n51.f.a(java.lang.Integer.valueOf(this.f371063o), java.lang.Integer.valueOf(buVar.f371063o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371055d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371056e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f371057f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f371058g);
            java.lang.String str4 = this.f371059h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.iu iuVar = this.f371060i;
            if (iuVar != null) {
                fVar.i(6, iuVar.computeSize());
                this.f371060i.writeFields(fVar);
            }
            java.lang.String str5 = this.f371061m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f371062n);
            fVar.e(9, this.f371063o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f371055d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f371056e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f371057f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f371058g);
            java.lang.String str9 = this.f371059h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            r45.iu iuVar2 = this.f371060i;
            if (iuVar2 != null) {
                e17 += b36.f.i(6, iuVar2.computeSize());
            }
            java.lang.String str10 = this.f371061m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            return e17 + b36.f.e(8, this.f371062n) + b36.f.e(9, this.f371063o);
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
        r45.bu buVar = (r45.bu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                buVar.f371055d = aVar2.k(intValue);
                return 0;
            case 2:
                buVar.f371056e = aVar2.k(intValue);
                return 0;
            case 3:
                buVar.f371057f = aVar2.k(intValue);
                return 0;
            case 4:
                buVar.f371058g = aVar2.g(intValue);
                return 0;
            case 5:
                buVar.f371059h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    buVar.f371060i = iuVar3;
                }
                return 0;
            case 7:
                buVar.f371061m = aVar2.k(intValue);
                return 0;
            case 8:
                buVar.f371062n = aVar2.g(intValue);
                return 0;
            case 9:
                buVar.f371063o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
