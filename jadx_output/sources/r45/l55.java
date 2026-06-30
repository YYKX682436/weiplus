package r45;

/* loaded from: classes9.dex */
public class l55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379153e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379154f;

    /* renamed from: g, reason: collision with root package name */
    public long f379155g;

    /* renamed from: h, reason: collision with root package name */
    public int f379156h;

    /* renamed from: i, reason: collision with root package name */
    public long f379157i;

    /* renamed from: m, reason: collision with root package name */
    public int f379158m;

    /* renamed from: n, reason: collision with root package name */
    public int f379159n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l55)) {
            return false;
        }
        r45.l55 l55Var = (r45.l55) fVar;
        return n51.f.a(this.f379152d, l55Var.f379152d) && n51.f.a(this.f379153e, l55Var.f379153e) && n51.f.a(this.f379154f, l55Var.f379154f) && n51.f.a(java.lang.Long.valueOf(this.f379155g), java.lang.Long.valueOf(l55Var.f379155g)) && n51.f.a(java.lang.Integer.valueOf(this.f379156h), java.lang.Integer.valueOf(l55Var.f379156h)) && n51.f.a(java.lang.Long.valueOf(this.f379157i), java.lang.Long.valueOf(l55Var.f379157i)) && n51.f.a(java.lang.Integer.valueOf(this.f379158m), java.lang.Integer.valueOf(l55Var.f379158m)) && n51.f.a(java.lang.Integer.valueOf(this.f379159n), java.lang.Integer.valueOf(l55Var.f379159n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379152d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379153e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379154f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f379155g);
            fVar.e(5, this.f379156h);
            fVar.h(6, this.f379157i);
            fVar.e(7, this.f379158m);
            fVar.e(8, this.f379159n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f379152d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f379153e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f379154f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f379155g) + b36.f.e(5, this.f379156h) + b36.f.h(6, this.f379157i) + b36.f.e(7, this.f379158m) + b36.f.e(8, this.f379159n);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.l55 l55Var = (r45.l55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l55Var.f379152d = aVar2.k(intValue);
                return 0;
            case 2:
                l55Var.f379153e = aVar2.k(intValue);
                return 0;
            case 3:
                l55Var.f379154f = aVar2.k(intValue);
                return 0;
            case 4:
                l55Var.f379155g = aVar2.i(intValue);
                return 0;
            case 5:
                l55Var.f379156h = aVar2.g(intValue);
                return 0;
            case 6:
                l55Var.f379157i = aVar2.i(intValue);
                return 0;
            case 7:
                l55Var.f379158m = aVar2.g(intValue);
                return 0;
            case 8:
                l55Var.f379159n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f379152d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "fromUser", str, false);
            eVar.d(jSONObject, "pattedUser", this.f379153e, false);
            eVar.d(jSONObject, "template", this.f379154f, false);
            eVar.d(jSONObject, "createTime", java.lang.Long.valueOf(this.f379155g), false);
            eVar.d(jSONObject, "readStatus", java.lang.Integer.valueOf(this.f379156h), false);
            eVar.d(jSONObject, "svrId", java.lang.Long.valueOf(this.f379157i), false);
            eVar.d(jSONObject, "showModifyTip", java.lang.Integer.valueOf(this.f379158m), false);
            eVar.d(jSONObject, "isNewPatMsg", java.lang.Integer.valueOf(this.f379159n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
