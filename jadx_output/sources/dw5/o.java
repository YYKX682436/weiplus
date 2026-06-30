package dw5;

/* loaded from: classes15.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f244395d;

    /* renamed from: f, reason: collision with root package name */
    public int f244397f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f244399h;

    /* renamed from: i, reason: collision with root package name */
    public dw5.e f244400i;

    /* renamed from: m, reason: collision with root package name */
    public dw5.n f244401m;

    /* renamed from: n, reason: collision with root package name */
    public int f244402n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f244396e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f244398g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f244403o = new boolean[9];

    static {
        new dw5.o();
    }

    public dw5.o b(java.util.Collection collection) {
        this.f244398g.addAll(collection);
        this.f244403o[4] = true;
        return this;
    }

    public dw5.o c(java.util.Collection collection) {
        this.f244396e.addAll(collection);
        this.f244403o[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.o)) {
            return false;
        }
        dw5.o oVar = (dw5.o) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f244395d), java.lang.Integer.valueOf(oVar.f244395d)) && n51.f.a(this.f244396e, oVar.f244396e) && n51.f.a(java.lang.Integer.valueOf(this.f244397f), java.lang.Integer.valueOf(oVar.f244397f)) && n51.f.a(this.f244398g, oVar.f244398g) && n51.f.a(this.f244399h, oVar.f244399h) && n51.f.a(this.f244400i, oVar.f244400i) && n51.f.a(this.f244401m, oVar.f244401m) && n51.f.a(java.lang.Integer.valueOf(this.f244402n), java.lang.Integer.valueOf(oVar.f244402n));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public dw5.o parseFrom(byte[] bArr) {
        return (dw5.o) super.parseFrom(bArr);
    }

    public dw5.o e(int i17) {
        this.f244397f = i17;
        this.f244403o[3] = true;
        return this;
    }

    public dw5.o f(int i17) {
        this.f244395d = i17;
        this.f244403o[1] = true;
        return this;
    }

    public dw5.o g(int i17) {
        this.f244402n = i17;
        this.f244403o[8] = true;
        return this;
    }

    public dw5.o i(dw5.n nVar) {
        this.f244401m = nVar;
        this.f244403o[7] = true;
        return this;
    }

    public dw5.o j(java.lang.String str) {
        this.f244399h = str;
        this.f244403o[5] = true;
        return this;
    }

    public dw5.o k(dw5.e eVar) {
        this.f244400i = eVar;
        this.f244403o[6] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f244398g;
        java.util.LinkedList linkedList2 = this.f244396e;
        boolean[] zArr = this.f244403o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f244395d);
            }
            fVar.g(2, 8, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f244397f);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f244399h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            dw5.e eVar = this.f244400i;
            if (eVar != null && zArr[6]) {
                fVar.i(6, eVar.computeSize());
                this.f244400i.writeFields(fVar);
            }
            dw5.n nVar = this.f244401m;
            if (nVar != null && zArr[7]) {
                fVar.i(7, nVar.computeSize());
                this.f244401m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f244402n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f244395d) : 0) + b36.f.g(2, 8, linkedList2);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f244397f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            java.lang.String str2 = this.f244399h;
            if (str2 != null && zArr[5]) {
                g17 += b36.f.j(5, str2);
            }
            dw5.e eVar2 = this.f244400i;
            if (eVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, eVar2.computeSize());
            }
            dw5.n nVar2 = this.f244401m;
            if (nVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, nVar2.computeSize());
            }
            return zArr[8] ? g17 + b36.f.e(8, this.f244402n) : g17;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f244395d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    dw5.l lVar = new dw5.l();
                    if (bArr != null && bArr.length > 0) {
                        lVar.parseFrom(bArr);
                    }
                    linkedList2.add(lVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f244397f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    dw5.d dVar = new dw5.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar.parseFrom(bArr2);
                    }
                    linkedList.add(dVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f244399h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    dw5.e eVar3 = new dw5.e();
                    if (bArr3 != null && bArr3.length > 0) {
                        eVar3.parseFrom(bArr3);
                    }
                    this.f244400i = eVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    dw5.n nVar3 = new dw5.n();
                    if (bArr4 != null && bArr4.length > 0) {
                        nVar3.parseFrom(bArr4);
                    }
                    this.f244401m = nVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f244402n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
