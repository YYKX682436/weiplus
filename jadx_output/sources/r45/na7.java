package r45;

/* loaded from: classes8.dex */
public class na7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381213e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381214f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381216h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381217i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.na7)) {
            return false;
        }
        r45.na7 na7Var = (r45.na7) fVar;
        return n51.f.a(this.f381212d, na7Var.f381212d) && n51.f.a(this.f381213e, na7Var.f381213e) && n51.f.a(this.f381214f, na7Var.f381214f) && n51.f.a(this.f381215g, na7Var.f381215g) && n51.f.a(this.f381216h, na7Var.f381216h) && n51.f.a(this.f381217i, na7Var.f381217i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381212d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381213e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381214f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381215g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381216h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f381217i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f381212d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f381213e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f381214f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f381215g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f381216h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f381217i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.na7 na7Var = (r45.na7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                na7Var.f381212d = aVar2.k(intValue);
                return 0;
            case 2:
                na7Var.f381213e = aVar2.k(intValue);
                return 0;
            case 3:
                na7Var.f381214f = aVar2.k(intValue);
                return 0;
            case 4:
                na7Var.f381215g = aVar2.k(intValue);
                return 0;
            case 5:
                na7Var.f381216h = aVar2.k(intValue);
                return 0;
            case 6:
                na7Var.f381217i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
