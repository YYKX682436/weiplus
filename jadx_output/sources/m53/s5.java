package m53;

/* loaded from: classes8.dex */
public class s5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f324060d;

    /* renamed from: e, reason: collision with root package name */
    public long f324061e;

    /* renamed from: f, reason: collision with root package name */
    public m53.l5 f324062f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s5)) {
            return false;
        }
        m53.s5 s5Var = (m53.s5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f324060d), java.lang.Long.valueOf(s5Var.f324060d)) && n51.f.a(java.lang.Long.valueOf(this.f324061e), java.lang.Long.valueOf(s5Var.f324061e)) && n51.f.a(this.f324062f, s5Var.f324062f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f324060d);
            fVar.h(2, this.f324061e);
            m53.l5 l5Var = this.f324062f;
            if (l5Var != null) {
                fVar.i(3, l5Var.computeSize());
                this.f324062f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f324060d) + 0 + b36.f.h(2, this.f324061e);
            m53.l5 l5Var2 = this.f324062f;
            return l5Var2 != null ? h17 + b36.f.i(3, l5Var2.computeSize()) : h17;
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
        m53.s5 s5Var = (m53.s5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s5Var.f324060d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            s5Var.f324061e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.l5 l5Var3 = new m53.l5();
            if (bArr != null && bArr.length > 0) {
                l5Var3.parseFrom(bArr);
            }
            s5Var.f324062f = l5Var3;
        }
        return 0;
    }
}
