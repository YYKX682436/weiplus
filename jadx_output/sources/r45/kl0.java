package r45;

/* loaded from: classes8.dex */
public class kl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b50 f378799d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378800e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378801f;

    /* renamed from: g, reason: collision with root package name */
    public long f378802g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378803h;

    /* renamed from: i, reason: collision with root package name */
    public int f378804i;

    /* renamed from: m, reason: collision with root package name */
    public int f378805m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kl0)) {
            return false;
        }
        r45.kl0 kl0Var = (r45.kl0) fVar;
        return n51.f.a(this.f378799d, kl0Var.f378799d) && n51.f.a(this.f378800e, kl0Var.f378800e) && n51.f.a(this.f378801f, kl0Var.f378801f) && n51.f.a(java.lang.Long.valueOf(this.f378802g), java.lang.Long.valueOf(kl0Var.f378802g)) && n51.f.a(this.f378803h, kl0Var.f378803h) && n51.f.a(java.lang.Integer.valueOf(this.f378804i), java.lang.Integer.valueOf(kl0Var.f378804i)) && n51.f.a(java.lang.Integer.valueOf(this.f378805m), java.lang.Integer.valueOf(kl0Var.f378805m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b50 b50Var = this.f378799d;
            if (b50Var != null) {
                fVar.i(1, b50Var.computeSize());
                this.f378799d.writeFields(fVar);
            }
            java.lang.String str = this.f378800e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378801f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f378802g);
            java.lang.String str3 = this.f378803h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f378804i);
            fVar.e(7, this.f378805m);
            return 0;
        }
        if (i17 == 1) {
            r45.b50 b50Var2 = this.f378799d;
            int i18 = b50Var2 != null ? 0 + b36.f.i(1, b50Var2.computeSize()) : 0;
            java.lang.String str4 = this.f378800e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f378801f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f378802g);
            java.lang.String str6 = this.f378803h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            return h17 + b36.f.e(6, this.f378804i) + b36.f.e(7, this.f378805m);
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
        r45.kl0 kl0Var = (r45.kl0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.b50 b50Var3 = new r45.b50();
                    if (bArr != null && bArr.length > 0) {
                        b50Var3.parseFrom(bArr);
                    }
                    kl0Var.f378799d = b50Var3;
                }
                return 0;
            case 2:
                kl0Var.f378800e = aVar2.k(intValue);
                return 0;
            case 3:
                kl0Var.f378801f = aVar2.k(intValue);
                return 0;
            case 4:
                kl0Var.f378802g = aVar2.i(intValue);
                return 0;
            case 5:
                kl0Var.f378803h = aVar2.k(intValue);
                return 0;
            case 6:
                kl0Var.f378804i = aVar2.g(intValue);
                return 0;
            case 7:
                kl0Var.f378805m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.b50 b50Var = this.f378799d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "cmdItem", b50Var, false);
            eVar.d(jSONObject, "clientVersion", this.f378800e, false);
            eVar.d(jSONObject, "reversion", this.f378801f, false);
            eVar.d(jSONObject, "time", java.lang.Long.valueOf(this.f378802g), false);
            eVar.d(jSONObject, "errStack", this.f378803h, false);
            eVar.d(jSONObject, "callSource", java.lang.Integer.valueOf(this.f378804i), false);
            eVar.d(jSONObject, "msgType", java.lang.Integer.valueOf(this.f378805m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
