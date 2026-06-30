package m53;

/* loaded from: classes2.dex */
public class b3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323578e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323579f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323580g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323581h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.b3)) {
            return false;
        }
        m53.b3 b3Var = (m53.b3) fVar;
        return n51.f.a(this.f323577d, b3Var.f323577d) && n51.f.a(this.f323578e, b3Var.f323578e) && n51.f.a(this.f323579f, b3Var.f323579f) && n51.f.a(this.f323580g, b3Var.f323580g) && n51.f.a(this.f323581h, b3Var.f323581h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323577d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323578e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323579f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323580g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f323581h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f323577d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f323578e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f323579f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f323580g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f323581h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        m53.b3 b3Var = (m53.b3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b3Var.f323577d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            b3Var.f323578e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            b3Var.f323579f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            b3Var.f323580g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        b3Var.f323581h = aVar2.k(intValue);
        return 0;
    }
}
