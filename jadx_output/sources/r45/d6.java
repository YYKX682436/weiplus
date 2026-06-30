package r45;

/* loaded from: classes8.dex */
public class d6 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final r45.d6 f372138g = new r45.d6();

    /* renamed from: d, reason: collision with root package name */
    public int f372139d;

    /* renamed from: e, reason: collision with root package name */
    public long f372140e;

    /* renamed from: f, reason: collision with root package name */
    public long f372141f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d6)) {
            return false;
        }
        r45.d6 d6Var = (r45.d6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372139d), java.lang.Integer.valueOf(d6Var.f372139d)) && n51.f.a(java.lang.Long.valueOf(this.f372140e), java.lang.Long.valueOf(d6Var.f372140e)) && n51.f.a(java.lang.Long.valueOf(this.f372141f), java.lang.Long.valueOf(d6Var.f372141f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.d6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372139d);
            fVar.h(2, this.f372140e);
            fVar.h(3, this.f372141f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372139d) + 0 + b36.f.h(2, this.f372140e) + b36.f.h(3, this.f372141f);
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
            this.f372139d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f372140e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f372141f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.d6) super.parseFrom(bArr);
    }
}
