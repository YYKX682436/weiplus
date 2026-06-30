package m53;

/* loaded from: classes2.dex */
public class n3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323926d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323927e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323928f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.n3)) {
            return false;
        }
        m53.n3 n3Var = (m53.n3) fVar;
        return n51.f.a(this.f323926d, n3Var.f323926d) && n51.f.a(this.f323927e, n3Var.f323927e) && n51.f.a(this.f323928f, n3Var.f323928f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323927e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323926d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f323928f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f323926d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str4 = this.f323928f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        m53.n3 n3Var = (m53.n3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n3Var.f323926d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            n3Var.f323928f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.y3 y3Var = new m53.y3();
            if (bArr2 != null && bArr2.length > 0) {
                y3Var.parseFrom(bArr2);
            }
            n3Var.f323927e.add(y3Var);
        }
        return 0;
    }
}
