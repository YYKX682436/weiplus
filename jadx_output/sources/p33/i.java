package p33;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351588d;

    /* renamed from: e, reason: collision with root package name */
    public int f351589e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f351590f;

    /* renamed from: g, reason: collision with root package name */
    public int f351591g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.i)) {
            return false;
        }
        p33.i iVar = (p33.i) fVar;
        return n51.f.a(this.f351588d, iVar.f351588d) && n51.f.a(java.lang.Integer.valueOf(this.f351589e), java.lang.Integer.valueOf(iVar.f351589e)) && n51.f.a(java.lang.Boolean.valueOf(this.f351590f), java.lang.Boolean.valueOf(iVar.f351590f)) && n51.f.a(java.lang.Integer.valueOf(this.f351591g), java.lang.Integer.valueOf(iVar.f351591g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351588d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f351589e);
            fVar.a(3, this.f351590f);
            fVar.e(4, this.f351591g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f351588d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f351589e) + b36.f.a(3, this.f351590f) + b36.f.e(4, this.f351591g);
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
        p33.i iVar = (p33.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f351588d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f351589e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f351590f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        iVar.f351591g = aVar2.g(intValue);
        return 0;
    }
}
