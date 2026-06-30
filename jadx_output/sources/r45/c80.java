package r45;

/* loaded from: classes2.dex */
public class c80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f371364d;

    /* renamed from: e, reason: collision with root package name */
    public int f371365e;

    /* renamed from: f, reason: collision with root package name */
    public int f371366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371367g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371368h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f371369i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371370m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f371371n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371372o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c80)) {
            return false;
        }
        r45.c80 c80Var = (r45.c80) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f371364d), java.lang.Long.valueOf(c80Var.f371364d)) && n51.f.a(java.lang.Integer.valueOf(this.f371365e), java.lang.Integer.valueOf(c80Var.f371365e)) && n51.f.a(java.lang.Integer.valueOf(this.f371366f), java.lang.Integer.valueOf(c80Var.f371366f)) && n51.f.a(this.f371367g, c80Var.f371367g) && n51.f.a(this.f371368h, c80Var.f371368h) && n51.f.a(this.f371369i, c80Var.f371369i) && n51.f.a(this.f371370m, c80Var.f371370m) && n51.f.a(java.lang.Boolean.valueOf(this.f371371n), java.lang.Boolean.valueOf(c80Var.f371371n)) && n51.f.a(this.f371372o, c80Var.f371372o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371369i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f371364d);
            fVar.e(2, this.f371365e);
            fVar.e(3, this.f371366f);
            java.lang.String str = this.f371367g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f371368h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, linkedList);
            java.lang.String str3 = this.f371370m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(8, this.f371371n);
            java.lang.String str4 = this.f371372o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f371364d) + 0 + b36.f.e(2, this.f371365e) + b36.f.e(3, this.f371366f);
            java.lang.String str5 = this.f371367g;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f371368h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            int g17 = h17 + b36.f.g(6, 1, linkedList);
            java.lang.String str7 = this.f371370m;
            if (str7 != null) {
                g17 += b36.f.j(7, str7);
            }
            int a17 = g17 + b36.f.a(8, this.f371371n);
            java.lang.String str8 = this.f371372o;
            return str8 != null ? a17 + b36.f.j(9, str8) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.c80 c80Var = (r45.c80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c80Var.f371364d = aVar2.i(intValue);
                return 0;
            case 2:
                c80Var.f371365e = aVar2.g(intValue);
                return 0;
            case 3:
                c80Var.f371366f = aVar2.g(intValue);
                return 0;
            case 4:
                c80Var.f371367g = aVar2.k(intValue);
                return 0;
            case 5:
                c80Var.f371368h = aVar2.k(intValue);
                return 0;
            case 6:
                c80Var.f371369i.add(aVar2.k(intValue));
                return 0;
            case 7:
                c80Var.f371370m = aVar2.k(intValue);
                return 0;
            case 8:
                c80Var.f371371n = aVar2.c(intValue);
                return 0;
            case 9:
                c80Var.f371372o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
