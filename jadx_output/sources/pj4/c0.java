package pj4;

/* loaded from: classes10.dex */
public class c0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355003d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355004e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355005f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355006g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355007h;

    /* renamed from: i, reason: collision with root package name */
    public int f355008i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f355009m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.c0)) {
            return false;
        }
        pj4.c0 c0Var = (pj4.c0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355003d), java.lang.Integer.valueOf(c0Var.f355003d)) && n51.f.a(this.f355004e, c0Var.f355004e) && n51.f.a(this.f355005f, c0Var.f355005f) && n51.f.a(this.f355006g, c0Var.f355006g) && n51.f.a(this.f355007h, c0Var.f355007h) && n51.f.a(java.lang.Integer.valueOf(this.f355008i), java.lang.Integer.valueOf(c0Var.f355008i)) && n51.f.a(this.f355009m, c0Var.f355009m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355003d);
            java.lang.String str = this.f355004e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355005f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f355006g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f355007h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f355008i);
            fVar.g(21, 8, this.f355009m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355003d) + 0;
            java.lang.String str5 = this.f355004e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f355005f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f355006g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f355007h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f355008i) + b36.f.g(21, 8, this.f355009m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f355009m.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        pj4.c0 c0Var = (pj4.c0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                pj4.j0 j0Var = new pj4.j0();
                if (bArr2 != null && bArr2.length > 0) {
                    j0Var.parseFrom(bArr2);
                }
                c0Var.f355009m.add(j0Var);
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                c0Var.f355003d = aVar2.g(intValue);
                return 0;
            case 2:
                c0Var.f355004e = aVar2.k(intValue);
                return 0;
            case 3:
                c0Var.f355005f = aVar2.k(intValue);
                return 0;
            case 4:
                c0Var.f355006g = aVar2.k(intValue);
                return 0;
            case 5:
                c0Var.f355007h = aVar2.k(intValue);
                return 0;
            case 6:
                c0Var.f355008i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355003d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "uin", valueOf, false);
            eVar.d(jSONObject, "sourceId", this.f355004e, false);
            eVar.d(jSONObject, "sourceActivityId", this.f355005f, false);
            eVar.d(jSONObject, "sourceName", this.f355006g, false);
            eVar.d(jSONObject, "sourceIcon", this.f355007h, false);
            eVar.d(jSONObject, "createTime", java.lang.Integer.valueOf(this.f355008i), false);
            eVar.d(jSONObject, "jumps", this.f355009m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
