package pj4;

/* loaded from: classes10.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355175d;

    /* renamed from: e, reason: collision with root package name */
    public int f355176e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355177f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355178g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355179h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355180i;

    /* renamed from: m, reason: collision with root package name */
    public long f355181m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.m0)) {
            return false;
        }
        pj4.m0 m0Var = (pj4.m0) fVar;
        return n51.f.a(this.f355175d, m0Var.f355175d) && n51.f.a(java.lang.Integer.valueOf(this.f355176e), java.lang.Integer.valueOf(m0Var.f355176e)) && n51.f.a(this.f355177f, m0Var.f355177f) && n51.f.a(this.f355178g, m0Var.f355178g) && n51.f.a(this.f355179h, m0Var.f355179h) && n51.f.a(this.f355180i, m0Var.f355180i) && n51.f.a(java.lang.Long.valueOf(this.f355181m), java.lang.Long.valueOf(m0Var.f355181m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355175d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f355176e);
            java.lang.String str2 = this.f355177f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f355178g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f355179h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f355180i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.h(7, this.f355181m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f355175d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f355176e);
            java.lang.String str7 = this.f355177f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f355178g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f355179h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f355180i;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            return j17 + b36.f.h(7, this.f355181m);
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
        pj4.m0 m0Var = (pj4.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m0Var.f355175d = aVar2.k(intValue);
                return 0;
            case 2:
                m0Var.f355176e = aVar2.g(intValue);
                return 0;
            case 3:
                m0Var.f355177f = aVar2.k(intValue);
                return 0;
            case 4:
                m0Var.f355178g = aVar2.k(intValue);
                return 0;
            case 5:
                m0Var.f355179h = aVar2.k(intValue);
                return 0;
            case 6:
                m0Var.f355180i = aVar2.k(intValue);
                return 0;
            case 7:
                m0Var.f355181m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355175d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "media_name", str, false);
            eVar.d(jSONObject, "media_type", java.lang.Integer.valueOf(this.f355176e), false);
            eVar.d(jSONObject, "media_url", this.f355177f, false);
            eVar.d(jSONObject, "media_aes_key", this.f355178g, false);
            eVar.d(jSONObject, "media_thumb_url", this.f355179h, false);
            eVar.d(jSONObject, "media_thumb_aes_key", this.f355180i, false);
            eVar.d(jSONObject, "media_duration_ms", java.lang.Long.valueOf(this.f355181m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
