package r45;

/* loaded from: classes2.dex */
public class ud4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.m03 f387265d;

    /* renamed from: e, reason: collision with root package name */
    public r45.m03 f387266e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud4)) {
            return false;
        }
        r45.ud4 ud4Var = (r45.ud4) fVar;
        return n51.f.a(this.f387265d, ud4Var.f387265d) && n51.f.a(this.f387266e, ud4Var.f387266e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.m03 m03Var = this.f387265d;
            if (m03Var != null) {
                fVar.i(1, m03Var.computeSize());
                this.f387265d.writeFields(fVar);
            }
            r45.m03 m03Var2 = this.f387266e;
            if (m03Var2 != null) {
                fVar.i(2, m03Var2.computeSize());
                this.f387266e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.m03 m03Var3 = this.f387265d;
            int i18 = m03Var3 != null ? 0 + b36.f.i(1, m03Var3.computeSize()) : 0;
            r45.m03 m03Var4 = this.f387266e;
            return m03Var4 != null ? i18 + b36.f.i(2, m03Var4.computeSize()) : i18;
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
        r45.ud4 ud4Var = (r45.ud4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.m03 m03Var5 = new r45.m03();
                if (bArr != null && bArr.length > 0) {
                    m03Var5.parseFrom(bArr);
                }
                ud4Var.f387265d = m03Var5;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.m03 m03Var6 = new r45.m03();
            if (bArr2 != null && bArr2.length > 0) {
                m03Var6.parseFrom(bArr2);
            }
            ud4Var.f387266e = m03Var6;
        }
        return 0;
    }
}
