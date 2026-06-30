package pj4;

/* loaded from: classes8.dex */
public class g0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355046d;

    /* renamed from: e, reason: collision with root package name */
    public long f355047e;

    /* renamed from: h, reason: collision with root package name */
    public int f355050h;

    /* renamed from: i, reason: collision with root package name */
    public int f355051i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f355052m;

    /* renamed from: n, reason: collision with root package name */
    public int f355053n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f355055p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f355056q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f355048f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f355049g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f355054o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f355057r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f355058s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.g0)) {
            return false;
        }
        pj4.g0 g0Var = (pj4.g0) fVar;
        return n51.f.a(this.f355046d, g0Var.f355046d) && n51.f.a(java.lang.Long.valueOf(this.f355047e), java.lang.Long.valueOf(g0Var.f355047e)) && n51.f.a(this.f355048f, g0Var.f355048f) && n51.f.a(this.f355049g, g0Var.f355049g) && n51.f.a(java.lang.Integer.valueOf(this.f355050h), java.lang.Integer.valueOf(g0Var.f355050h)) && n51.f.a(java.lang.Integer.valueOf(this.f355051i), java.lang.Integer.valueOf(g0Var.f355051i)) && n51.f.a(this.f355052m, g0Var.f355052m) && n51.f.a(java.lang.Integer.valueOf(this.f355053n), java.lang.Integer.valueOf(g0Var.f355053n)) && n51.f.a(this.f355054o, g0Var.f355054o) && n51.f.a(this.f355055p, g0Var.f355055p) && n51.f.a(this.f355056q, g0Var.f355056q) && n51.f.a(this.f355057r, g0Var.f355057r) && n51.f.a(this.f355058s, g0Var.f355058s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355058s;
        java.util.LinkedList linkedList2 = this.f355057r;
        java.util.LinkedList linkedList3 = this.f355054o;
        java.util.LinkedList linkedList4 = this.f355049g;
        java.util.LinkedList linkedList5 = this.f355048f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355046d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f355047e);
            fVar.g(3, 8, linkedList5);
            fVar.g(4, 8, linkedList4);
            fVar.e(5, this.f355050h);
            fVar.e(6, this.f355051i);
            java.lang.String str2 = this.f355052m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f355053n);
            fVar.g(9, 8, linkedList3);
            java.lang.String str3 = this.f355055p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f355056q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.g(13, 8, linkedList2);
            fVar.g(14, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f355046d;
            int j17 = (str5 != null ? b36.f.j(1, str5) + 0 : 0) + b36.f.h(2, this.f355047e) + b36.f.g(3, 8, linkedList5) + b36.f.g(4, 8, linkedList4) + b36.f.e(5, this.f355050h) + b36.f.e(6, this.f355051i);
            java.lang.String str6 = this.f355052m;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            int e17 = j17 + b36.f.e(8, this.f355053n) + b36.f.g(9, 8, linkedList3);
            java.lang.String str7 = this.f355055p;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            java.lang.String str8 = this.f355056q;
            if (str8 != null) {
                e17 += b36.f.j(11, str8);
            }
            return e17 + b36.f.g(13, 8, linkedList2) + b36.f.g(14, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        pj4.g0 g0Var = (pj4.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g0Var.f355046d = aVar2.k(intValue);
                return 0;
            case 2:
                g0Var.f355047e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    pj4.f0 f0Var = new pj4.f0();
                    if (bArr2 != null && bArr2.length > 0) {
                        f0Var.parseFrom(bArr2);
                    }
                    g0Var.f355048f.add(f0Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    pj4.f0 f0Var2 = new pj4.f0();
                    if (bArr3 != null && bArr3.length > 0) {
                        f0Var2.parseFrom(bArr3);
                    }
                    g0Var.f355049g.add(f0Var2);
                }
                return 0;
            case 5:
                g0Var.f355050h = aVar2.g(intValue);
                return 0;
            case 6:
                g0Var.f355051i = aVar2.g(intValue);
                return 0;
            case 7:
                g0Var.f355052m = aVar2.k(intValue);
                return 0;
            case 8:
                g0Var.f355053n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    pj4.f0 f0Var3 = new pj4.f0();
                    if (bArr4 != null && bArr4.length > 0) {
                        f0Var3.parseFrom(bArr4);
                    }
                    g0Var.f355054o.add(f0Var3);
                }
                return 0;
            case 10:
                g0Var.f355055p = aVar2.k(intValue);
                return 0;
            case 11:
                g0Var.f355056q = aVar2.k(intValue);
                return 0;
            case 12:
            default:
                return -1;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    pj4.f0 f0Var4 = new pj4.f0();
                    if (bArr5 != null && bArr5.length > 0) {
                        f0Var4.parseFrom(bArr5);
                    }
                    g0Var.f355057r.add(f0Var4);
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    pj4.f0 f0Var5 = new pj4.f0();
                    if (bArr6 != null && bArr6.length > 0) {
                        f0Var5.parseFrom(bArr6);
                    }
                    g0Var.f355058s.add(f0Var5);
                }
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355046d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "url", str, false);
            eVar.d(jSONObject, "extOption", java.lang.Long.valueOf(this.f355047e), false);
            eVar.d(jSONObject, "iconDescriptions", this.f355048f, false);
            eVar.d(jSONObject, "clusterDescriptions", this.f355049g, false);
            eVar.d(jSONObject, "beginTime", java.lang.Integer.valueOf(this.f355050h), false);
            eVar.d(jSONObject, "endTime", java.lang.Integer.valueOf(this.f355051i), false);
            eVar.d(jSONObject, "groupId", this.f355052m, false);
            eVar.d(jSONObject, "order", java.lang.Integer.valueOf(this.f355053n), false);
            eVar.d(jSONObject, "otherClusterDescriptions", this.f355054o, false);
            eVar.d(jSONObject, "bigIconUrl", this.f355055p, false);
            eVar.d(jSONObject, "unreadTextColor", this.f355056q, false);
            eVar.d(jSONObject, "cluster_with_me_descriptions", this.f355057r, false);
            eVar.d(jSONObject, "cluster_only_me_descriptions", this.f355058s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
