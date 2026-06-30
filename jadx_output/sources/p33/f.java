package p33;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351557d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351558e;

    /* renamed from: f, reason: collision with root package name */
    public int f351559f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.f)) {
            return false;
        }
        p33.f fVar2 = (p33.f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351557d), java.lang.Integer.valueOf(fVar2.f351557d)) && n51.f.a(this.f351558e, fVar2.f351558e) && n51.f.a(java.lang.Integer.valueOf(this.f351559f), java.lang.Integer.valueOf(fVar2.f351559f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351557d);
            java.lang.String str = this.f351558e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f351559f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351557d) + 0;
            java.lang.String str2 = this.f351558e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f351559f);
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
        p33.f fVar2 = (p33.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fVar2.f351557d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fVar2.f351558e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        fVar2.f351559f = aVar2.g(intValue);
        return 0;
    }
}
