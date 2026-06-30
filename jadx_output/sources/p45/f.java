package p45;

/* loaded from: classes15.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351905d;

    /* renamed from: e, reason: collision with root package name */
    public int f351906e;

    /* renamed from: f, reason: collision with root package name */
    public int f351907f;

    /* renamed from: g, reason: collision with root package name */
    public int f351908g;

    /* renamed from: h, reason: collision with root package name */
    public p45.o f351909h;

    /* renamed from: i, reason: collision with root package name */
    public p45.o f351910i;

    /* renamed from: m, reason: collision with root package name */
    public p45.o f351911m;

    /* renamed from: n, reason: collision with root package name */
    public int f351912n;

    /* renamed from: o, reason: collision with root package name */
    public int f351913o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.f)) {
            return false;
        }
        p45.f fVar2 = (p45.f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351905d), java.lang.Integer.valueOf(fVar2.f351905d)) && n51.f.a(java.lang.Integer.valueOf(this.f351906e), java.lang.Integer.valueOf(fVar2.f351906e)) && n51.f.a(java.lang.Integer.valueOf(this.f351907f), java.lang.Integer.valueOf(fVar2.f351907f)) && n51.f.a(java.lang.Integer.valueOf(this.f351908g), java.lang.Integer.valueOf(fVar2.f351908g)) && n51.f.a(this.f351909h, fVar2.f351909h) && n51.f.a(this.f351910i, fVar2.f351910i) && n51.f.a(this.f351911m, fVar2.f351911m) && n51.f.a(java.lang.Integer.valueOf(this.f351912n), java.lang.Integer.valueOf(fVar2.f351912n)) && n51.f.a(java.lang.Integer.valueOf(this.f351913o), java.lang.Integer.valueOf(fVar2.f351913o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351905d);
            fVar.e(2, this.f351906e);
            fVar.e(3, this.f351907f);
            fVar.e(4, this.f351908g);
            p45.o oVar = this.f351909h;
            if (oVar != null) {
                fVar.i(5, oVar.computeSize());
                this.f351909h.writeFields(fVar);
            }
            p45.o oVar2 = this.f351910i;
            if (oVar2 != null) {
                fVar.i(6, oVar2.computeSize());
                this.f351910i.writeFields(fVar);
            }
            p45.o oVar3 = this.f351911m;
            if (oVar3 != null) {
                fVar.i(7, oVar3.computeSize());
                this.f351911m.writeFields(fVar);
            }
            fVar.e(8, this.f351912n);
            fVar.e(9, this.f351913o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351905d) + 0 + b36.f.e(2, this.f351906e) + b36.f.e(3, this.f351907f) + b36.f.e(4, this.f351908g);
            p45.o oVar4 = this.f351909h;
            if (oVar4 != null) {
                e17 += b36.f.i(5, oVar4.computeSize());
            }
            p45.o oVar5 = this.f351910i;
            if (oVar5 != null) {
                e17 += b36.f.i(6, oVar5.computeSize());
            }
            p45.o oVar6 = this.f351911m;
            if (oVar6 != null) {
                e17 += b36.f.i(7, oVar6.computeSize());
            }
            return e17 + b36.f.e(8, this.f351912n) + b36.f.e(9, this.f351913o);
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
        p45.f fVar2 = (p45.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f351905d = aVar2.g(intValue);
                return 0;
            case 2:
                fVar2.f351906e = aVar2.g(intValue);
                return 0;
            case 3:
                fVar2.f351907f = aVar2.g(intValue);
                return 0;
            case 4:
                fVar2.f351908g = aVar2.g(intValue);
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
                    fVar2.f351909h = oVar7;
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
                    fVar2.f351910i = oVar8;
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
                    fVar2.f351911m = oVar9;
                }
                return 0;
            case 8:
                fVar2.f351912n = aVar2.g(intValue);
                return 0;
            case 9:
                fVar2.f351913o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
