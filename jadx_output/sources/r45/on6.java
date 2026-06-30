package r45;

/* loaded from: classes15.dex */
public class on6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382382d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382383e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382384f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382385g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382386h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382387i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382388m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.on6)) {
            return false;
        }
        r45.on6 on6Var = (r45.on6) fVar;
        return n51.f.a(this.f382382d, on6Var.f382382d) && n51.f.a(this.f382383e, on6Var.f382383e) && n51.f.a(this.f382384f, on6Var.f382384f) && n51.f.a(this.f382385g, on6Var.f382385g) && n51.f.a(this.f382386h, on6Var.f382386h) && n51.f.a(this.f382387i, on6Var.f382387i) && n51.f.a(this.f382388m, on6Var.f382388m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382382d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382383e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382384f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382385g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382386h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f382387i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f382388m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f382382d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f382383e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f382384f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f382385g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f382386h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f382387i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f382388m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.on6 on6Var = (r45.on6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                on6Var.f382382d = aVar2.k(intValue);
                return 0;
            case 2:
                on6Var.f382383e = aVar2.k(intValue);
                return 0;
            case 3:
                on6Var.f382384f = aVar2.k(intValue);
                return 0;
            case 4:
                on6Var.f382385g = aVar2.k(intValue);
                return 0;
            case 5:
                on6Var.f382386h = aVar2.k(intValue);
                return 0;
            case 6:
                on6Var.f382387i = aVar2.k(intValue);
                return 0;
            case 7:
                on6Var.f382388m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f382382d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, false);
            eVar.d(jSONObject, "desc", this.f382383e, false);
            eVar.d(jSONObject, "relativeURL", this.f382384f, false);
            eVar.d(jSONObject, "originalId", this.f382385g, false);
            eVar.d(jSONObject, "weAppName", this.f382386h, false);
            eVar.d(jSONObject, "appId", this.f382387i, false);
            eVar.d(jSONObject, "avatar", this.f382388m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
