package pj4;

/* loaded from: classes8.dex */
public class b1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354992d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354993e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.m2 f354994f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.b1)) {
            return false;
        }
        pj4.b1 b1Var = (pj4.b1) fVar;
        return n51.f.a(this.BaseRequest, b1Var.BaseRequest) && n51.f.a(this.f354992d, b1Var.f354992d) && n51.f.a(this.f354993e, b1Var.f354993e) && n51.f.a(this.f354994f, b1Var.f354994f);
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
            java.lang.String str = this.f354992d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f354993e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            pj4.m2 m2Var = this.f354994f;
            if (m2Var != null) {
                fVar.i(4, m2Var.computeSize());
                this.f354994f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f354992d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f354993e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            pj4.m2 m2Var2 = this.f354994f;
            return m2Var2 != null ? i18 + b36.f.i(4, m2Var2.computeSize()) : i18;
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
        pj4.b1 b1Var = (pj4.b1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                b1Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            b1Var.f354992d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            b1Var.f354993e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            pj4.m2 m2Var3 = new pj4.m2();
            if (bArr2 != null && bArr2.length > 0) {
                m2Var3.parseFrom(bArr2);
            }
            b1Var.f354994f = m2Var3;
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
            eVar.d(jSONObject, "url", this.f354992d, false);
            eVar.d(jSONObject, "status_signature", this.f354993e, false);
            eVar.d(jSONObject, "status_signature_ext_info", this.f354994f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
