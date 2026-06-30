package r45;

/* loaded from: classes12.dex */
public class di6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372513e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372514f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372515g;

    /* renamed from: h, reason: collision with root package name */
    public int f372516h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372517i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372518m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372519n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372520o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ak6 f372521p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.di6)) {
            return false;
        }
        r45.di6 di6Var = (r45.di6) fVar;
        return n51.f.a(this.f372512d, di6Var.f372512d) && n51.f.a(this.f372513e, di6Var.f372513e) && n51.f.a(this.f372514f, di6Var.f372514f) && n51.f.a(this.f372515g, di6Var.f372515g) && n51.f.a(java.lang.Integer.valueOf(this.f372516h), java.lang.Integer.valueOf(di6Var.f372516h)) && n51.f.a(this.f372517i, di6Var.f372517i) && n51.f.a(this.f372518m, di6Var.f372518m) && n51.f.a(this.f372519n, di6Var.f372519n) && n51.f.a(this.f372520o, di6Var.f372520o) && n51.f.a(this.f372521p, di6Var.f372521p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372512d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372513e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f372514f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str3 = this.f372515g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f372516h);
            com.tencent.mm.protobuf.g gVar2 = this.f372517i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            java.lang.String str4 = this.f372518m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f372519n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f372520o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            r45.ak6 ak6Var = this.f372521p;
            if (ak6Var != null) {
                fVar.i(10, ak6Var.computeSize());
                this.f372521p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f372512d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f372513e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f372514f;
            if (gVar3 != null) {
                j17 += b36.f.b(3, gVar3);
            }
            java.lang.String str9 = this.f372515g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f372516h);
            com.tencent.mm.protobuf.g gVar4 = this.f372517i;
            if (gVar4 != null) {
                e17 += b36.f.b(6, gVar4);
            }
            java.lang.String str10 = this.f372518m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f372519n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f372520o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            r45.ak6 ak6Var2 = this.f372521p;
            return ak6Var2 != null ? e17 + b36.f.i(10, ak6Var2.computeSize()) : e17;
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
        r45.di6 di6Var = (r45.di6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                di6Var.f372512d = aVar2.k(intValue);
                return 0;
            case 2:
                di6Var.f372513e = aVar2.k(intValue);
                return 0;
            case 3:
                di6Var.f372514f = aVar2.d(intValue);
                return 0;
            case 4:
                di6Var.f372515g = aVar2.k(intValue);
                return 0;
            case 5:
                di6Var.f372516h = aVar2.g(intValue);
                return 0;
            case 6:
                di6Var.f372517i = aVar2.d(intValue);
                return 0;
            case 7:
                di6Var.f372518m = aVar2.k(intValue);
                return 0;
            case 8:
                di6Var.f372519n = aVar2.k(intValue);
                return 0;
            case 9:
                di6Var.f372520o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ak6 ak6Var3 = new r45.ak6();
                    if (bArr != null && bArr.length > 0) {
                        ak6Var3.parseFrom(bArr);
                    }
                    di6Var.f372521p = ak6Var3;
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
            java.lang.String str = this.f372512d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Word", str, false);
            eVar.d(jSONObject, "DocId", this.f372513e, false);
            eVar.d(jSONObject, "DebugInfo", this.f372514f, false);
            eVar.d(jSONObject, "CacheJsonResult", this.f372515g, false);
            eVar.d(jSONObject, "JumpType", java.lang.Integer.valueOf(this.f372516h), false);
            eVar.d(jSONObject, "JumpUrl", this.f372517i, false);
            eVar.d(jSONObject, "Label", this.f372518m, false);
            eVar.d(jSONObject, "ExtInfo", this.f372519n, false);
            eVar.d(jSONObject, "wordHighlight", this.f372520o, false);
            eVar.d(jSONObject, "tagInfo", this.f372521p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
