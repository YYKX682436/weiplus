package r45;

/* loaded from: classes15.dex */
public class x56 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389795d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389796e;

    /* renamed from: f, reason: collision with root package name */
    public long f389797f;

    /* renamed from: g, reason: collision with root package name */
    public int f389798g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389799h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389800i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389801m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389802n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x56)) {
            return false;
        }
        r45.x56 x56Var = (r45.x56) fVar;
        return n51.f.a(this.f389795d, x56Var.f389795d) && n51.f.a(this.f389796e, x56Var.f389796e) && n51.f.a(java.lang.Long.valueOf(this.f389797f), java.lang.Long.valueOf(x56Var.f389797f)) && n51.f.a(java.lang.Integer.valueOf(this.f389798g), java.lang.Integer.valueOf(x56Var.f389798g)) && n51.f.a(this.f389799h, x56Var.f389799h) && n51.f.a(this.f389800i, x56Var.f389800i) && n51.f.a(this.f389801m, x56Var.f389801m) && n51.f.a(this.f389802n, x56Var.f389802n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389795d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389796e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f389797f);
            fVar.e(4, this.f389798g);
            java.lang.String str3 = this.f389799h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389800i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f389801m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f389802n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f389795d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f389796e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int h17 = j17 + b36.f.h(3, this.f389797f) + b36.f.e(4, this.f389798g);
            java.lang.String str9 = this.f389799h;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f389800i;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f389801m;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f389802n;
            return str12 != null ? h17 + b36.f.j(8, str12) : h17;
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
        r45.x56 x56Var = (r45.x56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x56Var.f389795d = aVar2.k(intValue);
                return 0;
            case 2:
                x56Var.f389796e = aVar2.k(intValue);
                return 0;
            case 3:
                x56Var.f389797f = aVar2.i(intValue);
                return 0;
            case 4:
                x56Var.f389798g = aVar2.g(intValue);
                return 0;
            case 5:
                x56Var.f389799h = aVar2.k(intValue);
                return 0;
            case 6:
                x56Var.f389800i = aVar2.k(intValue);
                return 0;
            case 7:
                x56Var.f389801m = aVar2.k(intValue);
                return 0;
            case 8:
                x56Var.f389802n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389795d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_ID, str, false);
            eVar.d(jSONObject, "wording", this.f389796e, false);
            eVar.d(jSONObject, "category", java.lang.Long.valueOf(this.f389797f), false);
            eVar.d(jSONObject, "actionType", java.lang.Integer.valueOf(this.f389798g), false);
            eVar.d(jSONObject, "url", this.f389799h, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f389800i, false);
            eVar.d(jSONObject, "subTitle", this.f389801m, false);
            eVar.d(jSONObject, "icon", this.f389802n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
