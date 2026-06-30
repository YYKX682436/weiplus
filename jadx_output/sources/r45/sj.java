package r45;

/* loaded from: classes4.dex */
public class sj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385769e;

    /* renamed from: f, reason: collision with root package name */
    public int f385770f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj)) {
            return false;
        }
        r45.sj sjVar = (r45.sj) fVar;
        return n51.f.a(this.f385768d, sjVar.f385768d) && n51.f.a(this.f385769e, sjVar.f385769e) && n51.f.a(java.lang.Integer.valueOf(this.f385770f), java.lang.Integer.valueOf(sjVar.f385770f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385768d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385769e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f385770f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f385768d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f385769e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f385770f);
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
        r45.sj sjVar = (r45.sj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sjVar.f385768d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            sjVar.f385769e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        sjVar.f385770f = aVar2.g(intValue);
        return 0;
    }
}
