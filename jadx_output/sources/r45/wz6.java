package r45;

/* loaded from: classes4.dex */
public class wz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.y80 f389607d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389608e = true;

    /* renamed from: f, reason: collision with root package name */
    public r45.bz6 f389609f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389610g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wz6)) {
            return false;
        }
        r45.wz6 wz6Var = (r45.wz6) fVar;
        return n51.f.a(this.f389607d, wz6Var.f389607d) && n51.f.a(java.lang.Boolean.valueOf(this.f389608e), java.lang.Boolean.valueOf(wz6Var.f389608e)) && n51.f.a(this.f389609f, wz6Var.f389609f) && n51.f.a(this.f389610g, wz6Var.f389610g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.y80 y80Var = this.f389607d;
            if (y80Var != null) {
                fVar.i(1, y80Var.computeSize());
                this.f389607d.writeFields(fVar);
            }
            fVar.a(2, this.f389608e);
            r45.bz6 bz6Var = this.f389609f;
            if (bz6Var != null) {
                fVar.i(3, bz6Var.computeSize());
                this.f389609f.writeFields(fVar);
            }
            java.lang.String str = this.f389610g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.y80 y80Var2 = this.f389607d;
            int i18 = (y80Var2 != null ? 0 + b36.f.i(1, y80Var2.computeSize()) : 0) + b36.f.a(2, this.f389608e);
            r45.bz6 bz6Var2 = this.f389609f;
            if (bz6Var2 != null) {
                i18 += b36.f.i(3, bz6Var2.computeSize());
            }
            java.lang.String str2 = this.f389610g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.wz6 wz6Var = (r45.wz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.y80 y80Var3 = new r45.y80();
                if (bArr != null && bArr.length > 0) {
                    y80Var3.parseFrom(bArr);
                }
                wz6Var.f389607d = y80Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            wz6Var.f389608e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            wz6Var.f389610g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.bz6 bz6Var3 = new r45.bz6();
            if (bArr2 != null && bArr2.length > 0) {
                bz6Var3.parseFrom(bArr2);
            }
            wz6Var.f389609f = bz6Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.y80 y80Var = this.f389607d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ContentId", y80Var, false);
            eVar.d(jSONObject, "Valid", java.lang.Boolean.valueOf(this.f389608e), false);
            eVar.d(jSONObject, "VideoCdnInfo", this.f389609f, false);
            eVar.d(jSONObject, "VideoApi", this.f389610g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
