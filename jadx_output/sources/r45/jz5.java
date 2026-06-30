package r45;

/* loaded from: classes4.dex */
public class jz5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378230d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378231e;

    /* renamed from: f, reason: collision with root package name */
    public int f378232f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f378233g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jz5)) {
            return false;
        }
        r45.jz5 jz5Var = (r45.jz5) fVar;
        return n51.f.a(this.f378230d, jz5Var.f378230d) && n51.f.a(this.f378231e, jz5Var.f378231e) && n51.f.a(java.lang.Integer.valueOf(this.f378232f), java.lang.Integer.valueOf(jz5Var.f378232f)) && n51.f.a(this.f378233g, jz5Var.f378233g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378233g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378230d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378231e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f378232f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f378230d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f378231e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f378232f) + b36.f.g(4, 8, linkedList);
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
        r45.jz5 jz5Var = (r45.jz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jz5Var.f378230d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jz5Var.f378231e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            jz5Var.f378232f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.lk5 lk5Var = new r45.lk5();
            if (bArr2 != null && bArr2.length > 0) {
                lk5Var.parseFrom(bArr2);
            }
            jz5Var.f378233g.add(lk5Var);
        }
        return 0;
    }
}
