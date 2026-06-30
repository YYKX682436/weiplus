package r45;

/* loaded from: classes9.dex */
public class qa extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383788d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f383789e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383790f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qa)) {
            return false;
        }
        r45.qa qaVar = (r45.qa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383788d), java.lang.Integer.valueOf(qaVar.f383788d)) && n51.f.a(this.f383789e, qaVar.f383789e) && n51.f.a(this.f383790f, qaVar.f383790f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383788d);
            fVar.g(2, 8, this.f383789e);
            java.lang.String str = this.f383790f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383788d) + 0 + b36.f.g(2, 8, this.f383789e);
            java.lang.String str2 = this.f383790f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383789e.clear();
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
        r45.qa qaVar = (r45.qa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qaVar.f383788d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qaVar.f383790f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.z56 z56Var = new r45.z56();
            if (bArr2 != null && bArr2.length > 0) {
                z56Var.parseFrom(bArr2);
            }
            qaVar.f383789e.add(z56Var);
        }
        return 0;
    }
}
