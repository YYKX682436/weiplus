package r45;

/* loaded from: classes7.dex */
public class le3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.jr5 f379367d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jc4 f379368e;

    /* renamed from: f, reason: collision with root package name */
    public int f379369f;

    /* renamed from: g, reason: collision with root package name */
    public int f379370g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f379371h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f379372i;

    /* renamed from: m, reason: collision with root package name */
    public int f379373m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379374n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379375o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379376p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.le3)) {
            return false;
        }
        r45.le3 le3Var = (r45.le3) fVar;
        return n51.f.a(this.f379367d, le3Var.f379367d) && n51.f.a(this.f379368e, le3Var.f379368e) && n51.f.a(java.lang.Integer.valueOf(this.f379369f), java.lang.Integer.valueOf(le3Var.f379369f)) && n51.f.a(java.lang.Integer.valueOf(this.f379370g), java.lang.Integer.valueOf(le3Var.f379370g)) && n51.f.a(java.lang.Boolean.valueOf(this.f379371h), java.lang.Boolean.valueOf(le3Var.f379371h)) && n51.f.a(java.lang.Boolean.valueOf(this.f379372i), java.lang.Boolean.valueOf(le3Var.f379372i)) && n51.f.a(java.lang.Integer.valueOf(this.f379373m), java.lang.Integer.valueOf(le3Var.f379373m)) && n51.f.a(this.f379374n, le3Var.f379374n) && n51.f.a(this.f379375o, le3Var.f379375o) && n51.f.a(this.f379376p, le3Var.f379376p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.jr5 jr5Var = this.f379367d;
            if (jr5Var != null) {
                fVar.i(1, jr5Var.computeSize());
                this.f379367d.writeFields(fVar);
            }
            r45.jc4 jc4Var = this.f379368e;
            if (jc4Var != null) {
                fVar.i(2, jc4Var.computeSize());
                this.f379368e.writeFields(fVar);
            }
            fVar.e(3, this.f379369f);
            fVar.e(4, this.f379370g);
            fVar.a(5, this.f379371h);
            fVar.a(6, this.f379372i);
            fVar.e(7, this.f379373m);
            java.lang.String str = this.f379374n;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f379375o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f379376p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.jr5 jr5Var2 = this.f379367d;
            int i18 = jr5Var2 != null ? 0 + b36.f.i(1, jr5Var2.computeSize()) : 0;
            r45.jc4 jc4Var2 = this.f379368e;
            if (jc4Var2 != null) {
                i18 += b36.f.i(2, jc4Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f379369f) + b36.f.e(4, this.f379370g) + b36.f.a(5, this.f379371h) + b36.f.a(6, this.f379372i) + b36.f.e(7, this.f379373m);
            java.lang.String str4 = this.f379374n;
            if (str4 != null) {
                e17 += b36.f.j(8, str4);
            }
            java.lang.String str5 = this.f379375o;
            if (str5 != null) {
                e17 += b36.f.j(9, str5);
            }
            java.lang.String str6 = this.f379376p;
            return str6 != null ? e17 + b36.f.j(10, str6) : e17;
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
        r45.le3 le3Var = (r45.le3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.jr5 jr5Var3 = new r45.jr5();
                    if (bArr != null && bArr.length > 0) {
                        jr5Var3.parseFrom(bArr);
                    }
                    le3Var.f379367d = jr5Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.jc4 jc4Var3 = new r45.jc4();
                    if (bArr2 != null && bArr2.length > 0) {
                        jc4Var3.parseFrom(bArr2);
                    }
                    le3Var.f379368e = jc4Var3;
                }
                return 0;
            case 3:
                le3Var.f379369f = aVar2.g(intValue);
                return 0;
            case 4:
                le3Var.f379370g = aVar2.g(intValue);
                return 0;
            case 5:
                le3Var.f379371h = aVar2.c(intValue);
                return 0;
            case 6:
                le3Var.f379372i = aVar2.c(intValue);
                return 0;
            case 7:
                le3Var.f379373m = aVar2.g(intValue);
                return 0;
            case 8:
                le3Var.f379374n = aVar2.k(intValue);
                return 0;
            case 9:
                le3Var.f379375o = aVar2.k(intValue);
                return 0;
            case 10:
                le3Var.f379376p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
