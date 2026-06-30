package dw5;

/* loaded from: classes15.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f244390d;

    /* renamed from: e, reason: collision with root package name */
    public int f244391e;

    /* renamed from: f, reason: collision with root package name */
    public int f244392f;

    /* renamed from: g, reason: collision with root package name */
    public int f244393g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f244394h = new boolean[5];

    static {
        new dw5.n();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.n parseFrom(byte[] bArr) {
        return (dw5.n) super.parseFrom(bArr);
    }

    public dw5.n c(int i17) {
        this.f244393g = i17;
        this.f244394h[4] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.n)) {
            return false;
        }
        dw5.n nVar = (dw5.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f244390d), java.lang.Integer.valueOf(nVar.f244390d)) && n51.f.a(java.lang.Integer.valueOf(this.f244391e), java.lang.Integer.valueOf(nVar.f244391e)) && n51.f.a(java.lang.Integer.valueOf(this.f244392f), java.lang.Integer.valueOf(nVar.f244392f)) && n51.f.a(java.lang.Integer.valueOf(this.f244393g), java.lang.Integer.valueOf(nVar.f244393g));
    }

    public dw5.n d(int i17) {
        this.f244390d = i17;
        this.f244394h[1] = true;
        return this;
    }

    public dw5.n e(int i17) {
        this.f244391e = i17;
        this.f244394h[2] = true;
        return this;
    }

    public dw5.n f(int i17) {
        this.f244392f = i17;
        this.f244394h[3] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.n();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f244394h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f244390d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f244391e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f244392f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f244393g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f244390d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f244391e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f244392f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f244393g) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f244390d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f244391e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f244392f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f244393g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
