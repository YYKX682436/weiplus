package r45;

/* loaded from: classes8.dex */
public class ku extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378946d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378947e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378948f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378949g;

    /* renamed from: h, reason: collision with root package name */
    public int f378950h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378951i;

    /* renamed from: m, reason: collision with root package name */
    public r45.iu f378952m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378953n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ku)) {
            return false;
        }
        r45.ku kuVar = (r45.ku) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378946d), java.lang.Integer.valueOf(kuVar.f378946d)) && n51.f.a(this.f378947e, kuVar.f378947e) && n51.f.a(this.f378948f, kuVar.f378948f) && n51.f.a(this.f378949g, kuVar.f378949g) && n51.f.a(java.lang.Integer.valueOf(this.f378950h), java.lang.Integer.valueOf(kuVar.f378950h)) && n51.f.a(this.f378951i, kuVar.f378951i) && n51.f.a(this.f378952m, kuVar.f378952m) && n51.f.a(this.f378953n, kuVar.f378953n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378946d);
            java.lang.String str = this.f378947e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378948f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378949g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f378950h);
            java.lang.String str4 = this.f378951i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.iu iuVar = this.f378952m;
            if (iuVar != null) {
                fVar.i(7, iuVar.computeSize());
                this.f378952m.writeFields(fVar);
            }
            java.lang.String str5 = this.f378953n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378946d) + 0;
            java.lang.String str6 = this.f378947e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f378948f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f378949g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int e18 = e17 + b36.f.e(5, this.f378950h);
            java.lang.String str9 = this.f378951i;
            if (str9 != null) {
                e18 += b36.f.j(6, str9);
            }
            r45.iu iuVar2 = this.f378952m;
            if (iuVar2 != null) {
                e18 += b36.f.i(7, iuVar2.computeSize());
            }
            java.lang.String str10 = this.f378953n;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.ku kuVar = (r45.ku) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kuVar.f378946d = aVar2.g(intValue);
                return 0;
            case 2:
                kuVar.f378947e = aVar2.k(intValue);
                return 0;
            case 3:
                kuVar.f378948f = aVar2.k(intValue);
                return 0;
            case 4:
                kuVar.f378949g = aVar2.k(intValue);
                return 0;
            case 5:
                kuVar.f378950h = aVar2.g(intValue);
                return 0;
            case 6:
                kuVar.f378951i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    kuVar.f378952m = iuVar3;
                }
                return 0;
            case 8:
                kuVar.f378953n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
