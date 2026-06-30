package r45;

/* loaded from: classes4.dex */
public class rq5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385124d;

    /* renamed from: e, reason: collision with root package name */
    public int f385125e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385126f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f385127g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq5)) {
            return false;
        }
        r45.rq5 rq5Var = (r45.rq5) fVar;
        return n51.f.a(this.BaseResponse, rq5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385124d), java.lang.Integer.valueOf(rq5Var.f385124d)) && n51.f.a(java.lang.Integer.valueOf(this.f385125e), java.lang.Integer.valueOf(rq5Var.f385125e)) && n51.f.a(this.f385126f, rq5Var.f385126f) && n51.f.a(java.lang.Long.valueOf(this.f385127g), java.lang.Long.valueOf(rq5Var.f385127g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385126f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385124d);
            fVar.e(3, this.f385125e);
            fVar.g(4, 8, linkedList);
            fVar.h(5, this.f385127g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385124d) + b36.f.e(3, this.f385125e) + b36.f.g(4, 8, linkedList) + b36.f.h(5, this.f385127g);
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
        r45.rq5 rq5Var = (r45.rq5) objArr[1];
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
                rq5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rq5Var.f385124d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            rq5Var.f385125e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            rq5Var.f385127g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.oq5 oq5Var = new r45.oq5();
            if (bArr3 != null && bArr3.length > 0) {
                oq5Var.parseFrom(bArr3);
            }
            rq5Var.f385126f.add(oq5Var);
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
            eVar.d(jSONObject, "report_aggregate_interval_ms", java.lang.Integer.valueOf(this.f385124d), false);
            eVar.d(jSONObject, "report_aggregate_count", java.lang.Integer.valueOf(this.f385125e), false);
            eVar.d(jSONObject, "item_confs", this.f385126f, false);
            eVar.d(jSONObject, "item_confs_version", java.lang.Long.valueOf(this.f385127g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
