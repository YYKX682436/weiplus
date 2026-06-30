package wn1;

/* loaded from: classes12.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447453d;

    /* renamed from: e, reason: collision with root package name */
    public long f447454e;

    /* renamed from: f, reason: collision with root package name */
    public long f447455f;

    /* renamed from: g, reason: collision with root package name */
    public long f447456g;

    /* renamed from: h, reason: collision with root package name */
    public wn1.p f447457h;

    /* renamed from: i, reason: collision with root package name */
    public long f447458i;

    /* renamed from: m, reason: collision with root package name */
    public int f447459m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f447460n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.q)) {
            return false;
        }
        wn1.q qVar = (wn1.q) fVar;
        return n51.f.a(this.f447453d, qVar.f447453d) && n51.f.a(java.lang.Long.valueOf(this.f447454e), java.lang.Long.valueOf(qVar.f447454e)) && n51.f.a(java.lang.Long.valueOf(this.f447455f), java.lang.Long.valueOf(qVar.f447455f)) && n51.f.a(java.lang.Long.valueOf(this.f447456g), java.lang.Long.valueOf(qVar.f447456g)) && n51.f.a(this.f447457h, qVar.f447457h) && n51.f.a(java.lang.Long.valueOf(this.f447458i), java.lang.Long.valueOf(qVar.f447458i)) && n51.f.a(java.lang.Integer.valueOf(this.f447459m), java.lang.Integer.valueOf(qVar.f447459m)) && n51.f.a(this.f447460n, qVar.f447460n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447453d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f447454e);
            fVar.h(3, this.f447455f);
            fVar.h(4, this.f447456g);
            wn1.p pVar = this.f447457h;
            if (pVar != null) {
                fVar.i(5, pVar.computeSize());
                this.f447457h.writeFields(fVar);
            }
            fVar.h(6, this.f447458i);
            fVar.e(7, this.f447459m);
            java.lang.String str2 = this.f447460n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f447453d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f447454e) + b36.f.h(3, this.f447455f) + b36.f.h(4, this.f447456g);
            wn1.p pVar2 = this.f447457h;
            if (pVar2 != null) {
                j17 += b36.f.i(5, pVar2.computeSize());
            }
            int h17 = j17 + b36.f.h(6, this.f447458i) + b36.f.e(7, this.f447459m);
            java.lang.String str4 = this.f447460n;
            return str4 != null ? h17 + b36.f.j(8, str4) : h17;
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
        wn1.q qVar = (wn1.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qVar.f447453d = aVar2.k(intValue);
                return 0;
            case 2:
                qVar.f447454e = aVar2.i(intValue);
                return 0;
            case 3:
                qVar.f447455f = aVar2.i(intValue);
                return 0;
            case 4:
                qVar.f447456g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    wn1.p pVar3 = new wn1.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar3.parseFrom(bArr);
                    }
                    qVar.f447457h = pVar3;
                }
                return 0;
            case 6:
                qVar.f447458i = aVar2.i(intValue);
                return 0;
            case 7:
                qVar.f447459m = aVar2.g(intValue);
                return 0;
            case 8:
                qVar.f447460n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
