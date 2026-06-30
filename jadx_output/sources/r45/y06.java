package r45;

/* loaded from: classes11.dex */
public class y06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390686d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390687e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390688f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y06)) {
            return false;
        }
        r45.y06 y06Var = (r45.y06) fVar;
        return n51.f.a(this.f390686d, y06Var.f390686d) && n51.f.a(this.f390687e, y06Var.f390687e) && n51.f.a(this.f390688f, y06Var.f390688f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390686d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390687e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390688f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390686d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f390687e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f390688f;
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
        r45.y06 y06Var = (r45.y06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y06Var.f390686d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            y06Var.f390687e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        y06Var.f390688f = aVar2.k(intValue);
        return 0;
    }
}
