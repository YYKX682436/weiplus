package r45;

/* loaded from: classes10.dex */
public class vl4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388345d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388346e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388347f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388348g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388349h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vl4)) {
            return false;
        }
        r45.vl4 vl4Var = (r45.vl4) fVar;
        return n51.f.a(this.f388345d, vl4Var.f388345d) && n51.f.a(this.f388346e, vl4Var.f388346e) && n51.f.a(this.f388347f, vl4Var.f388347f) && n51.f.a(this.f388348g, vl4Var.f388348g) && n51.f.a(this.f388349h, vl4Var.f388349h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388345d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388346e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388347f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f388348g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f388349h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f388345d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f388346e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f388347f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f388348g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388349h;
            return gVar2 != null ? j17 + b36.f.b(5, gVar2) : j17;
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
        r45.vl4 vl4Var = (r45.vl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vl4Var.f388345d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vl4Var.f388346e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            vl4Var.f388347f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            vl4Var.f388348g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        vl4Var.f388349h = aVar2.d(intValue);
        return 0;
    }
}
