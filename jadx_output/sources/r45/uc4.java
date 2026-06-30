package r45;

/* loaded from: classes14.dex */
public class uc4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f387217d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pq5 f387218e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387219f;

    /* renamed from: g, reason: collision with root package name */
    public long f387220g;

    /* renamed from: h, reason: collision with root package name */
    public long f387221h;

    /* renamed from: i, reason: collision with root package name */
    public long f387222i;

    /* renamed from: m, reason: collision with root package name */
    public long f387223m;

    /* renamed from: n, reason: collision with root package name */
    public int f387224n;

    /* renamed from: o, reason: collision with root package name */
    public long f387225o = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc4)) {
            return false;
        }
        r45.uc4 uc4Var = (r45.uc4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f387217d), java.lang.Boolean.valueOf(uc4Var.f387217d)) && n51.f.a(this.f387218e, uc4Var.f387218e) && n51.f.a(this.f387219f, uc4Var.f387219f) && n51.f.a(java.lang.Long.valueOf(this.f387220g), java.lang.Long.valueOf(uc4Var.f387220g)) && n51.f.a(java.lang.Long.valueOf(this.f387221h), java.lang.Long.valueOf(uc4Var.f387221h)) && n51.f.a(java.lang.Long.valueOf(this.f387222i), java.lang.Long.valueOf(uc4Var.f387222i)) && n51.f.a(java.lang.Long.valueOf(this.f387223m), java.lang.Long.valueOf(uc4Var.f387223m)) && n51.f.a(java.lang.Integer.valueOf(this.f387224n), java.lang.Integer.valueOf(uc4Var.f387224n)) && n51.f.a(java.lang.Long.valueOf(this.f387225o), java.lang.Long.valueOf(uc4Var.f387225o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f387217d);
            r45.pq5 pq5Var = this.f387218e;
            if (pq5Var != null) {
                fVar.i(2, pq5Var.computeSize());
                this.f387218e.writeFields(fVar);
            }
            java.lang.String str = this.f387219f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f387220g);
            fVar.h(5, this.f387221h);
            fVar.h(6, this.f387222i);
            fVar.h(7, this.f387223m);
            fVar.e(8, this.f387224n);
            fVar.h(9, this.f387225o);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f387217d) + 0;
            r45.pq5 pq5Var2 = this.f387218e;
            if (pq5Var2 != null) {
                a17 += b36.f.i(2, pq5Var2.computeSize());
            }
            java.lang.String str2 = this.f387219f;
            if (str2 != null) {
                a17 += b36.f.j(3, str2);
            }
            return a17 + b36.f.h(4, this.f387220g) + b36.f.h(5, this.f387221h) + b36.f.h(6, this.f387222i) + b36.f.h(7, this.f387223m) + b36.f.e(8, this.f387224n) + b36.f.h(9, this.f387225o);
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
        r45.uc4 uc4Var = (r45.uc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uc4Var.f387217d = aVar2.c(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.pq5 pq5Var3 = new r45.pq5();
                    if (bArr != null && bArr.length > 0) {
                        pq5Var3.parseFrom(bArr);
                    }
                    uc4Var.f387218e = pq5Var3;
                }
                return 0;
            case 3:
                uc4Var.f387219f = aVar2.k(intValue);
                return 0;
            case 4:
                uc4Var.f387220g = aVar2.i(intValue);
                return 0;
            case 5:
                uc4Var.f387221h = aVar2.i(intValue);
                return 0;
            case 6:
                uc4Var.f387222i = aVar2.i(intValue);
                return 0;
            case 7:
                uc4Var.f387223m = aVar2.i(intValue);
                return 0;
            case 8:
                uc4Var.f387224n = aVar2.g(intValue);
                return 0;
            case 9:
                uc4Var.f387225o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f387217d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "isBatchReport", valueOf, false);
            eVar.d(jSONObject, "itemData", this.f387218e, false);
            eVar.d(jSONObject, "dataSource", this.f387219f, false);
            eVar.d(jSONObject, "curReportTime", java.lang.Long.valueOf(this.f387220g), false);
            eVar.d(jSONObject, "localItemReportId", java.lang.Long.valueOf(this.f387221h), false);
            eVar.d(jSONObject, "retryDelayTime", java.lang.Long.valueOf(this.f387222i), false);
            eVar.d(jSONObject, "lastRetryTime", java.lang.Long.valueOf(this.f387223m), false);
            eVar.d(jSONObject, "sendErrCode", java.lang.Integer.valueOf(this.f387224n), false);
            eVar.d(jSONObject, "batchDelayTime", java.lang.Long.valueOf(this.f387225o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
