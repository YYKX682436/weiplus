package r45;

/* loaded from: classes7.dex */
public class me3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380398d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380399e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380400f;

    /* renamed from: g, reason: collision with root package name */
    public int f380401g;

    /* renamed from: h, reason: collision with root package name */
    public int f380402h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f380403i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f380404m;

    /* renamed from: n, reason: collision with root package name */
    public r45.jr5 f380405n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380406o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380407p;

    /* renamed from: q, reason: collision with root package name */
    public int f380408q;

    /* renamed from: r, reason: collision with root package name */
    public long f380409r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me3)) {
            return false;
        }
        r45.me3 me3Var = (r45.me3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380398d), java.lang.Integer.valueOf(me3Var.f380398d)) && n51.f.a(this.f380399e, me3Var.f380399e) && n51.f.a(this.f380400f, me3Var.f380400f) && n51.f.a(java.lang.Integer.valueOf(this.f380401g), java.lang.Integer.valueOf(me3Var.f380401g)) && n51.f.a(java.lang.Integer.valueOf(this.f380402h), java.lang.Integer.valueOf(me3Var.f380402h)) && n51.f.a(java.lang.Boolean.valueOf(this.f380403i), java.lang.Boolean.valueOf(me3Var.f380403i)) && n51.f.a(java.lang.Boolean.valueOf(this.f380404m), java.lang.Boolean.valueOf(me3Var.f380404m)) && n51.f.a(this.f380405n, me3Var.f380405n) && n51.f.a(this.f380406o, me3Var.f380406o) && n51.f.a(this.f380407p, me3Var.f380407p) && n51.f.a(java.lang.Integer.valueOf(this.f380408q), java.lang.Integer.valueOf(me3Var.f380408q)) && n51.f.a(java.lang.Long.valueOf(this.f380409r), java.lang.Long.valueOf(me3Var.f380409r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380398d);
            java.lang.String str = this.f380399e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380400f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f380401g);
            fVar.e(5, this.f380402h);
            fVar.a(6, this.f380403i);
            fVar.a(7, this.f380404m);
            r45.jr5 jr5Var = this.f380405n;
            if (jr5Var != null) {
                fVar.i(20, jr5Var.computeSize());
                this.f380405n.writeFields(fVar);
            }
            java.lang.String str3 = this.f380406o;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            java.lang.String str4 = this.f380407p;
            if (str4 != null) {
                fVar.j(22, str4);
            }
            fVar.e(23, this.f380408q);
            fVar.h(24, this.f380409r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380398d) + 0;
            java.lang.String str5 = this.f380399e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f380400f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            int e18 = e17 + b36.f.e(4, this.f380401g) + b36.f.e(5, this.f380402h) + b36.f.a(6, this.f380403i) + b36.f.a(7, this.f380404m);
            r45.jr5 jr5Var2 = this.f380405n;
            if (jr5Var2 != null) {
                e18 += b36.f.i(20, jr5Var2.computeSize());
            }
            java.lang.String str7 = this.f380406o;
            if (str7 != null) {
                e18 += b36.f.j(21, str7);
            }
            java.lang.String str8 = this.f380407p;
            if (str8 != null) {
                e18 += b36.f.j(22, str8);
            }
            return e18 + b36.f.e(23, this.f380408q) + b36.f.h(24, this.f380409r);
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
        r45.me3 me3Var = (r45.me3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                me3Var.f380398d = aVar2.g(intValue);
                return 0;
            case 2:
                me3Var.f380399e = aVar2.k(intValue);
                return 0;
            case 3:
                me3Var.f380400f = aVar2.k(intValue);
                return 0;
            case 4:
                me3Var.f380401g = aVar2.g(intValue);
                return 0;
            case 5:
                me3Var.f380402h = aVar2.g(intValue);
                return 0;
            case 6:
                me3Var.f380403i = aVar2.c(intValue);
                return 0;
            case 7:
                me3Var.f380404m = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        java.util.LinkedList j17 = aVar2.j(intValue);
                        int size = j17.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j17.get(i18);
                            r45.jr5 jr5Var3 = new r45.jr5();
                            if (bArr != null && bArr.length > 0) {
                                jr5Var3.parseFrom(bArr);
                            }
                            me3Var.f380405n = jr5Var3;
                        }
                        return 0;
                    case 21:
                        me3Var.f380406o = aVar2.k(intValue);
                        return 0;
                    case 22:
                        me3Var.f380407p = aVar2.k(intValue);
                        return 0;
                    case 23:
                        me3Var.f380408q = aVar2.g(intValue);
                        return 0;
                    case 24:
                        me3Var.f380409r = aVar2.i(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
