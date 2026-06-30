package r45;

/* loaded from: classes8.dex */
public class ek0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f373575d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373576e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f373577f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ek0)) {
            return false;
        }
        r45.ek0 ek0Var = (r45.ek0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f373575d), java.lang.Long.valueOf(ek0Var.f373575d)) && n51.f.a(this.f373576e, ek0Var.f373576e) && n51.f.a(this.f373577f, ek0Var.f373577f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373577f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f373575d);
            java.lang.String str = this.f373576e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f373575d) + 0;
            java.lang.String str2 = this.f373576e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 8, linkedList);
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
        r45.ek0 ek0Var = (r45.ek0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ek0Var.f373575d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ek0Var.f373576e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.dk0 dk0Var = new r45.dk0();
            if (bArr2 != null && bArr2.length > 0) {
                dk0Var.parseFrom(bArr2);
            }
            ek0Var.f373577f.add(dk0Var);
        }
        return 0;
    }
}
