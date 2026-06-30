package pj4;

/* loaded from: classes4.dex */
public class p extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355233d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355234e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355235f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.p)) {
            return false;
        }
        pj4.p pVar = (pj4.p) fVar;
        return n51.f.a(this.BaseResponse, pVar.BaseResponse) && n51.f.a(this.f355233d, pVar.f355233d) && n51.f.a(this.f355234e, pVar.f355234e) && n51.f.a(this.f355235f, pVar.f355235f);
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
            java.lang.String str = this.f355233d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355234e;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f355235f;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f355233d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f355234e;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f355235f;
            return str6 != null ? i18 + b36.f.j(6, str6) : i18;
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
        pj4.p pVar = (pj4.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                pVar.f355233d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 5) {
                pVar.f355234e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 6) {
                return -1;
            }
            pVar.f355235f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            pVar.BaseResponse = ieVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "text_status_id", this.f355233d, false);
            eVar.d(jSONObject, "text_status_ext_info", this.f355234e, false);
            eVar.d(jSONObject, "private_info", this.f355235f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
