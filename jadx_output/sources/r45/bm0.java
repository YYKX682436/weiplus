package r45;

/* loaded from: classes7.dex */
public class bm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370867f;

    /* renamed from: g, reason: collision with root package name */
    public long f370868g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm0)) {
            return false;
        }
        r45.bm0 bm0Var = (r45.bm0) fVar;
        return n51.f.a(this.f370865d, bm0Var.f370865d) && n51.f.a(this.f370866e, bm0Var.f370866e) && n51.f.a(this.f370867f, bm0Var.f370867f) && n51.f.a(java.lang.Long.valueOf(this.f370868g), java.lang.Long.valueOf(bm0Var.f370868g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370865d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370866e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370867f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f370868g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f370865d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f370866e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f370867f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f370868g);
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
        r45.bm0 bm0Var = (r45.bm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bm0Var.f370865d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bm0Var.f370866e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bm0Var.f370867f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        bm0Var.f370868g = aVar2.i(intValue);
        return 0;
    }
}
