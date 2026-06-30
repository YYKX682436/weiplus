package m53;

/* loaded from: classes4.dex */
public class l1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.g0 f323859d;

    /* renamed from: e, reason: collision with root package name */
    public m53.h3 f323860e;

    /* renamed from: f, reason: collision with root package name */
    public m53.n4 f323861f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323862g;

    /* renamed from: h, reason: collision with root package name */
    public m53.v2 f323863h;

    /* renamed from: i, reason: collision with root package name */
    public m53.m f323864i;

    /* renamed from: m, reason: collision with root package name */
    public m53.e0 f323865m;

    /* renamed from: n, reason: collision with root package name */
    public m53.t f323866n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.l1)) {
            return false;
        }
        m53.l1 l1Var = (m53.l1) fVar;
        return n51.f.a(this.f323859d, l1Var.f323859d) && n51.f.a(this.f323860e, l1Var.f323860e) && n51.f.a(this.f323861f, l1Var.f323861f) && n51.f.a(java.lang.Boolean.valueOf(this.f323862g), java.lang.Boolean.valueOf(l1Var.f323862g)) && n51.f.a(this.f323863h, l1Var.f323863h) && n51.f.a(this.f323864i, l1Var.f323864i) && n51.f.a(this.f323865m, l1Var.f323865m) && n51.f.a(this.f323866n, l1Var.f323866n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.g0 g0Var = this.f323859d;
            if (g0Var != null) {
                fVar.i(1, g0Var.computeSize());
                this.f323859d.writeFields(fVar);
            }
            m53.h3 h3Var = this.f323860e;
            if (h3Var != null) {
                fVar.i(2, h3Var.computeSize());
                this.f323860e.writeFields(fVar);
            }
            m53.n4 n4Var = this.f323861f;
            if (n4Var != null) {
                fVar.i(3, n4Var.computeSize());
                this.f323861f.writeFields(fVar);
            }
            fVar.a(4, this.f323862g);
            m53.v2 v2Var = this.f323863h;
            if (v2Var != null) {
                fVar.i(5, v2Var.computeSize());
                this.f323863h.writeFields(fVar);
            }
            m53.m mVar = this.f323864i;
            if (mVar != null) {
                fVar.i(6, mVar.computeSize());
                this.f323864i.writeFields(fVar);
            }
            m53.e0 e0Var = this.f323865m;
            if (e0Var != null) {
                fVar.i(7, e0Var.computeSize());
                this.f323865m.writeFields(fVar);
            }
            m53.t tVar = this.f323866n;
            if (tVar != null) {
                fVar.i(8, tVar.computeSize());
                this.f323866n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.g0 g0Var2 = this.f323859d;
            int i18 = g0Var2 != null ? 0 + b36.f.i(1, g0Var2.computeSize()) : 0;
            m53.h3 h3Var2 = this.f323860e;
            if (h3Var2 != null) {
                i18 += b36.f.i(2, h3Var2.computeSize());
            }
            m53.n4 n4Var2 = this.f323861f;
            if (n4Var2 != null) {
                i18 += b36.f.i(3, n4Var2.computeSize());
            }
            int a17 = i18 + b36.f.a(4, this.f323862g);
            m53.v2 v2Var2 = this.f323863h;
            if (v2Var2 != null) {
                a17 += b36.f.i(5, v2Var2.computeSize());
            }
            m53.m mVar2 = this.f323864i;
            if (mVar2 != null) {
                a17 += b36.f.i(6, mVar2.computeSize());
            }
            m53.e0 e0Var2 = this.f323865m;
            if (e0Var2 != null) {
                a17 += b36.f.i(7, e0Var2.computeSize());
            }
            m53.t tVar2 = this.f323866n;
            return tVar2 != null ? a17 + b36.f.i(8, tVar2.computeSize()) : a17;
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
        m53.l1 l1Var = (m53.l1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    m53.g0 g0Var3 = new m53.g0();
                    if (bArr != null && bArr.length > 0) {
                        g0Var3.parseFrom(bArr);
                    }
                    l1Var.f323859d = g0Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    m53.h3 h3Var3 = new m53.h3();
                    if (bArr2 != null && bArr2.length > 0) {
                        h3Var3.parseFrom(bArr2);
                    }
                    l1Var.f323860e = h3Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    m53.n4 n4Var3 = new m53.n4();
                    if (bArr3 != null && bArr3.length > 0) {
                        n4Var3.parseFrom(bArr3);
                    }
                    l1Var.f323861f = n4Var3;
                }
                return 0;
            case 4:
                l1Var.f323862g = aVar2.c(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    m53.v2 v2Var3 = new m53.v2();
                    if (bArr4 != null && bArr4.length > 0) {
                        v2Var3.parseFrom(bArr4);
                    }
                    l1Var.f323863h = v2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    m53.m mVar3 = new m53.m();
                    if (bArr5 != null && bArr5.length > 0) {
                        mVar3.parseFrom(bArr5);
                    }
                    l1Var.f323864i = mVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    m53.e0 e0Var3 = new m53.e0();
                    if (bArr6 != null && bArr6.length > 0) {
                        e0Var3.parseFrom(bArr6);
                    }
                    l1Var.f323865m = e0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    m53.t tVar3 = new m53.t();
                    if (bArr7 != null && bArr7.length > 0) {
                        tVar3.parseFrom(bArr7);
                    }
                    l1Var.f323866n = tVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
