package r45;

/* loaded from: classes4.dex */
public class ke0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378617d;

    /* renamed from: e, reason: collision with root package name */
    public r45.he0 f378618e;

    /* renamed from: f, reason: collision with root package name */
    public r45.he0 f378619f;

    /* renamed from: g, reason: collision with root package name */
    public int f378620g;

    /* renamed from: h, reason: collision with root package name */
    public int f378621h;

    /* renamed from: i, reason: collision with root package name */
    public int f378622i;

    /* renamed from: m, reason: collision with root package name */
    public int f378623m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ke0)) {
            return false;
        }
        r45.ke0 ke0Var = (r45.ke0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378617d), java.lang.Integer.valueOf(ke0Var.f378617d)) && n51.f.a(this.f378618e, ke0Var.f378618e) && n51.f.a(this.f378619f, ke0Var.f378619f) && n51.f.a(java.lang.Integer.valueOf(this.f378620g), java.lang.Integer.valueOf(ke0Var.f378620g)) && n51.f.a(java.lang.Integer.valueOf(this.f378621h), java.lang.Integer.valueOf(ke0Var.f378621h)) && n51.f.a(java.lang.Integer.valueOf(this.f378622i), java.lang.Integer.valueOf(ke0Var.f378622i)) && n51.f.a(java.lang.Integer.valueOf(this.f378623m), java.lang.Integer.valueOf(ke0Var.f378623m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378617d);
            r45.he0 he0Var = this.f378618e;
            if (he0Var != null) {
                fVar.i(2, he0Var.computeSize());
                this.f378618e.writeFields(fVar);
            }
            r45.he0 he0Var2 = this.f378619f;
            if (he0Var2 != null) {
                fVar.i(3, he0Var2.computeSize());
                this.f378619f.writeFields(fVar);
            }
            fVar.e(4, this.f378620g);
            fVar.e(5, this.f378621h);
            fVar.e(6, this.f378622i);
            fVar.e(7, this.f378623m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378617d) + 0;
            r45.he0 he0Var3 = this.f378618e;
            if (he0Var3 != null) {
                e17 += b36.f.i(2, he0Var3.computeSize());
            }
            r45.he0 he0Var4 = this.f378619f;
            if (he0Var4 != null) {
                e17 += b36.f.i(3, he0Var4.computeSize());
            }
            return e17 + b36.f.e(4, this.f378620g) + b36.f.e(5, this.f378621h) + b36.f.e(6, this.f378622i) + b36.f.e(7, this.f378623m);
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
        r45.ke0 ke0Var = (r45.ke0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ke0Var.f378617d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he0 he0Var5 = new r45.he0();
                    if (bArr != null && bArr.length > 0) {
                        he0Var5.parseFrom(bArr);
                    }
                    ke0Var.f378618e = he0Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.he0 he0Var6 = new r45.he0();
                    if (bArr2 != null && bArr2.length > 0) {
                        he0Var6.parseFrom(bArr2);
                    }
                    ke0Var.f378619f = he0Var6;
                }
                return 0;
            case 4:
                ke0Var.f378620g = aVar2.g(intValue);
                return 0;
            case 5:
                ke0Var.f378621h = aVar2.g(intValue);
                return 0;
            case 6:
                ke0Var.f378622i = aVar2.g(intValue);
                return 0;
            case 7:
                ke0Var.f378623m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
