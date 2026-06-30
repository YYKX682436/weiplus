package p45;

/* loaded from: classes14.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351895d;

    /* renamed from: e, reason: collision with root package name */
    public int f351896e;

    /* renamed from: f, reason: collision with root package name */
    public int f351897f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f351898g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f351899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f351900i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f351901m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f351902n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f351903o;

    /* renamed from: p, reason: collision with root package name */
    public int f351904p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.e)) {
            return false;
        }
        p45.e eVar = (p45.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351895d), java.lang.Integer.valueOf(eVar.f351895d)) && n51.f.a(java.lang.Integer.valueOf(this.f351896e), java.lang.Integer.valueOf(eVar.f351896e)) && n51.f.a(java.lang.Integer.valueOf(this.f351897f), java.lang.Integer.valueOf(eVar.f351897f)) && n51.f.a(this.f351898g, eVar.f351898g) && n51.f.a(this.f351899h, eVar.f351899h) && n51.f.a(this.f351900i, eVar.f351900i) && n51.f.a(this.f351901m, eVar.f351901m) && n51.f.a(this.f351902n, eVar.f351902n) && n51.f.a(this.f351903o, eVar.f351903o) && n51.f.a(java.lang.Integer.valueOf(this.f351904p), java.lang.Integer.valueOf(eVar.f351904p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351898g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351895d);
            fVar.e(2, this.f351896e);
            fVar.e(3, this.f351897f);
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f351899h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f351900i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f351901m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f351902n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f351903o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f351904p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351895d) + 0 + b36.f.e(2, this.f351896e) + b36.f.e(3, this.f351897f) + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f351899h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f351900i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f351901m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f351902n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f351903o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f351904p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        p45.e eVar = (p45.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eVar.f351895d = aVar2.g(intValue);
                return 0;
            case 2:
                eVar.f351896e = aVar2.g(intValue);
                return 0;
            case 3:
                eVar.f351897f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    p45.d dVar = new p45.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar.parseFrom(bArr2);
                    }
                    eVar.f351898g.add(dVar);
                }
                return 0;
            case 5:
                eVar.f351899h = aVar2.k(intValue);
                return 0;
            case 6:
                eVar.f351900i = aVar2.k(intValue);
                return 0;
            case 7:
                eVar.f351901m = aVar2.k(intValue);
                return 0;
            case 8:
                eVar.f351902n = aVar2.k(intValue);
                return 0;
            case 9:
                eVar.f351903o = aVar2.k(intValue);
                return 0;
            case 10:
                eVar.f351904p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
