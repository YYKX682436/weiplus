package r45;

/* loaded from: classes4.dex */
public class yq extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391285d;

    /* renamed from: e, reason: collision with root package name */
    public long f391286e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f391287f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f391288g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yq)) {
            return false;
        }
        r45.yq yqVar = (r45.yq) fVar;
        return n51.f.a(this.BaseResponse, yqVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f391285d), java.lang.Integer.valueOf(yqVar.f391285d)) && n51.f.a(java.lang.Long.valueOf(this.f391286e), java.lang.Long.valueOf(yqVar.f391286e)) && n51.f.a(this.f391287f, yqVar.f391287f) && n51.f.a(java.lang.Boolean.valueOf(this.f391288g), java.lang.Boolean.valueOf(yqVar.f391288g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391287f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f391285d);
            fVar.h(3, this.f391286e);
            fVar.g(4, 8, linkedList);
            fVar.a(5, this.f391288g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f391285d) + b36.f.h(3, this.f391286e) + b36.f.g(4, 8, linkedList) + b36.f.a(5, this.f391288g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.yq yqVar = (r45.yq) objArr[1];
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
                yqVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yqVar.f391285d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yqVar.f391286e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            yqVar.f391288g = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.wq wqVar = new r45.wq();
            if (bArr3 != null && bArr3.length > 0) {
                wqVar.parseFrom(bArr3);
            }
            yqVar.f391287f.add(wqVar);
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
            eVar.d(jSONObject, "resp_continue_flag", java.lang.Integer.valueOf(this.f391285d), false);
            eVar.d(jSONObject, "resp_synckey_value", java.lang.Long.valueOf(this.f391286e), false);
            eVar.d(jSONObject, "sync_item_list", this.f391287f, false);
            eVar.d(jSONObject, "reset", java.lang.Boolean.valueOf(this.f391288g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
