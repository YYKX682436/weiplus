package r45;

/* loaded from: classes4.dex */
public class ur1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f387587d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387588e;

    /* renamed from: f, reason: collision with root package name */
    public long f387589f;

    /* renamed from: g, reason: collision with root package name */
    public long f387590g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f387591h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387592i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ur1)) {
            return false;
        }
        r45.ur1 ur1Var = (r45.ur1) fVar;
        return n51.f.a(this.BaseRequest, ur1Var.BaseRequest) && n51.f.a(this.f387587d, ur1Var.f387587d) && n51.f.a(this.f387588e, ur1Var.f387588e) && n51.f.a(java.lang.Long.valueOf(this.f387589f), java.lang.Long.valueOf(ur1Var.f387589f)) && n51.f.a(java.lang.Long.valueOf(this.f387590g), java.lang.Long.valueOf(ur1Var.f387590g)) && n51.f.a(this.f387591h, ur1Var.f387591h) && n51.f.a(this.f387592i, ur1Var.f387592i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387591h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f387587d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f387587d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f387588e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f387589f);
            fVar.h(5, this.f387590g);
            fVar.g(6, 8, linkedList);
            java.lang.String str = this.f387592i;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f387587d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f387588e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int h17 = i18 + b36.f.h(4, this.f387589f) + b36.f.h(5, this.f387590g) + b36.f.g(6, 8, linkedList);
            java.lang.String str2 = this.f387592i;
            return str2 != null ? h17 + b36.f.j(7, str2) : h17;
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
        r45.ur1 ur1Var = (r45.ur1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    ur1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.parseFrom(bArr3);
                    }
                    ur1Var.f387587d = kv0Var3;
                }
                return 0;
            case 3:
                ur1Var.f387588e = aVar2.d(intValue);
                return 0;
            case 4:
                ur1Var.f387589f = aVar2.i(intValue);
                return 0;
            case 5:
                ur1Var.f387590g = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tn tnVar = new r45.tn();
                    if (bArr4 != null && bArr4.length > 0) {
                        tnVar.parseFrom(bArr4);
                    }
                    ur1Var.f387591h.add(tnVar);
                }
                return 0;
            case 7:
                ur1Var.f387592i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "finder_basereq", this.f387587d, false);
            eVar.d(jSONObject, "live_cookies", this.f387588e, false);
            eVar.d(jSONObject, "object_id", java.lang.Long.valueOf(this.f387589f), false);
            eVar.d(jSONObject, "live_id", java.lang.Long.valueOf(this.f387590g), false);
            eVar.d(jSONObject, "box_list", this.f387591h, false);
            eVar.d(jSONObject, "finder_username", this.f387592i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
