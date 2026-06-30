package r45;

/* loaded from: classes4.dex */
public class wc4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f389066d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f389067e;

    /* renamed from: f, reason: collision with root package name */
    public int f389068f;

    /* renamed from: g, reason: collision with root package name */
    public int f389069g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wc4)) {
            return false;
        }
        r45.wc4 wc4Var = (r45.wc4) fVar;
        return n51.f.a(this.f389066d, wc4Var.f389066d) && n51.f.a(java.lang.Integer.valueOf(this.f389067e), java.lang.Integer.valueOf(wc4Var.f389067e)) && n51.f.a(java.lang.Integer.valueOf(this.f389068f), java.lang.Integer.valueOf(wc4Var.f389068f)) && n51.f.a(java.lang.Integer.valueOf(this.f389069g), java.lang.Integer.valueOf(wc4Var.f389069g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389066d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f389067e);
            fVar.e(3, this.f389068f);
            fVar.e(4, this.f389069g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f389067e) + b36.f.e(3, this.f389068f) + b36.f.e(4, this.f389069g);
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
        r45.wc4 wc4Var = (r45.wc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wc4Var.f389067e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                wc4Var.f389068f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wc4Var.f389069g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.re0 re0Var = new r45.re0();
            if (bArr2 != null && bArr2.length > 0) {
                re0Var.parseFrom(bArr2);
            }
            wc4Var.f389066d.add(re0Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f389066d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "items", linkedList, false);
            eVar.d(jSONObject, "update_time", java.lang.Integer.valueOf(this.f389067e), false);
            eVar.d(jSONObject, "expire_time", java.lang.Integer.valueOf(this.f389068f), false);
            eVar.d(jSONObject, "max_dict_size", java.lang.Integer.valueOf(this.f389069g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
