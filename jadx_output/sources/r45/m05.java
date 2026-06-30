package r45;

/* loaded from: classes4.dex */
public class m05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f380047d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hd4 f380048e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m05)) {
            return false;
        }
        r45.m05 m05Var = (r45.m05) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f380047d), java.lang.Long.valueOf(m05Var.f380047d)) && n51.f.a(this.f380048e, m05Var.f380048e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f380047d);
            r45.hd4 hd4Var = this.f380048e;
            if (hd4Var != null) {
                fVar.i(2, hd4Var.computeSize());
                this.f380048e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f380047d) + 0;
            r45.hd4 hd4Var2 = this.f380048e;
            return hd4Var2 != null ? h17 + b36.f.i(2, hd4Var2.computeSize()) : h17;
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
        r45.m05 m05Var = (r45.m05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m05Var.f380047d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.hd4 hd4Var3 = new r45.hd4();
            if (bArr != null && bArr.length > 0) {
                hd4Var3.parseFrom(bArr);
            }
            m05Var.f380048e = hd4Var3;
        }
        return 0;
    }
}
