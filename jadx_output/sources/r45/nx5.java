package r45;

/* loaded from: classes9.dex */
public class nx5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381724d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381725e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381726f;

    /* renamed from: g, reason: collision with root package name */
    public int f381727g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381728h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381729i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381730m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381731n;

    /* renamed from: o, reason: collision with root package name */
    public int f381732o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f381733p;

    /* renamed from: q, reason: collision with root package name */
    public r45.p34 f381734q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381735r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f381736s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nx5)) {
            return false;
        }
        r45.nx5 nx5Var = (r45.nx5) fVar;
        return n51.f.a(this.BaseResponse, nx5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381724d), java.lang.Integer.valueOf(nx5Var.f381724d)) && n51.f.a(this.f381725e, nx5Var.f381725e) && n51.f.a(this.f381726f, nx5Var.f381726f) && n51.f.a(java.lang.Integer.valueOf(this.f381727g), java.lang.Integer.valueOf(nx5Var.f381727g)) && n51.f.a(this.f381728h, nx5Var.f381728h) && n51.f.a(this.f381729i, nx5Var.f381729i) && n51.f.a(this.f381730m, nx5Var.f381730m) && n51.f.a(this.f381731n, nx5Var.f381731n) && n51.f.a(java.lang.Integer.valueOf(this.f381732o), java.lang.Integer.valueOf(nx5Var.f381732o)) && n51.f.a(java.lang.Boolean.valueOf(this.f381733p), java.lang.Boolean.valueOf(nx5Var.f381733p)) && n51.f.a(this.f381734q, nx5Var.f381734q) && n51.f.a(this.f381735r, nx5Var.f381735r) && n51.f.a(java.lang.Boolean.valueOf(this.f381736s), java.lang.Boolean.valueOf(nx5Var.f381736s));
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
            fVar.e(2, this.f381724d);
            java.lang.String str = this.f381725e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381726f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f381727g);
            java.lang.String str3 = this.f381728h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f381729i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f381730m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f381731n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f381732o);
            fVar.a(12, this.f381733p);
            r45.p34 p34Var = this.f381734q;
            if (p34Var != null) {
                fVar.i(13, p34Var.computeSize());
                this.f381734q.writeFields(fVar);
            }
            java.lang.String str7 = this.f381735r;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.a(15, this.f381736s);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f381724d);
            java.lang.String str8 = this.f381725e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f381726f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            int e17 = i18 + b36.f.e(5, this.f381727g);
            java.lang.String str10 = this.f381728h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f381729i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f381730m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f381731n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            int e18 = e17 + b36.f.e(10, this.f381732o) + b36.f.a(12, this.f381733p);
            r45.p34 p34Var2 = this.f381734q;
            if (p34Var2 != null) {
                e18 += b36.f.i(13, p34Var2.computeSize());
            }
            java.lang.String str14 = this.f381735r;
            if (str14 != null) {
                e18 += b36.f.j(14, str14);
            }
            return e18 + b36.f.a(15, this.f381736s);
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
        r45.nx5 nx5Var = (r45.nx5) objArr[1];
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
                    nx5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                nx5Var.f381724d = aVar2.g(intValue);
                return 0;
            case 3:
                nx5Var.f381725e = aVar2.k(intValue);
                return 0;
            case 4:
                nx5Var.f381726f = aVar2.k(intValue);
                return 0;
            case 5:
                nx5Var.f381727g = aVar2.g(intValue);
                return 0;
            case 6:
                nx5Var.f381728h = aVar2.k(intValue);
                return 0;
            case 7:
                nx5Var.f381729i = aVar2.k(intValue);
                return 0;
            case 8:
                nx5Var.f381730m = aVar2.k(intValue);
                return 0;
            case 9:
                nx5Var.f381731n = aVar2.k(intValue);
                return 0;
            case 10:
                nx5Var.f381732o = aVar2.g(intValue);
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                nx5Var.f381733p = aVar2.c(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.p34 p34Var3 = new r45.p34();
                    if (bArr2 != null && bArr2.length > 0) {
                        p34Var3.parseFrom(bArr2);
                    }
                    nx5Var.f381734q = p34Var3;
                }
                return 0;
            case 14:
                nx5Var.f381735r = aVar2.k(intValue);
                return 0;
            case 15:
                nx5Var.f381736s = aVar2.c(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "JumpType", java.lang.Integer.valueOf(this.f381724d), false);
            eVar.d(jSONObject, "UserName", this.f381725e, false);
            eVar.d(jSONObject, "WeappUrl", this.f381726f, false);
            eVar.d(jSONObject, "VersionType", java.lang.Integer.valueOf(this.f381727g), false);
            eVar.d(jSONObject, "Appid", this.f381728h, false);
            eVar.d(jSONObject, "NickName", this.f381729i, false);
            eVar.d(jSONObject, "JumpUrl", this.f381730m, false);
            eVar.d(jSONObject, "WebviewJson", this.f381731n, false);
            eVar.d(jSONObject, "Version", java.lang.Integer.valueOf(this.f381732o), false);
            eVar.d(jSONObject, "DisablePopups", java.lang.Boolean.valueOf(this.f381733p), false);
            eVar.d(jSONObject, "LiteAppInfo", this.f381734q, false);
            eVar.d(jSONObject, "JumpQuery", this.f381735r, false);
            eVar.d(jSONObject, "IsNewWebSearchStyle", java.lang.Boolean.valueOf(this.f381736s), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
