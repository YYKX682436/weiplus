package dw5;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f244366d;

    /* renamed from: e, reason: collision with root package name */
    public int f244367e;

    /* renamed from: f, reason: collision with root package name */
    public int f244368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f244369g = new boolean[4];

    static {
        new dw5.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.i)) {
            return false;
        }
        dw5.i iVar = (dw5.i) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f244366d), java.lang.Boolean.valueOf(iVar.f244366d)) && n51.f.a(java.lang.Integer.valueOf(this.f244367e), java.lang.Integer.valueOf(iVar.f244367e)) && n51.f.a(java.lang.Integer.valueOf(this.f244368f), java.lang.Integer.valueOf(iVar.f244368f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f244369g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f244366d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f244367e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f244368f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f244366d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f244367e);
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f244368f) : a17;
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
            this.f244366d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f244367e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f244368f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (dw5.i) super.parseFrom(bArr);
    }
}
