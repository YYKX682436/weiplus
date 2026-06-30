package pj4;

/* loaded from: classes4.dex */
public class e1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public pj4.p1 f355031d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.x0 f355032e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.k0 f355033f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f355034g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.e1)) {
            return false;
        }
        pj4.e1 e1Var = (pj4.e1) fVar;
        return n51.f.a(this.BaseResponse, e1Var.BaseResponse) && n51.f.a(this.f355031d, e1Var.f355031d) && n51.f.a(this.f355032e, e1Var.f355032e) && n51.f.a(this.f355033f, e1Var.f355033f) && n51.f.a(this.f355034g, e1Var.f355034g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355034g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            pj4.p1 p1Var = this.f355031d;
            if (p1Var != null) {
                fVar.i(2, p1Var.computeSize());
                this.f355031d.writeFields(fVar);
            }
            pj4.x0 x0Var = this.f355032e;
            if (x0Var != null) {
                fVar.i(3, x0Var.computeSize());
                this.f355032e.writeFields(fVar);
            }
            pj4.k0 k0Var = this.f355033f;
            if (k0Var != null) {
                fVar.i(4, k0Var.computeSize());
                this.f355033f.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            pj4.p1 p1Var2 = this.f355031d;
            if (p1Var2 != null) {
                i18 += b36.f.i(2, p1Var2.computeSize());
            }
            pj4.x0 x0Var2 = this.f355032e;
            if (x0Var2 != null) {
                i18 += b36.f.i(3, x0Var2.computeSize());
            }
            pj4.k0 k0Var2 = this.f355033f;
            if (k0Var2 != null) {
                i18 += b36.f.i(4, k0Var2.computeSize());
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        pj4.e1 e1Var = (pj4.e1) objArr[1];
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
                e1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                pj4.p1 p1Var3 = new pj4.p1();
                if (bArr3 != null && bArr3.length > 0) {
                    p1Var3.parseFrom(bArr3);
                }
                e1Var.f355031d = p1Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                pj4.x0 x0Var3 = new pj4.x0();
                if (bArr4 != null && bArr4.length > 0) {
                    x0Var3.parseFrom(bArr4);
                }
                e1Var.f355032e = x0Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr5 = (byte[]) j27.get(i29);
                pj4.k0 k0Var3 = new pj4.k0();
                if (bArr5 != null && bArr5.length > 0) {
                    k0Var3.parseFrom(bArr5);
                }
                e1Var.f355033f = k0Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr6 = (byte[]) j28.get(i37);
            pj4.p1 p1Var4 = new pj4.p1();
            if (bArr6 != null && bArr6.length > 0) {
                p1Var4.parseFrom(bArr6);
            }
            e1Var.f355034g.add(p1Var4);
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
            eVar.d(jSONObject, "icon_config", this.f355031d, false);
            eVar.d(jSONObject, "cover_agenda", this.f355032e, false);
            eVar.d(jSONObject, "key_value_config", this.f355033f, false);
            eVar.d(jSONObject, "icon_configs", this.f355034g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
