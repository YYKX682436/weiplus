package r45;

/* loaded from: classes4.dex */
public class uh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387375d;

    /* renamed from: e, reason: collision with root package name */
    public int f387376e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387377f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uh0)) {
            return false;
        }
        r45.uh0 uh0Var = (r45.uh0) fVar;
        return n51.f.a(this.f387375d, uh0Var.f387375d) && n51.f.a(java.lang.Integer.valueOf(this.f387376e), java.lang.Integer.valueOf(uh0Var.f387376e)) && n51.f.a(this.f387377f, uh0Var.f387377f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387377f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387375d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f387376e);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f387375d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f387376e) + b36.f.g(3, 1, linkedList);
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
        r45.uh0 uh0Var = (r45.uh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uh0Var.f387375d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            uh0Var.f387376e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        uh0Var.f387377f.add(aVar2.k(intValue));
        return 0;
    }
}
