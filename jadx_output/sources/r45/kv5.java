package r45;

/* loaded from: classes4.dex */
public class kv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378979d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378980e;

    /* renamed from: f, reason: collision with root package name */
    public int f378981f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378982g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378983h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378984i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kv5)) {
            return false;
        }
        r45.kv5 kv5Var = (r45.kv5) fVar;
        return n51.f.a(this.f378979d, kv5Var.f378979d) && n51.f.a(this.f378980e, kv5Var.f378980e) && n51.f.a(java.lang.Integer.valueOf(this.f378981f), java.lang.Integer.valueOf(kv5Var.f378981f)) && n51.f.a(this.f378982g, kv5Var.f378982g) && n51.f.a(this.f378983h, kv5Var.f378983h) && n51.f.a(this.f378984i, kv5Var.f378984i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378979d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378980e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f378981f);
            java.lang.String str3 = this.f378982g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378983h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f378984i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f378979d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f378980e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f378981f);
            java.lang.String str8 = this.f378982g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f378983h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f378984i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.kv5 kv5Var = (r45.kv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kv5Var.f378979d = aVar2.k(intValue);
                return 0;
            case 2:
                kv5Var.f378980e = aVar2.k(intValue);
                return 0;
            case 3:
                kv5Var.f378981f = aVar2.g(intValue);
                return 0;
            case 4:
                kv5Var.f378982g = aVar2.k(intValue);
                return 0;
            case 5:
                kv5Var.f378983h = aVar2.k(intValue);
                return 0;
            case 6:
                kv5Var.f378984i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f378979d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "scope", str, false);
            eVar.d(jSONObject, "desc", this.f378980e, false);
            eVar.d(jSONObject, "state", java.lang.Integer.valueOf(this.f378981f), false);
            eVar.d(jSONObject, "icon_url", this.f378982g, false);
            eVar.d(jSONObject, "dark_mode_icon_url", this.f378983h, false);
            eVar.d(jSONObject, "sub_desc", this.f378984i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
