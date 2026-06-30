package r45;

/* loaded from: classes9.dex */
public class p90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f382867d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382868e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382869f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382870g;

    /* renamed from: h, reason: collision with root package name */
    public int f382871h;

    /* renamed from: i, reason: collision with root package name */
    public int f382872i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382873m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p90)) {
            return false;
        }
        r45.p90 p90Var = (r45.p90) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f382867d), java.lang.Boolean.valueOf(p90Var.f382867d)) && n51.f.a(this.f382868e, p90Var.f382868e) && n51.f.a(this.f382869f, p90Var.f382869f) && n51.f.a(this.f382870g, p90Var.f382870g) && n51.f.a(java.lang.Integer.valueOf(this.f382871h), java.lang.Integer.valueOf(p90Var.f382871h)) && n51.f.a(java.lang.Integer.valueOf(this.f382872i), java.lang.Integer.valueOf(p90Var.f382872i)) && n51.f.a(this.f382873m, p90Var.f382873m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382868e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f382867d);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f382869f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f382870g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f382871h);
            fVar.e(6, this.f382872i);
            java.lang.String str3 = this.f382873m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f382867d) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str4 = this.f382869f;
            if (str4 != null) {
                a17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f382870g;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            int e17 = a17 + b36.f.e(5, this.f382871h) + b36.f.e(6, this.f382872i);
            java.lang.String str6 = this.f382873m;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        r45.p90 p90Var = (r45.p90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p90Var.f382867d = aVar2.c(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.fm5 fm5Var = new r45.fm5();
                    if (bArr2 != null && bArr2.length > 0) {
                        fm5Var.parseFrom(bArr2);
                    }
                    p90Var.f382868e.add(fm5Var);
                }
                return 0;
            case 3:
                p90Var.f382869f = aVar2.k(intValue);
                return 0;
            case 4:
                p90Var.f382870g = aVar2.k(intValue);
                return 0;
            case 5:
                p90Var.f382871h = aVar2.g(intValue);
                return 0;
            case 6:
                p90Var.f382872i = aVar2.g(intValue);
                return 0;
            case 7:
                p90Var.f382873m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
