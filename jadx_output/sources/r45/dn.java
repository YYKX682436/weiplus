package r45;

/* loaded from: classes11.dex */
public class dn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372580d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372581e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372582f;

    /* renamed from: g, reason: collision with root package name */
    public int f372583g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372584h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372585i;

    /* renamed from: m, reason: collision with root package name */
    public int f372586m;

    /* renamed from: n, reason: collision with root package name */
    public int f372587n = 2;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn)) {
            return false;
        }
        r45.dn dnVar = (r45.dn) fVar;
        return n51.f.a(this.f372580d, dnVar.f372580d) && n51.f.a(this.f372581e, dnVar.f372581e) && n51.f.a(this.f372582f, dnVar.f372582f) && n51.f.a(java.lang.Integer.valueOf(this.f372583g), java.lang.Integer.valueOf(dnVar.f372583g)) && n51.f.a(this.f372584h, dnVar.f372584h) && n51.f.a(this.f372585i, dnVar.f372585i) && n51.f.a(java.lang.Integer.valueOf(this.f372586m), java.lang.Integer.valueOf(dnVar.f372586m)) && n51.f.a(java.lang.Integer.valueOf(this.f372587n), java.lang.Integer.valueOf(dnVar.f372587n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372580d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372581e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372582f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f372583g);
            java.lang.String str4 = this.f372584h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f372585i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.e(7, this.f372586m);
            fVar.e(8, this.f372587n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372580d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f372581e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f372582f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f372583g);
            java.lang.String str8 = this.f372584h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f372585i;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            return e17 + b36.f.e(7, this.f372586m) + b36.f.e(8, this.f372587n);
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
        r45.dn dnVar = (r45.dn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dnVar.f372580d = aVar2.k(intValue);
                return 0;
            case 2:
                dnVar.f372581e = aVar2.k(intValue);
                return 0;
            case 3:
                dnVar.f372582f = aVar2.k(intValue);
                return 0;
            case 4:
                dnVar.f372583g = aVar2.g(intValue);
                return 0;
            case 5:
                dnVar.f372584h = aVar2.k(intValue);
                return 0;
            case 6:
                dnVar.f372585i = aVar2.d(intValue);
                return 0;
            case 7:
                dnVar.f372586m = aVar2.g(intValue);
                return 0;
            case 8:
                dnVar.f372587n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
