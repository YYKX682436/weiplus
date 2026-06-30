package r45;

/* loaded from: classes4.dex */
public class k06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378273d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378274e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378275f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k06)) {
            return false;
        }
        r45.k06 k06Var = (r45.k06) fVar;
        return n51.f.a(this.f378273d, k06Var.f378273d) && n51.f.a(this.f378274e, k06Var.f378274e) && n51.f.a(this.f378275f, k06Var.f378275f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f378273d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f378274e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            java.lang.String str = this.f378275f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f378273d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f378274e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            java.lang.String str2 = this.f378275f;
            return str2 != null ? b17 + b36.f.j(3, str2) : b17;
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
        r45.k06 k06Var = (r45.k06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k06Var.f378273d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            k06Var.f378274e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k06Var.f378275f = aVar2.k(intValue);
        return 0;
    }
}
