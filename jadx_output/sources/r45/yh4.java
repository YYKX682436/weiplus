package r45;

/* loaded from: classes4.dex */
public class yh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391084d;

    /* renamed from: e, reason: collision with root package name */
    public int f391085e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391086f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391087g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391088h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yh4)) {
            return false;
        }
        r45.yh4 yh4Var = (r45.yh4) fVar;
        return n51.f.a(this.f391084d, yh4Var.f391084d) && n51.f.a(java.lang.Integer.valueOf(this.f391085e), java.lang.Integer.valueOf(yh4Var.f391085e)) && n51.f.a(this.f391086f, yh4Var.f391086f) && n51.f.a(this.f391087g, yh4Var.f391087g) && n51.f.a(this.f391088h, yh4Var.f391088h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391084d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f391085e);
            java.lang.String str2 = this.f391086f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f391087g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f391088h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f391084d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f391085e);
            java.lang.String str6 = this.f391086f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f391087g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f391088h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.yh4 yh4Var = (r45.yh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yh4Var.f391084d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yh4Var.f391085e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yh4Var.f391086f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yh4Var.f391087g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yh4Var.f391088h = aVar2.k(intValue);
        return 0;
    }
}
