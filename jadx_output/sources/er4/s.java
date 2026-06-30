package er4;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final er4.s f256167g = new er4.s();

    /* renamed from: d, reason: collision with root package name */
    public long f256168d;

    /* renamed from: e, reason: collision with root package name */
    public long f256169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f256170f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.s)) {
            return false;
        }
        er4.s sVar = (er4.s) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f256168d), java.lang.Long.valueOf(sVar.f256168d)) && n51.f.a(java.lang.Long.valueOf(this.f256169e), java.lang.Long.valueOf(sVar.f256169e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.s();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f256170f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f256168d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f256169e);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f256168d) : 0;
            return zArr[2] ? h17 + b36.f.h(2, this.f256169e) : h17;
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
            this.f256168d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f256169e = aVar2.i(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.s) super.parseFrom(bArr);
    }
}
