package dw5;

/* loaded from: classes15.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f244338d;

    /* renamed from: e, reason: collision with root package name */
    public int f244339e;

    /* renamed from: f, reason: collision with root package name */
    public int f244340f;

    /* renamed from: g, reason: collision with root package name */
    public long f244341g;

    /* renamed from: h, reason: collision with root package name */
    public int f244342h;

    /* renamed from: i, reason: collision with root package name */
    public int f244343i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f244344m = new boolean[7];

    static {
        new dw5.e();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.e parseFrom(byte[] bArr) {
        return (dw5.e) super.parseFrom(bArr);
    }

    public dw5.e c(int i17) {
        this.f244339e = i17;
        this.f244344m[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.e)) {
            return false;
        }
        dw5.e eVar = (dw5.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f244338d), java.lang.Integer.valueOf(eVar.f244338d)) && n51.f.a(java.lang.Integer.valueOf(this.f244339e), java.lang.Integer.valueOf(eVar.f244339e)) && n51.f.a(java.lang.Integer.valueOf(this.f244340f), java.lang.Integer.valueOf(eVar.f244340f)) && n51.f.a(java.lang.Long.valueOf(this.f244341g), java.lang.Long.valueOf(eVar.f244341g)) && n51.f.a(java.lang.Integer.valueOf(this.f244342h), java.lang.Integer.valueOf(eVar.f244342h)) && n51.f.a(java.lang.Integer.valueOf(this.f244343i), java.lang.Integer.valueOf(eVar.f244343i));
    }

    public dw5.e d(int i17) {
        this.f244340f = i17;
        this.f244344m[3] = true;
        return this;
    }

    public dw5.e e(int i17) {
        this.f244338d = i17;
        this.f244344m[1] = true;
        return this;
    }

    public dw5.e f(long j17) {
        this.f244341g = j17;
        this.f244344m[4] = true;
        return this;
    }

    public dw5.e g(int i17) {
        this.f244342h = i17;
        this.f244344m[5] = true;
        return this;
    }

    public dw5.e i(int i17) {
        this.f244343i = i17;
        this.f244344m[6] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f244344m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f244338d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f244339e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f244340f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f244341g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f244342h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f244343i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f244338d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f244339e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f244340f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f244341g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f244342h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f244343i) : e17;
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
        switch (intValue) {
            case 1:
                this.f244338d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f244339e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f244340f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f244341g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f244342h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f244343i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
