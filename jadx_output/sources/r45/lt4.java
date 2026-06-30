package r45;

/* loaded from: classes2.dex */
public class lt4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379817d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f379818e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379819f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lt4)) {
            return false;
        }
        r45.lt4 lt4Var = (r45.lt4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379817d), java.lang.Integer.valueOf(lt4Var.f379817d)) && n51.f.a(this.f379818e, lt4Var.f379818e) && n51.f.a(this.f379819f, lt4Var.f379819f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379818e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379817d);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f379819f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379817d) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f379819f;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.lt4 lt4Var = (r45.lt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lt4Var.f379817d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 4) {
                return -1;
            }
            lt4Var.f379819f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ms2 ms2Var = new r45.ms2();
            if (bArr2 != null && bArr2.length > 0) {
                ms2Var.parseFrom(bArr2);
            }
            lt4Var.f379818e.add(ms2Var);
        }
        return 0;
    }
}
