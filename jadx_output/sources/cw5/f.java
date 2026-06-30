package cw5;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f224353d;

    /* renamed from: e, reason: collision with root package name */
    public int f224354e;

    /* renamed from: f, reason: collision with root package name */
    public int f224355f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f224356g = new boolean[4];

    static {
        new cw5.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.f)) {
            return false;
        }
        cw5.f fVar2 = (cw5.f) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f224353d), java.lang.Boolean.valueOf(fVar2.f224353d)) && n51.f.a(java.lang.Integer.valueOf(this.f224354e), java.lang.Integer.valueOf(fVar2.f224354e)) && n51.f.a(java.lang.Integer.valueOf(this.f224355f), java.lang.Integer.valueOf(fVar2.f224355f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new cw5.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f224356g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f224353d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f224354e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f224355f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f224353d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f224354e);
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f224355f) : a17;
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
            this.f224353d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f224354e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f224355f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (cw5.f) super.parseFrom(bArr);
    }
}
