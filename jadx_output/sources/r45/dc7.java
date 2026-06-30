package r45;

/* loaded from: classes4.dex */
public class dc7 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.jw6 f372314d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372315e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.uf7 f372316f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dc7)) {
            return false;
        }
        r45.dc7 dc7Var = (r45.dc7) fVar;
        return n51.f.a(this.BaseResponse, dc7Var.BaseResponse) && n51.f.a(this.f372314d, dc7Var.f372314d) && n51.f.a(this.f372315e, dc7Var.f372315e) && n51.f.a(this.f372316f, dc7Var.f372316f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372315e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.jw6 jw6Var = this.f372314d;
            if (jw6Var != null) {
                fVar.i(2, jw6Var.computeSize());
                this.f372314d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            r45.uf7 uf7Var = this.f372316f;
            if (uf7Var != null) {
                fVar.i(4, uf7Var.computeSize());
                this.f372316f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.jw6 jw6Var2 = this.f372314d;
            if (jw6Var2 != null) {
                i18 += b36.f.i(2, jw6Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            r45.uf7 uf7Var2 = this.f372316f;
            return uf7Var2 != null ? g17 + b36.f.i(4, uf7Var2.computeSize()) : g17;
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
        r45.dc7 dc7Var = (r45.dc7) objArr[1];
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
                dc7Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.jw6 jw6Var3 = new r45.jw6();
                if (bArr3 != null && bArr3.length > 0) {
                    jw6Var3.parseFrom(bArr3);
                }
                dc7Var.f372314d = jw6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                r45.vb vbVar = new r45.vb();
                if (bArr4 != null && bArr4.length > 0) {
                    vbVar.parseFrom(bArr4);
                }
                dc7Var.f372315e.add(vbVar);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.uf7 uf7Var3 = new r45.uf7();
            if (bArr5 != null && bArr5.length > 0) {
                uf7Var3.parseFrom(bArr5);
            }
            dc7Var.f372316f = uf7Var3;
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
            eVar.d(jSONObject, "userMgrBaseResp", this.f372314d, false);
            eVar.d(jSONObject, "authItem", this.f372315e, false);
            eVar.d(jSONObject, "use_user_info", this.f372316f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
