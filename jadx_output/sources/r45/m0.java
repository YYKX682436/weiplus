package r45;

/* loaded from: classes8.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380029d;

    /* renamed from: e, reason: collision with root package name */
    public int f380030e;

    /* renamed from: f, reason: collision with root package name */
    public r45.e64 f380031f;

    /* renamed from: g, reason: collision with root package name */
    public long f380032g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380033h;

    /* renamed from: i, reason: collision with root package name */
    public long f380034i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380035m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380036n;

    /* renamed from: o, reason: collision with root package name */
    public r45.j30 f380037o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f380038p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380039q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m0)) {
            return false;
        }
        r45.m0 m0Var = (r45.m0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380029d), java.lang.Integer.valueOf(m0Var.f380029d)) && n51.f.a(java.lang.Integer.valueOf(this.f380030e), java.lang.Integer.valueOf(m0Var.f380030e)) && n51.f.a(this.f380031f, m0Var.f380031f) && n51.f.a(java.lang.Long.valueOf(this.f380032g), java.lang.Long.valueOf(m0Var.f380032g)) && n51.f.a(this.f380033h, m0Var.f380033h) && n51.f.a(java.lang.Long.valueOf(this.f380034i), java.lang.Long.valueOf(m0Var.f380034i)) && n51.f.a(this.f380035m, m0Var.f380035m) && n51.f.a(this.f380036n, m0Var.f380036n) && n51.f.a(this.f380037o, m0Var.f380037o) && n51.f.a(this.f380038p, m0Var.f380038p) && n51.f.a(this.f380039q, m0Var.f380039q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380038p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380029d);
            fVar.e(2, this.f380030e);
            r45.e64 e64Var = this.f380031f;
            if (e64Var != null) {
                fVar.i(3, e64Var.computeSize());
                this.f380031f.writeFields(fVar);
            }
            fVar.h(4, this.f380032g);
            java.lang.String str = this.f380033h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.h(6, this.f380034i);
            java.lang.String str2 = this.f380035m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f380036n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.j30 j30Var = this.f380037o;
            if (j30Var != null) {
                fVar.i(9, j30Var.computeSize());
                this.f380037o.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f380039q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380029d) + 0 + b36.f.e(2, this.f380030e);
            r45.e64 e64Var2 = this.f380031f;
            if (e64Var2 != null) {
                e17 += b36.f.i(3, e64Var2.computeSize());
            }
            int h17 = e17 + b36.f.h(4, this.f380032g);
            java.lang.String str5 = this.f380033h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            int h18 = h17 + b36.f.h(6, this.f380034i);
            java.lang.String str6 = this.f380035m;
            if (str6 != null) {
                h18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f380036n;
            if (str7 != null) {
                h18 += b36.f.j(8, str7);
            }
            r45.j30 j30Var2 = this.f380037o;
            if (j30Var2 != null) {
                h18 += b36.f.i(9, j30Var2.computeSize());
            }
            int g17 = h18 + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f380039q;
            return str8 != null ? g17 + b36.f.j(11, str8) : g17;
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
        r45.m0 m0Var = (r45.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m0Var.f380029d = aVar2.g(intValue);
                return 0;
            case 2:
                m0Var.f380030e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    m0Var.f380031f = e64Var3;
                }
                return 0;
            case 4:
                m0Var.f380032g = aVar2.i(intValue);
                return 0;
            case 5:
                m0Var.f380033h = aVar2.k(intValue);
                return 0;
            case 6:
                m0Var.f380034i = aVar2.i(intValue);
                return 0;
            case 7:
                m0Var.f380035m = aVar2.k(intValue);
                return 0;
            case 8:
                m0Var.f380036n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr3 != null && bArr3.length > 0) {
                        j30Var3.parseFrom(bArr3);
                    }
                    m0Var.f380037o = j30Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.parseFrom(bArr4);
                    }
                    m0Var.f380038p.add(x50Var);
                }
                return 0;
            case 11:
                m0Var.f380039q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f380029d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f380030e), false);
            eVar.d(jSONObject, "Location", this.f380031f, false);
            eVar.d(jSONObject, "BusinessType", java.lang.Long.valueOf(this.f380032g), false);
            eVar.d(jSONObject, "Language", this.f380033h, false);
            eVar.d(jSONObject, "ConfigParam", java.lang.Long.valueOf(this.f380034i), false);
            eVar.d(jSONObject, "SessionId", this.f380035m, false);
            eVar.d(jSONObject, "Url", this.f380036n, false);
            eVar.d(jSONObject, "ChildMode", this.f380037o, false);
            eVar.d(jSONObject, "ExtReqParams", this.f380038p, false);
            eVar.d(jSONObject, "RequestId", this.f380039q, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
