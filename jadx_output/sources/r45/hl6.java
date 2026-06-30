package r45;

/* loaded from: classes9.dex */
public class hl6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f376271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376272e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376273f;

    /* renamed from: g, reason: collision with root package name */
    public float f376274g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yt5 f376275h;

    /* renamed from: i, reason: collision with root package name */
    public int f376276i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376277m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cg0 f376278n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cg0 f376279o;

    /* renamed from: p, reason: collision with root package name */
    public float f376280p;

    /* renamed from: q, reason: collision with root package name */
    public int f376281q;

    /* renamed from: r, reason: collision with root package name */
    public r45.e90 f376282r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hl6)) {
            return false;
        }
        r45.hl6 hl6Var = (r45.hl6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f376271d), java.lang.Long.valueOf(hl6Var.f376271d)) && n51.f.a(this.f376272e, hl6Var.f376272e) && n51.f.a(this.f376273f, hl6Var.f376273f) && n51.f.a(java.lang.Float.valueOf(this.f376274g), java.lang.Float.valueOf(hl6Var.f376274g)) && n51.f.a(this.f376275h, hl6Var.f376275h) && n51.f.a(java.lang.Integer.valueOf(this.f376276i), java.lang.Integer.valueOf(hl6Var.f376276i)) && n51.f.a(this.f376277m, hl6Var.f376277m) && n51.f.a(this.f376278n, hl6Var.f376278n) && n51.f.a(this.f376279o, hl6Var.f376279o) && n51.f.a(java.lang.Float.valueOf(this.f376280p), java.lang.Float.valueOf(hl6Var.f376280p)) && n51.f.a(java.lang.Integer.valueOf(this.f376281q), java.lang.Integer.valueOf(hl6Var.f376281q)) && n51.f.a(this.f376282r, hl6Var.f376282r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f376271d);
            java.lang.String str = this.f376272e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376273f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.d(4, this.f376274g);
            r45.yt5 yt5Var = this.f376275h;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.computeSize());
                this.f376275h.writeFields(fVar);
            }
            fVar.e(6, this.f376276i);
            java.lang.String str3 = this.f376277m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.cg0 cg0Var = this.f376278n;
            if (cg0Var != null) {
                fVar.i(8, cg0Var.computeSize());
                this.f376278n.writeFields(fVar);
            }
            r45.cg0 cg0Var2 = this.f376279o;
            if (cg0Var2 != null) {
                fVar.i(9, cg0Var2.computeSize());
                this.f376279o.writeFields(fVar);
            }
            fVar.d(10, this.f376280p);
            fVar.e(11, this.f376281q);
            r45.e90 e90Var = this.f376282r;
            if (e90Var == null) {
                return 0;
            }
            fVar.i(12, e90Var.computeSize());
            this.f376282r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f376271d) + 0;
            java.lang.String str4 = this.f376272e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f376273f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            int d17 = h17 + b36.f.d(4, this.f376274g);
            r45.yt5 yt5Var2 = this.f376275h;
            if (yt5Var2 != null) {
                d17 += b36.f.i(5, yt5Var2.computeSize());
            }
            int e17 = d17 + b36.f.e(6, this.f376276i);
            java.lang.String str6 = this.f376277m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            r45.cg0 cg0Var3 = this.f376278n;
            if (cg0Var3 != null) {
                e17 += b36.f.i(8, cg0Var3.computeSize());
            }
            r45.cg0 cg0Var4 = this.f376279o;
            if (cg0Var4 != null) {
                e17 += b36.f.i(9, cg0Var4.computeSize());
            }
            int d18 = e17 + b36.f.d(10, this.f376280p) + b36.f.e(11, this.f376281q);
            r45.e90 e90Var2 = this.f376282r;
            return e90Var2 != null ? d18 + b36.f.i(12, e90Var2.computeSize()) : d18;
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
        r45.hl6 hl6Var = (r45.hl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hl6Var.f376271d = aVar2.i(intValue);
                return 0;
            case 2:
                hl6Var.f376272e = aVar2.k(intValue);
                return 0;
            case 3:
                hl6Var.f376273f = aVar2.k(intValue);
                return 0;
            case 4:
                hl6Var.f376274g = aVar2.f(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr != null && bArr.length > 0) {
                        yt5Var3.parseFrom(bArr);
                    }
                    hl6Var.f376275h = yt5Var3;
                }
                return 0;
            case 6:
                hl6Var.f376276i = aVar2.g(intValue);
                return 0;
            case 7:
                hl6Var.f376277m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cg0 cg0Var5 = new r45.cg0();
                    if (bArr2 != null && bArr2.length > 0) {
                        cg0Var5.parseFrom(bArr2);
                    }
                    hl6Var.f376278n = cg0Var5;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cg0 cg0Var6 = new r45.cg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        cg0Var6.parseFrom(bArr3);
                    }
                    hl6Var.f376279o = cg0Var6;
                }
                return 0;
            case 10:
                hl6Var.f376280p = aVar2.f(intValue);
                return 0;
            case 11:
                hl6Var.f376281q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.e90 e90Var3 = new r45.e90();
                    if (bArr4 != null && bArr4.length > 0) {
                        e90Var3.parseFrom(bArr4);
                    }
                    hl6Var.f376282r = e90Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
