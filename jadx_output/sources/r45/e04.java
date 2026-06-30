package r45;

/* loaded from: classes4.dex */
public class e04 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372890d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372891e;

    /* renamed from: f, reason: collision with root package name */
    public int f372892f;

    /* renamed from: g, reason: collision with root package name */
    public int f372893g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372894h;

    /* renamed from: i, reason: collision with root package name */
    public long f372895i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e04)) {
            return false;
        }
        r45.e04 e04Var = (r45.e04) fVar;
        return n51.f.a(this.f372890d, e04Var.f372890d) && n51.f.a(this.f372891e, e04Var.f372891e) && n51.f.a(java.lang.Integer.valueOf(this.f372892f), java.lang.Integer.valueOf(e04Var.f372892f)) && n51.f.a(java.lang.Integer.valueOf(this.f372893g), java.lang.Integer.valueOf(e04Var.f372893g)) && n51.f.a(this.f372894h, e04Var.f372894h) && n51.f.a(java.lang.Long.valueOf(this.f372895i), java.lang.Long.valueOf(e04Var.f372895i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372890d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372891e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372892f);
            fVar.e(4, this.f372893g);
            java.lang.String str3 = this.f372894h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(99, this.f372895i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372890d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f372891e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f372892f) + b36.f.e(4, this.f372893g);
            java.lang.String str6 = this.f372894h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.h(99, this.f372895i);
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
        r45.e04 e04Var = (r45.e04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e04Var.f372890d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e04Var.f372891e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e04Var.f372892f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            e04Var.f372893g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            e04Var.f372894h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 99) {
            return -1;
        }
        e04Var.f372895i = aVar2.i(intValue);
        return 0;
    }
}
