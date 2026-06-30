package r45;

/* loaded from: classes4.dex */
public class ms0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380788e;

    /* renamed from: f, reason: collision with root package name */
    public int f380789f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f380790g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ms0)) {
            return false;
        }
        r45.ms0 ms0Var = (r45.ms0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380787d), java.lang.Integer.valueOf(ms0Var.f380787d)) && n51.f.a(this.f380788e, ms0Var.f380788e) && n51.f.a(java.lang.Integer.valueOf(this.f380789f), java.lang.Integer.valueOf(ms0Var.f380789f)) && n51.f.a(this.f380790g, ms0Var.f380790g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380790g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380787d);
            java.lang.String str = this.f380788e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380789f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380787d) + 0;
            java.lang.String str2 = this.f380788e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f380789f) + b36.f.g(4, 8, linkedList);
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
        r45.ms0 ms0Var = (r45.ms0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ms0Var.f380787d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ms0Var.f380788e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ms0Var.f380789f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ks0 ks0Var = new r45.ks0();
            if (bArr2 != null && bArr2.length > 0) {
                ks0Var.parseFrom(bArr2);
            }
            ms0Var.f380790g.add(ks0Var);
        }
        return 0;
    }
}
