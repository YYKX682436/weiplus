package r45;

/* loaded from: classes4.dex */
public class qs extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384236e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384237f;

    /* renamed from: g, reason: collision with root package name */
    public int f384238g;

    /* renamed from: h, reason: collision with root package name */
    public long f384239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384241m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384242n;

    /* renamed from: o, reason: collision with root package name */
    public int f384243o;

    /* renamed from: p, reason: collision with root package name */
    public int f384244p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qs)) {
            return false;
        }
        r45.qs qsVar = (r45.qs) fVar;
        return n51.f.a(this.BaseResponse, qsVar.BaseResponse) && n51.f.a(this.f384235d, qsVar.f384235d) && n51.f.a(this.f384236e, qsVar.f384236e) && n51.f.a(this.f384237f, qsVar.f384237f) && n51.f.a(java.lang.Integer.valueOf(this.f384238g), java.lang.Integer.valueOf(qsVar.f384238g)) && n51.f.a(java.lang.Long.valueOf(this.f384239h), java.lang.Long.valueOf(qsVar.f384239h)) && n51.f.a(this.f384240i, qsVar.f384240i) && n51.f.a(this.f384241m, qsVar.f384241m) && n51.f.a(this.f384242n, qsVar.f384242n) && n51.f.a(java.lang.Integer.valueOf(this.f384243o), java.lang.Integer.valueOf(qsVar.f384243o)) && n51.f.a(java.lang.Integer.valueOf(this.f384244p), java.lang.Integer.valueOf(qsVar.f384244p));
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
            java.lang.String str = this.f384235d;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384236e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f384237f;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(9, this.f384238g);
            fVar.h(10, this.f384239h);
            java.lang.String str4 = this.f384240i;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f384241m;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f384242n;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f384243o);
            fVar.e(15, this.f384244p);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str7 = this.f384235d;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f384236e;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f384237f;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(9, this.f384238g) + b36.f.h(10, this.f384239h);
            java.lang.String str10 = this.f384240i;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f384241m;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f384242n;
            if (str12 != null) {
                e17 += b36.f.j(13, str12);
            }
            return e17 + b36.f.e(14, this.f384243o) + b36.f.e(15, this.f384244p);
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
        r45.qs qsVar = (r45.qs) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                qsVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            qsVar.f384235d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qsVar.f384236e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            qsVar.f384237f = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 9:
                qsVar.f384238g = aVar2.g(intValue);
                return 0;
            case 10:
                qsVar.f384239h = aVar2.i(intValue);
                return 0;
            case 11:
                qsVar.f384240i = aVar2.k(intValue);
                return 0;
            case 12:
                qsVar.f384241m = aVar2.k(intValue);
                return 0;
            case 13:
                qsVar.f384242n = aVar2.k(intValue);
                return 0;
            case 14:
                qsVar.f384243o = aVar2.g(intValue);
                return 0;
            case 15:
                qsVar.f384244p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "ClientImgId", this.f384235d, false);
            eVar.d(jSONObject, "FromUserName", this.f384236e, false);
            eVar.d(jSONObject, "ToUserName", this.f384237f, false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f384238g), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f384239h), false);
            eVar.d(jSONObject, "AESKey", this.f384240i, false);
            eVar.d(jSONObject, "FileId", this.f384241m, false);
            eVar.d(jSONObject, "MsgSource", this.f384242n, false);
            eVar.d(jSONObject, "ActionFlag", java.lang.Integer.valueOf(this.f384243o), false);
            eVar.d(jSONObject, "NoCommit", java.lang.Integer.valueOf(this.f384244p), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
