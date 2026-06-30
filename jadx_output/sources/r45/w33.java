package r45;

/* loaded from: classes8.dex */
public class w33 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388832e;

    /* renamed from: f, reason: collision with root package name */
    public long f388833f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f388834g;

    /* renamed from: h, reason: collision with root package name */
    public float f388835h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388836i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f388837m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public r45.x33 f388838n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w33)) {
            return false;
        }
        r45.w33 w33Var = (r45.w33) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388831d), java.lang.Integer.valueOf(w33Var.f388831d)) && n51.f.a(this.f388832e, w33Var.f388832e) && n51.f.a(java.lang.Long.valueOf(this.f388833f), java.lang.Long.valueOf(w33Var.f388833f)) && n51.f.a(java.lang.Boolean.valueOf(this.f388834g), java.lang.Boolean.valueOf(w33Var.f388834g)) && n51.f.a(java.lang.Float.valueOf(this.f388835h), java.lang.Float.valueOf(w33Var.f388835h)) && n51.f.a(this.f388836i, w33Var.f388836i) && n51.f.a(this.f388837m, w33Var.f388837m) && n51.f.a(this.f388838n, w33Var.f388838n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388831d);
            java.lang.String str = this.f388832e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f388833f);
            fVar.a(4, this.f388834g);
            fVar.d(5, this.f388835h);
            com.tencent.mm.protobuf.g gVar = this.f388836i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 8, this.f388837m);
            r45.x33 x33Var = this.f388838n;
            if (x33Var != null) {
                fVar.i(8, x33Var.computeSize());
                this.f388838n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388831d) + 0;
            java.lang.String str2 = this.f388832e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int h17 = e17 + b36.f.h(3, this.f388833f) + b36.f.a(4, this.f388834g) + b36.f.d(5, this.f388835h);
            com.tencent.mm.protobuf.g gVar2 = this.f388836i;
            if (gVar2 != null) {
                h17 += b36.f.b(6, gVar2);
            }
            int g17 = h17 + b36.f.g(7, 8, this.f388837m);
            r45.x33 x33Var2 = this.f388838n;
            return x33Var2 != null ? g17 + b36.f.i(8, x33Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388837m.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.w33 w33Var = (r45.w33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w33Var.f388831d = aVar2.g(intValue);
                return 0;
            case 2:
                w33Var.f388832e = aVar2.k(intValue);
                return 0;
            case 3:
                w33Var.f388833f = aVar2.i(intValue);
                return 0;
            case 4:
                w33Var.f388834g = aVar2.c(intValue);
                return 0;
            case 5:
                w33Var.f388835h = aVar2.f(intValue);
                return 0;
            case 6:
                w33Var.f388836i = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.w33 w33Var2 = new r45.w33();
                    if (bArr2 != null && bArr2.length > 0) {
                        w33Var2.parseFrom(bArr2);
                    }
                    w33Var.f388837m.add(w33Var2);
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x33 x33Var3 = new r45.x33();
                    if (bArr3 != null && bArr3.length > 0) {
                        x33Var3.parseFrom(bArr3);
                    }
                    w33Var.f388838n = x33Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
