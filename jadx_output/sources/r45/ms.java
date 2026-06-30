package r45;

/* loaded from: classes8.dex */
public class ms extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380770d;

    /* renamed from: e, reason: collision with root package name */
    public int f380771e;

    /* renamed from: f, reason: collision with root package name */
    public int f380772f;

    /* renamed from: g, reason: collision with root package name */
    public int f380773g;

    /* renamed from: h, reason: collision with root package name */
    public int f380774h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380776m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f380777n;

    /* renamed from: o, reason: collision with root package name */
    public int f380778o;

    /* renamed from: p, reason: collision with root package name */
    public int f380779p;

    /* renamed from: t, reason: collision with root package name */
    public int f380783t;

    /* renamed from: u, reason: collision with root package name */
    public int f380784u;

    /* renamed from: v, reason: collision with root package name */
    public int f380785v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f380786w;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f380775i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f380780q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f380781r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f380782s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ms)) {
            return false;
        }
        r45.ms msVar = (r45.ms) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380770d), java.lang.Integer.valueOf(msVar.f380770d)) && n51.f.a(java.lang.Integer.valueOf(this.f380771e), java.lang.Integer.valueOf(msVar.f380771e)) && n51.f.a(java.lang.Integer.valueOf(this.f380772f), java.lang.Integer.valueOf(msVar.f380772f)) && n51.f.a(java.lang.Integer.valueOf(this.f380773g), java.lang.Integer.valueOf(msVar.f380773g)) && n51.f.a(java.lang.Integer.valueOf(this.f380774h), java.lang.Integer.valueOf(msVar.f380774h)) && n51.f.a(this.f380775i, msVar.f380775i) && n51.f.a(this.f380776m, msVar.f380776m) && n51.f.a(this.f380777n, msVar.f380777n) && n51.f.a(java.lang.Integer.valueOf(this.f380778o), java.lang.Integer.valueOf(msVar.f380778o)) && n51.f.a(java.lang.Integer.valueOf(this.f380779p), java.lang.Integer.valueOf(msVar.f380779p)) && n51.f.a(this.f380780q, msVar.f380780q) && n51.f.a(this.f380781r, msVar.f380781r) && n51.f.a(this.f380782s, msVar.f380782s) && n51.f.a(java.lang.Integer.valueOf(this.f380783t), java.lang.Integer.valueOf(msVar.f380783t)) && n51.f.a(java.lang.Integer.valueOf(this.f380784u), java.lang.Integer.valueOf(msVar.f380784u)) && n51.f.a(java.lang.Integer.valueOf(this.f380785v), java.lang.Integer.valueOf(msVar.f380785v)) && n51.f.a(this.f380786w, msVar.f380786w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380782s;
        java.util.LinkedList linkedList2 = this.f380781r;
        java.util.LinkedList linkedList3 = this.f380780q;
        java.util.LinkedList linkedList4 = this.f380775i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380770d);
            fVar.e(2, this.f380771e);
            fVar.e(3, this.f380772f);
            fVar.e(4, this.f380773g);
            fVar.e(5, this.f380774h);
            fVar.g(6, 8, linkedList4);
            java.lang.String str = this.f380776m;
            if (str != null) {
                fVar.j(7, str);
            }
            r45.cu5 cu5Var = this.f380777n;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f380777n.writeFields(fVar);
            }
            fVar.e(9, this.f380778o);
            fVar.e(10, this.f380779p);
            fVar.g(11, 8, linkedList3);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            fVar.e(14, this.f380783t);
            fVar.e(15, this.f380784u);
            fVar.e(16, this.f380785v);
            r45.cu5 cu5Var2 = this.f380786w;
            if (cu5Var2 != null) {
                fVar.i(17, cu5Var2.computeSize());
                this.f380786w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380770d) + 0 + b36.f.e(2, this.f380771e) + b36.f.e(3, this.f380772f) + b36.f.e(4, this.f380773g) + b36.f.e(5, this.f380774h) + b36.f.g(6, 8, linkedList4);
            java.lang.String str2 = this.f380776m;
            if (str2 != null) {
                e17 += b36.f.j(7, str2);
            }
            r45.cu5 cu5Var3 = this.f380777n;
            if (cu5Var3 != null) {
                e17 += b36.f.i(8, cu5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(9, this.f380778o) + b36.f.e(10, this.f380779p) + b36.f.g(11, 8, linkedList3) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList) + b36.f.e(14, this.f380783t) + b36.f.e(15, this.f380784u) + b36.f.e(16, this.f380785v);
            r45.cu5 cu5Var4 = this.f380786w;
            return cu5Var4 != null ? e18 + b36.f.i(17, cu5Var4.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.ms msVar = (r45.ms) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                msVar.f380770d = aVar2.g(intValue);
                return 0;
            case 2:
                msVar.f380771e = aVar2.g(intValue);
                return 0;
            case 3:
                msVar.f380772f = aVar2.g(intValue);
                return 0;
            case 4:
                msVar.f380773g = aVar2.g(intValue);
                return 0;
            case 5:
                msVar.f380774h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var.b(bArr2);
                    }
                    msVar.f380775i.add(du5Var);
                }
                return 0;
            case 7:
                msVar.f380776m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    msVar.f380777n = cu5Var5;
                }
                return 0;
            case 9:
                msVar.f380778o = aVar2.g(intValue);
                return 0;
            case 10:
                msVar.f380779p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var2.b(bArr4);
                    }
                    msVar.f380780q.add(du5Var2);
                }
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ns nsVar = new r45.ns();
                    if (bArr5 != null && bArr5.length > 0) {
                        nsVar.parseFrom(bArr5);
                    }
                    msVar.f380781r.add(nsVar);
                }
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.ns nsVar2 = new r45.ns();
                    if (bArr6 != null && bArr6.length > 0) {
                        nsVar2.parseFrom(bArr6);
                    }
                    msVar.f380782s.add(nsVar2);
                }
                return 0;
            case 14:
                msVar.f380783t = aVar2.g(intValue);
                return 0;
            case 15:
                msVar.f380784u = aVar2.g(intValue);
                return 0;
            case 16:
                msVar.f380785v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var6.b(bArr7);
                    }
                    msVar.f380786w = cu5Var6;
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f380770d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Ver", valueOf, false);
            eVar.d(jSONObject, "Uin", java.lang.Integer.valueOf(this.f380771e), false);
            eVar.d(jSONObject, "ExpireTime", java.lang.Integer.valueOf(this.f380772f), false);
            eVar.d(jSONObject, "FrontID", java.lang.Integer.valueOf(this.f380773g), false);
            eVar.d(jSONObject, "FrontIPCount", java.lang.Integer.valueOf(this.f380774h), false);
            eVar.d(jSONObject, "FrontIPList", this.f380775i, false);
            eVar.d(jSONObject, "ZoneDomain", this.f380776m, false);
            eVar.d(jSONObject, "AuthKey", this.f380777n, false);
            eVar.d(jSONObject, "ZoneID", java.lang.Integer.valueOf(this.f380778o), false);
            eVar.d(jSONObject, "ZoneIPCount", java.lang.Integer.valueOf(this.f380779p), false);
            eVar.d(jSONObject, "ZoneIPList", this.f380780q, false);
            eVar.d(jSONObject, "FrontIPPortList", this.f380781r, false);
            eVar.d(jSONObject, "ZoneIPPortList", this.f380782s, false);
            eVar.d(jSONObject, "FrontIPPortCount", java.lang.Integer.valueOf(this.f380783t), false);
            eVar.d(jSONObject, "ZoneIPPortCount", java.lang.Integer.valueOf(this.f380784u), false);
            eVar.d(jSONObject, "FakeUin", java.lang.Integer.valueOf(this.f380785v), false);
            eVar.d(jSONObject, "NewAuthKey", this.f380786w, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
