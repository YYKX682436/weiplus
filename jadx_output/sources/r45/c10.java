package r45;

/* loaded from: classes4.dex */
public class c10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371203d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371204e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f371205f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c10)) {
            return false;
        }
        r45.c10 c10Var = (r45.c10) fVar;
        return n51.f.a(this.BaseRequest, c10Var.BaseRequest) && n51.f.a(this.f371203d, c10Var.f371203d) && n51.f.a(this.f371204e, c10Var.f371204e) && n51.f.a(this.f371205f, c10Var.f371205f);
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
            java.lang.String str = this.f371203d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371204e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.cu5 cu5Var = this.f371205f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f371205f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f371203d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f371204e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.cu5 cu5Var2 = this.f371205f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.computeSize()) : i18;
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
        r45.c10 c10Var = (r45.c10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                c10Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c10Var.f371203d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c10Var.f371204e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            c10Var.f371205f = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "DeviceBrand", this.f371203d, false);
            eVar.d(jSONObject, "DeviceModel", this.f371204e, false);
            eVar.d(jSONObject, "RandomEncryKey", this.f371205f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
