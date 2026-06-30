package r45;

/* loaded from: classes11.dex */
public class lk4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f379543d;

    /* renamed from: e, reason: collision with root package name */
    public int f379544e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f379545f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f379546g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f379547h;

    /* renamed from: i, reason: collision with root package name */
    public int f379548i;

    /* renamed from: m, reason: collision with root package name */
    public r45.du5 f379549m;

    /* renamed from: n, reason: collision with root package name */
    public r45.du5 f379550n;

    /* renamed from: o, reason: collision with root package name */
    public r45.du5 f379551o;

    /* renamed from: p, reason: collision with root package name */
    public int f379552p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379553q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379554r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379555s;

    /* renamed from: t, reason: collision with root package name */
    public int f379556t;

    /* renamed from: u, reason: collision with root package name */
    public int f379557u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f379558v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f379559w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lk4)) {
            return false;
        }
        r45.lk4 lk4Var = (r45.lk4) fVar;
        return n51.f.a(this.f379543d, lk4Var.f379543d) && n51.f.a(java.lang.Integer.valueOf(this.f379544e), java.lang.Integer.valueOf(lk4Var.f379544e)) && n51.f.a(this.f379545f, lk4Var.f379545f) && n51.f.a(this.f379546g, lk4Var.f379546g) && n51.f.a(this.f379547h, lk4Var.f379547h) && n51.f.a(java.lang.Integer.valueOf(this.f379548i), java.lang.Integer.valueOf(lk4Var.f379548i)) && n51.f.a(this.f379549m, lk4Var.f379549m) && n51.f.a(this.f379550n, lk4Var.f379550n) && n51.f.a(this.f379551o, lk4Var.f379551o) && n51.f.a(java.lang.Integer.valueOf(this.f379552p), java.lang.Integer.valueOf(lk4Var.f379552p)) && n51.f.a(this.f379553q, lk4Var.f379553q) && n51.f.a(this.f379554r, lk4Var.f379554r) && n51.f.a(this.f379555s, lk4Var.f379555s) && n51.f.a(java.lang.Integer.valueOf(this.f379556t), java.lang.Integer.valueOf(lk4Var.f379556t)) && n51.f.a(java.lang.Integer.valueOf(this.f379557u), java.lang.Integer.valueOf(lk4Var.f379557u)) && n51.f.a(this.f379558v, lk4Var.f379558v) && n51.f.a(this.f379559w, lk4Var.f379559w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f379543d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f379543d.writeFields(fVar);
            }
            fVar.e(2, this.f379544e);
            r45.du5 du5Var2 = this.f379545f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f379545f.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f379546g;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.computeSize());
                this.f379546g.writeFields(fVar);
            }
            r45.du5 du5Var4 = this.f379547h;
            if (du5Var4 != null) {
                fVar.i(5, du5Var4.computeSize());
                this.f379547h.writeFields(fVar);
            }
            fVar.e(6, this.f379548i);
            r45.du5 du5Var5 = this.f379549m;
            if (du5Var5 != null) {
                fVar.i(9, du5Var5.computeSize());
                this.f379549m.writeFields(fVar);
            }
            r45.du5 du5Var6 = this.f379550n;
            if (du5Var6 != null) {
                fVar.i(10, du5Var6.computeSize());
                this.f379550n.writeFields(fVar);
            }
            r45.du5 du5Var7 = this.f379551o;
            if (du5Var7 != null) {
                fVar.i(11, du5Var7.computeSize());
                this.f379551o.writeFields(fVar);
            }
            fVar.e(12, this.f379552p);
            java.lang.String str = this.f379553q;
            if (str != null) {
                fVar.j(13, str);
            }
            java.lang.String str2 = this.f379554r;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            java.lang.String str3 = this.f379555s;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            fVar.e(16, this.f379556t);
            fVar.e(17, this.f379557u);
            java.lang.String str4 = this.f379558v;
            if (str4 != null) {
                fVar.j(18, str4);
            }
            java.lang.String str5 = this.f379559w;
            if (str5 != null) {
                fVar.j(19, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var8 = this.f379543d;
            int i18 = (du5Var8 != null ? b36.f.i(1, du5Var8.computeSize()) + 0 : 0) + b36.f.e(2, this.f379544e);
            r45.du5 du5Var9 = this.f379545f;
            if (du5Var9 != null) {
                i18 += b36.f.i(3, du5Var9.computeSize());
            }
            r45.du5 du5Var10 = this.f379546g;
            if (du5Var10 != null) {
                i18 += b36.f.i(4, du5Var10.computeSize());
            }
            r45.du5 du5Var11 = this.f379547h;
            if (du5Var11 != null) {
                i18 += b36.f.i(5, du5Var11.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f379548i);
            r45.du5 du5Var12 = this.f379549m;
            if (du5Var12 != null) {
                e17 += b36.f.i(9, du5Var12.computeSize());
            }
            r45.du5 du5Var13 = this.f379550n;
            if (du5Var13 != null) {
                e17 += b36.f.i(10, du5Var13.computeSize());
            }
            r45.du5 du5Var14 = this.f379551o;
            if (du5Var14 != null) {
                e17 += b36.f.i(11, du5Var14.computeSize());
            }
            int e18 = e17 + b36.f.e(12, this.f379552p);
            java.lang.String str6 = this.f379553q;
            if (str6 != null) {
                e18 += b36.f.j(13, str6);
            }
            java.lang.String str7 = this.f379554r;
            if (str7 != null) {
                e18 += b36.f.j(14, str7);
            }
            java.lang.String str8 = this.f379555s;
            if (str8 != null) {
                e18 += b36.f.j(15, str8);
            }
            int e19 = e18 + b36.f.e(16, this.f379556t) + b36.f.e(17, this.f379557u);
            java.lang.String str9 = this.f379558v;
            if (str9 != null) {
                e19 += b36.f.j(18, str9);
            }
            java.lang.String str10 = this.f379559w;
            return str10 != null ? e19 + b36.f.j(19, str10) : e19;
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
        r45.lk4 lk4Var = (r45.lk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var15 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var15.b(bArr);
                    }
                    lk4Var.f379543d = du5Var15;
                }
                return 0;
            case 2:
                lk4Var.f379544e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var16 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var16.b(bArr2);
                    }
                    lk4Var.f379545f = du5Var16;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var17 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var17.b(bArr3);
                    }
                    lk4Var.f379546g = du5Var17;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var18 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var18.b(bArr4);
                    }
                    lk4Var.f379547h = du5Var18;
                }
                return 0;
            case 6:
                lk4Var.f379548i = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            default:
                return -1;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.du5 du5Var19 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var19.b(bArr5);
                    }
                    lk4Var.f379549m = du5Var19;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.du5 du5Var20 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var20.b(bArr6);
                    }
                    lk4Var.f379550n = du5Var20;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.du5 du5Var21 = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var21.b(bArr7);
                    }
                    lk4Var.f379551o = du5Var21;
                }
                return 0;
            case 12:
                lk4Var.f379552p = aVar2.g(intValue);
                return 0;
            case 13:
                lk4Var.f379553q = aVar2.k(intValue);
                return 0;
            case 14:
                lk4Var.f379554r = aVar2.k(intValue);
                return 0;
            case 15:
                lk4Var.f379555s = aVar2.k(intValue);
                return 0;
            case 16:
                lk4Var.f379556t = aVar2.g(intValue);
                return 0;
            case 17:
                lk4Var.f379557u = aVar2.g(intValue);
                return 0;
            case 18:
                lk4Var.f379558v = aVar2.k(intValue);
                return 0;
            case 19:
                lk4Var.f379559w = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f379543d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "MemberName", du5Var, false);
            eVar.d(jSONObject, "MemberStatus", java.lang.Integer.valueOf(this.f379544e), false);
            eVar.d(jSONObject, "NickName", this.f379545f, false);
            eVar.d(jSONObject, "PYInitial", this.f379546g, false);
            eVar.d(jSONObject, "QuanPin", this.f379547h, false);
            eVar.d(jSONObject, "Sex", java.lang.Integer.valueOf(this.f379548i), false);
            eVar.d(jSONObject, "Remark", this.f379549m, false);
            eVar.d(jSONObject, "RemarkPYInitial", this.f379550n, false);
            eVar.d(jSONObject, "RemarkQuanPin", this.f379551o, false);
            eVar.d(jSONObject, "ContactType", java.lang.Integer.valueOf(this.f379552p), false);
            eVar.d(jSONObject, "Province", this.f379553q, false);
            eVar.d(jSONObject, "City", this.f379554r, false);
            eVar.d(jSONObject, "Signature", this.f379555s, false);
            eVar.d(jSONObject, "PersonalCard", java.lang.Integer.valueOf(this.f379556t), false);
            eVar.d(jSONObject, "VerifyFlag", java.lang.Integer.valueOf(this.f379557u), false);
            eVar.d(jSONObject, "VerifyInfo", this.f379558v, false);
            eVar.d(jSONObject, "Country", this.f379559w, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
