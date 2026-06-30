package r45;

/* loaded from: classes8.dex */
public class y5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390790d;

    /* renamed from: e, reason: collision with root package name */
    public int f390791e;

    /* renamed from: f, reason: collision with root package name */
    public int f390792f;

    /* renamed from: g, reason: collision with root package name */
    public int f390793g;

    /* renamed from: h, reason: collision with root package name */
    public int f390794h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390795i;

    /* renamed from: m, reason: collision with root package name */
    public int f390796m;

    static {
        new r45.y5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.y5 parseFrom(byte[] bArr) {
        return (r45.y5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y5)) {
            return false;
        }
        r45.y5 y5Var = (r45.y5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390790d), java.lang.Integer.valueOf(y5Var.f390790d)) && n51.f.a(java.lang.Integer.valueOf(this.f390791e), java.lang.Integer.valueOf(y5Var.f390791e)) && n51.f.a(java.lang.Integer.valueOf(this.f390792f), java.lang.Integer.valueOf(y5Var.f390792f)) && n51.f.a(java.lang.Integer.valueOf(this.f390793g), java.lang.Integer.valueOf(y5Var.f390793g)) && n51.f.a(java.lang.Integer.valueOf(this.f390794h), java.lang.Integer.valueOf(y5Var.f390794h)) && n51.f.a(this.f390795i, y5Var.f390795i) && n51.f.a(java.lang.Integer.valueOf(this.f390796m), java.lang.Integer.valueOf(y5Var.f390796m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.y5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390790d);
            fVar.e(2, this.f390791e);
            fVar.e(3, this.f390792f);
            fVar.e(4, this.f390793g);
            fVar.e(5, this.f390794h);
            java.lang.String str = this.f390795i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(8, this.f390796m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390790d) + 0 + b36.f.e(2, this.f390791e) + b36.f.e(3, this.f390792f) + b36.f.e(4, this.f390793g) + b36.f.e(5, this.f390794h);
            java.lang.String str2 = this.f390795i;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            return e17 + b36.f.e(8, this.f390796m);
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
                this.f390790d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f390791e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f390792f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f390793g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f390794h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f390795i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                this.f390796m = aVar2.g(intValue);
                return 0;
        }
    }
}
