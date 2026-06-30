package r45;

/* loaded from: classes7.dex */
public class in extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377157e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f377158f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in)) {
            return false;
        }
        r45.in inVar = (r45.in) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377156d), java.lang.Integer.valueOf(inVar.f377156d)) && n51.f.a(this.f377157e, inVar.f377157e) && n51.f.a(this.f377158f, inVar.f377158f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377158f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377156d);
            java.lang.String str = this.f377157e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377156d) + 0;
            java.lang.String str2 = this.f377157e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
        r45.in inVar = (r45.in) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            inVar.f377156d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            inVar.f377157e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ch6 ch6Var = new r45.ch6();
            if (bArr2 != null && bArr2.length > 0) {
                ch6Var.parseFrom(bArr2);
            }
            inVar.f377158f.add(ch6Var);
        }
        return 0;
    }
}
