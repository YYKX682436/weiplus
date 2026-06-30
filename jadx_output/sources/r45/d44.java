package r45;

/* loaded from: classes2.dex */
public class d44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372092e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372093f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372094g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372095h;

    /* renamed from: i, reason: collision with root package name */
    public int f372096i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d44)) {
            return false;
        }
        r45.d44 d44Var = (r45.d44) fVar;
        return n51.f.a(this.f372091d, d44Var.f372091d) && n51.f.a(this.f372092e, d44Var.f372092e) && n51.f.a(this.f372093f, d44Var.f372093f) && n51.f.a(this.f372094g, d44Var.f372094g) && n51.f.a(this.f372095h, d44Var.f372095h) && n51.f.a(java.lang.Integer.valueOf(this.f372096i), java.lang.Integer.valueOf(d44Var.f372096i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372091d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372092e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372093f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f372094g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f372095h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f372096i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f372091d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f372092e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f372093f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f372094g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f372095h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f372096i);
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
        r45.d44 d44Var = (r45.d44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d44Var.f372091d = aVar2.k(intValue);
                return 0;
            case 2:
                d44Var.f372092e = aVar2.k(intValue);
                return 0;
            case 3:
                d44Var.f372093f = aVar2.k(intValue);
                return 0;
            case 4:
                d44Var.f372094g = aVar2.k(intValue);
                return 0;
            case 5:
                d44Var.f372095h = aVar2.k(intValue);
                return 0;
            case 6:
                d44Var.f372096i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
