package r45;

/* loaded from: classes4.dex */
public class ul4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387457d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387458e;

    /* renamed from: f, reason: collision with root package name */
    public int f387459f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387460g;

    /* renamed from: h, reason: collision with root package name */
    public int f387461h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f387462i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ul4)) {
            return false;
        }
        r45.ul4 ul4Var = (r45.ul4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387457d), java.lang.Integer.valueOf(ul4Var.f387457d)) && n51.f.a(this.f387458e, ul4Var.f387458e) && n51.f.a(java.lang.Integer.valueOf(this.f387459f), java.lang.Integer.valueOf(ul4Var.f387459f)) && n51.f.a(this.f387460g, ul4Var.f387460g) && n51.f.a(java.lang.Integer.valueOf(this.f387461h), java.lang.Integer.valueOf(ul4Var.f387461h)) && n51.f.a(this.f387462i, ul4Var.f387462i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387462i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387457d);
            java.lang.String str = this.f387458e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f387459f);
            java.lang.String str2 = this.f387460g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f387461h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387457d) + 0;
            java.lang.String str3 = this.f387458e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f387459f);
            java.lang.String str4 = this.f387460g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            return e18 + b36.f.e(5, this.f387461h) + b36.f.g(6, 8, linkedList);
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
        r45.ul4 ul4Var = (r45.ul4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ul4Var.f387457d = aVar2.g(intValue);
                return 0;
            case 2:
                ul4Var.f387458e = aVar2.k(intValue);
                return 0;
            case 3:
                ul4Var.f387459f = aVar2.g(intValue);
                return 0;
            case 4:
                ul4Var.f387460g = aVar2.k(intValue);
                return 0;
            case 5:
                ul4Var.f387461h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.lm4 lm4Var = new r45.lm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        lm4Var.parseFrom(bArr2);
                    }
                    ul4Var.f387462i.add(lm4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
