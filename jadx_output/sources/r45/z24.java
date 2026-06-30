package r45;

/* loaded from: classes7.dex */
public class z24 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391634d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391635e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391636f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f391637g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z24)) {
            return false;
        }
        r45.z24 z24Var = (r45.z24) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391634d), java.lang.Integer.valueOf(z24Var.f391634d)) && n51.f.a(this.f391635e, z24Var.f391635e) && n51.f.a(this.f391636f, z24Var.f391636f) && n51.f.a(this.f391637g, z24Var.f391637g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391637g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391634d);
            java.lang.String str = this.f391635e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391636f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391634d) + 0;
            java.lang.String str3 = this.f391635e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f391636f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.g(4, 8, linkedList);
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
        r45.z24 z24Var = (r45.z24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z24Var.f391634d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            z24Var.f391635e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z24Var.f391636f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.cw3 cw3Var = new r45.cw3();
            if (bArr2 != null && bArr2.length > 0) {
                cw3Var.parseFrom(bArr2);
            }
            z24Var.f391637g.add(cw3Var);
        }
        return 0;
    }
}
