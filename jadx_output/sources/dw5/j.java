package dw5;

/* loaded from: classes11.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f244370d;

    /* renamed from: e, reason: collision with root package name */
    public int f244371e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f244372f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f244373g = new boolean[4];

    static {
        new dw5.j();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.j parseFrom(byte[] bArr) {
        return (dw5.j) super.parseFrom(bArr);
    }

    public dw5.j c(int i17) {
        this.f244370d = i17;
        this.f244373g[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.j)) {
            return false;
        }
        dw5.j jVar = (dw5.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f244370d), java.lang.Integer.valueOf(jVar.f244370d)) && n51.f.a(java.lang.Integer.valueOf(this.f244371e), java.lang.Integer.valueOf(jVar.f244371e)) && n51.f.a(this.f244372f, jVar.f244372f);
    }

    public dw5.j d(java.lang.String str) {
        this.f244372f = str;
        this.f244373g[3] = true;
        return this;
    }

    public dw5.j e(int i17) {
        this.f244371e = i17;
        this.f244373g[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f244373g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f244370d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f244371e);
            }
            java.lang.String str = this.f244372f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f244370d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f244371e);
            }
            java.lang.String str2 = this.f244372f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
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
            this.f244370d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f244371e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f244372f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
