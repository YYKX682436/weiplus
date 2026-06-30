package r45;

/* loaded from: classes4.dex */
public class x44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389770e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389771f;

    static {
        new r45.x44();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x44)) {
            return false;
        }
        r45.x44 x44Var = (r45.x44) fVar;
        return n51.f.a(this.f389769d, x44Var.f389769d) && n51.f.a(this.f389770e, x44Var.f389770e) && n51.f.a(this.f389771f, x44Var.f389771f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.x44();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389769d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389770e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f389771f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f389769d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f389770e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389771f;
            return gVar2 != null ? j17 + b36.f.b(3, gVar2) : j17;
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
            this.f389769d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f389770e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f389771f = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.x44) super.parseFrom(bArr);
    }
}
