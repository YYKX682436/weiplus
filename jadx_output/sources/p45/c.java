package p45;

/* loaded from: classes15.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351883d;

    /* renamed from: e, reason: collision with root package name */
    public int f351884e;

    /* renamed from: f, reason: collision with root package name */
    public int f351885f;

    /* renamed from: g, reason: collision with root package name */
    public p45.o f351886g;

    /* renamed from: h, reason: collision with root package name */
    public p45.o f351887h;

    /* renamed from: i, reason: collision with root package name */
    public int f351888i;

    /* renamed from: m, reason: collision with root package name */
    public int f351889m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.c)) {
            return false;
        }
        p45.c cVar = (p45.c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351883d), java.lang.Integer.valueOf(cVar.f351883d)) && n51.f.a(java.lang.Integer.valueOf(this.f351884e), java.lang.Integer.valueOf(cVar.f351884e)) && n51.f.a(java.lang.Integer.valueOf(this.f351885f), java.lang.Integer.valueOf(cVar.f351885f)) && n51.f.a(this.f351886g, cVar.f351886g) && n51.f.a(this.f351887h, cVar.f351887h) && n51.f.a(java.lang.Integer.valueOf(this.f351888i), java.lang.Integer.valueOf(cVar.f351888i)) && n51.f.a(java.lang.Integer.valueOf(this.f351889m), java.lang.Integer.valueOf(cVar.f351889m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351883d);
            fVar.e(2, this.f351884e);
            fVar.e(3, this.f351885f);
            p45.o oVar = this.f351886g;
            if (oVar != null) {
                fVar.i(4, oVar.computeSize());
                this.f351886g.writeFields(fVar);
            }
            p45.o oVar2 = this.f351887h;
            if (oVar2 != null) {
                fVar.i(5, oVar2.computeSize());
                this.f351887h.writeFields(fVar);
            }
            fVar.e(6, this.f351888i);
            fVar.e(7, this.f351889m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351883d) + 0 + b36.f.e(2, this.f351884e) + b36.f.e(3, this.f351885f);
            p45.o oVar3 = this.f351886g;
            if (oVar3 != null) {
                e17 += b36.f.i(4, oVar3.computeSize());
            }
            p45.o oVar4 = this.f351887h;
            if (oVar4 != null) {
                e17 += b36.f.i(5, oVar4.computeSize());
            }
            return e17 + b36.f.e(6, this.f351888i) + b36.f.e(7, this.f351889m);
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
        p45.c cVar = (p45.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f351883d = aVar2.g(intValue);
                return 0;
            case 2:
                cVar.f351884e = aVar2.g(intValue);
                return 0;
            case 3:
                cVar.f351885f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    p45.o oVar5 = new p45.o();
                    if (bArr != null && bArr.length > 0) {
                        oVar5.parseFrom(bArr);
                    }
                    cVar.f351886g = oVar5;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    p45.o oVar6 = new p45.o();
                    if (bArr2 != null && bArr2.length > 0) {
                        oVar6.parseFrom(bArr2);
                    }
                    cVar.f351887h = oVar6;
                }
                return 0;
            case 6:
                cVar.f351888i = aVar2.g(intValue);
                return 0;
            case 7:
                cVar.f351889m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
