package r45;

/* loaded from: classes9.dex */
public class p70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f382810d;

    /* renamed from: e, reason: collision with root package name */
    public long f382811e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f382812f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p70)) {
            return false;
        }
        r45.p70 p70Var = (r45.p70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f382810d), java.lang.Long.valueOf(p70Var.f382810d)) && n51.f.a(java.lang.Long.valueOf(this.f382811e), java.lang.Long.valueOf(p70Var.f382811e)) && n51.f.a(this.f382812f, p70Var.f382812f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382812f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f382810d);
            fVar.h(2, this.f382811e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f382810d) + 0 + b36.f.h(2, this.f382811e) + b36.f.g(3, 8, linkedList);
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
        r45.p70 p70Var = (r45.p70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p70Var.f382810d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            p70Var.f382811e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.o70 o70Var = new r45.o70();
            if (bArr2 != null && bArr2.length > 0) {
                o70Var.parseFrom(bArr2);
            }
            p70Var.f382812f.add(o70Var);
        }
        return 0;
    }
}
