package r45;

/* loaded from: classes2.dex */
public class f66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374056d;

    /* renamed from: e, reason: collision with root package name */
    public int f374057e;

    /* renamed from: f, reason: collision with root package name */
    public int f374058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374059g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374060h;

    /* renamed from: i, reason: collision with root package name */
    public int f374061i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e64 f374062m;

    /* renamed from: n, reason: collision with root package name */
    public int f374063n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374064o;

    /* renamed from: p, reason: collision with root package name */
    public int f374065p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374066q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f374067r;

    /* renamed from: s, reason: collision with root package name */
    public r45.j30 f374068s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f66)) {
            return false;
        }
        r45.f66 f66Var = (r45.f66) fVar;
        return n51.f.a(this.f374056d, f66Var.f374056d) && n51.f.a(java.lang.Integer.valueOf(this.f374057e), java.lang.Integer.valueOf(f66Var.f374057e)) && n51.f.a(java.lang.Integer.valueOf(this.f374058f), java.lang.Integer.valueOf(f66Var.f374058f)) && n51.f.a(this.f374059g, f66Var.f374059g) && n51.f.a(this.f374060h, f66Var.f374060h) && n51.f.a(java.lang.Integer.valueOf(this.f374061i), java.lang.Integer.valueOf(f66Var.f374061i)) && n51.f.a(this.f374062m, f66Var.f374062m) && n51.f.a(java.lang.Integer.valueOf(this.f374063n), java.lang.Integer.valueOf(f66Var.f374063n)) && n51.f.a(this.f374064o, f66Var.f374064o) && n51.f.a(java.lang.Integer.valueOf(this.f374065p), java.lang.Integer.valueOf(f66Var.f374065p)) && n51.f.a(this.f374066q, f66Var.f374066q) && n51.f.a(this.f374067r, f66Var.f374067r) && n51.f.a(this.f374068s, f66Var.f374068s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374056d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f374057e);
            fVar.e(3, this.f374058f);
            java.lang.String str2 = this.f374059g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374060h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f374061i);
            r45.e64 e64Var = this.f374062m;
            if (e64Var != null) {
                fVar.i(7, e64Var.computeSize());
                this.f374062m.writeFields(fVar);
            }
            fVar.e(8, this.f374063n);
            java.lang.String str4 = this.f374064o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f374065p);
            java.lang.String str5 = this.f374066q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f374067r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            r45.j30 j30Var = this.f374068s;
            if (j30Var == null) {
                return 0;
            }
            fVar.i(13, j30Var.computeSize());
            this.f374068s.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f374056d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f374057e) + b36.f.e(3, this.f374058f);
            java.lang.String str8 = this.f374059g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f374060h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            int e17 = j17 + b36.f.e(6, this.f374061i);
            r45.e64 e64Var2 = this.f374062m;
            if (e64Var2 != null) {
                e17 += b36.f.i(7, e64Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f374063n);
            java.lang.String str10 = this.f374064o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            int e19 = e18 + b36.f.e(10, this.f374065p);
            java.lang.String str11 = this.f374066q;
            if (str11 != null) {
                e19 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f374067r;
            if (str12 != null) {
                e19 += b36.f.j(12, str12);
            }
            r45.j30 j30Var2 = this.f374068s;
            return j30Var2 != null ? e19 + b36.f.i(13, j30Var2.computeSize()) : e19;
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
        r45.f66 f66Var = (r45.f66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f66Var.f374056d = aVar2.k(intValue);
                return 0;
            case 2:
                f66Var.f374057e = aVar2.g(intValue);
                return 0;
            case 3:
                f66Var.f374058f = aVar2.g(intValue);
                return 0;
            case 4:
                f66Var.f374059g = aVar2.k(intValue);
                return 0;
            case 5:
                f66Var.f374060h = aVar2.k(intValue);
                return 0;
            case 6:
                f66Var.f374061i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr != null && bArr.length > 0) {
                        e64Var3.parseFrom(bArr);
                    }
                    f66Var.f374062m = e64Var3;
                }
                return 0;
            case 8:
                f66Var.f374063n = aVar2.g(intValue);
                return 0;
            case 9:
                f66Var.f374064o = aVar2.k(intValue);
                return 0;
            case 10:
                f66Var.f374065p = aVar2.g(intValue);
                return 0;
            case 11:
                f66Var.f374066q = aVar2.k(intValue);
                return 0;
            case 12:
                f66Var.f374067r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr2 != null && bArr2.length > 0) {
                        j30Var3.parseFrom(bArr2);
                    }
                    f66Var.f374068s = j30Var3;
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
            java.lang.String str = this.f374056d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Md5", str, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f374057e), false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f374058f), false);
            eVar.d(jSONObject, "SearchId", this.f374059g, false);
            eVar.d(jSONObject, "SessionId", this.f374060h, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f374061i), false);
            eVar.d(jSONObject, "Location", this.f374062m, false);
            eVar.d(jSONObject, "Tab", java.lang.Integer.valueOf(this.f374063n), false);
            eVar.d(jSONObject, "RequestId", this.f374064o, false);
            eVar.d(jSONObject, "RequestType", java.lang.Integer.valueOf(this.f374065p), false);
            eVar.d(jSONObject, "EmojiUrl", this.f374066q, false);
            eVar.d(jSONObject, "AesKey", this.f374067r, false);
            eVar.d(jSONObject, "ChildMode", this.f374068s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
