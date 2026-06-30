package r45;

/* loaded from: classes8.dex */
public class on0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f382364d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382365e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f382366f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382367g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f382368h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f382369i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f382370m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382371n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382372o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382373p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f382374q;

    /* renamed from: r, reason: collision with root package name */
    public int f382375r;

    /* renamed from: s, reason: collision with root package name */
    public int f382376s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.on0)) {
            return false;
        }
        r45.on0 on0Var = (r45.on0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f382364d), java.lang.Long.valueOf(on0Var.f382364d)) && n51.f.a(this.f382365e, on0Var.f382365e) && n51.f.a(java.lang.Integer.valueOf(this.f382366f), java.lang.Integer.valueOf(on0Var.f382366f)) && n51.f.a(java.lang.Boolean.valueOf(this.f382367g), java.lang.Boolean.valueOf(on0Var.f382367g)) && n51.f.a(java.lang.Boolean.valueOf(this.f382368h), java.lang.Boolean.valueOf(on0Var.f382368h)) && n51.f.a(java.lang.Boolean.valueOf(this.f382369i), java.lang.Boolean.valueOf(on0Var.f382369i)) && n51.f.a(java.lang.Boolean.valueOf(this.f382370m), java.lang.Boolean.valueOf(on0Var.f382370m)) && n51.f.a(this.f382371n, on0Var.f382371n) && n51.f.a(this.f382372o, on0Var.f382372o) && n51.f.a(this.f382373p, on0Var.f382373p) && n51.f.a(java.lang.Boolean.valueOf(this.f382374q), java.lang.Boolean.valueOf(on0Var.f382374q)) && n51.f.a(java.lang.Integer.valueOf(this.f382375r), java.lang.Integer.valueOf(on0Var.f382375r)) && n51.f.a(java.lang.Integer.valueOf(this.f382376s), java.lang.Integer.valueOf(on0Var.f382376s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382365e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f382364d);
            fVar.g(2, 2, linkedList);
            fVar.e(3, this.f382366f);
            fVar.a(4, this.f382367g);
            fVar.a(5, this.f382368h);
            fVar.a(6, this.f382369i);
            fVar.a(7, this.f382370m);
            java.lang.String str = this.f382371n;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f382372o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f382373p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.a(11, this.f382374q);
            fVar.e(12, this.f382375r);
            fVar.e(13, this.f382376s);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f382364d) + 0 + b36.f.g(2, 2, linkedList) + b36.f.e(3, this.f382366f) + b36.f.a(4, this.f382367g) + b36.f.a(5, this.f382368h) + b36.f.a(6, this.f382369i) + b36.f.a(7, this.f382370m);
            java.lang.String str4 = this.f382371n;
            if (str4 != null) {
                h17 += b36.f.j(8, str4);
            }
            java.lang.String str5 = this.f382372o;
            if (str5 != null) {
                h17 += b36.f.j(9, str5);
            }
            java.lang.String str6 = this.f382373p;
            if (str6 != null) {
                h17 += b36.f.j(10, str6);
            }
            return h17 + b36.f.a(11, this.f382374q) + b36.f.e(12, this.f382375r) + b36.f.e(13, this.f382376s);
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
        r45.on0 on0Var = (r45.on0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                on0Var.f382364d = aVar2.i(intValue);
                return 0;
            case 2:
                on0Var.f382365e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 3:
                on0Var.f382366f = aVar2.g(intValue);
                return 0;
            case 4:
                on0Var.f382367g = aVar2.c(intValue);
                return 0;
            case 5:
                on0Var.f382368h = aVar2.c(intValue);
                return 0;
            case 6:
                on0Var.f382369i = aVar2.c(intValue);
                return 0;
            case 7:
                on0Var.f382370m = aVar2.c(intValue);
                return 0;
            case 8:
                on0Var.f382371n = aVar2.k(intValue);
                return 0;
            case 9:
                on0Var.f382372o = aVar2.k(intValue);
                return 0;
            case 10:
                on0Var.f382373p = aVar2.k(intValue);
                return 0;
            case 11:
                on0Var.f382374q = aVar2.c(intValue);
                return 0;
            case 12:
                on0Var.f382375r = aVar2.g(intValue);
                return 0;
            case 13:
                on0Var.f382376s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
