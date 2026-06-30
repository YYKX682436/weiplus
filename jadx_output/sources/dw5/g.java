package dw5;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f244357d;

    /* renamed from: e, reason: collision with root package name */
    public float f244358e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f244359f = new boolean[3];

    static {
        new dw5.g();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.g parseFrom(byte[] bArr) {
        return (dw5.g) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.g)) {
            return false;
        }
        dw5.g gVar = (dw5.g) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f244357d), java.lang.Float.valueOf(gVar.f244357d)) && n51.f.a(java.lang.Float.valueOf(this.f244358e), java.lang.Float.valueOf(gVar.f244358e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f244359f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f244357d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f244358e);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f244357d) : 0;
            return zArr[2] ? d17 + b36.f.d(2, this.f244358e) : d17;
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
            this.f244357d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f244358e = aVar2.f(intValue);
        zArr[2] = true;
        return 0;
    }
}
