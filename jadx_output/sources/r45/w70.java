package r45;

/* loaded from: classes9.dex */
public class w70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f388919d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f388920e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f388921f;

    /* renamed from: g, reason: collision with root package name */
    public int f388922g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388923h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388924i;

    /* renamed from: m, reason: collision with root package name */
    public long f388925m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388926n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388927o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w70)) {
            return false;
        }
        r45.w70 w70Var = (r45.w70) fVar;
        return n51.f.a(this.f388919d, w70Var.f388919d) && n51.f.a(java.lang.Integer.valueOf(this.f388920e), java.lang.Integer.valueOf(w70Var.f388920e)) && n51.f.a(java.lang.Boolean.valueOf(this.f388921f), java.lang.Boolean.valueOf(w70Var.f388921f)) && n51.f.a(java.lang.Integer.valueOf(this.f388922g), java.lang.Integer.valueOf(w70Var.f388922g)) && n51.f.a(this.f388923h, w70Var.f388923h) && n51.f.a(this.f388924i, w70Var.f388924i) && n51.f.a(java.lang.Long.valueOf(this.f388925m), java.lang.Long.valueOf(w70Var.f388925m)) && n51.f.a(this.f388926n, w70Var.f388926n) && n51.f.a(this.f388927o, w70Var.f388927o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f388919d);
            fVar.e(2, this.f388920e);
            fVar.a(3, this.f388921f);
            fVar.e(4, this.f388922g);
            java.lang.String str = this.f388923h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f388924i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.h(7, this.f388925m);
            java.lang.String str3 = this.f388926n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f388927o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f388919d) + 0 + b36.f.e(2, this.f388920e) + b36.f.a(3, this.f388921f) + b36.f.e(4, this.f388922g);
            java.lang.String str5 = this.f388923h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f388924i;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            int h17 = g17 + b36.f.h(7, this.f388925m);
            java.lang.String str7 = this.f388926n;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f388927o;
            return str8 != null ? h17 + b36.f.j(9, str8) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388919d.clear();
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
        r45.w70 w70Var = (r45.w70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w70Var.f388919d.add(aVar2.k(intValue));
                return 0;
            case 2:
                w70Var.f388920e = aVar2.g(intValue);
                return 0;
            case 3:
                w70Var.f388921f = aVar2.c(intValue);
                return 0;
            case 4:
                w70Var.f388922g = aVar2.g(intValue);
                return 0;
            case 5:
                w70Var.f388923h = aVar2.k(intValue);
                return 0;
            case 6:
                w70Var.f388924i = aVar2.k(intValue);
                return 0;
            case 7:
                w70Var.f388925m = aVar2.i(intValue);
                return 0;
            case 8:
                w70Var.f388926n = aVar2.k(intValue);
                return 0;
            case 9:
                w70Var.f388927o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
