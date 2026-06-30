package r45;

/* loaded from: classes10.dex */
public class p64 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382792d;

    /* renamed from: e, reason: collision with root package name */
    public r45.o64 f382793e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382794f;

    /* renamed from: g, reason: collision with root package name */
    public r45.v75 f382795g;

    /* renamed from: h, reason: collision with root package name */
    public r45.r64 f382796h;

    static {
        new r45.p64();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.p64 parseFrom(byte[] bArr) {
        return (r45.p64) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p64)) {
            return false;
        }
        r45.p64 p64Var = (r45.p64) fVar;
        return n51.f.a(this.f382792d, p64Var.f382792d) && n51.f.a(this.f382793e, p64Var.f382793e) && n51.f.a(this.f382794f, p64Var.f382794f) && n51.f.a(this.f382795g, p64Var.f382795g) && n51.f.a(this.f382796h, p64Var.f382796h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.p64();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382792d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.o64 o64Var = this.f382793e;
            if (o64Var != null) {
                fVar.i(2, o64Var.computeSize());
                this.f382793e.writeFields(fVar);
            }
            java.lang.String str2 = this.f382794f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.v75 v75Var = this.f382795g;
            if (v75Var != null) {
                fVar.i(4, v75Var.computeSize());
                this.f382795g.writeFields(fVar);
            }
            r45.r64 r64Var = this.f382796h;
            if (r64Var != null) {
                fVar.i(5, r64Var.computeSize());
                this.f382796h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f382792d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.o64 o64Var2 = this.f382793e;
            if (o64Var2 != null) {
                j17 += b36.f.i(2, o64Var2.computeSize());
            }
            java.lang.String str4 = this.f382794f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.v75 v75Var2 = this.f382795g;
            if (v75Var2 != null) {
                j17 += b36.f.i(4, v75Var2.computeSize());
            }
            r45.r64 r64Var2 = this.f382796h;
            return r64Var2 != null ? j17 + b36.f.i(5, r64Var2.computeSize()) : j17;
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
            this.f382792d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.o64 o64Var3 = new r45.o64();
                if (bArr != null && bArr.length > 0) {
                    o64Var3.parseFrom(bArr);
                }
                this.f382793e = o64Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            this.f382794f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.v75 v75Var3 = new r45.v75();
                if (bArr2 != null && bArr2.length > 0) {
                    v75Var3.parseFrom(bArr2);
                }
                this.f382795g = v75Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.r64 r64Var3 = new r45.r64();
            if (bArr3 != null && bArr3.length > 0) {
                r64Var3.parseFrom(bArr3);
            }
            this.f382796h = r64Var3;
        }
        return 0;
    }
}
