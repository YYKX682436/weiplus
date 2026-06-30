package pj4;

/* loaded from: classes7.dex */
public class w extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355311d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355313f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355315h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355316i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.w)) {
            return false;
        }
        pj4.w wVar = (pj4.w) fVar;
        return n51.f.a(this.f355311d, wVar.f355311d) && n51.f.a(this.f355312e, wVar.f355312e) && n51.f.a(this.f355313f, wVar.f355313f) && n51.f.a(this.f355314g, wVar.f355314g) && n51.f.a(this.f355315h, wVar.f355315h) && n51.f.a(this.f355316i, wVar.f355316i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355311d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355312e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f355313f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f355314g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f355315h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f355316i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f355311d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f355312e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f355313f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f355314g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f355315h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f355316i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        pj4.w wVar = (pj4.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wVar.f355311d = aVar2.k(intValue);
                return 0;
            case 2:
                wVar.f355312e = aVar2.k(intValue);
                return 0;
            case 3:
                wVar.f355313f = aVar2.k(intValue);
                return 0;
            case 4:
                wVar.f355314g = aVar2.k(intValue);
                return 0;
            case 5:
                wVar.f355315h = aVar2.k(intValue);
                return 0;
            case 6:
                wVar.f355316i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355311d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "statusDesc", str, false);
            eVar.d(jSONObject, "statusIconId", this.f355312e, false);
            eVar.d(jSONObject, "sourceJumpType", this.f355313f, false);
            eVar.d(jSONObject, "sourceWeAppUserName", this.f355314g, false);
            eVar.d(jSONObject, "sourceWeAppPagePath", this.f355315h, false);
            eVar.d(jSONObject, "sourceH5Url", this.f355316i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
