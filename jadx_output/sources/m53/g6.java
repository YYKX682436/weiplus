package m53;

/* loaded from: classes2.dex */
public class g6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h6 f323714d;

    /* renamed from: e, reason: collision with root package name */
    public m53.u0 f323715e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323716f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g6)) {
            return false;
        }
        m53.g6 g6Var = (m53.g6) fVar;
        return n51.f.a(this.f323714d, g6Var.f323714d) && n51.f.a(this.f323715e, g6Var.f323715e) && n51.f.a(this.f323716f, g6Var.f323716f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h6 h6Var = this.f323714d;
            if (h6Var != null) {
                fVar.i(1, h6Var.computeSize());
                this.f323714d.writeFields(fVar);
            }
            m53.u0 u0Var = this.f323715e;
            if (u0Var != null) {
                fVar.i(2, u0Var.computeSize());
                this.f323715e.writeFields(fVar);
            }
            java.lang.String str = this.f323716f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h6 h6Var2 = this.f323714d;
            int i18 = h6Var2 != null ? 0 + b36.f.i(1, h6Var2.computeSize()) : 0;
            m53.u0 u0Var2 = this.f323715e;
            if (u0Var2 != null) {
                i18 += b36.f.i(2, u0Var2.computeSize());
            }
            java.lang.String str2 = this.f323716f;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        m53.g6 g6Var = (m53.g6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                m53.h6 h6Var3 = new m53.h6();
                if (bArr != null && bArr.length > 0) {
                    h6Var3.parseFrom(bArr);
                }
                g6Var.f323714d = h6Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            g6Var.f323716f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            m53.u0 u0Var3 = new m53.u0();
            if (bArr2 != null && bArr2.length > 0) {
                u0Var3.parseFrom(bArr2);
            }
            g6Var.f323715e = u0Var3;
        }
        return 0;
    }
}
