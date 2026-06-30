package r45;

/* loaded from: classes2.dex */
public class dm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ks5 f372558d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372559e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dm)) {
            return false;
        }
        r45.dm dmVar = (r45.dm) fVar;
        return n51.f.a(this.f372558d, dmVar.f372558d) && n51.f.a(this.f372559e, dmVar.f372559e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ks5 ks5Var = this.f372558d;
            if (ks5Var != null) {
                fVar.i(1, ks5Var.computeSize());
                this.f372558d.writeFields(fVar);
            }
            java.lang.String str = this.f372559e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ks5 ks5Var2 = this.f372558d;
            int i18 = ks5Var2 != null ? 0 + b36.f.i(1, ks5Var2.computeSize()) : 0;
            java.lang.String str2 = this.f372559e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.dm dmVar = (r45.dm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            dmVar.f372559e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ks5 ks5Var3 = new r45.ks5();
            if (bArr != null && bArr.length > 0) {
                ks5Var3.parseFrom(bArr);
            }
            dmVar.f372558d = ks5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ks5 ks5Var = this.f372558d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "CommContent", ks5Var, false);
            eVar.d(jSONObject, "BizUserAttrInfo", this.f372559e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
