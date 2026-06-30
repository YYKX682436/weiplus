package r45;

/* loaded from: classes8.dex */
public class j7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377617d;

    /* renamed from: e, reason: collision with root package name */
    public int f377618e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f377619f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j7)) {
            return false;
        }
        r45.j7 j7Var = (r45.j7) fVar;
        return n51.f.a(this.BaseRequest, j7Var.BaseRequest) && n51.f.a(this.f377617d, j7Var.f377617d) && n51.f.a(java.lang.Integer.valueOf(this.f377618e), java.lang.Integer.valueOf(j7Var.f377618e)) && n51.f.a(this.f377619f, j7Var.f377619f);
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
            java.lang.String str = this.f377617d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f377618e);
            fVar.g(4, 8, this.f377619f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f377617d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f377618e) + b36.f.g(4, 8, this.f377619f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377619f.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.j7 j7Var = (r45.j7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                j7Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            j7Var.f377617d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            j7Var.f377618e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.az azVar = new r45.az();
            if (bArr3 != null && bArr3.length > 0) {
                azVar.parseFrom(bArr3);
            }
            j7Var.f377619f.add(azVar);
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
            eVar.d(jSONObject, "ChatRoomName", this.f377617d, false);
            eVar.d(jSONObject, "WatchMemberCount", java.lang.Integer.valueOf(this.f377618e), false);
            eVar.d(jSONObject, "WatchMembers", this.f377619f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
