package r45;

/* loaded from: classes11.dex */
public class ma extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380289d;

    /* renamed from: e, reason: collision with root package name */
    public int f380290e;

    /* renamed from: f, reason: collision with root package name */
    public int f380291f;

    /* renamed from: g, reason: collision with root package name */
    public int f380292g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ma)) {
            return false;
        }
        r45.ma maVar = (r45.ma) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380289d), java.lang.Integer.valueOf(maVar.f380289d)) && n51.f.a(java.lang.Integer.valueOf(this.f380290e), java.lang.Integer.valueOf(maVar.f380290e)) && n51.f.a(java.lang.Integer.valueOf(this.f380291f), java.lang.Integer.valueOf(maVar.f380291f)) && n51.f.a(java.lang.Integer.valueOf(this.f380292g), java.lang.Integer.valueOf(maVar.f380292g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380289d);
            fVar.e(2, this.f380290e);
            fVar.e(3, this.f380291f);
            fVar.e(4, this.f380292g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f380289d) + 0 + b36.f.e(2, this.f380290e) + b36.f.e(3, this.f380291f) + b36.f.e(4, this.f380292g);
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
        r45.ma maVar = (r45.ma) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            maVar.f380289d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            maVar.f380290e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            maVar.f380291f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        maVar.f380292g = aVar2.g(intValue);
        return 0;
    }
}
