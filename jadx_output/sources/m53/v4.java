package m53;

/* loaded from: classes8.dex */
public class v4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324126d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f324127e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324128f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324129g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.v4)) {
            return false;
        }
        m53.v4 v4Var = (m53.v4) fVar;
        return n51.f.a(this.f324126d, v4Var.f324126d) && n51.f.a(this.f324127e, v4Var.f324127e) && n51.f.a(this.f324128f, v4Var.f324128f) && n51.f.a(this.f324129g, v4Var.f324129g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324127e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324126d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f324128f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f324129g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f324126d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f324128f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f324129g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
        m53.v4 v4Var = (m53.v4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v4Var.f324126d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                v4Var.f324128f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            v4Var.f324129g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.i1 i1Var = new m53.i1();
            if (bArr2 != null && bArr2.length > 0) {
                i1Var.parseFrom(bArr2);
            }
            v4Var.f324127e.add(i1Var);
        }
        return 0;
    }
}
