package vr4;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f439750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f439751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f439752f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.j)) {
            return false;
        }
        vr4.j jVar = (vr4.j) fVar;
        return n51.f.a(this.f439750d, jVar.f439750d) && n51.f.a(this.f439751e, jVar.f439751e) && n51.f.a(this.f439752f, jVar.f439752f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f439750d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f439751e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f439752f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f439750d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f439751e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f439752f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        vr4.j jVar = (vr4.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jVar.f439750d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jVar.f439751e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        jVar.f439752f = aVar2.k(intValue);
        return 0;
    }
}
