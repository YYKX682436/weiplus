package r45;

/* loaded from: classes10.dex */
public class gd4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375134e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zz6 f375135f;

    /* renamed from: g, reason: collision with root package name */
    public float f375136g;

    /* renamed from: h, reason: collision with root package name */
    public float f375137h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bi0 f375138i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gd4)) {
            return false;
        }
        r45.gd4 gd4Var = (r45.gd4) fVar;
        return n51.f.a(this.f375133d, gd4Var.f375133d) && n51.f.a(this.f375134e, gd4Var.f375134e) && n51.f.a(this.f375135f, gd4Var.f375135f) && n51.f.a(java.lang.Float.valueOf(this.f375136g), java.lang.Float.valueOf(gd4Var.f375136g)) && n51.f.a(java.lang.Float.valueOf(this.f375137h), java.lang.Float.valueOf(gd4Var.f375137h)) && n51.f.a(this.f375138i, gd4Var.f375138i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375133d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375134e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zz6 zz6Var = this.f375135f;
            if (zz6Var != null) {
                fVar.i(4, zz6Var.computeSize());
                this.f375135f.writeFields(fVar);
            }
            fVar.d(5, this.f375136g);
            fVar.d(6, this.f375137h);
            r45.bi0 bi0Var = this.f375138i;
            if (bi0Var != null) {
                fVar.i(7, bi0Var.computeSize());
                this.f375138i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f375133d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f375134e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zz6 zz6Var2 = this.f375135f;
            if (zz6Var2 != null) {
                j17 += b36.f.i(4, zz6Var2.computeSize());
            }
            int d17 = j17 + b36.f.d(5, this.f375136g) + b36.f.d(6, this.f375137h);
            r45.bi0 bi0Var2 = this.f375138i;
            return bi0Var2 != null ? d17 + b36.f.i(7, bi0Var2.computeSize()) : d17;
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
        r45.gd4 gd4Var = (r45.gd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gd4Var.f375133d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gd4Var.f375134e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.zz6 zz6Var3 = new r45.zz6();
                if (bArr != null && bArr.length > 0) {
                    zz6Var3.parseFrom(bArr);
                }
                gd4Var.f375135f = zz6Var3;
            }
            return 0;
        }
        if (intValue == 5) {
            gd4Var.f375136g = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 6) {
            gd4Var.f375137h = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.bi0 bi0Var3 = new r45.bi0();
            if (bArr2 != null && bArr2.length > 0) {
                bi0Var3.parseFrom(bArr2);
            }
            gd4Var.f375138i = bi0Var3;
        }
        return 0;
    }
}
