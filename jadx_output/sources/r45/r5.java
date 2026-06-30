package r45;

/* loaded from: classes8.dex */
public class r5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384546d;

    /* renamed from: e, reason: collision with root package name */
    public int f384547e;

    /* renamed from: f, reason: collision with root package name */
    public int f384548f;

    static {
        new r45.r5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.r5 parseFrom(byte[] bArr) {
        return (r45.r5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r5)) {
            return false;
        }
        r45.r5 r5Var = (r45.r5) fVar;
        return n51.f.a(this.f384546d, r5Var.f384546d) && n51.f.a(java.lang.Integer.valueOf(this.f384547e), java.lang.Integer.valueOf(r5Var.f384547e)) && n51.f.a(java.lang.Integer.valueOf(this.f384548f), java.lang.Integer.valueOf(r5Var.f384548f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.r5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384546d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f384547e);
            fVar.e(3, this.f384548f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f384546d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f384547e) + b36.f.e(3, this.f384548f);
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
            this.f384546d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f384547e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f384548f = aVar2.g(intValue);
        return 0;
    }
}
