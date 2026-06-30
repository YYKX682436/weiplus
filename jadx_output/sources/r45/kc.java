package r45;

/* loaded from: classes9.dex */
public class kc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378580d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378581e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f378582f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kc)) {
            return false;
        }
        r45.kc kcVar = (r45.kc) fVar;
        return n51.f.a(this.f378580d, kcVar.f378580d) && n51.f.a(this.f378581e, kcVar.f378581e) && n51.f.a(this.f378582f, kcVar.f378582f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378582f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378580d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378581e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f378580d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f378581e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, linkedList);
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
        r45.kc kcVar = (r45.kc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kcVar.f378580d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kcVar.f378581e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.jc jcVar = new r45.jc();
            if (bArr2 != null && bArr2.length > 0) {
                jcVar.parseFrom(bArr2);
            }
            kcVar.f378582f.add(jcVar);
        }
        return 0;
    }
}
