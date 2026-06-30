package r45;

/* loaded from: classes11.dex */
public class ic6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376936e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376937f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376938g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ic6)) {
            return false;
        }
        r45.ic6 ic6Var = (r45.ic6) fVar;
        return n51.f.a(this.f376935d, ic6Var.f376935d) && n51.f.a(this.f376936e, ic6Var.f376936e) && n51.f.a(this.f376937f, ic6Var.f376937f) && n51.f.a(this.f376938g, ic6Var.f376938g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376935d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376936e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376937f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f376938g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f376935d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f376936e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f376937f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f376938g;
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
        r45.ic6 ic6Var = (r45.ic6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ic6Var.f376935d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ic6Var.f376936e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ic6Var.f376937f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ic6Var.f376938g = aVar2.k(intValue);
        return 0;
    }
}
