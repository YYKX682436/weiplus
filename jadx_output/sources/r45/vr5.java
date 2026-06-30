package r45;

/* loaded from: classes12.dex */
public class vr5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388468d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bs5 f388469e;

    /* renamed from: f, reason: collision with root package name */
    public r45.as5 f388470f;

    /* renamed from: g, reason: collision with root package name */
    public int f388471g;

    /* renamed from: h, reason: collision with root package name */
    public int f388472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388473i;

    /* renamed from: m, reason: collision with root package name */
    public int f388474m;

    /* renamed from: n, reason: collision with root package name */
    public int f388475n;

    /* renamed from: o, reason: collision with root package name */
    public int f388476o;

    /* renamed from: p, reason: collision with root package name */
    public int f388477p;

    /* renamed from: q, reason: collision with root package name */
    public int f388478q;

    /* renamed from: r, reason: collision with root package name */
    public int f388479r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vr5)) {
            return false;
        }
        r45.vr5 vr5Var = (r45.vr5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388468d), java.lang.Integer.valueOf(vr5Var.f388468d)) && n51.f.a(this.f388469e, vr5Var.f388469e) && n51.f.a(this.f388470f, vr5Var.f388470f) && n51.f.a(java.lang.Integer.valueOf(this.f388471g), java.lang.Integer.valueOf(vr5Var.f388471g)) && n51.f.a(java.lang.Integer.valueOf(this.f388472h), java.lang.Integer.valueOf(vr5Var.f388472h)) && n51.f.a(this.f388473i, vr5Var.f388473i) && n51.f.a(java.lang.Integer.valueOf(this.f388474m), java.lang.Integer.valueOf(vr5Var.f388474m)) && n51.f.a(java.lang.Integer.valueOf(this.f388475n), java.lang.Integer.valueOf(vr5Var.f388475n)) && n51.f.a(java.lang.Integer.valueOf(this.f388476o), java.lang.Integer.valueOf(vr5Var.f388476o)) && n51.f.a(java.lang.Integer.valueOf(this.f388477p), java.lang.Integer.valueOf(vr5Var.f388477p)) && n51.f.a(java.lang.Integer.valueOf(this.f388478q), java.lang.Integer.valueOf(vr5Var.f388478q)) && n51.f.a(java.lang.Integer.valueOf(this.f388479r), java.lang.Integer.valueOf(vr5Var.f388479r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388468d);
            r45.bs5 bs5Var = this.f388469e;
            if (bs5Var != null) {
                fVar.i(2, bs5Var.computeSize());
                this.f388469e.writeFields(fVar);
            }
            r45.as5 as5Var = this.f388470f;
            if (as5Var != null) {
                fVar.i(3, as5Var.computeSize());
                this.f388470f.writeFields(fVar);
            }
            fVar.e(4, this.f388471g);
            fVar.e(5, this.f388472h);
            java.lang.String str = this.f388473i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f388474m);
            fVar.e(8, this.f388475n);
            fVar.e(9, this.f388476o);
            fVar.e(10, this.f388477p);
            fVar.e(11, this.f388478q);
            fVar.e(12, this.f388479r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388468d) + 0;
            r45.bs5 bs5Var2 = this.f388469e;
            if (bs5Var2 != null) {
                e17 += b36.f.i(2, bs5Var2.computeSize());
            }
            r45.as5 as5Var2 = this.f388470f;
            if (as5Var2 != null) {
                e17 += b36.f.i(3, as5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f388471g) + b36.f.e(5, this.f388472h);
            java.lang.String str2 = this.f388473i;
            if (str2 != null) {
                e18 += b36.f.j(6, str2);
            }
            return e18 + b36.f.e(7, this.f388474m) + b36.f.e(8, this.f388475n) + b36.f.e(9, this.f388476o) + b36.f.e(10, this.f388477p) + b36.f.e(11, this.f388478q) + b36.f.e(12, this.f388479r);
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
        r45.vr5 vr5Var = (r45.vr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vr5Var.f388468d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.bs5 bs5Var3 = new r45.bs5();
                    if (bArr != null && bArr.length > 0) {
                        bs5Var3.parseFrom(bArr);
                    }
                    vr5Var.f388469e = bs5Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.as5 as5Var3 = new r45.as5();
                    if (bArr2 != null && bArr2.length > 0) {
                        as5Var3.parseFrom(bArr2);
                    }
                    vr5Var.f388470f = as5Var3;
                }
                return 0;
            case 4:
                vr5Var.f388471g = aVar2.g(intValue);
                return 0;
            case 5:
                vr5Var.f388472h = aVar2.g(intValue);
                return 0;
            case 6:
                vr5Var.f388473i = aVar2.k(intValue);
                return 0;
            case 7:
                vr5Var.f388474m = aVar2.g(intValue);
                return 0;
            case 8:
                vr5Var.f388475n = aVar2.g(intValue);
                return 0;
            case 9:
                vr5Var.f388476o = aVar2.g(intValue);
                return 0;
            case 10:
                vr5Var.f388477p = aVar2.g(intValue);
                return 0;
            case 11:
                vr5Var.f388478q = aVar2.g(intValue);
                return 0;
            case 12:
                vr5Var.f388479r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
