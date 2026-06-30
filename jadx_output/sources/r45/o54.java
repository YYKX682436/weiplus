package r45;

/* loaded from: classes7.dex */
public class o54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381942d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381943e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f381944f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381945g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381946h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ie7 f381947i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381948m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o54)) {
            return false;
        }
        r45.o54 o54Var = (r45.o54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381942d), java.lang.Integer.valueOf(o54Var.f381942d)) && n51.f.a(this.f381943e, o54Var.f381943e) && n51.f.a(java.lang.Boolean.valueOf(this.f381944f), java.lang.Boolean.valueOf(o54Var.f381944f)) && n51.f.a(this.f381945g, o54Var.f381945g) && n51.f.a(this.f381946h, o54Var.f381946h) && n51.f.a(this.f381947i, o54Var.f381947i) && n51.f.a(this.f381948m, o54Var.f381948m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381942d);
            java.lang.String str = this.f381943e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f381944f);
            java.lang.String str2 = this.f381945g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381946h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.ie7 ie7Var = this.f381947i;
            if (ie7Var != null) {
                fVar.i(6, ie7Var.computeSize());
                this.f381947i.writeFields(fVar);
            }
            java.lang.String str4 = this.f381948m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381942d) + 0;
            java.lang.String str5 = this.f381943e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            int a17 = e17 + b36.f.a(3, this.f381944f);
            java.lang.String str6 = this.f381945g;
            if (str6 != null) {
                a17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f381946h;
            if (str7 != null) {
                a17 += b36.f.j(5, str7);
            }
            r45.ie7 ie7Var2 = this.f381947i;
            if (ie7Var2 != null) {
                a17 += b36.f.i(6, ie7Var2.computeSize());
            }
            java.lang.String str8 = this.f381948m;
            return str8 != null ? a17 + b36.f.j(7, str8) : a17;
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
        r45.o54 o54Var = (r45.o54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o54Var.f381942d = aVar2.g(intValue);
                return 0;
            case 2:
                o54Var.f381943e = aVar2.k(intValue);
                return 0;
            case 3:
                o54Var.f381944f = aVar2.c(intValue);
                return 0;
            case 4:
                o54Var.f381945g = aVar2.k(intValue);
                return 0;
            case 5:
                o54Var.f381946h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ie7 ie7Var3 = new r45.ie7();
                    if (bArr != null && bArr.length > 0) {
                        ie7Var3.parseFrom(bArr);
                    }
                    o54Var.f381947i = ie7Var3;
                }
                return 0;
            case 7:
                o54Var.f381948m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
