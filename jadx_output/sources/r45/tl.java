package r45;

/* loaded from: classes2.dex */
public class tl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386540d;

    /* renamed from: e, reason: collision with root package name */
    public int f386541e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tl)) {
            return false;
        }
        r45.tl tlVar = (r45.tl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386540d), java.lang.Integer.valueOf(tlVar.f386540d)) && n51.f.a(java.lang.Integer.valueOf(this.f386541e), java.lang.Integer.valueOf(tlVar.f386541e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386540d);
            fVar.e(2, this.f386541e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f386540d) + 0 + b36.f.e(2, this.f386541e);
        }
        if (i17 == 2) {
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
        r45.tl tlVar = (r45.tl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tlVar.f386540d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        tlVar.f386541e = aVar2.g(intValue);
        return 0;
    }
}
