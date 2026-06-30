package r45;

/* loaded from: classes4.dex */
public class az3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370373d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370374e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370375f;

    /* renamed from: g, reason: collision with root package name */
    public long f370376g;

    /* renamed from: h, reason: collision with root package name */
    public int f370377h;

    /* renamed from: i, reason: collision with root package name */
    public int f370378i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.az3)) {
            return false;
        }
        r45.az3 az3Var = (r45.az3) fVar;
        return n51.f.a(this.f370373d, az3Var.f370373d) && n51.f.a(this.f370374e, az3Var.f370374e) && n51.f.a(this.f370375f, az3Var.f370375f) && n51.f.a(java.lang.Long.valueOf(this.f370376g), java.lang.Long.valueOf(az3Var.f370376g)) && n51.f.a(java.lang.Integer.valueOf(this.f370377h), java.lang.Integer.valueOf(az3Var.f370377h)) && n51.f.a(java.lang.Integer.valueOf(this.f370378i), java.lang.Integer.valueOf(az3Var.f370378i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370373d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370374e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370375f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f370376g);
            fVar.e(5, this.f370377h);
            fVar.e(6, this.f370378i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f370373d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f370374e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f370375f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f370376g) + b36.f.e(5, this.f370377h) + b36.f.e(6, this.f370378i);
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
        r45.az3 az3Var = (r45.az3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                az3Var.f370373d = aVar2.k(intValue);
                return 0;
            case 2:
                az3Var.f370374e = aVar2.k(intValue);
                return 0;
            case 3:
                az3Var.f370375f = aVar2.k(intValue);
                return 0;
            case 4:
                az3Var.f370376g = aVar2.i(intValue);
                return 0;
            case 5:
                az3Var.f370377h = aVar2.g(intValue);
                return 0;
            case 6:
                az3Var.f370378i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
