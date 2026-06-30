package d02;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f225269d;

    /* renamed from: e, reason: collision with root package name */
    public long f225270e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225271f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.a)) {
            return false;
        }
        d02.a aVar = (d02.a) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f225269d), java.lang.Long.valueOf(aVar.f225269d)) && n51.f.a(java.lang.Long.valueOf(this.f225270e), java.lang.Long.valueOf(aVar.f225270e)) && n51.f.a(this.f225271f, aVar.f225271f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f225269d);
            fVar.h(2, this.f225270e);
            java.lang.String str = this.f225271f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f225269d) + 0 + b36.f.h(2, this.f225270e);
            java.lang.String str2 = this.f225271f;
            return str2 != null ? h17 + b36.f.j(3, str2) : h17;
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
        d02.a aVar3 = (d02.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f225269d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f225270e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        aVar3.f225271f = aVar2.k(intValue);
        return 0;
    }
}
