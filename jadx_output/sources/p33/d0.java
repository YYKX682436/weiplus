package p33;

/* loaded from: classes2.dex */
public class d0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351527d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351528e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351529f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f351530g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f351531h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.d0)) {
            return false;
        }
        p33.d0 d0Var = (p33.d0) fVar;
        return n51.f.a(this.f351527d, d0Var.f351527d) && n51.f.a(this.f351528e, d0Var.f351528e) && n51.f.a(this.f351529f, d0Var.f351529f) && n51.f.a(this.f351530g, d0Var.f351530g) && n51.f.a(this.f351531h, d0Var.f351531h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351527d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f351528e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f351529f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f351530g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f351531h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f351527d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f351528e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f351529f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f351530g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f351531h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        p33.d0 d0Var = (p33.d0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d0Var.f351527d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            d0Var.f351528e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            d0Var.f351529f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            d0Var.f351530g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d0Var.f351531h = aVar2.k(intValue);
        return 0;
    }
}
