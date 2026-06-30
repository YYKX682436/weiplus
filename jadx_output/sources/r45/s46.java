package r45;

/* loaded from: classes7.dex */
public class s46 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f385502d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385503e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385504f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f385505g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s46)) {
            return false;
        }
        r45.s46 s46Var = (r45.s46) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f385502d), java.lang.Long.valueOf(s46Var.f385502d)) && n51.f.a(this.f385503e, s46Var.f385503e) && n51.f.a(this.f385504f, s46Var.f385504f) && n51.f.a(java.lang.Integer.valueOf(this.f385505g), java.lang.Integer.valueOf(s46Var.f385505g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385504f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f385502d);
            java.lang.String str = this.f385503e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            fVar.e(4, this.f385505g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f385502d) + 0;
            java.lang.String str2 = this.f385503e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 1, linkedList) + b36.f.e(4, this.f385505g);
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
        r45.s46 s46Var = (r45.s46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s46Var.f385502d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            s46Var.f385503e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s46Var.f385504f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s46Var.f385505g = aVar2.g(intValue);
        return 0;
    }
}
