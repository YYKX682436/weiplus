package r45;

/* loaded from: classes2.dex */
public class xt5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390400d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f390401e;

    /* renamed from: f, reason: collision with root package name */
    public r45.t35 f390402f;

    /* renamed from: g, reason: collision with root package name */
    public float f390403g;

    /* renamed from: h, reason: collision with root package name */
    public long f390404h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cg0 f390405i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt5)) {
            return false;
        }
        r45.xt5 xt5Var = (r45.xt5) fVar;
        return n51.f.a(this.f390400d, xt5Var.f390400d) && n51.f.a(this.f390401e, xt5Var.f390401e) && n51.f.a(this.f390402f, xt5Var.f390402f) && n51.f.a(java.lang.Float.valueOf(this.f390403g), java.lang.Float.valueOf(xt5Var.f390403g)) && n51.f.a(java.lang.Long.valueOf(this.f390404h), java.lang.Long.valueOf(xt5Var.f390404h)) && n51.f.a(this.f390405i, xt5Var.f390405i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390400d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.rl6 rl6Var = this.f390401e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.computeSize());
                this.f390401e.writeFields(fVar);
            }
            r45.t35 t35Var = this.f390402f;
            if (t35Var != null) {
                fVar.i(3, t35Var.computeSize());
                this.f390402f.writeFields(fVar);
            }
            fVar.d(4, this.f390403g);
            fVar.h(5, this.f390404h);
            r45.cg0 cg0Var = this.f390405i;
            if (cg0Var != null) {
                fVar.i(8, cg0Var.computeSize());
                this.f390405i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f390400d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.rl6 rl6Var2 = this.f390401e;
            if (rl6Var2 != null) {
                j17 += b36.f.i(2, rl6Var2.computeSize());
            }
            r45.t35 t35Var2 = this.f390402f;
            if (t35Var2 != null) {
                j17 += b36.f.i(3, t35Var2.computeSize());
            }
            int d17 = j17 + b36.f.d(4, this.f390403g) + b36.f.h(5, this.f390404h);
            r45.cg0 cg0Var2 = this.f390405i;
            return cg0Var2 != null ? d17 + b36.f.i(8, cg0Var2.computeSize()) : d17;
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
        r45.xt5 xt5Var = (r45.xt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xt5Var.f390400d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.parseFrom(bArr);
                }
                xt5Var.f390401e = rl6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.t35 t35Var3 = new r45.t35();
                if (bArr2 != null && bArr2.length > 0) {
                    t35Var3.parseFrom(bArr2);
                }
                xt5Var.f390402f = t35Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            xt5Var.f390403g = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 5) {
            xt5Var.f390404h = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.cg0 cg0Var3 = new r45.cg0();
            if (bArr3 != null && bArr3.length > 0) {
                cg0Var3.parseFrom(bArr3);
            }
            xt5Var.f390405i = cg0Var3;
        }
        return 0;
    }
}
