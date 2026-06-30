package r45;

/* loaded from: classes8.dex */
public class fk3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ek3 f374407d;

    /* renamed from: e, reason: collision with root package name */
    public int f374408e;

    /* renamed from: f, reason: collision with root package name */
    public r45.dk3 f374409f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374410g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374411h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fk3)) {
            return false;
        }
        r45.fk3 fk3Var = (r45.fk3) fVar;
        return n51.f.a(this.f374407d, fk3Var.f374407d) && n51.f.a(java.lang.Integer.valueOf(this.f374408e), java.lang.Integer.valueOf(fk3Var.f374408e)) && n51.f.a(this.f374409f, fk3Var.f374409f) && n51.f.a(this.f374410g, fk3Var.f374410g) && n51.f.a(this.f374411h, fk3Var.f374411h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ek3 ek3Var = this.f374407d;
            if (ek3Var != null) {
                fVar.i(1, ek3Var.computeSize());
                this.f374407d.writeFields(fVar);
            }
            fVar.e(2, this.f374408e);
            r45.dk3 dk3Var = this.f374409f;
            if (dk3Var != null) {
                fVar.i(3, dk3Var.computeSize());
                this.f374409f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f374410g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f374411h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ek3 ek3Var2 = this.f374407d;
            int i18 = (ek3Var2 != null ? 0 + b36.f.i(1, ek3Var2.computeSize()) : 0) + b36.f.e(2, this.f374408e);
            r45.dk3 dk3Var2 = this.f374409f;
            if (dk3Var2 != null) {
                i18 += b36.f.i(3, dk3Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374410g;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f374411h;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.fk3 fk3Var = (r45.fk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ek3 ek3Var3 = new r45.ek3();
                if (bArr != null && bArr.length > 0) {
                    ek3Var3.parseFrom(bArr);
                }
                fk3Var.f374407d = ek3Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            fk3Var.f374408e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                fk3Var.f374410g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            fk3Var.f374411h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.dk3 dk3Var3 = new r45.dk3();
            if (bArr2 != null && bArr2.length > 0) {
                dk3Var3.parseFrom(bArr2);
            }
            fk3Var.f374409f = dk3Var3;
        }
        return 0;
    }
}
