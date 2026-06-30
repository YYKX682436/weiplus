package r45;

/* loaded from: classes4.dex */
public class o00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381791d;

    /* renamed from: e, reason: collision with root package name */
    public int f381792e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381793f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381794g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f381795h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o00)) {
            return false;
        }
        r45.o00 o00Var = (r45.o00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381791d), java.lang.Integer.valueOf(o00Var.f381791d)) && n51.f.a(java.lang.Integer.valueOf(this.f381792e), java.lang.Integer.valueOf(o00Var.f381792e)) && n51.f.a(this.f381793f, o00Var.f381793f) && n51.f.a(this.f381794g, o00Var.f381794g) && n51.f.a(this.f381795h, o00Var.f381795h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381795h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381791d);
            fVar.e(2, this.f381792e);
            java.lang.String str = this.f381793f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381794g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381791d) + 0 + b36.f.e(2, this.f381792e);
            java.lang.String str3 = this.f381793f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f381794g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.g(5, 8, linkedList);
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
        r45.o00 o00Var = (r45.o00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o00Var.f381791d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            o00Var.f381792e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            o00Var.f381793f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            o00Var.f381794g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.p00 p00Var = new r45.p00();
            if (bArr2 != null && bArr2.length > 0) {
                p00Var.parseFrom(bArr2);
            }
            o00Var.f381795h.add(p00Var);
        }
        return 0;
    }
}
