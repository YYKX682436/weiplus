package er4;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final er4.g f256082i = new er4.g();

    /* renamed from: d, reason: collision with root package name */
    public long f256083d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f256084e;

    /* renamed from: f, reason: collision with root package name */
    public er4.r f256085f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f256086g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f256087h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.g)) {
            return false;
        }
        er4.g gVar = (er4.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f256083d), java.lang.Long.valueOf(gVar.f256083d)) && n51.f.a(this.f256084e, gVar.f256084e) && n51.f.a(this.f256085f, gVar.f256085f) && n51.f.a(java.lang.Boolean.valueOf(this.f256086g), java.lang.Boolean.valueOf(gVar.f256086g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f256087h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f256083d);
            }
            java.lang.String str = this.f256084e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            er4.r rVar = this.f256085f;
            if (rVar != null && zArr[3]) {
                fVar.e(3, rVar.f256166d);
            }
            if (zArr[4]) {
                fVar.a(4, this.f256086g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f256083d) : 0;
            java.lang.String str2 = this.f256084e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            er4.r rVar2 = this.f256085f;
            if (rVar2 != null && zArr[3]) {
                h17 += b36.f.e(3, rVar2.f256166d);
            }
            return zArr[4] ? h17 + b36.f.a(4, this.f256086g) : h17;
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
            this.f256083d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f256084e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f256085f = er4.r.a(aVar2.g(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f256086g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.g) super.parseFrom(bArr);
    }
}
