package r45;

/* loaded from: classes4.dex */
public class p61 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382782d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382783e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f382784f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382785g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f382786h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p61)) {
            return false;
        }
        r45.p61 p61Var = (r45.p61) fVar;
        return n51.f.a(this.BaseResponse, p61Var.BaseResponse) && n51.f.a(this.f382782d, p61Var.f382782d) && n51.f.a(this.f382783e, p61Var.f382783e) && n51.f.a(java.lang.Integer.valueOf(this.f382784f), java.lang.Integer.valueOf(p61Var.f382784f)) && n51.f.a(java.lang.Boolean.valueOf(this.f382785g), java.lang.Boolean.valueOf(p61Var.f382785g)) && n51.f.a(java.lang.Boolean.valueOf(this.f382786h), java.lang.Boolean.valueOf(p61Var.f382786h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382783e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f382782d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f382784f);
            fVar.a(5, this.f382785g);
            fVar.a(6, this.f382786h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f382782d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f382784f) + b36.f.a(5, this.f382785g) + b36.f.a(6, this.f382786h);
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
        r45.p61 p61Var = (r45.p61) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    p61Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                p61Var.f382782d = aVar2.d(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ch1 ch1Var = new r45.ch1();
                    if (bArr3 != null && bArr3.length > 0) {
                        ch1Var.parseFrom(bArr3);
                    }
                    p61Var.f382783e.add(ch1Var);
                }
                return 0;
            case 4:
                p61Var.f382784f = aVar2.g(intValue);
                return 0;
            case 5:
                p61Var.f382785g = aVar2.c(intValue);
                return 0;
            case 6:
                p61Var.f382786h = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "last_buffer", this.f382782d, false);
            eVar.d(jSONObject, "app_msg_list", this.f382783e, false);
            eVar.d(jSONObject, "next_interval_ms", java.lang.Integer.valueOf(this.f382784f), false);
            eVar.d(jSONObject, "has_new_msg", java.lang.Boolean.valueOf(this.f382785g), false);
            eVar.d(jSONObject, "need_clear_msg", java.lang.Boolean.valueOf(this.f382786h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
