package r45;

/* loaded from: classes9.dex */
public class vn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f388383d;

    /* renamed from: e, reason: collision with root package name */
    public int f388384e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f388385f;

    /* renamed from: g, reason: collision with root package name */
    public int f388386g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388387h;

    /* renamed from: i, reason: collision with root package name */
    public int f388388i;

    /* renamed from: m, reason: collision with root package name */
    public int f388389m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qm5 f388390n;

    /* renamed from: o, reason: collision with root package name */
    public long f388391o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vn)) {
            return false;
        }
        r45.vn vnVar = (r45.vn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f388383d), java.lang.Long.valueOf(vnVar.f388383d)) && n51.f.a(java.lang.Integer.valueOf(this.f388384e), java.lang.Integer.valueOf(vnVar.f388384e)) && n51.f.a(java.lang.Boolean.valueOf(this.f388385f), java.lang.Boolean.valueOf(vnVar.f388385f)) && n51.f.a(java.lang.Integer.valueOf(this.f388386g), java.lang.Integer.valueOf(vnVar.f388386g)) && n51.f.a(this.f388387h, vnVar.f388387h) && n51.f.a(java.lang.Integer.valueOf(this.f388388i), java.lang.Integer.valueOf(vnVar.f388388i)) && n51.f.a(java.lang.Integer.valueOf(this.f388389m), java.lang.Integer.valueOf(vnVar.f388389m)) && n51.f.a(this.f388390n, vnVar.f388390n) && n51.f.a(java.lang.Long.valueOf(this.f388391o), java.lang.Long.valueOf(vnVar.f388391o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f388383d);
            fVar.e(2, this.f388384e);
            fVar.a(3, this.f388385f);
            fVar.e(4, this.f388386g);
            java.lang.String str = this.f388387h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f388388i);
            fVar.e(7, this.f388389m);
            r45.qm5 qm5Var = this.f388390n;
            if (qm5Var != null) {
                fVar.i(8, qm5Var.computeSize());
                this.f388390n.writeFields(fVar);
            }
            fVar.h(9, this.f388391o);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f388383d) + 0 + b36.f.e(2, this.f388384e) + b36.f.a(3, this.f388385f) + b36.f.e(4, this.f388386g);
            java.lang.String str2 = this.f388387h;
            if (str2 != null) {
                h17 += b36.f.j(5, str2);
            }
            int e17 = h17 + b36.f.e(6, this.f388388i) + b36.f.e(7, this.f388389m);
            r45.qm5 qm5Var2 = this.f388390n;
            if (qm5Var2 != null) {
                e17 += b36.f.i(8, qm5Var2.computeSize());
            }
            return e17 + b36.f.h(9, this.f388391o);
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
        r45.vn vnVar = (r45.vn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vnVar.f388383d = aVar2.i(intValue);
                return 0;
            case 2:
                vnVar.f388384e = aVar2.g(intValue);
                return 0;
            case 3:
                vnVar.f388385f = aVar2.c(intValue);
                return 0;
            case 4:
                vnVar.f388386g = aVar2.g(intValue);
                return 0;
            case 5:
                vnVar.f388387h = aVar2.k(intValue);
                return 0;
            case 6:
                vnVar.f388388i = aVar2.g(intValue);
                return 0;
            case 7:
                vnVar.f388389m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qm5 qm5Var3 = new r45.qm5();
                    if (bArr != null && bArr.length > 0) {
                        qm5Var3.parseFrom(bArr);
                    }
                    vnVar.f388390n = qm5Var3;
                }
                return 0;
            case 9:
                vnVar.f388391o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
