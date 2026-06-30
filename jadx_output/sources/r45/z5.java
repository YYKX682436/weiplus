package r45;

/* loaded from: classes11.dex */
public class z5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391717d;

    /* renamed from: e, reason: collision with root package name */
    public int f391718e;

    /* renamed from: f, reason: collision with root package name */
    public int f391719f;

    /* renamed from: g, reason: collision with root package name */
    public int f391720g;

    static {
        new r45.z5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.z5 parseFrom(byte[] bArr) {
        return (r45.z5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z5)) {
            return false;
        }
        r45.z5 z5Var = (r45.z5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391717d), java.lang.Integer.valueOf(z5Var.f391717d)) && n51.f.a(java.lang.Integer.valueOf(this.f391718e), java.lang.Integer.valueOf(z5Var.f391718e)) && n51.f.a(java.lang.Integer.valueOf(this.f391719f), java.lang.Integer.valueOf(z5Var.f391719f)) && n51.f.a(java.lang.Integer.valueOf(this.f391720g), java.lang.Integer.valueOf(z5Var.f391720g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.z5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391717d);
            fVar.e(2, this.f391718e);
            fVar.e(3, this.f391719f);
            fVar.e(4, this.f391720g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f391717d) + 0 + b36.f.e(2, this.f391718e) + b36.f.e(3, this.f391719f) + b36.f.e(4, this.f391720g);
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
            this.f391717d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f391718e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f391719f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f391720g = aVar2.g(intValue);
        return 0;
    }
}
