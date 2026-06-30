package m53;

/* loaded from: classes8.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323969d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323970e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323971f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323972g;

    /* renamed from: h, reason: collision with root package name */
    public int f323973h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323974i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.q)) {
            return false;
        }
        m53.q qVar = (m53.q) fVar;
        return n51.f.a(this.f323969d, qVar.f323969d) && n51.f.a(this.f323970e, qVar.f323970e) && n51.f.a(this.f323971f, qVar.f323971f) && n51.f.a(this.f323972g, qVar.f323972g) && n51.f.a(java.lang.Integer.valueOf(this.f323973h), java.lang.Integer.valueOf(qVar.f323973h)) && n51.f.a(this.f323974i, qVar.f323974i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323969d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323970e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323971f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323972g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f323973h);
            java.lang.String str5 = this.f323974i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f323969d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f323970e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f323971f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f323972g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f323973h);
            java.lang.String str10 = this.f323974i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        m53.q qVar = (m53.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qVar.f323969d = aVar2.k(intValue);
                return 0;
            case 2:
                qVar.f323970e = aVar2.k(intValue);
                return 0;
            case 3:
                qVar.f323971f = aVar2.k(intValue);
                return 0;
            case 4:
                qVar.f323972g = aVar2.k(intValue);
                return 0;
            case 5:
                qVar.f323973h = aVar2.g(intValue);
                return 0;
            case 6:
                qVar.f323974i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
