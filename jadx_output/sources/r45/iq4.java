package r45;

/* loaded from: classes9.dex */
public class iq4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f377266d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f377267e;

    /* renamed from: f, reason: collision with root package name */
    public long f377268f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iq4)) {
            return false;
        }
        r45.iq4 iq4Var = (r45.iq4) fVar;
        return n51.f.a(this.f377266d, iq4Var.f377266d) && n51.f.a(java.lang.Boolean.valueOf(this.f377267e), java.lang.Boolean.valueOf(iq4Var.f377267e)) && n51.f.a(java.lang.Long.valueOf(this.f377268f), java.lang.Long.valueOf(iq4Var.f377268f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f377266d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f377266d.writeFields(fVar);
            }
            fVar.a(2, this.f377267e);
            fVar.h(3, this.f377268f);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f377266d;
            return (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.computeSize()) : 0) + b36.f.a(2, this.f377267e) + b36.f.h(3, this.f377268f);
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
        r45.iq4 iq4Var = (r45.iq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                iq4Var.f377267e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            iq4Var.f377268f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.bn6 bn6Var3 = new r45.bn6();
            if (bArr != null && bArr.length > 0) {
                bn6Var3.parseFrom(bArr);
            }
            iq4Var.f377266d = bn6Var3;
        }
        return 0;
    }
}
