package r45;

/* loaded from: classes8.dex */
public class pw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383433e;

    /* renamed from: f, reason: collision with root package name */
    public int f383434f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383435g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383436h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383437i;

    /* renamed from: m, reason: collision with root package name */
    public int f383438m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f383439n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pw5)) {
            return false;
        }
        r45.pw5 pw5Var = (r45.pw5) fVar;
        return n51.f.a(this.f383432d, pw5Var.f383432d) && n51.f.a(this.f383433e, pw5Var.f383433e) && n51.f.a(java.lang.Integer.valueOf(this.f383434f), java.lang.Integer.valueOf(pw5Var.f383434f)) && n51.f.a(this.f383435g, pw5Var.f383435g) && n51.f.a(this.f383436h, pw5Var.f383436h) && n51.f.a(this.f383437i, pw5Var.f383437i) && n51.f.a(java.lang.Integer.valueOf(this.f383438m), java.lang.Integer.valueOf(pw5Var.f383438m)) && n51.f.a(this.f383439n, pw5Var.f383439n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383439n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383432d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383433e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f383434f);
            java.lang.String str3 = this.f383435g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383436h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f383437i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f383438m);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f383432d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f383433e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f383434f);
            java.lang.String str8 = this.f383435g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f383436h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f383437i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f383438m) + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.pw5 pw5Var = (r45.pw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pw5Var.f383432d = aVar2.k(intValue);
                return 0;
            case 2:
                pw5Var.f383433e = aVar2.k(intValue);
                return 0;
            case 3:
                pw5Var.f383434f = aVar2.g(intValue);
                return 0;
            case 4:
                pw5Var.f383435g = aVar2.k(intValue);
                return 0;
            case 5:
                pw5Var.f383436h = aVar2.k(intValue);
                return 0;
            case 6:
                pw5Var.f383437i = aVar2.k(intValue);
                return 0;
            case 7:
                pw5Var.f383438m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.qw5 qw5Var = new r45.qw5();
                    if (bArr2 != null && bArr2.length > 0) {
                        qw5Var.parseFrom(bArr2);
                    }
                    pw5Var.f383439n.add(qw5Var);
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
            java.lang.String str = this.f383432d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Tid", this.f383433e, false);
            eVar.d(jSONObject, "FeedType", java.lang.Integer.valueOf(this.f383434f), false);
            eVar.d(jSONObject, "NickName", this.f383435g, false);
            eVar.d(jSONObject, "Avatar", this.f383436h, false);
            eVar.d(jSONObject, "NonceID", this.f383437i, false);
            eVar.d(jSONObject, "MediaCount", java.lang.Integer.valueOf(this.f383438m), false);
            eVar.d(jSONObject, "MediaList", this.f383439n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
