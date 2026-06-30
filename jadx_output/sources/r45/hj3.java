package r45;

/* loaded from: classes4.dex */
public class hj3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376213e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376214f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hj3)) {
            return false;
        }
        r45.hj3 hj3Var = (r45.hj3) fVar;
        return n51.f.a(this.BaseRequest, hj3Var.BaseRequest) && n51.f.a(this.f376212d, hj3Var.f376212d) && n51.f.a(this.f376213e, hj3Var.f376213e) && n51.f.a(this.f376214f, hj3Var.f376214f);
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
            java.lang.String str = this.f376212d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376213e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f376214f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f376212d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f376213e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f376214f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.hj3 hj3Var = (r45.hj3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                hj3Var.f376212d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                hj3Var.f376213e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            hj3Var.f376214f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            hj3Var.BaseRequest = heVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "from_username", this.f376212d, false);
            eVar.d(jSONObject, "to_username", this.f376213e, false);
            eVar.d(jSONObject, "msg_session_id", this.f376214f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
