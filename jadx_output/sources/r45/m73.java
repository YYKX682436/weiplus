package r45;

/* loaded from: classes4.dex */
public class m73 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380179d;

    /* renamed from: e, reason: collision with root package name */
    public int f380180e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m73)) {
            return false;
        }
        r45.m73 m73Var = (r45.m73) fVar;
        return n51.f.a(this.f380179d, m73Var.f380179d) && n51.f.a(java.lang.Integer.valueOf(this.f380180e), java.lang.Integer.valueOf(m73Var.f380180e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380179d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f380180e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f380179d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f380180e);
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
        r45.m73 m73Var = (r45.m73) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m73Var.f380179d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        m73Var.f380180e = aVar2.g(intValue);
        return 0;
    }
}
