package r45;

/* loaded from: classes2.dex */
public class nu6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f381689e = new java.util.LinkedList();

    static {
        new r45.nu6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nu6)) {
            return false;
        }
        r45.nu6 nu6Var = (r45.nu6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381688d), java.lang.Integer.valueOf(nu6Var.f381688d)) && n51.f.a(this.f381689e, nu6Var.f381689e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.nu6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381689e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381688d);
            fVar.g(2, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f381688d) + 0 + b36.f.g(2, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f381688d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.nu6) super.parseFrom(bArr);
    }
}
