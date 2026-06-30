package r45;

/* loaded from: classes4.dex */
public class ae0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369964e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zd0 f369965f;

    static {
        new r45.ae0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.ae0 parseFrom(byte[] bArr) {
        return (r45.ae0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ae0)) {
            return false;
        }
        r45.ae0 ae0Var = (r45.ae0) fVar;
        return n51.f.a(this.f369963d, ae0Var.f369963d) && n51.f.a(this.f369964e, ae0Var.f369964e) && n51.f.a(this.f369965f, ae0Var.f369965f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ae0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369963d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f369964e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zd0 zd0Var = this.f369965f;
            if (zd0Var != null) {
                fVar.i(3, zd0Var.computeSize());
                this.f369965f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f369963d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f369964e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zd0 zd0Var2 = this.f369965f;
            return zd0Var2 != null ? j17 + b36.f.i(3, zd0Var2.computeSize()) : j17;
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
            this.f369963d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f369964e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.zd0 zd0Var3 = new r45.zd0();
            if (bArr != null && bArr.length > 0) {
                zd0Var3.parseFrom(bArr);
            }
            this.f369965f = zd0Var3;
        }
        return 0;
    }
}
