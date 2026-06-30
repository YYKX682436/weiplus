package m53;

/* loaded from: classes8.dex */
public class p3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323962d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323963e;

    /* renamed from: f, reason: collision with root package name */
    public m53.c6 f323964f;

    /* renamed from: g, reason: collision with root package name */
    public m53.f3 f323965g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p3)) {
            return false;
        }
        m53.p3 p3Var = (m53.p3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323962d), java.lang.Integer.valueOf(p3Var.f323962d)) && n51.f.a(this.f323963e, p3Var.f323963e) && n51.f.a(this.f323964f, p3Var.f323964f) && n51.f.a(this.f323965g, p3Var.f323965g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323962d);
            java.lang.String str = this.f323963e;
            if (str != null) {
                fVar.j(2, str);
            }
            m53.c6 c6Var = this.f323964f;
            if (c6Var != null) {
                fVar.i(3, c6Var.computeSize());
                this.f323964f.writeFields(fVar);
            }
            m53.f3 f3Var = this.f323965g;
            if (f3Var != null) {
                fVar.i(4, f3Var.computeSize());
                this.f323965g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323962d) + 0;
            java.lang.String str2 = this.f323963e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            m53.c6 c6Var2 = this.f323964f;
            if (c6Var2 != null) {
                e17 += b36.f.i(3, c6Var2.computeSize());
            }
            m53.f3 f3Var2 = this.f323965g;
            return f3Var2 != null ? e17 + b36.f.i(4, f3Var2.computeSize()) : e17;
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
        m53.p3 p3Var = (m53.p3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p3Var.f323962d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p3Var.f323963e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                m53.c6 c6Var3 = new m53.c6();
                if (bArr != null && bArr.length > 0) {
                    c6Var3.parseFrom(bArr);
                }
                p3Var.f323964f = c6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            m53.f3 f3Var3 = new m53.f3();
            if (bArr2 != null && bArr2.length > 0) {
                f3Var3.parseFrom(bArr2);
            }
            p3Var.f323965g = f3Var3;
        }
        return 0;
    }
}
