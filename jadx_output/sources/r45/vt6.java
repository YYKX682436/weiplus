package r45;

/* loaded from: classes8.dex */
public class vt6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388534d;

    /* renamed from: e, reason: collision with root package name */
    public int f388535e;

    /* renamed from: f, reason: collision with root package name */
    public int f388536f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388537g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f388538h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f388539i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388540m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388541n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388542o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388543p;

    static {
        new r45.vt6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vt6 parseFrom(byte[] bArr) {
        return (r45.vt6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt6)) {
            return false;
        }
        r45.vt6 vt6Var = (r45.vt6) fVar;
        return n51.f.a(this.f388534d, vt6Var.f388534d) && n51.f.a(java.lang.Integer.valueOf(this.f388535e), java.lang.Integer.valueOf(vt6Var.f388535e)) && n51.f.a(java.lang.Integer.valueOf(this.f388536f), java.lang.Integer.valueOf(vt6Var.f388536f)) && n51.f.a(this.f388537g, vt6Var.f388537g) && n51.f.a(java.lang.Boolean.valueOf(this.f388538h), java.lang.Boolean.valueOf(vt6Var.f388538h)) && n51.f.a(this.f388539i, vt6Var.f388539i) && n51.f.a(this.f388540m, vt6Var.f388540m) && n51.f.a(this.f388541n, vt6Var.f388541n) && n51.f.a(this.f388542o, vt6Var.f388542o) && n51.f.a(this.f388543p, vt6Var.f388543p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.vt6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388539i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388534d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f388535e);
            fVar.e(3, this.f388536f);
            com.tencent.mm.protobuf.g gVar = this.f388537g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.a(5, this.f388538h);
            fVar.g(6, 1, linkedList);
            java.lang.String str2 = this.f388540m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f388541n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f388542o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f388543p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f388534d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f388535e) + b36.f.e(3, this.f388536f);
            com.tencent.mm.protobuf.g gVar2 = this.f388537g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            int a17 = j17 + b36.f.a(5, this.f388538h) + b36.f.g(6, 1, linkedList);
            java.lang.String str7 = this.f388540m;
            if (str7 != null) {
                a17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f388541n;
            if (str8 != null) {
                a17 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f388542o;
            if (str9 != null) {
                a17 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f388543p;
            return str10 != null ? a17 + b36.f.j(10, str10) : a17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f388534d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f388535e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f388536f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f388537g = aVar2.d(intValue);
                return 0;
            case 5:
                this.f388538h = aVar2.c(intValue);
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 7:
                this.f388540m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f388541n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f388542o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f388543p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
