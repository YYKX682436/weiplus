package r45;

/* loaded from: classes4.dex */
public class pn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f383204d;

    /* renamed from: e, reason: collision with root package name */
    public int f383205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383207g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383208h;

    /* renamed from: i, reason: collision with root package name */
    public int f383209i;

    /* renamed from: m, reason: collision with root package name */
    public int f383210m;

    /* renamed from: n, reason: collision with root package name */
    public int f383211n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xn1 f383212o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn)) {
            return false;
        }
        r45.pn pnVar = (r45.pn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f383204d), java.lang.Long.valueOf(pnVar.f383204d)) && n51.f.a(java.lang.Integer.valueOf(this.f383205e), java.lang.Integer.valueOf(pnVar.f383205e)) && n51.f.a(this.f383206f, pnVar.f383206f) && n51.f.a(this.f383207g, pnVar.f383207g) && n51.f.a(this.f383208h, pnVar.f383208h) && n51.f.a(java.lang.Integer.valueOf(this.f383209i), java.lang.Integer.valueOf(pnVar.f383209i)) && n51.f.a(java.lang.Integer.valueOf(this.f383210m), java.lang.Integer.valueOf(pnVar.f383210m)) && n51.f.a(java.lang.Integer.valueOf(this.f383211n), java.lang.Integer.valueOf(pnVar.f383211n)) && n51.f.a(this.f383212o, pnVar.f383212o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f383204d);
            fVar.e(2, this.f383205e);
            java.lang.String str = this.f383206f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383207g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383208h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f383209i);
            fVar.e(7, this.f383210m);
            fVar.e(8, this.f383211n);
            r45.xn1 xn1Var = this.f383212o;
            if (xn1Var != null) {
                fVar.i(9, xn1Var.computeSize());
                this.f383212o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f383204d) + 0 + b36.f.e(2, this.f383205e);
            java.lang.String str4 = this.f383206f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f383207g;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f383208h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            int e17 = h17 + b36.f.e(6, this.f383209i) + b36.f.e(7, this.f383210m) + b36.f.e(8, this.f383211n);
            r45.xn1 xn1Var2 = this.f383212o;
            return xn1Var2 != null ? e17 + b36.f.i(9, xn1Var2.computeSize()) : e17;
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
        r45.pn pnVar = (r45.pn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pnVar.f383204d = aVar2.i(intValue);
                return 0;
            case 2:
                pnVar.f383205e = aVar2.g(intValue);
                return 0;
            case 3:
                pnVar.f383206f = aVar2.k(intValue);
                return 0;
            case 4:
                pnVar.f383207g = aVar2.k(intValue);
                return 0;
            case 5:
                pnVar.f383208h = aVar2.k(intValue);
                return 0;
            case 6:
                pnVar.f383209i = aVar2.g(intValue);
                return 0;
            case 7:
                pnVar.f383210m = aVar2.g(intValue);
                return 0;
            case 8:
                pnVar.f383211n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.xn1 xn1Var3 = new r45.xn1();
                    if (bArr != null && bArr.length > 0) {
                        xn1Var3.parseFrom(bArr);
                    }
                    pnVar.f383212o = xn1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f383204d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_ID, valueOf, false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f383205e), false);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f383206f, false);
            eVar.d(jSONObject, "nickname", this.f383207g, false);
            eVar.d(jSONObject, "msg", this.f383208h, false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f383209i), false);
            eVar.d(jSONObject, "relation", java.lang.Integer.valueOf(this.f383210m), false);
            eVar.d(jSONObject, "del_flag", java.lang.Integer.valueOf(this.f383211n), false);
            eVar.d(jSONObject, "to_user_contact", this.f383212o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
