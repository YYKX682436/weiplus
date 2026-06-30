package r45;

/* loaded from: classes9.dex */
public class gf5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f375198d;

    /* renamed from: e, reason: collision with root package name */
    public long f375199e;

    /* renamed from: f, reason: collision with root package name */
    public r45.na5 f375200f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f375201g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gf5)) {
            return false;
        }
        r45.gf5 gf5Var = (r45.gf5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f375198d), java.lang.Long.valueOf(gf5Var.f375198d)) && n51.f.a(java.lang.Long.valueOf(this.f375199e), java.lang.Long.valueOf(gf5Var.f375199e)) && n51.f.a(this.f375200f, gf5Var.f375200f) && n51.f.a(this.f375201g, gf5Var.f375201g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375201g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f375198d);
            fVar.h(2, this.f375199e);
            r45.na5 na5Var = this.f375200f;
            if (na5Var != null) {
                fVar.i(3, na5Var.computeSize());
                this.f375200f.writeFields(fVar);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f375198d) + 0 + b36.f.h(2, this.f375199e);
            r45.na5 na5Var2 = this.f375200f;
            if (na5Var2 != null) {
                h17 += b36.f.i(3, na5Var2.computeSize());
            }
            return h17 + b36.f.g(4, 1, linkedList);
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
        r45.gf5 gf5Var = (r45.gf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gf5Var.f375198d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            gf5Var.f375199e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            gf5Var.f375201g.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.na5 na5Var3 = new r45.na5();
            if (bArr2 != null && bArr2.length > 0) {
                na5Var3.parseFrom(bArr2);
            }
            gf5Var.f375200f = na5Var3;
        }
        return 0;
    }
}
