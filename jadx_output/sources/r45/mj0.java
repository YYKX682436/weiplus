package r45;

/* loaded from: classes7.dex */
public class mj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380556e;

    /* renamed from: f, reason: collision with root package name */
    public int f380557f;

    static {
        new r45.mj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.mj0 parseFrom(byte[] bArr) {
        return (r45.mj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj0)) {
            return false;
        }
        r45.mj0 mj0Var = (r45.mj0) fVar;
        return n51.f.a(this.f380555d, mj0Var.f380555d) && n51.f.a(this.f380556e, mj0Var.f380556e) && n51.f.a(java.lang.Integer.valueOf(this.f380557f), java.lang.Integer.valueOf(mj0Var.f380557f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.mj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380555d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380556e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380557f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f380555d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f380556e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f380557f);
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
            this.f380555d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f380556e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f380557f = aVar2.g(intValue);
        return 0;
    }
}
