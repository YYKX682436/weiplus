package m53;

/* loaded from: classes8.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f324063d;

    /* renamed from: e, reason: collision with root package name */
    public m53.f4 f324064e;

    /* renamed from: f, reason: collision with root package name */
    public m53.l f324065f;

    /* renamed from: g, reason: collision with root package name */
    public m53.t5 f324066g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.t)) {
            return false;
        }
        m53.t tVar = (m53.t) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f324063d), java.lang.Boolean.valueOf(tVar.f324063d)) && n51.f.a(this.f324064e, tVar.f324064e) && n51.f.a(this.f324065f, tVar.f324065f) && n51.f.a(this.f324066g, tVar.f324066g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f324063d);
            m53.f4 f4Var = this.f324064e;
            if (f4Var != null) {
                fVar.i(2, f4Var.computeSize());
                this.f324064e.writeFields(fVar);
            }
            m53.l lVar = this.f324065f;
            if (lVar != null) {
                fVar.i(3, lVar.computeSize());
                this.f324065f.writeFields(fVar);
            }
            m53.t5 t5Var = this.f324066g;
            if (t5Var != null) {
                fVar.i(4, t5Var.computeSize());
                this.f324066g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f324063d) + 0;
            m53.f4 f4Var2 = this.f324064e;
            if (f4Var2 != null) {
                a17 += b36.f.i(2, f4Var2.computeSize());
            }
            m53.l lVar2 = this.f324065f;
            if (lVar2 != null) {
                a17 += b36.f.i(3, lVar2.computeSize());
            }
            m53.t5 t5Var2 = this.f324066g;
            return t5Var2 != null ? a17 + b36.f.i(4, t5Var2.computeSize()) : a17;
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
        m53.t tVar = (m53.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tVar.f324063d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                m53.f4 f4Var3 = new m53.f4();
                if (bArr != null && bArr.length > 0) {
                    f4Var3.parseFrom(bArr);
                }
                tVar.f324064e = f4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                m53.l lVar3 = new m53.l();
                if (bArr2 != null && bArr2.length > 0) {
                    lVar3.parseFrom(bArr2);
                }
                tVar.f324065f = lVar3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            m53.t5 t5Var3 = new m53.t5();
            if (bArr3 != null && bArr3.length > 0) {
                t5Var3.parseFrom(bArr3);
            }
            tVar.f324066g = t5Var3;
        }
        return 0;
    }
}
