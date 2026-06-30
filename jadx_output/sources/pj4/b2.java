package pj4;

/* loaded from: classes2.dex */
public class b2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354996e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f354997f;

    /* renamed from: g, reason: collision with root package name */
    public int f354998g;

    /* renamed from: h, reason: collision with root package name */
    public int f354999h;

    /* renamed from: i, reason: collision with root package name */
    public long f355000i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.b2)) {
            return false;
        }
        pj4.b2 b2Var = (pj4.b2) fVar;
        return n51.f.a(this.f354995d, b2Var.f354995d) && n51.f.a(this.f354996e, b2Var.f354996e) && n51.f.a(this.f354997f, b2Var.f354997f) && n51.f.a(java.lang.Integer.valueOf(this.f354998g), java.lang.Integer.valueOf(b2Var.f354998g)) && n51.f.a(java.lang.Integer.valueOf(this.f354999h), java.lang.Integer.valueOf(b2Var.f354999h)) && n51.f.a(java.lang.Long.valueOf(this.f355000i), java.lang.Long.valueOf(b2Var.f355000i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f354995d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f354996e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f354997f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f354998g);
            fVar.e(5, this.f354999h);
            fVar.h(6, this.f355000i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f354995d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f354996e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f354997f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f354998g) + b36.f.e(5, this.f354999h) + b36.f.h(6, this.f355000i);
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
        pj4.b2 b2Var = (pj4.b2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b2Var.f354995d = aVar2.k(intValue);
                return 0;
            case 2:
                b2Var.f354996e = aVar2.k(intValue);
                return 0;
            case 3:
                b2Var.f354997f = aVar2.k(intValue);
                return 0;
            case 4:
                b2Var.f354998g = aVar2.g(intValue);
                return 0;
            case 5:
                b2Var.f354999h = aVar2.g(intValue);
                return 0;
            case 6:
                b2Var.f355000i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f354995d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "nickname", str, false);
            eVar.d(jSONObject, "head_img_url", this.f354996e, false);
            eVar.d(jSONObject, "hash_username", this.f354997f, false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f354998g), false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f354999h), false);
            eVar.d(jSONObject, "like_id", java.lang.Long.valueOf(this.f355000i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
