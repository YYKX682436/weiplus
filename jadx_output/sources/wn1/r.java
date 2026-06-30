package wn1;

/* loaded from: classes12.dex */
public class r extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447461d;

    /* renamed from: e, reason: collision with root package name */
    public long f447462e;

    /* renamed from: f, reason: collision with root package name */
    public long f447463f;

    /* renamed from: g, reason: collision with root package name */
    public int f447464g;

    /* renamed from: h, reason: collision with root package name */
    public int f447465h;

    /* renamed from: i, reason: collision with root package name */
    public long f447466i;

    /* renamed from: m, reason: collision with root package name */
    public wn1.p f447467m;

    /* renamed from: n, reason: collision with root package name */
    public int f447468n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.r)) {
            return false;
        }
        wn1.r rVar = (wn1.r) fVar;
        return n51.f.a(this.f447461d, rVar.f447461d) && n51.f.a(java.lang.Long.valueOf(this.f447462e), java.lang.Long.valueOf(rVar.f447462e)) && n51.f.a(java.lang.Long.valueOf(this.f447463f), java.lang.Long.valueOf(rVar.f447463f)) && n51.f.a(java.lang.Integer.valueOf(this.f447464g), java.lang.Integer.valueOf(rVar.f447464g)) && n51.f.a(java.lang.Integer.valueOf(this.f447465h), java.lang.Integer.valueOf(rVar.f447465h)) && n51.f.a(java.lang.Long.valueOf(this.f447466i), java.lang.Long.valueOf(rVar.f447466i)) && n51.f.a(this.f447467m, rVar.f447467m) && n51.f.a(java.lang.Integer.valueOf(this.f447468n), java.lang.Integer.valueOf(rVar.f447468n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447461d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f447462e);
            fVar.h(3, this.f447463f);
            fVar.e(4, this.f447464g);
            fVar.e(5, this.f447465h);
            fVar.h(6, this.f447466i);
            wn1.p pVar = this.f447467m;
            if (pVar != null) {
                fVar.i(7, pVar.computeSize());
                this.f447467m.writeFields(fVar);
            }
            fVar.e(8, this.f447468n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f447461d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f447462e) + b36.f.h(3, this.f447463f) + b36.f.e(4, this.f447464g) + b36.f.e(5, this.f447465h) + b36.f.h(6, this.f447466i);
            wn1.p pVar2 = this.f447467m;
            if (pVar2 != null) {
                j17 += b36.f.i(7, pVar2.computeSize());
            }
            return j17 + b36.f.e(8, this.f447468n);
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
        wn1.r rVar = (wn1.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rVar.f447461d = aVar2.k(intValue);
                return 0;
            case 2:
                rVar.f447462e = aVar2.i(intValue);
                return 0;
            case 3:
                rVar.f447463f = aVar2.i(intValue);
                return 0;
            case 4:
                rVar.f447464g = aVar2.g(intValue);
                return 0;
            case 5:
                rVar.f447465h = aVar2.g(intValue);
                return 0;
            case 6:
                rVar.f447466i = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    wn1.p pVar3 = new wn1.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar3.parseFrom(bArr);
                    }
                    rVar.f447467m = pVar3;
                }
                return 0;
            case 8:
                rVar.f447468n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
