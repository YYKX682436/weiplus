package r45;

/* loaded from: classes4.dex */
public class y60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390819e;

    /* renamed from: f, reason: collision with root package name */
    public long f390820f;

    /* renamed from: g, reason: collision with root package name */
    public int f390821g;

    /* renamed from: h, reason: collision with root package name */
    public int f390822h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f390823i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y60)) {
            return false;
        }
        r45.y60 y60Var = (r45.y60) fVar;
        return n51.f.a(this.f390818d, y60Var.f390818d) && n51.f.a(this.f390819e, y60Var.f390819e) && n51.f.a(java.lang.Long.valueOf(this.f390820f), java.lang.Long.valueOf(y60Var.f390820f)) && n51.f.a(java.lang.Integer.valueOf(this.f390821g), java.lang.Integer.valueOf(y60Var.f390821g)) && n51.f.a(java.lang.Integer.valueOf(this.f390822h), java.lang.Integer.valueOf(y60Var.f390822h)) && n51.f.a(this.f390823i, y60Var.f390823i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390823i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390818d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390819e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f390820f);
            fVar.e(4, this.f390821g);
            fVar.e(5, this.f390822h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f390818d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f390819e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f390820f) + b36.f.e(4, this.f390821g) + b36.f.e(5, this.f390822h) + b36.f.g(6, 8, linkedList);
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
        r45.y60 y60Var = (r45.y60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y60Var.f390818d = aVar2.k(intValue);
                return 0;
            case 2:
                y60Var.f390819e = aVar2.k(intValue);
                return 0;
            case 3:
                y60Var.f390820f = aVar2.i(intValue);
                return 0;
            case 4:
                y60Var.f390821g = aVar2.g(intValue);
                return 0;
            case 5:
                y60Var.f390822h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.a70 a70Var = new r45.a70();
                    if (bArr2 != null && bArr2.length > 0) {
                        a70Var.parseFrom(bArr2);
                    }
                    y60Var.f390823i.add(a70Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
