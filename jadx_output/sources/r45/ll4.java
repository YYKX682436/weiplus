package r45;

/* loaded from: classes12.dex */
public class ll4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f379572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379573e;

    /* renamed from: f, reason: collision with root package name */
    public int f379574f;

    /* renamed from: g, reason: collision with root package name */
    public int f379575g;

    /* renamed from: h, reason: collision with root package name */
    public int f379576h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379577i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379578m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ll4)) {
            return false;
        }
        r45.ll4 ll4Var = (r45.ll4) fVar;
        return n51.f.a(this.f379572d, ll4Var.f379572d) && n51.f.a(this.f379573e, ll4Var.f379573e) && n51.f.a(java.lang.Integer.valueOf(this.f379574f), java.lang.Integer.valueOf(ll4Var.f379574f)) && n51.f.a(java.lang.Integer.valueOf(this.f379575g), java.lang.Integer.valueOf(ll4Var.f379575g)) && n51.f.a(java.lang.Integer.valueOf(this.f379576h), java.lang.Integer.valueOf(ll4Var.f379576h)) && n51.f.a(this.f379577i, ll4Var.f379577i) && n51.f.a(this.f379578m, ll4Var.f379578m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f379572d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f379572d.writeFields(fVar);
            }
            java.lang.String str = this.f379573e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f379574f);
            fVar.e(4, this.f379575g);
            fVar.e(5, this.f379576h);
            java.lang.String str2 = this.f379577i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f379578m;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f379572d;
            int i18 = du5Var2 != null ? 0 + b36.f.i(1, du5Var2.computeSize()) : 0;
            java.lang.String str4 = this.f379573e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f379574f) + b36.f.e(4, this.f379575g) + b36.f.e(5, this.f379576h);
            java.lang.String str5 = this.f379577i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f379578m;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.ll4 ll4Var = (r45.ll4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 9) {
            ll4Var.f379578m = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    ll4Var.f379572d = du5Var3;
                }
                return 0;
            case 2:
                ll4Var.f379573e = aVar2.k(intValue);
                return 0;
            case 3:
                ll4Var.f379574f = aVar2.g(intValue);
                return 0;
            case 4:
                ll4Var.f379575g = aVar2.g(intValue);
                return 0;
            case 5:
                ll4Var.f379576h = aVar2.g(intValue);
                return 0;
            case 6:
                ll4Var.f379577i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f379572d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ToUserName", du5Var, false);
            eVar.d(jSONObject, "Content", this.f379573e, false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f379574f), false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f379575g), false);
            eVar.d(jSONObject, "ClientMsgId", java.lang.Integer.valueOf(this.f379576h), false);
            eVar.d(jSONObject, "MsgSource", this.f379577i, false);
            eVar.d(jSONObject, "SendMsgTicket", this.f379578m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
