package r45;

/* loaded from: classes9.dex */
public class vz extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388681d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388682e;

    /* renamed from: f, reason: collision with root package name */
    public long f388683f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388684g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388685h;

    /* renamed from: i, reason: collision with root package name */
    public int f388686i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388687m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388688n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz)) {
            return false;
        }
        r45.vz vzVar = (r45.vz) fVar;
        return n51.f.a(this.BaseRequest, vzVar.BaseRequest) && n51.f.a(this.f388681d, vzVar.f388681d) && n51.f.a(this.f388682e, vzVar.f388682e) && n51.f.a(java.lang.Long.valueOf(this.f388683f), java.lang.Long.valueOf(vzVar.f388683f)) && n51.f.a(this.f388684g, vzVar.f388684g) && n51.f.a(this.f388685h, vzVar.f388685h) && n51.f.a(java.lang.Integer.valueOf(this.f388686i), java.lang.Integer.valueOf(vzVar.f388686i)) && n51.f.a(this.f388687m, vzVar.f388687m) && n51.f.a(this.f388688n, vzVar.f388688n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f388681d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388682e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f388683f);
            java.lang.String str3 = this.f388684g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f388685h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f388686i);
            java.lang.String str5 = this.f388687m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f388688n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f388681d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f388682e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int h17 = i18 + b36.f.h(4, this.f388683f);
            java.lang.String str9 = this.f388684g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f388685h;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            int e17 = h17 + b36.f.e(7, this.f388686i);
            java.lang.String str11 = this.f388687m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f388688n;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.vz vzVar = (r45.vz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    vzVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                vzVar.f388681d = aVar2.k(intValue);
                return 0;
            case 3:
                vzVar.f388682e = aVar2.k(intValue);
                return 0;
            case 4:
                vzVar.f388683f = aVar2.i(intValue);
                return 0;
            case 5:
                vzVar.f388684g = aVar2.k(intValue);
                return 0;
            case 6:
                vzVar.f388685h = aVar2.k(intValue);
                return 0;
            case 7:
                vzVar.f388686i = aVar2.g(intValue);
                return 0;
            case 8:
                vzVar.f388687m = aVar2.k(intValue);
                return 0;
            case 9:
                vzVar.f388688n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "FromUserName", this.f388681d, false);
            eVar.d(jSONObject, "ToUserName", this.f388682e, false);
            eVar.d(jSONObject, "FileSize", java.lang.Long.valueOf(this.f388683f), false);
            eVar.d(jSONObject, "AESKey", this.f388684g, false);
            eVar.d(jSONObject, "FileMd5", this.f388685h, false);
            eVar.d(jSONObject, "FileType", java.lang.Integer.valueOf(this.f388686i), false);
            eVar.d(jSONObject, "FileExt", this.f388687m, false);
            eVar.d(jSONObject, "FileName", this.f388688n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
