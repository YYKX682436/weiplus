package r45;

/* loaded from: classes4.dex */
public class o61 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f381973d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381974e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qm1 f381975f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381976g;

    /* renamed from: h, reason: collision with root package name */
    public long f381977h;

    /* renamed from: i, reason: collision with root package name */
    public long f381978i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381979m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o61)) {
            return false;
        }
        r45.o61 o61Var = (r45.o61) fVar;
        return n51.f.a(this.BaseRequest, o61Var.BaseRequest) && n51.f.a(this.f381973d, o61Var.f381973d) && n51.f.a(this.f381974e, o61Var.f381974e) && n51.f.a(this.f381975f, o61Var.f381975f) && n51.f.a(this.f381976g, o61Var.f381976g) && n51.f.a(java.lang.Long.valueOf(this.f381977h), java.lang.Long.valueOf(o61Var.f381977h)) && n51.f.a(java.lang.Long.valueOf(this.f381978i), java.lang.Long.valueOf(o61Var.f381978i)) && n51.f.a(this.f381979m, o61Var.f381979m);
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
            r45.kv0 kv0Var = this.f381973d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f381973d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f381974e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.qm1 qm1Var = this.f381975f;
            if (qm1Var != null) {
                fVar.i(4, qm1Var.computeSize());
                this.f381975f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f381976g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.h(6, this.f381977h);
            fVar.h(7, this.f381978i);
            java.lang.String str = this.f381979m;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f381973d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f381974e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            r45.qm1 qm1Var2 = this.f381975f;
            if (qm1Var2 != null) {
                i18 += b36.f.i(4, qm1Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f381976g;
            if (gVar4 != null) {
                i18 += b36.f.b(5, gVar4);
            }
            int h17 = i18 + b36.f.h(6, this.f381977h) + b36.f.h(7, this.f381978i);
            java.lang.String str2 = this.f381979m;
            return str2 != null ? h17 + b36.f.j(8, str2) : h17;
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
        r45.o61 o61Var = (r45.o61) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    o61Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    o61Var.f381973d = kv0Var3;
                }
                return 0;
            case 3:
                o61Var.f381974e = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.qm1 qm1Var3 = new r45.qm1();
                    if (bArr3 != null && bArr3.length > 0) {
                        qm1Var3.parseFrom(bArr3);
                    }
                    o61Var.f381975f = qm1Var3;
                }
                return 0;
            case 5:
                o61Var.f381976g = aVar2.d(intValue);
                return 0;
            case 6:
                o61Var.f381977h = aVar2.i(intValue);
                return 0;
            case 7:
                o61Var.f381978i = aVar2.i(intValue);
                return 0;
            case 8:
                o61Var.f381979m = aVar2.k(intValue);
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
            eVar.d(jSONObject, "finder_basereq", this.f381973d, false);
            eVar.d(jSONObject, "live_cookies", this.f381974e, false);
            eVar.d(jSONObject, "box_id", this.f381975f, false);
            eVar.d(jSONObject, "last_buffer", this.f381976g, false);
            eVar.d(jSONObject, "object_id", java.lang.Long.valueOf(this.f381977h), false);
            eVar.d(jSONObject, "live_id", java.lang.Long.valueOf(this.f381978i), false);
            eVar.d(jSONObject, "finder_username", this.f381979m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
