package r45;

/* loaded from: classes10.dex */
public class x84 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public long f389866e;

    /* renamed from: f, reason: collision with root package name */
    public int f389867f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389868g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389869h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ia4 f389870i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389871m;

    /* renamed from: o, reason: collision with root package name */
    public long f389873o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f389865d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f389872n = 1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x84)) {
            return false;
        }
        r45.x84 x84Var = (r45.x84) fVar;
        return n51.f.a(this.f389865d, x84Var.f389865d) && n51.f.a(java.lang.Long.valueOf(this.f389866e), java.lang.Long.valueOf(x84Var.f389866e)) && n51.f.a(java.lang.Integer.valueOf(this.f389867f), java.lang.Integer.valueOf(x84Var.f389867f)) && n51.f.a(this.f389868g, x84Var.f389868g) && n51.f.a(this.f389869h, x84Var.f389869h) && n51.f.a(this.f389870i, x84Var.f389870i) && n51.f.a(this.f389871m, x84Var.f389871m) && n51.f.a(java.lang.Integer.valueOf(this.f389872n), java.lang.Integer.valueOf(x84Var.f389872n)) && n51.f.a(java.lang.Long.valueOf(this.f389873o), java.lang.Long.valueOf(x84Var.f389873o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389865d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.h(2, this.f389866e);
            fVar.e(3, this.f389867f);
            java.lang.String str = this.f389868g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f389869h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.ia4 ia4Var = this.f389870i;
            if (ia4Var != null) {
                fVar.i(6, ia4Var.computeSize());
                this.f389870i.writeFields(fVar);
            }
            java.lang.String str3 = this.f389871m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f389872n);
            fVar.h(100, this.f389873o);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.h(2, this.f389866e) + b36.f.e(3, this.f389867f);
            java.lang.String str4 = this.f389868g;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f389869h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            r45.ia4 ia4Var2 = this.f389870i;
            if (ia4Var2 != null) {
                g17 += b36.f.i(6, ia4Var2.computeSize());
            }
            java.lang.String str6 = this.f389871m;
            if (str6 != null) {
                g17 += b36.f.j(7, str6);
            }
            return g17 + b36.f.e(8, this.f389872n) + b36.f.h(100, this.f389873o);
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
        r45.x84 x84Var = (r45.x84) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            x84Var.f389873o = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.w84 w84Var = new r45.w84();
                    if (bArr2 != null && bArr2.length > 0) {
                        w84Var.parseFrom(bArr2);
                    }
                    x84Var.f389865d.add(w84Var);
                }
                return 0;
            case 2:
                x84Var.f389866e = aVar2.i(intValue);
                return 0;
            case 3:
                x84Var.f389867f = aVar2.g(intValue);
                return 0;
            case 4:
                x84Var.f389868g = aVar2.k(intValue);
                return 0;
            case 5:
                x84Var.f389869h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ia4 ia4Var3 = new r45.ia4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ia4Var3.parseFrom(bArr3);
                    }
                    x84Var.f389870i = ia4Var3;
                }
                return 0;
            case 7:
                x84Var.f389871m = aVar2.k(intValue);
                return 0;
            case 8:
                x84Var.f389872n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
