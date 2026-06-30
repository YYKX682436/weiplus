package r45;

/* loaded from: classes4.dex */
public class e43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373005e;

    /* renamed from: f, reason: collision with root package name */
    public int f373006f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e43)) {
            return false;
        }
        r45.e43 e43Var = (r45.e43) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373004d), java.lang.Integer.valueOf(e43Var.f373004d)) && n51.f.a(this.f373005e, e43Var.f373005e) && n51.f.a(java.lang.Integer.valueOf(this.f373006f), java.lang.Integer.valueOf(e43Var.f373006f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373004d);
            java.lang.String str = this.f373005e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f373006f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373004d) + 0;
            java.lang.String str2 = this.f373005e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f373006f);
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
        r45.e43 e43Var = (r45.e43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e43Var.f373004d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e43Var.f373005e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        e43Var.f373006f = aVar2.g(intValue);
        return 0;
    }
}
