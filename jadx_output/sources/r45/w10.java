package r45;

/* loaded from: classes9.dex */
public class w10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388778e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388779f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388780g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w10)) {
            return false;
        }
        r45.w10 w10Var = (r45.w10) fVar;
        return n51.f.a(this.f388777d, w10Var.f388777d) && n51.f.a(this.f388778e, w10Var.f388778e) && n51.f.a(this.f388779f, w10Var.f388779f) && n51.f.a(this.f388780g, w10Var.f388780g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388777d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388778e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388779f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f388780g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f388777d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f388778e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f388779f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f388780g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.w10 w10Var = (r45.w10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w10Var.f388777d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            w10Var.f388778e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            w10Var.f388779f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        w10Var.f388780g = aVar2.k(intValue);
        return 0;
    }
}
