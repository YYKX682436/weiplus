package r45;

/* loaded from: classes7.dex */
public class m55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f380155d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l55 f380156e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m55)) {
            return false;
        }
        r45.m55 m55Var = (r45.m55) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f380155d), java.lang.Long.valueOf(m55Var.f380155d)) && n51.f.a(this.f380156e, m55Var.f380156e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f380155d);
            r45.l55 l55Var = this.f380156e;
            if (l55Var != null) {
                fVar.i(2, l55Var.computeSize());
                this.f380156e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f380155d) + 0;
            r45.l55 l55Var2 = this.f380156e;
            return l55Var2 != null ? h17 + b36.f.i(2, l55Var2.computeSize()) : h17;
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
        r45.m55 m55Var = (r45.m55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m55Var.f380155d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l55 l55Var3 = new r45.l55();
            if (bArr != null && bArr.length > 0) {
                l55Var3.parseFrom(bArr);
            }
            m55Var.f380156e = l55Var3;
        }
        return 0;
    }
}
