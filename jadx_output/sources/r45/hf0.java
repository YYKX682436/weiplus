package r45;

/* loaded from: classes2.dex */
public class hf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ks5 f376103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376105f;

    /* renamed from: g, reason: collision with root package name */
    public int f376106g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376107h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376108i;

    /* renamed from: m, reason: collision with root package name */
    public int f376109m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376110n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hf0)) {
            return false;
        }
        r45.hf0 hf0Var = (r45.hf0) fVar;
        return n51.f.a(this.f376103d, hf0Var.f376103d) && n51.f.a(this.f376104e, hf0Var.f376104e) && n51.f.a(this.f376105f, hf0Var.f376105f) && n51.f.a(java.lang.Integer.valueOf(this.f376106g), java.lang.Integer.valueOf(hf0Var.f376106g)) && n51.f.a(this.f376107h, hf0Var.f376107h) && n51.f.a(this.f376108i, hf0Var.f376108i) && n51.f.a(java.lang.Integer.valueOf(this.f376109m), java.lang.Integer.valueOf(hf0Var.f376109m)) && n51.f.a(this.f376110n, hf0Var.f376110n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ks5 ks5Var = this.f376103d;
            if (ks5Var != null) {
                fVar.i(1, ks5Var.computeSize());
                this.f376103d.writeFields(fVar);
            }
            java.lang.String str = this.f376104e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376105f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f376106g);
            java.lang.String str3 = this.f376107h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f376108i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f376109m);
            java.lang.String str5 = this.f376110n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ks5 ks5Var2 = this.f376103d;
            int i18 = ks5Var2 != null ? 0 + b36.f.i(1, ks5Var2.computeSize()) : 0;
            java.lang.String str6 = this.f376104e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f376105f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f376106g);
            java.lang.String str8 = this.f376107h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f376108i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            int e18 = e17 + b36.f.e(7, this.f376109m);
            java.lang.String str10 = this.f376110n;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.hf0 hf0Var = (r45.hf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ks5 ks5Var3 = new r45.ks5();
                    if (bArr != null && bArr.length > 0) {
                        ks5Var3.parseFrom(bArr);
                    }
                    hf0Var.f376103d = ks5Var3;
                }
                return 0;
            case 2:
                hf0Var.f376104e = aVar2.k(intValue);
                return 0;
            case 3:
                hf0Var.f376105f = aVar2.k(intValue);
                return 0;
            case 4:
                hf0Var.f376106g = aVar2.g(intValue);
                return 0;
            case 5:
                hf0Var.f376107h = aVar2.k(intValue);
                return 0;
            case 6:
                hf0Var.f376108i = aVar2.k(intValue);
                return 0;
            case 7:
                hf0Var.f376109m = aVar2.g(intValue);
                return 0;
            case 8:
                hf0Var.f376110n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ks5 ks5Var = this.f376103d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "CommContent", ks5Var, false);
            eVar.d(jSONObject, "JumpUrl", this.f376104e, false);
            eVar.d(jSONObject, "Date", this.f376105f, false);
            eVar.d(jSONObject, "JumpType", java.lang.Integer.valueOf(this.f376106g), false);
            eVar.d(jSONObject, "UserName", this.f376107h, false);
            eVar.d(jSONObject, "WeappPath", this.f376108i, false);
            eVar.d(jSONObject, "WeappVersion", java.lang.Integer.valueOf(this.f376109m), false);
            eVar.d(jSONObject, "SceneNote", this.f376110n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
