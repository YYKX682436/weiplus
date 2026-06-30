package r45;

/* loaded from: classes9.dex */
public class if3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376984d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376985e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376986f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376987g;

    /* renamed from: h, reason: collision with root package name */
    public float f376988h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376989i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376990m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376991n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376992o;

    /* renamed from: p, reason: collision with root package name */
    public long f376993p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.if3)) {
            return false;
        }
        r45.if3 if3Var = (r45.if3) fVar;
        return n51.f.a(this.BaseResponse, if3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f376984d), java.lang.Integer.valueOf(if3Var.f376984d)) && n51.f.a(this.f376985e, if3Var.f376985e) && n51.f.a(this.f376986f, if3Var.f376986f) && n51.f.a(this.f376987g, if3Var.f376987g) && n51.f.a(java.lang.Float.valueOf(this.f376988h), java.lang.Float.valueOf(if3Var.f376988h)) && n51.f.a(this.f376989i, if3Var.f376989i) && n51.f.a(this.f376990m, if3Var.f376990m) && n51.f.a(this.f376991n, if3Var.f376991n) && n51.f.a(this.f376992o, if3Var.f376992o) && n51.f.a(java.lang.Long.valueOf(this.f376993p), java.lang.Long.valueOf(if3Var.f376993p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f376984d);
            java.lang.String str = this.f376985e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f376986f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f376987g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.d(6, this.f376988h);
            java.lang.String str4 = this.f376989i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f376990m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f376991n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            com.tencent.mm.protobuf.g gVar = this.f376992o;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            fVar.h(11, this.f376993p);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f376984d);
            java.lang.String str7 = this.f376985e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f376986f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f376987g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int d17 = i18 + b36.f.d(6, this.f376988h);
            java.lang.String str10 = this.f376989i;
            if (str10 != null) {
                d17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f376990m;
            if (str11 != null) {
                d17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f376991n;
            if (str12 != null) {
                d17 += b36.f.j(9, str12);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f376992o;
            if (gVar2 != null) {
                d17 += b36.f.b(10, gVar2);
            }
            return d17 + b36.f.h(11, this.f376993p);
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
        r45.if3 if3Var = (r45.if3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    if3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                if3Var.f376984d = aVar2.g(intValue);
                return 0;
            case 3:
                if3Var.f376985e = aVar2.k(intValue);
                return 0;
            case 4:
                if3Var.f376986f = aVar2.k(intValue);
                return 0;
            case 5:
                if3Var.f376987g = aVar2.k(intValue);
                return 0;
            case 6:
                if3Var.f376988h = aVar2.f(intValue);
                return 0;
            case 7:
                if3Var.f376989i = aVar2.k(intValue);
                return 0;
            case 8:
                if3Var.f376990m = aVar2.k(intValue);
                return 0;
            case 9:
                if3Var.f376991n = aVar2.k(intValue);
                return 0;
            case 10:
                if3Var.f376992o = aVar2.d(intValue);
                return 0;
            case 11:
                if3Var.f376993p = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
