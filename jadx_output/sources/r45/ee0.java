package r45;

/* loaded from: classes9.dex */
public class ee0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373353d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373354e;

    /* renamed from: f, reason: collision with root package name */
    public int f373355f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f373356g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee0)) {
            return false;
        }
        r45.ee0 ee0Var = (r45.ee0) fVar;
        return n51.f.a(this.f373353d, ee0Var.f373353d) && n51.f.a(this.f373354e, ee0Var.f373354e) && n51.f.a(java.lang.Integer.valueOf(this.f373355f), java.lang.Integer.valueOf(ee0Var.f373355f)) && n51.f.a(this.f373356g, ee0Var.f373356g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373353d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373354e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f373355f);
            fVar.g(4, 8, this.f373356g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f373353d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f373354e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f373355f) + b36.f.g(4, 8, this.f373356g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373356g.clear();
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
        r45.ee0 ee0Var = (r45.ee0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ee0Var.f373353d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ee0Var.f373354e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ee0Var.f373355f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.w50 w50Var = new r45.w50();
            if (bArr2 != null && bArr2.length > 0) {
                w50Var.parseFrom(bArr2);
            }
            ee0Var.f373356g.add(w50Var);
        }
        return 0;
    }
}
