package r45;

/* loaded from: classes2.dex */
public class y95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390886d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390887e;

    /* renamed from: f, reason: collision with root package name */
    public int f390888f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f390889g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390890h;

    /* renamed from: i, reason: collision with root package name */
    public int f390891i;

    /* renamed from: m, reason: collision with root package name */
    public int f390892m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y95)) {
            return false;
        }
        r45.y95 y95Var = (r45.y95) fVar;
        return n51.f.a(this.f390886d, y95Var.f390886d) && n51.f.a(this.f390887e, y95Var.f390887e) && n51.f.a(java.lang.Integer.valueOf(this.f390888f), java.lang.Integer.valueOf(y95Var.f390888f)) && n51.f.a(this.f390889g, y95Var.f390889g) && n51.f.a(this.f390890h, y95Var.f390890h) && n51.f.a(java.lang.Integer.valueOf(this.f390891i), java.lang.Integer.valueOf(y95Var.f390891i)) && n51.f.a(java.lang.Integer.valueOf(this.f390892m), java.lang.Integer.valueOf(y95Var.f390892m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390889g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390886d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390887e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f390888f);
            fVar.g(4, 8, linkedList);
            java.lang.String str3 = this.f390890h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f390891i);
            fVar.e(7, this.f390892m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390886d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f390887e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f390888f) + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f390890h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f390891i) + b36.f.e(7, this.f390892m);
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
        r45.y95 y95Var = (r45.y95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y95Var.f390886d = aVar2.k(intValue);
                return 0;
            case 2:
                y95Var.f390887e = aVar2.k(intValue);
                return 0;
            case 3:
                y95Var.f390888f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.q95 q95Var = new r45.q95();
                    if (bArr2 != null && bArr2.length > 0) {
                        q95Var.parseFrom(bArr2);
                    }
                    y95Var.f390889g.add(q95Var);
                }
                return 0;
            case 5:
                y95Var.f390890h = aVar2.k(intValue);
                return 0;
            case 6:
                y95Var.f390891i = aVar2.g(intValue);
                return 0;
            case 7:
                y95Var.f390892m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
