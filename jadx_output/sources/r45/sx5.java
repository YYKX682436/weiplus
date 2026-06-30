package r45;

/* loaded from: classes2.dex */
public class sx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386010e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f386011f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.e64 f386012g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sx5)) {
            return false;
        }
        r45.sx5 sx5Var = (r45.sx5) fVar;
        return n51.f.a(this.f386009d, sx5Var.f386009d) && n51.f.a(this.f386010e, sx5Var.f386010e) && n51.f.a(this.f386011f, sx5Var.f386011f) && n51.f.a(this.f386012g, sx5Var.f386012g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386011f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386009d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386010e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            r45.e64 e64Var = this.f386012g;
            if (e64Var != null) {
                fVar.i(4, e64Var.computeSize());
                this.f386012g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386009d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f386010e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            r45.e64 e64Var2 = this.f386012g;
            return e64Var2 != null ? g17 + b36.f.i(4, e64Var2.computeSize()) : g17;
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
        r45.sx5 sx5Var = (r45.sx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sx5Var.f386009d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            sx5Var.f386010e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.x50 x50Var = new r45.x50();
                if (bArr2 != null && bArr2.length > 0) {
                    x50Var.parseFrom(bArr2);
                }
                sx5Var.f386011f.add(x50Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.e64 e64Var3 = new r45.e64();
            if (bArr3 != null && bArr3.length > 0) {
                e64Var3.parseFrom(bArr3);
            }
            sx5Var.f386012g = e64Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f386009d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "commReq", str, false);
            eVar.d(jSONObject, "requestId", this.f386010e, false);
            eVar.d(jSONObject, "ExtReqParams", this.f386011f, false);
            eVar.d(jSONObject, "Location", this.f386012g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
