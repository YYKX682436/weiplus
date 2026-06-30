package r45;

/* loaded from: classes8.dex */
public class o30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381863d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381864e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381865f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o30)) {
            return false;
        }
        r45.o30 o30Var = (r45.o30) fVar;
        return n51.f.a(this.f381863d, o30Var.f381863d) && n51.f.a(this.f381864e, o30Var.f381864e) && n51.f.a(this.f381865f, o30Var.f381865f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381863d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f381864e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f381865f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f381863d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.protobuf.g gVar3 = this.f381864e;
            if (gVar3 != null) {
                j17 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f381865f;
            return gVar4 != null ? j17 + b36.f.b(3, gVar4) : j17;
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
        r45.o30 o30Var = (r45.o30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o30Var.f381863d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            o30Var.f381864e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        o30Var.f381865f = aVar2.d(intValue);
        return 0;
    }
}
