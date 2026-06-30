package p45;

/* loaded from: classes15.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351931d;

    /* renamed from: e, reason: collision with root package name */
    public int f351932e;

    /* renamed from: f, reason: collision with root package name */
    public int f351933f;

    /* renamed from: g, reason: collision with root package name */
    public int f351934g;

    /* renamed from: h, reason: collision with root package name */
    public p45.o f351935h;

    /* renamed from: i, reason: collision with root package name */
    public p45.o f351936i;

    /* renamed from: m, reason: collision with root package name */
    public p45.o f351937m;

    /* renamed from: n, reason: collision with root package name */
    public int f351938n;

    /* renamed from: o, reason: collision with root package name */
    public int f351939o;

    /* renamed from: p, reason: collision with root package name */
    public int f351940p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.j)) {
            return false;
        }
        p45.j jVar = (p45.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351931d), java.lang.Integer.valueOf(jVar.f351931d)) && n51.f.a(java.lang.Integer.valueOf(this.f351932e), java.lang.Integer.valueOf(jVar.f351932e)) && n51.f.a(java.lang.Integer.valueOf(this.f351933f), java.lang.Integer.valueOf(jVar.f351933f)) && n51.f.a(java.lang.Integer.valueOf(this.f351934g), java.lang.Integer.valueOf(jVar.f351934g)) && n51.f.a(this.f351935h, jVar.f351935h) && n51.f.a(this.f351936i, jVar.f351936i) && n51.f.a(this.f351937m, jVar.f351937m) && n51.f.a(java.lang.Integer.valueOf(this.f351938n), java.lang.Integer.valueOf(jVar.f351938n)) && n51.f.a(java.lang.Integer.valueOf(this.f351939o), java.lang.Integer.valueOf(jVar.f351939o)) && n51.f.a(java.lang.Integer.valueOf(this.f351940p), java.lang.Integer.valueOf(jVar.f351940p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351931d);
            fVar.e(2, this.f351932e);
            fVar.e(3, this.f351933f);
            fVar.e(4, this.f351934g);
            p45.o oVar = this.f351935h;
            if (oVar != null) {
                fVar.i(5, oVar.computeSize());
                this.f351935h.writeFields(fVar);
            }
            p45.o oVar2 = this.f351936i;
            if (oVar2 != null) {
                fVar.i(6, oVar2.computeSize());
                this.f351936i.writeFields(fVar);
            }
            p45.o oVar3 = this.f351937m;
            if (oVar3 != null) {
                fVar.i(7, oVar3.computeSize());
                this.f351937m.writeFields(fVar);
            }
            fVar.e(8, this.f351938n);
            fVar.e(9, this.f351939o);
            fVar.e(10, this.f351940p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351931d) + 0 + b36.f.e(2, this.f351932e) + b36.f.e(3, this.f351933f) + b36.f.e(4, this.f351934g);
            p45.o oVar4 = this.f351935h;
            if (oVar4 != null) {
                e17 += b36.f.i(5, oVar4.computeSize());
            }
            p45.o oVar5 = this.f351936i;
            if (oVar5 != null) {
                e17 += b36.f.i(6, oVar5.computeSize());
            }
            p45.o oVar6 = this.f351937m;
            if (oVar6 != null) {
                e17 += b36.f.i(7, oVar6.computeSize());
            }
            return e17 + b36.f.e(8, this.f351938n) + b36.f.e(9, this.f351939o) + b36.f.e(10, this.f351940p);
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
        p45.j jVar = (p45.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f351931d = aVar2.g(intValue);
                return 0;
            case 2:
                jVar.f351932e = aVar2.g(intValue);
                return 0;
            case 3:
                jVar.f351933f = aVar2.g(intValue);
                return 0;
            case 4:
                jVar.f351934g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    p45.o oVar7 = new p45.o();
                    if (bArr != null && bArr.length > 0) {
                        oVar7.parseFrom(bArr);
                    }
                    jVar.f351935h = oVar7;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    p45.o oVar8 = new p45.o();
                    if (bArr2 != null && bArr2.length > 0) {
                        oVar8.parseFrom(bArr2);
                    }
                    jVar.f351936i = oVar8;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    p45.o oVar9 = new p45.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar9.parseFrom(bArr3);
                    }
                    jVar.f351937m = oVar9;
                }
                return 0;
            case 8:
                jVar.f351938n = aVar2.g(intValue);
                return 0;
            case 9:
                jVar.f351939o = aVar2.g(intValue);
                return 0;
            case 10:
                jVar.f351940p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
