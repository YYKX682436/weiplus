package r45;

/* loaded from: classes2.dex */
public class pp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383261d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rp f383262e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gx5 f383263f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yp f383264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383265h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pp)) {
            return false;
        }
        r45.pp ppVar = (r45.pp) fVar;
        return n51.f.a(this.f383261d, ppVar.f383261d) && n51.f.a(this.f383262e, ppVar.f383262e) && n51.f.a(this.f383263f, ppVar.f383263f) && n51.f.a(this.f383264g, ppVar.f383264g) && n51.f.a(this.f383265h, ppVar.f383265h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383261d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.rp rpVar = this.f383262e;
            if (rpVar != null) {
                fVar.i(2, rpVar.computeSize());
                this.f383262e.writeFields(fVar);
            }
            r45.gx5 gx5Var = this.f383263f;
            if (gx5Var != null) {
                fVar.i(3, gx5Var.computeSize());
                this.f383263f.writeFields(fVar);
            }
            r45.yp ypVar = this.f383264g;
            if (ypVar != null) {
                fVar.i(4, ypVar.computeSize());
                this.f383264g.writeFields(fVar);
            }
            java.lang.String str2 = this.f383265h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383261d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.rp rpVar2 = this.f383262e;
            if (rpVar2 != null) {
                j17 += b36.f.i(2, rpVar2.computeSize());
            }
            r45.gx5 gx5Var2 = this.f383263f;
            if (gx5Var2 != null) {
                j17 += b36.f.i(3, gx5Var2.computeSize());
            }
            r45.yp ypVar2 = this.f383264g;
            if (ypVar2 != null) {
                j17 += b36.f.i(4, ypVar2.computeSize());
            }
            java.lang.String str4 = this.f383265h;
            return str4 != null ? j17 + b36.f.j(5, str4) : j17;
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
        r45.pp ppVar = (r45.pp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ppVar.f383261d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.rp rpVar3 = new r45.rp();
                if (bArr != null && bArr.length > 0) {
                    rpVar3.parseFrom(bArr);
                }
                ppVar.f383262e = rpVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.gx5 gx5Var3 = new r45.gx5();
                if (bArr2 != null && bArr2.length > 0) {
                    gx5Var3.parseFrom(bArr2);
                }
                ppVar.f383263f = gx5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ppVar.f383265h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.yp ypVar3 = new r45.yp();
            if (bArr3 != null && bArr3.length > 0) {
                ypVar3.parseFrom(bArr3);
            }
            ppVar.f383264g = ypVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f383261d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "NickName", str, false);
            eVar.d(jSONObject, "DetailInfo", this.f383262e, false);
            eVar.d(jSONObject, "ContactItem", this.f383263f, false);
            eVar.d(jSONObject, "ServiceInfo", this.f383264g, false);
            eVar.d(jSONObject, "JumpUrl", this.f383265h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
