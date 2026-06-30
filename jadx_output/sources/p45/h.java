package p45;

/* loaded from: classes15.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351918d;

    /* renamed from: e, reason: collision with root package name */
    public int f351919e;

    /* renamed from: f, reason: collision with root package name */
    public int f351920f;

    /* renamed from: g, reason: collision with root package name */
    public p45.o f351921g;

    /* renamed from: h, reason: collision with root package name */
    public p45.o f351922h;

    /* renamed from: i, reason: collision with root package name */
    public int f351923i;

    /* renamed from: m, reason: collision with root package name */
    public int f351924m;

    /* renamed from: n, reason: collision with root package name */
    public int f351925n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.h)) {
            return false;
        }
        p45.h hVar = (p45.h) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351918d), java.lang.Integer.valueOf(hVar.f351918d)) && n51.f.a(java.lang.Integer.valueOf(this.f351919e), java.lang.Integer.valueOf(hVar.f351919e)) && n51.f.a(java.lang.Integer.valueOf(this.f351920f), java.lang.Integer.valueOf(hVar.f351920f)) && n51.f.a(this.f351921g, hVar.f351921g) && n51.f.a(this.f351922h, hVar.f351922h) && n51.f.a(java.lang.Integer.valueOf(this.f351923i), java.lang.Integer.valueOf(hVar.f351923i)) && n51.f.a(java.lang.Integer.valueOf(this.f351924m), java.lang.Integer.valueOf(hVar.f351924m)) && n51.f.a(java.lang.Integer.valueOf(this.f351925n), java.lang.Integer.valueOf(hVar.f351925n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351918d);
            fVar.e(2, this.f351919e);
            fVar.e(3, this.f351920f);
            p45.o oVar = this.f351921g;
            if (oVar != null) {
                fVar.i(4, oVar.computeSize());
                this.f351921g.writeFields(fVar);
            }
            p45.o oVar2 = this.f351922h;
            if (oVar2 != null) {
                fVar.i(5, oVar2.computeSize());
                this.f351922h.writeFields(fVar);
            }
            fVar.e(6, this.f351923i);
            fVar.e(7, this.f351924m);
            fVar.e(8, this.f351925n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351918d) + 0 + b36.f.e(2, this.f351919e) + b36.f.e(3, this.f351920f);
            p45.o oVar3 = this.f351921g;
            if (oVar3 != null) {
                e17 += b36.f.i(4, oVar3.computeSize());
            }
            p45.o oVar4 = this.f351922h;
            if (oVar4 != null) {
                e17 += b36.f.i(5, oVar4.computeSize());
            }
            return e17 + b36.f.e(6, this.f351923i) + b36.f.e(7, this.f351924m) + b36.f.e(8, this.f351925n);
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
        p45.h hVar = (p45.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f351918d = aVar2.g(intValue);
                return 0;
            case 2:
                hVar.f351919e = aVar2.g(intValue);
                return 0;
            case 3:
                hVar.f351920f = aVar2.g(intValue);
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
                    hVar.f351921g = oVar5;
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
                    hVar.f351922h = oVar6;
                }
                return 0;
            case 6:
                hVar.f351923i = aVar2.g(intValue);
                return 0;
            case 7:
                hVar.f351924m = aVar2.g(intValue);
                return 0;
            case 8:
                hVar.f351925n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
