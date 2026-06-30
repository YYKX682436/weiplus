package r45;

/* loaded from: classes7.dex */
public class p20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382676d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382677e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382678f;

    /* renamed from: g, reason: collision with root package name */
    public long f382679g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p20)) {
            return false;
        }
        r45.p20 p20Var = (r45.p20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382676d), java.lang.Integer.valueOf(p20Var.f382676d)) && n51.f.a(this.f382677e, p20Var.f382677e) && n51.f.a(this.f382678f, p20Var.f382678f) && n51.f.a(java.lang.Long.valueOf(this.f382679g), java.lang.Long.valueOf(p20Var.f382679g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382677e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382676d);
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f382678f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f382679g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382676d) + 0 + b36.f.g(2, 1, linkedList);
            java.lang.String str2 = this.f382678f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.h(4, this.f382679g);
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
        r45.p20 p20Var = (r45.p20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p20Var.f382676d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p20Var.f382677e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            p20Var.f382678f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        p20Var.f382679g = aVar2.i(intValue);
        return 0;
    }
}
