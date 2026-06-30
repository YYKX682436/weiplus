package r45;

/* loaded from: classes2.dex */
public class og4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382236e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f382237f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382238g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382241m;

    /* renamed from: n, reason: collision with root package name */
    public int f382242n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f382243o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.og4)) {
            return false;
        }
        r45.og4 og4Var = (r45.og4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382235d), java.lang.Integer.valueOf(og4Var.f382235d)) && n51.f.a(this.f382236e, og4Var.f382236e) && n51.f.a(this.f382237f, og4Var.f382237f) && n51.f.a(this.f382238g, og4Var.f382238g) && n51.f.a(this.f382239h, og4Var.f382239h) && n51.f.a(this.f382240i, og4Var.f382240i) && n51.f.a(this.f382241m, og4Var.f382241m) && n51.f.a(java.lang.Integer.valueOf(this.f382242n), java.lang.Integer.valueOf(og4Var.f382242n)) && n51.f.a(java.lang.Boolean.valueOf(this.f382243o), java.lang.Boolean.valueOf(og4Var.f382243o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382237f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382235d);
            java.lang.String str = this.f382236e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f382238g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f382239h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str3 = this.f382240i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f382241m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f382242n);
            fVar.a(9, this.f382243o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382235d) + 0;
            java.lang.String str5 = this.f382236e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            java.lang.String str6 = this.f382238g;
            if (str6 != null) {
                g17 += b36.f.j(4, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f382239h;
            if (gVar2 != null) {
                g17 += b36.f.b(5, gVar2);
            }
            java.lang.String str7 = this.f382240i;
            if (str7 != null) {
                g17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f382241m;
            if (str8 != null) {
                g17 += b36.f.j(7, str8);
            }
            return g17 + b36.f.e(8, this.f382242n) + b36.f.a(9, this.f382243o);
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
        r45.og4 og4Var = (r45.og4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                og4Var.f382235d = aVar2.g(intValue);
                return 0;
            case 2:
                og4Var.f382236e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.kv6 kv6Var = new r45.kv6();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv6Var.parseFrom(bArr2);
                    }
                    og4Var.f382237f.add(kv6Var);
                }
                return 0;
            case 4:
                og4Var.f382238g = aVar2.k(intValue);
                return 0;
            case 5:
                og4Var.f382239h = aVar2.d(intValue);
                return 0;
            case 6:
                og4Var.f382240i = aVar2.k(intValue);
                return 0;
            case 7:
                og4Var.f382241m = aVar2.k(intValue);
                return 0;
            case 8:
                og4Var.f382242n = aVar2.g(intValue);
                return 0;
            case 9:
                og4Var.f382243o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
