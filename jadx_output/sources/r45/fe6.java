package r45;

/* loaded from: classes4.dex */
public class fe6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374259e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374260f;

    /* renamed from: g, reason: collision with root package name */
    public int f374261g;

    /* renamed from: h, reason: collision with root package name */
    public int f374262h;

    /* renamed from: i, reason: collision with root package name */
    public r45.oi0 f374263i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ni0 f374264m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fe6)) {
            return false;
        }
        r45.fe6 fe6Var = (r45.fe6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374258d), java.lang.Integer.valueOf(fe6Var.f374258d)) && n51.f.a(this.f374259e, fe6Var.f374259e) && n51.f.a(this.f374260f, fe6Var.f374260f) && n51.f.a(java.lang.Integer.valueOf(this.f374261g), java.lang.Integer.valueOf(fe6Var.f374261g)) && n51.f.a(java.lang.Integer.valueOf(this.f374262h), java.lang.Integer.valueOf(fe6Var.f374262h)) && n51.f.a(this.f374263i, fe6Var.f374263i) && n51.f.a(this.f374264m, fe6Var.f374264m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374258d);
            java.lang.String str = this.f374259e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f374260f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f374261g);
            fVar.e(5, this.f374262h);
            r45.oi0 oi0Var = this.f374263i;
            if (oi0Var != null) {
                fVar.i(6, oi0Var.computeSize());
                this.f374263i.writeFields(fVar);
            }
            r45.ni0 ni0Var = this.f374264m;
            if (ni0Var != null) {
                fVar.i(7, ni0Var.computeSize());
                this.f374264m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374258d) + 0;
            java.lang.String str2 = this.f374259e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374260f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            int e18 = e17 + b36.f.e(4, this.f374261g) + b36.f.e(5, this.f374262h);
            r45.oi0 oi0Var2 = this.f374263i;
            if (oi0Var2 != null) {
                e18 += b36.f.i(6, oi0Var2.computeSize());
            }
            r45.ni0 ni0Var2 = this.f374264m;
            return ni0Var2 != null ? e18 + b36.f.i(7, ni0Var2.computeSize()) : e18;
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
        r45.fe6 fe6Var = (r45.fe6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fe6Var.f374258d = aVar2.g(intValue);
                return 0;
            case 2:
                fe6Var.f374259e = aVar2.k(intValue);
                return 0;
            case 3:
                fe6Var.f374260f = aVar2.d(intValue);
                return 0;
            case 4:
                fe6Var.f374261g = aVar2.g(intValue);
                return 0;
            case 5:
                fe6Var.f374262h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.oi0 oi0Var3 = new r45.oi0();
                    if (bArr != null && bArr.length > 0) {
                        oi0Var3.parseFrom(bArr);
                    }
                    fe6Var.f374263i = oi0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.ni0 ni0Var3 = new r45.ni0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ni0Var3.parseFrom(bArr2);
                    }
                    fe6Var.f374264m = ni0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
