package r45;

/* loaded from: classes4.dex */
public class tz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386884f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386885g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386886h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386887i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386888m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f386889n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tz4)) {
            return false;
        }
        r45.tz4 tz4Var = (r45.tz4) fVar;
        return n51.f.a(this.f386882d, tz4Var.f386882d) && n51.f.a(this.f386883e, tz4Var.f386883e) && n51.f.a(this.f386884f, tz4Var.f386884f) && n51.f.a(this.f386885g, tz4Var.f386885g) && n51.f.a(this.f386886h, tz4Var.f386886h) && n51.f.a(this.f386887i, tz4Var.f386887i) && n51.f.a(this.f386888m, tz4Var.f386888m) && n51.f.a(java.lang.Boolean.valueOf(this.f386889n), java.lang.Boolean.valueOf(tz4Var.f386889n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386882d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386883e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f386884f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f386885g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f386886h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f386887i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f386888m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.a(8, this.f386889n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f386882d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f386883e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f386884f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f386885g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f386886h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f386887i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f386888m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.a(8, this.f386889n);
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
        r45.tz4 tz4Var = (r45.tz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tz4Var.f386882d = aVar2.k(intValue);
                return 0;
            case 2:
                tz4Var.f386883e = aVar2.k(intValue);
                return 0;
            case 3:
                tz4Var.f386884f = aVar2.k(intValue);
                return 0;
            case 4:
                tz4Var.f386885g = aVar2.k(intValue);
                return 0;
            case 5:
                tz4Var.f386886h = aVar2.k(intValue);
                return 0;
            case 6:
                tz4Var.f386887i = aVar2.k(intValue);
                return 0;
            case 7:
                tz4Var.f386888m = aVar2.k(intValue);
                return 0;
            case 8:
                tz4Var.f386889n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f386882d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, false);
            eVar.d(jSONObject, "heading", this.f386883e, false);
            eVar.d(jSONObject, "desp", this.f386884f, false);
            eVar.d(jSONObject, "approve_button_wording", this.f386885g, false);
            eVar.d(jSONObject, "reject_button_wording", this.f386886h, false);
            eVar.d(jSONObject, "privacy_agreement_wording", this.f386887i, false);
            eVar.d(jSONObject, "privacy_agreement_url", this.f386888m, false);
            eVar.d(jSONObject, "is_force_archived", java.lang.Boolean.valueOf(this.f386889n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
