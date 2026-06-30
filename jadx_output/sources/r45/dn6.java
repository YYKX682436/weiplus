package r45;

/* loaded from: classes8.dex */
public class dn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372604e;

    /* renamed from: f, reason: collision with root package name */
    public long f372605f;

    /* renamed from: g, reason: collision with root package name */
    public int f372606g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372607h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372608i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372609m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn6)) {
            return false;
        }
        r45.dn6 dn6Var = (r45.dn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372603d), java.lang.Integer.valueOf(dn6Var.f372603d)) && n51.f.a(this.f372604e, dn6Var.f372604e) && n51.f.a(java.lang.Long.valueOf(this.f372605f), java.lang.Long.valueOf(dn6Var.f372605f)) && n51.f.a(java.lang.Integer.valueOf(this.f372606g), java.lang.Integer.valueOf(dn6Var.f372606g)) && n51.f.a(this.f372607h, dn6Var.f372607h) && n51.f.a(this.f372608i, dn6Var.f372608i) && n51.f.a(this.f372609m, dn6Var.f372609m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372603d);
            java.lang.String str = this.f372604e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f372605f);
            fVar.e(4, this.f372606g);
            java.lang.String str2 = this.f372607h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f372608i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f372609m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372603d) + 0;
            java.lang.String str4 = this.f372604e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int h17 = e17 + b36.f.h(3, this.f372605f) + b36.f.e(4, this.f372606g);
            java.lang.String str5 = this.f372607h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f372608i;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f372609m;
            return gVar2 != null ? h17 + b36.f.b(7, gVar2) : h17;
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
        r45.dn6 dn6Var = (r45.dn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dn6Var.f372603d = aVar2.g(intValue);
                return 0;
            case 2:
                dn6Var.f372604e = aVar2.k(intValue);
                return 0;
            case 3:
                dn6Var.f372605f = aVar2.i(intValue);
                return 0;
            case 4:
                dn6Var.f372606g = aVar2.g(intValue);
                return 0;
            case 5:
                dn6Var.f372607h = aVar2.k(intValue);
                return 0;
            case 6:
                dn6Var.f372608i = aVar2.k(intValue);
                return 0;
            case 7:
                dn6Var.f372609m = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372603d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Id", valueOf, false);
            eVar.d(jSONObject, "UserName", this.f372604e, false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f372605f), false);
            eVar.d(jSONObject, "MsgType", java.lang.Integer.valueOf(this.f372606g), false);
            eVar.d(jSONObject, "MsgSummary", this.f372607h, false);
            eVar.d(jSONObject, "MsgUserName", this.f372608i, false);
            eVar.d(jSONObject, "ClientBuf", this.f372609m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
