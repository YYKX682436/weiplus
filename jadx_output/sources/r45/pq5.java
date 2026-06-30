package r45;

/* loaded from: classes14.dex */
public class pq5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nq5 f383313d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383314e;

    /* renamed from: f, reason: collision with root package name */
    public r45.uq5 f383315f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383316g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383317h;

    /* renamed from: i, reason: collision with root package name */
    public int f383318i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq5)) {
            return false;
        }
        r45.pq5 pq5Var = (r45.pq5) fVar;
        return n51.f.a(this.f383313d, pq5Var.f383313d) && n51.f.a(this.f383314e, pq5Var.f383314e) && n51.f.a(this.f383315f, pq5Var.f383315f) && n51.f.a(this.f383316g, pq5Var.f383316g) && n51.f.a(this.f383317h, pq5Var.f383317h) && n51.f.a(java.lang.Integer.valueOf(this.f383318i), java.lang.Integer.valueOf(pq5Var.f383318i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nq5 nq5Var = this.f383313d;
            if (nq5Var != null) {
                fVar.i(1, nq5Var.computeSize());
                this.f383313d.writeFields(fVar);
            }
            java.lang.String str = this.f383314e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.uq5 uq5Var = this.f383315f;
            if (uq5Var != null) {
                fVar.i(3, uq5Var.computeSize());
                this.f383315f.writeFields(fVar);
            }
            java.lang.String str2 = this.f383316g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383317h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f383318i);
            return 0;
        }
        if (i17 == 1) {
            r45.nq5 nq5Var2 = this.f383313d;
            int i18 = nq5Var2 != null ? 0 + b36.f.i(1, nq5Var2.computeSize()) : 0;
            java.lang.String str4 = this.f383314e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.uq5 uq5Var2 = this.f383315f;
            if (uq5Var2 != null) {
                i18 += b36.f.i(3, uq5Var2.computeSize());
            }
            java.lang.String str5 = this.f383316g;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f383317h;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f383318i);
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
        r45.pq5 pq5Var = (r45.pq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.nq5 nq5Var3 = new r45.nq5();
                    if (bArr != null && bArr.length > 0) {
                        nq5Var3.parseFrom(bArr);
                    }
                    pq5Var.f383313d = nq5Var3;
                }
                return 0;
            case 2:
                pq5Var.f383314e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.uq5 uq5Var3 = new r45.uq5();
                    if (bArr2 != null && bArr2.length > 0) {
                        uq5Var3.parseFrom(bArr2);
                    }
                    pq5Var.f383315f = uq5Var3;
                }
                return 0;
            case 4:
                pq5Var.f383316g = aVar2.k(intValue);
                return 0;
            case 5:
                pq5Var.f383317h = aVar2.k(intValue);
                return 0;
            case 6:
                pq5Var.f383318i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.nq5 nq5Var = this.f383313d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "item", nq5Var, false);
            eVar.d(jSONObject, "event_id", this.f383314e, false);
            eVar.d(jSONObject, "event_time", this.f383315f, false);
            eVar.d(jSONObject, "data_json", this.f383316g, false);
            eVar.d(jSONObject, "local_item_request_id", this.f383317h, false);
            eVar.d(jSONObject, "item_retry_cnt", java.lang.Integer.valueOf(this.f383318i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
