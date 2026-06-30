package xq3;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456087d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456088e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456089f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.h)) {
            return false;
        }
        xq3.h hVar = (xq3.h) fVar;
        return n51.f.a(this.f456087d, hVar.f456087d) && n51.f.a(this.f456088e, hVar.f456088e) && n51.f.a(java.lang.Boolean.valueOf(this.f456089f), java.lang.Boolean.valueOf(hVar.f456089f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456087d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456088e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f456089f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456087d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f456088e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f456089f);
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
        xq3.h hVar = (xq3.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hVar.f456087d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hVar.f456088e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hVar.f456089f = aVar2.c(intValue);
        return 0;
    }
}
