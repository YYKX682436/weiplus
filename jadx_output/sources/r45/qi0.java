package r45;

/* loaded from: classes9.dex */
public class qi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f384011d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f384012e;

    /* renamed from: f, reason: collision with root package name */
    public int f384013f;

    static {
        new r45.qi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.qi0 parseFrom(byte[] bArr) {
        return (r45.qi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi0)) {
            return false;
        }
        r45.qi0 qi0Var = (r45.qi0) fVar;
        return n51.f.a(this.f384011d, qi0Var.f384011d) && n51.f.a(java.lang.Integer.valueOf(this.f384012e), java.lang.Integer.valueOf(qi0Var.f384012e)) && n51.f.a(java.lang.Integer.valueOf(this.f384013f), java.lang.Integer.valueOf(qi0Var.f384013f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.qi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384011d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            fVar.e(2, this.f384012e);
            fVar.e(3, this.f384013f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList) + 0 + b36.f.e(2, this.f384012e) + b36.f.e(3, this.f384013f);
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
            linkedList.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            this.f384012e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f384013f = aVar2.g(intValue);
        return 0;
    }
}
