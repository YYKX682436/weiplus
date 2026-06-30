package r45;

/* loaded from: classes4.dex */
public class jo5 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377992e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f377991d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f377993f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jo5)) {
            return false;
        }
        r45.jo5 jo5Var = (r45.jo5) fVar;
        return n51.f.a(this.BaseResponse, jo5Var.BaseResponse) && n51.f.a(this.f377991d, jo5Var.f377991d) && n51.f.a(this.f377992e, jo5Var.f377992e) && n51.f.a(this.f377993f, jo5Var.f377993f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377993f;
        java.util.LinkedList linkedList2 = this.f377991d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 3, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f377992e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 3, linkedList2);
            com.tencent.mm.protobuf.g gVar2 = this.f377992e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.jo5 jo5Var = (r45.jo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                jo5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            jo5Var.f377991d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 3) {
            jo5Var.f377992e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.go5 go5Var = new r45.go5();
            if (bArr3 != null && bArr3.length > 0) {
                go5Var.parseFrom(bArr3);
            }
            jo5Var.f377993f.add(go5Var);
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
            eVar.d(jSONObject, "resp_continue_flag", this.f377991d, false);
            eVar.d(jSONObject, "resp_sync_key_buff", this.f377992e, false);
            eVar.d(jSONObject, "sync_item_list", this.f377993f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
