package r45;

/* loaded from: classes9.dex */
public class gq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375476e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f375477f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.xp0 f375478g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq0)) {
            return false;
        }
        r45.gq0 gq0Var = (r45.gq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375475d), java.lang.Integer.valueOf(gq0Var.f375475d)) && n51.f.a(this.f375476e, gq0Var.f375476e) && n51.f.a(this.f375477f, gq0Var.f375477f) && n51.f.a(this.f375478g, gq0Var.f375478g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375475d);
            java.lang.String str = this.f375476e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f375477f);
            r45.xp0 xp0Var = this.f375478g;
            if (xp0Var != null) {
                fVar.i(4, xp0Var.computeSize());
                this.f375478g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375475d) + 0;
            java.lang.String str2 = this.f375476e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, this.f375477f);
            r45.xp0 xp0Var2 = this.f375478g;
            return xp0Var2 != null ? g17 + b36.f.i(4, xp0Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f375477f.clear();
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
        r45.gq0 gq0Var = (r45.gq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gq0Var.f375475d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gq0Var.f375476e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.xp0 xp0Var3 = new r45.xp0();
                if (bArr2 != null && bArr2.length > 0) {
                    xp0Var3.parseFrom(bArr2);
                }
                gq0Var.f375477f.add(xp0Var3);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.xp0 xp0Var4 = new r45.xp0();
            if (bArr3 != null && bArr3.length > 0) {
                xp0Var4.parseFrom(bArr3);
            }
            gq0Var.f375478g = xp0Var4;
        }
        return 0;
    }
}
