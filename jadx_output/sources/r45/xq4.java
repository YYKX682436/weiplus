package r45;

/* loaded from: classes8.dex */
public class xq4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390333d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390334e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390335f;

    /* renamed from: g, reason: collision with root package name */
    public int f390336g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f390337h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f390338i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq4)) {
            return false;
        }
        r45.xq4 xq4Var = (r45.xq4) fVar;
        return n51.f.a(this.f390333d, xq4Var.f390333d) && n51.f.a(this.f390334e, xq4Var.f390334e) && n51.f.a(this.f390335f, xq4Var.f390335f) && n51.f.a(java.lang.Integer.valueOf(this.f390336g), java.lang.Integer.valueOf(xq4Var.f390336g)) && n51.f.a(java.lang.Boolean.valueOf(this.f390337h), java.lang.Boolean.valueOf(xq4Var.f390337h)) && n51.f.a(java.lang.Boolean.valueOf(this.f390338i), java.lang.Boolean.valueOf(xq4Var.f390338i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390333d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390334e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390335f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f390336g);
            fVar.a(5, this.f390337h);
            fVar.a(6, this.f390338i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390333d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f390334e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f390335f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f390336g) + b36.f.a(5, this.f390337h) + b36.f.a(6, this.f390338i);
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
        r45.xq4 xq4Var = (r45.xq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xq4Var.f390333d = aVar2.k(intValue);
                return 0;
            case 2:
                xq4Var.f390334e = aVar2.k(intValue);
                return 0;
            case 3:
                xq4Var.f390335f = aVar2.k(intValue);
                return 0;
            case 4:
                xq4Var.f390336g = aVar2.g(intValue);
                return 0;
            case 5:
                xq4Var.f390337h = aVar2.c(intValue);
                return 0;
            case 6:
                xq4Var.f390338i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f390333d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "from_username", str, false);
            eVar.d(jSONObject, "to_username", this.f390334e, false);
            eVar.d(jSONObject, "msg_session_id", this.f390335f, false);
            eVar.d(jSONObject, "session_status", java.lang.Integer.valueOf(this.f390336g), false);
            eVar.d(jSONObject, "can_change_identity", java.lang.Boolean.valueOf(this.f390337h), false);
            eVar.d(jSONObject, "can_recv_msg", java.lang.Boolean.valueOf(this.f390338i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
