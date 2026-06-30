package r45;

/* loaded from: classes15.dex */
public class pn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383236d;

    /* renamed from: e, reason: collision with root package name */
    public int f383237e;

    /* renamed from: f, reason: collision with root package name */
    public int f383238f;

    /* renamed from: g, reason: collision with root package name */
    public int f383239g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383240h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383241i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383242m;

    /* renamed from: n, reason: collision with root package name */
    public r45.on6 f383243n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f383244o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn6)) {
            return false;
        }
        r45.pn6 pn6Var = (r45.pn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383236d), java.lang.Integer.valueOf(pn6Var.f383236d)) && n51.f.a(java.lang.Integer.valueOf(this.f383237e), java.lang.Integer.valueOf(pn6Var.f383237e)) && n51.f.a(java.lang.Integer.valueOf(this.f383238f), java.lang.Integer.valueOf(pn6Var.f383238f)) && n51.f.a(java.lang.Integer.valueOf(this.f383239g), java.lang.Integer.valueOf(pn6Var.f383239g)) && n51.f.a(this.f383240h, pn6Var.f383240h) && n51.f.a(this.f383241i, pn6Var.f383241i) && n51.f.a(this.f383242m, pn6Var.f383242m) && n51.f.a(this.f383243n, pn6Var.f383243n) && n51.f.a(java.lang.Boolean.valueOf(this.f383244o), java.lang.Boolean.valueOf(pn6Var.f383244o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383236d);
            fVar.e(2, this.f383237e);
            fVar.e(3, this.f383238f);
            fVar.e(4, this.f383239g);
            java.lang.String str = this.f383240h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f383241i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f383242m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.on6 on6Var = this.f383243n;
            if (on6Var != null) {
                fVar.i(8, on6Var.computeSize());
                this.f383243n.writeFields(fVar);
            }
            fVar.a(9, this.f383244o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383236d) + 0 + b36.f.e(2, this.f383237e) + b36.f.e(3, this.f383238f) + b36.f.e(4, this.f383239g);
            java.lang.String str4 = this.f383240h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            java.lang.String str5 = this.f383241i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f383242m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            r45.on6 on6Var2 = this.f383243n;
            if (on6Var2 != null) {
                e17 += b36.f.i(8, on6Var2.computeSize());
            }
            return e17 + b36.f.a(9, this.f383244o);
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
        r45.pn6 pn6Var = (r45.pn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pn6Var.f383236d = aVar2.g(intValue);
                return 0;
            case 2:
                pn6Var.f383237e = aVar2.g(intValue);
                return 0;
            case 3:
                pn6Var.f383238f = aVar2.g(intValue);
                return 0;
            case 4:
                pn6Var.f383239g = aVar2.g(intValue);
                return 0;
            case 5:
                pn6Var.f383240h = aVar2.k(intValue);
                return 0;
            case 6:
                pn6Var.f383241i = aVar2.k(intValue);
                return 0;
            case 7:
                pn6Var.f383242m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.on6 on6Var3 = new r45.on6();
                    if (bArr != null && bArr.length > 0) {
                        on6Var3.parseFrom(bArr);
                    }
                    pn6Var.f383243n = on6Var3;
                }
                return 0;
            case 9:
                pn6Var.f383244o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f383236d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "beginTime", valueOf, false);
            eVar.d(jSONObject, "endTime", java.lang.Integer.valueOf(this.f383237e), false);
            eVar.d(jSONObject, "minShowTime", java.lang.Integer.valueOf(this.f383238f), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f383239g), false);
            eVar.d(jSONObject, dm.i4.COL_ID, this.f383240h, false);
            eVar.d(jSONObject, "subId", this.f383241i, false);
            eVar.d(jSONObject, "bizUin", this.f383242m, false);
            eVar.d(jSONObject, "videoDotInfo", this.f383243n, false);
            eVar.d(jSONObject, "isShow", java.lang.Boolean.valueOf(this.f383244o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
