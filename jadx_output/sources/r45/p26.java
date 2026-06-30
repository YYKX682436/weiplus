package r45;

/* loaded from: classes4.dex */
public class p26 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382685e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f382686f;

    /* renamed from: g, reason: collision with root package name */
    public int f382687g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p26)) {
            return false;
        }
        r45.p26 p26Var = (r45.p26) fVar;
        return n51.f.a(this.BaseRequest, p26Var.BaseRequest) && n51.f.a(this.f382684d, p26Var.f382684d) && n51.f.a(this.f382685e, p26Var.f382685e) && n51.f.a(this.f382686f, p26Var.f382686f) && n51.f.a(java.lang.Integer.valueOf(this.f382687g), java.lang.Integer.valueOf(p26Var.f382687g));
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
            java.lang.String str = this.f382684d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382685e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.cu5 cu5Var = this.f382686f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f382686f.writeFields(fVar);
            }
            fVar.e(5, this.f382687g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f382684d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f382685e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.cu5 cu5Var2 = this.f382686f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f382687g);
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
        r45.p26 p26Var = (r45.p26) objArr[1];
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
                p26Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            p26Var.f382684d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            p26Var.f382685e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            p26Var.f382687g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            p26Var.f382686f = cu5Var3;
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
            eVar.d(jSONObject, "Password", this.f382684d, false);
            eVar.d(jSONObject, "Ticket", this.f382685e, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f382686f, false);
            eVar.d(jSONObject, "TicketType", java.lang.Integer.valueOf(this.f382687g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
