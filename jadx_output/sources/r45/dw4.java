package r45;

/* loaded from: classes9.dex */
public class dw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.c50 f372777d;

    /* renamed from: e, reason: collision with root package name */
    public int f372778e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f372779f;

    /* renamed from: g, reason: collision with root package name */
    public int f372780g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372781h;

    /* renamed from: i, reason: collision with root package name */
    public int f372782i;

    /* renamed from: m, reason: collision with root package name */
    public long f372783m;

    /* renamed from: n, reason: collision with root package name */
    public long f372784n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dw4)) {
            return false;
        }
        r45.dw4 dw4Var = (r45.dw4) fVar;
        return n51.f.a(this.f372777d, dw4Var.f372777d) && n51.f.a(java.lang.Integer.valueOf(this.f372778e), java.lang.Integer.valueOf(dw4Var.f372778e)) && n51.f.a(this.f372779f, dw4Var.f372779f) && n51.f.a(java.lang.Integer.valueOf(this.f372780g), java.lang.Integer.valueOf(dw4Var.f372780g)) && n51.f.a(this.f372781h, dw4Var.f372781h) && n51.f.a(java.lang.Integer.valueOf(this.f372782i), java.lang.Integer.valueOf(dw4Var.f372782i)) && n51.f.a(java.lang.Long.valueOf(this.f372783m), java.lang.Long.valueOf(dw4Var.f372783m)) && n51.f.a(java.lang.Long.valueOf(this.f372784n), java.lang.Long.valueOf(dw4Var.f372784n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.c50 c50Var = this.f372777d;
            if (c50Var != null) {
                fVar.i(1, c50Var.computeSize());
                this.f372777d.writeFields(fVar);
            }
            fVar.e(2, this.f372778e);
            r45.cu5 cu5Var = this.f372779f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f372779f.writeFields(fVar);
            }
            fVar.e(4, this.f372780g);
            java.lang.String str = this.f372781h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f372782i);
            fVar.h(7, this.f372783m);
            fVar.h(9, this.f372784n);
            return 0;
        }
        if (i17 == 1) {
            r45.c50 c50Var2 = this.f372777d;
            int i18 = (c50Var2 != null ? 0 + b36.f.i(1, c50Var2.computeSize()) : 0) + b36.f.e(2, this.f372778e);
            r45.cu5 cu5Var2 = this.f372779f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f372780g);
            java.lang.String str2 = this.f372781h;
            if (str2 != null) {
                e17 += b36.f.j(5, str2);
            }
            return e17 + b36.f.e(6, this.f372782i) + b36.f.h(7, this.f372783m) + b36.f.h(9, this.f372784n);
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
        r45.dw4 dw4Var = (r45.dw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.c50 c50Var3 = new r45.c50();
                    if (bArr != null && bArr.length > 0) {
                        c50Var3.parseFrom(bArr);
                    }
                    dw4Var.f372777d = c50Var3;
                }
                return 0;
            case 2:
                dw4Var.f372778e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    dw4Var.f372779f = cu5Var3;
                }
                return 0;
            case 4:
                dw4Var.f372780g = aVar2.g(intValue);
                return 0;
            case 5:
                dw4Var.f372781h = aVar2.k(intValue);
                return 0;
            case 6:
                dw4Var.f372782i = aVar2.g(intValue);
                return 0;
            case 7:
                dw4Var.f372783m = aVar2.i(intValue);
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                dw4Var.f372784n = aVar2.i(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.c50 c50Var = this.f372777d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Oplog", c50Var, false);
            eVar.d(jSONObject, "Selector", java.lang.Integer.valueOf(this.f372778e), false);
            eVar.d(jSONObject, "KeyBuf", this.f372779f, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f372780g), false);
            eVar.d(jSONObject, "DeviceType", this.f372781h, false);
            eVar.d(jSONObject, "SyncMsgDigest", java.lang.Integer.valueOf(this.f372782i), false);
            eVar.d(jSONObject, "prev_download_flag", java.lang.Long.valueOf(this.f372783m), false);
            eVar.d(jSONObject, "SyncFlag", java.lang.Long.valueOf(this.f372784n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
