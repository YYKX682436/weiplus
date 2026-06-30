package m53;

/* loaded from: classes2.dex */
public class y2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324204d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f324205e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324207g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.y2)) {
            return false;
        }
        m53.y2 y2Var = (m53.y2) fVar;
        return n51.f.a(this.f324204d, y2Var.f324204d) && n51.f.a(this.f324205e, y2Var.f324205e) && n51.f.a(this.f324206f, y2Var.f324206f) && n51.f.a(this.f324207g, y2Var.f324207g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324205e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324204d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f324206f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f324207g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f324204d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f324206f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f324207g;
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
        m53.y2 y2Var = (m53.y2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y2Var.f324204d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                y2Var.f324206f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            y2Var.f324207g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.z2 z2Var = new m53.z2();
            if (bArr2 != null && bArr2.length > 0) {
                z2Var.parseFrom(bArr2);
            }
            y2Var.f324205e.add(z2Var);
        }
        return 0;
    }
}
