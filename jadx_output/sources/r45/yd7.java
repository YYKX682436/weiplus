package r45;

/* loaded from: classes8.dex */
public class yd7 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f391003d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f391004e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yd7)) {
            return false;
        }
        r45.yd7 yd7Var = (r45.yd7) fVar;
        return n51.f.a(this.BaseResponse, yd7Var.BaseResponse) && n51.f.a(this.f391003d, yd7Var.f391003d) && n51.f.a(this.f391004e, yd7Var.f391004e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391004e;
        java.util.LinkedList linkedList2 = this.f391003d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
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
        r45.yd7 yd7Var = (r45.yd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                yd7Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.ie0 ie0Var = new r45.ie0();
                if (bArr3 != null && bArr3.length > 0) {
                    ie0Var.parseFrom(bArr3);
                }
                yd7Var.f391003d.add(ie0Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.g27 g27Var = new r45.g27();
            if (bArr4 != null && bArr4.length > 0) {
                g27Var.parseFrom(bArr4);
            }
            yd7Var.f391004e.add(g27Var);
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
            eVar.d(jSONObject, "device_list", this.f391003d, false);
            eVar.d(jSONObject, "voip_call_auth_info_list", this.f391004e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
