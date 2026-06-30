package pj4;

/* loaded from: classes2.dex */
public class k1 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f355156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355157f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f355155d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f355158g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.k1)) {
            return false;
        }
        pj4.k1 k1Var = (pj4.k1) fVar;
        return n51.f.a(this.BaseResponse, k1Var.BaseResponse) && n51.f.a(this.f355155d, k1Var.f355155d) && n51.f.a(this.f355156e, k1Var.f355156e) && n51.f.a(java.lang.Boolean.valueOf(this.f355157f), java.lang.Boolean.valueOf(k1Var.f355157f)) && n51.f.a(this.f355158g, k1Var.f355158g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355158g;
        java.util.LinkedList linkedList2 = this.f355155d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f355156e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f355157f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar2 = this.f355156e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.a(4, this.f355157f) + b36.f.g(5, 8, linkedList);
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
        pj4.k1 k1Var = (pj4.k1) objArr[1];
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
                k1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                pj4.b2 b2Var = new pj4.b2();
                if (bArr3 != null && bArr3.length > 0) {
                    b2Var.parseFrom(bArr3);
                }
                k1Var.f355155d.add(b2Var);
            }
            return 0;
        }
        if (intValue == 3) {
            k1Var.f355156e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            k1Var.f355157f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            pj4.l2 l2Var = new pj4.l2();
            if (bArr4 != null && bArr4.length > 0) {
                l2Var.parseFrom(bArr4);
            }
            k1Var.f355158g.add(l2Var);
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
            eVar.d(jSONObject, "likeds", this.f355155d, false);
            eVar.d(jSONObject, "context", this.f355156e, false);
            eVar.d(jSONObject, "continue_flag", java.lang.Boolean.valueOf(this.f355157f), false);
            eVar.d(jSONObject, "referenceds", this.f355158g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
