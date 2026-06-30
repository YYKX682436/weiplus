package r45;

/* loaded from: classes2.dex */
public class qb1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f383797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383799f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qb1)) {
            return false;
        }
        r45.qb1 qb1Var = (r45.qb1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f383797d), java.lang.Boolean.valueOf(qb1Var.f383797d)) && n51.f.a(this.f383798e, qb1Var.f383798e) && n51.f.a(this.f383799f, qb1Var.f383799f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f383797d);
            java.lang.String str = this.f383798e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383799f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f383797d) + 0;
            java.lang.String str3 = this.f383798e;
            if (str3 != null) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f383799f;
            return str4 != null ? a17 + b36.f.j(3, str4) : a17;
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
        r45.qb1 qb1Var = (r45.qb1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qb1Var.f383797d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            qb1Var.f383798e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        qb1Var.f383799f = aVar2.k(intValue);
        return 0;
    }
}
