package r45;

/* loaded from: classes8.dex */
public class q24 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383605d;

    /* renamed from: e, reason: collision with root package name */
    public int f383606e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383607f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f383608g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q24)) {
            return false;
        }
        r45.q24 q24Var = (r45.q24) fVar;
        return n51.f.a(this.f383605d, q24Var.f383605d) && n51.f.a(java.lang.Integer.valueOf(this.f383606e), java.lang.Integer.valueOf(q24Var.f383606e)) && n51.f.a(this.f383607f, q24Var.f383607f) && n51.f.a(this.f383608g, q24Var.f383608g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383608g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383605d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f383606e);
            java.lang.String str2 = this.f383607f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383605d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f383606e);
            java.lang.String str4 = this.f383607f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
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
        r45.q24 q24Var = (r45.q24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q24Var.f383605d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            q24Var.f383606e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            q24Var.f383607f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        q24Var.f383608g.add(aVar2.k(intValue));
        return 0;
    }
}
