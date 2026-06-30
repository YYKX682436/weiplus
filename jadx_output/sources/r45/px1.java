package r45;

/* loaded from: classes4.dex */
public class px1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.xn1 f383452d;

    /* renamed from: e, reason: collision with root package name */
    public int f383453e;

    /* renamed from: f, reason: collision with root package name */
    public int f383454f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383455g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383456h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f383457i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px1)) {
            return false;
        }
        r45.px1 px1Var = (r45.px1) fVar;
        return n51.f.a(this.f383452d, px1Var.f383452d) && n51.f.a(java.lang.Integer.valueOf(this.f383453e), java.lang.Integer.valueOf(px1Var.f383453e)) && n51.f.a(java.lang.Integer.valueOf(this.f383454f), java.lang.Integer.valueOf(px1Var.f383454f)) && n51.f.a(this.f383455g, px1Var.f383455g) && n51.f.a(this.f383456h, px1Var.f383456h) && n51.f.a(java.lang.Boolean.valueOf(this.f383457i), java.lang.Boolean.valueOf(px1Var.f383457i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.xn1 xn1Var = this.f383452d;
            if (xn1Var != null) {
                fVar.i(1, xn1Var.computeSize());
                this.f383452d.writeFields(fVar);
            }
            fVar.e(2, this.f383453e);
            fVar.e(3, this.f383454f);
            java.lang.String str = this.f383455g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f383456h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f383457i);
            return 0;
        }
        if (i17 == 1) {
            r45.xn1 xn1Var2 = this.f383452d;
            int i18 = (xn1Var2 != null ? 0 + b36.f.i(1, xn1Var2.computeSize()) : 0) + b36.f.e(2, this.f383453e) + b36.f.e(3, this.f383454f);
            java.lang.String str3 = this.f383455g;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f383456h;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.a(6, this.f383457i);
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
        r45.px1 px1Var = (r45.px1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.xn1 xn1Var3 = new r45.xn1();
                    if (bArr != null && bArr.length > 0) {
                        xn1Var3.parseFrom(bArr);
                    }
                    px1Var.f383452d = xn1Var3;
                }
                return 0;
            case 2:
                px1Var.f383453e = aVar2.g(intValue);
                return 0;
            case 3:
                px1Var.f383454f = aVar2.g(intValue);
                return 0;
            case 4:
                px1Var.f383455g = aVar2.k(intValue);
                return 0;
            case 5:
                px1Var.f383456h = aVar2.k(intValue);
                return 0;
            case 6:
                px1Var.f383457i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
