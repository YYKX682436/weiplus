package r45;

/* loaded from: classes11.dex */
public class e35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372968d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372969e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372970f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f372971g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e35)) {
            return false;
        }
        r45.e35 e35Var = (r45.e35) fVar;
        return n51.f.a(this.f372968d, e35Var.f372968d) && n51.f.a(this.f372969e, e35Var.f372969e) && n51.f.a(this.f372970f, e35Var.f372970f) && n51.f.a(this.f372971g, e35Var.f372971g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372971g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372968d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372969e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372970f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372968d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f372969e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f372970f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 1, linkedList);
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
        r45.e35 e35Var = (r45.e35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e35Var.f372968d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e35Var.f372969e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e35Var.f372970f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e35Var.f372971g.add(aVar2.k(intValue));
        return 0;
    }
}
