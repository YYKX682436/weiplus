package r45;

/* loaded from: classes2.dex */
public class e00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372886d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372887e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372888f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f372889g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e00)) {
            return false;
        }
        r45.e00 e00Var = (r45.e00) fVar;
        return n51.f.a(this.f372886d, e00Var.f372886d) && n51.f.a(this.f372887e, e00Var.f372887e) && n51.f.a(this.f372888f, e00Var.f372888f) && n51.f.a(java.lang.Boolean.valueOf(this.f372889g), java.lang.Boolean.valueOf(e00Var.f372889g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372886d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372887e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372888f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f372889g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372886d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f372887e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f372888f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.a(4, this.f372889g);
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
        r45.e00 e00Var = (r45.e00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e00Var.f372886d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e00Var.f372887e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e00Var.f372888f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e00Var.f372889g = aVar2.c(intValue);
        return 0;
    }
}
