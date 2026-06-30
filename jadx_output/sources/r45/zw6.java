package r45;

/* loaded from: classes11.dex */
public class zw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f392445d;

    /* renamed from: e, reason: collision with root package name */
    public int f392446e;

    /* renamed from: f, reason: collision with root package name */
    public int f392447f;

    /* renamed from: g, reason: collision with root package name */
    public int f392448g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zw6)) {
            return false;
        }
        r45.zw6 zw6Var = (r45.zw6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f392445d), java.lang.Integer.valueOf(zw6Var.f392445d)) && n51.f.a(java.lang.Integer.valueOf(this.f392446e), java.lang.Integer.valueOf(zw6Var.f392446e)) && n51.f.a(java.lang.Integer.valueOf(this.f392447f), java.lang.Integer.valueOf(zw6Var.f392447f)) && n51.f.a(java.lang.Integer.valueOf(this.f392448g), java.lang.Integer.valueOf(zw6Var.f392448g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f392445d);
            fVar.e(2, this.f392446e);
            fVar.e(3, this.f392447f);
            fVar.e(4, this.f392448g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f392445d) + 0 + b36.f.e(2, this.f392446e) + b36.f.e(3, this.f392447f) + b36.f.e(4, this.f392448g);
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
        r45.zw6 zw6Var = (r45.zw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zw6Var.f392445d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            zw6Var.f392446e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            zw6Var.f392447f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zw6Var.f392448g = aVar2.g(intValue);
        return 0;
    }
}
