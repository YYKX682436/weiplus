package o32;

/* loaded from: classes14.dex */
public class a extends o32.i {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342682e;

    /* renamed from: f, reason: collision with root package name */
    public int f342683f;

    /* renamed from: g, reason: collision with root package name */
    public int f342684g;

    /* renamed from: h, reason: collision with root package name */
    public int f342685h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342686i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342687m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f342688n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f342689o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f342690p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.a)) {
            return false;
        }
        o32.a aVar = (o32.a) fVar;
        return n51.f.a(this.f342713d, aVar.f342713d) && n51.f.a(this.f342682e, aVar.f342682e) && n51.f.a(java.lang.Integer.valueOf(this.f342683f), java.lang.Integer.valueOf(aVar.f342683f)) && n51.f.a(java.lang.Integer.valueOf(this.f342684g), java.lang.Integer.valueOf(aVar.f342684g)) && n51.f.a(java.lang.Integer.valueOf(this.f342685h), java.lang.Integer.valueOf(aVar.f342685h)) && n51.f.a(this.f342686i, aVar.f342686i) && n51.f.a(this.f342687m, aVar.f342687m) && n51.f.a(this.f342688n, aVar.f342688n) && n51.f.a(this.f342689o, aVar.f342689o) && n51.f.a(this.f342690p, aVar.f342690p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.d dVar = this.f342713d;
            if (dVar != null) {
                fVar.i(1, dVar.computeSize());
                this.f342713d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f342682e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f342683f);
            fVar.e(4, this.f342684g);
            fVar.e(5, this.f342685h);
            com.tencent.mm.protobuf.g gVar2 = this.f342686i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f342687m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            java.lang.String str = this.f342688n;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f342689o;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f342690p;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            o32.d dVar2 = this.f342713d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f342682e;
            if (gVar4 != null) {
                i18 += b36.f.b(2, gVar4);
            }
            int e17 = i18 + b36.f.e(3, this.f342683f) + b36.f.e(4, this.f342684g) + b36.f.e(5, this.f342685h);
            com.tencent.mm.protobuf.g gVar5 = this.f342686i;
            if (gVar5 != null) {
                e17 += b36.f.b(6, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f342687m;
            if (gVar6 != null) {
                e17 += b36.f.b(7, gVar6);
            }
            java.lang.String str4 = this.f342688n;
            if (str4 != null) {
                e17 += b36.f.j(10, str4);
            }
            java.lang.String str5 = this.f342689o;
            if (str5 != null) {
                e17 += b36.f.j(11, str5);
            }
            java.lang.String str6 = this.f342690p;
            return str6 != null ? e17 + b36.f.j(12, str6) : e17;
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
        o32.a aVar3 = (o32.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    o32.d dVar3 = new o32.d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.parseFrom(bArr);
                    }
                    aVar3.f342713d = dVar3;
                }
                return 0;
            case 2:
                aVar3.f342682e = aVar2.d(intValue);
                return 0;
            case 3:
                aVar3.f342683f = aVar2.g(intValue);
                return 0;
            case 4:
                aVar3.f342684g = aVar2.g(intValue);
                return 0;
            case 5:
                aVar3.f342685h = aVar2.g(intValue);
                return 0;
            case 6:
                aVar3.f342686i = aVar2.d(intValue);
                return 0;
            case 7:
                aVar3.f342687m = aVar2.d(intValue);
                return 0;
            case 8:
            case 9:
            default:
                return -1;
            case 10:
                aVar3.f342688n = aVar2.k(intValue);
                return 0;
            case 11:
                aVar3.f342689o = aVar2.k(intValue);
                return 0;
            case 12:
                aVar3.f342690p = aVar2.k(intValue);
                return 0;
        }
    }
}
