package r45;

/* loaded from: classes11.dex */
public class kk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378774e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378775f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378776g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kk0)) {
            return false;
        }
        r45.kk0 kk0Var = (r45.kk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378773d), java.lang.Integer.valueOf(kk0Var.f378773d)) && n51.f.a(this.f378774e, kk0Var.f378774e) && n51.f.a(this.f378775f, kk0Var.f378775f) && n51.f.a(this.f378776g, kk0Var.f378776g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378773d);
            java.lang.String str = this.f378774e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378775f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378776g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378773d) + 0;
            java.lang.String str4 = this.f378774e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f378775f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f378776g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.kk0 kk0Var = (r45.kk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kk0Var.f378773d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            kk0Var.f378774e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            kk0Var.f378775f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        kk0Var.f378776g = aVar2.k(intValue);
        return 0;
    }
}
