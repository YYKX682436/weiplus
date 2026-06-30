package r45;

/* loaded from: classes2.dex */
public class qp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f384154d;

    /* renamed from: e, reason: collision with root package name */
    public int f384155e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384156f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384157g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f384158h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f384159i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384160m;

    /* renamed from: n, reason: collision with root package name */
    public int f384161n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp)) {
            return false;
        }
        r45.qp qpVar = (r45.qp) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f384154d), java.lang.Long.valueOf(qpVar.f384154d)) && n51.f.a(java.lang.Integer.valueOf(this.f384155e), java.lang.Integer.valueOf(qpVar.f384155e)) && n51.f.a(this.f384156f, qpVar.f384156f) && n51.f.a(this.f384157g, qpVar.f384157g) && n51.f.a(this.f384158h, qpVar.f384158h) && n51.f.a(java.lang.Integer.valueOf(this.f384159i), java.lang.Integer.valueOf(qpVar.f384159i)) && n51.f.a(this.f384160m, qpVar.f384160m) && n51.f.a(java.lang.Integer.valueOf(this.f384161n), java.lang.Integer.valueOf(qpVar.f384161n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384158h;
        java.util.LinkedList linkedList2 = this.f384157g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f384154d);
            fVar.e(2, this.f384155e);
            java.lang.String str = this.f384156f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f384159i);
            java.lang.String str2 = this.f384160m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f384161n);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f384154d) + 0 + b36.f.e(2, this.f384155e);
            java.lang.String str3 = this.f384156f;
            if (str3 != null) {
                h17 += b36.f.j(3, str3);
            }
            int g17 = h17 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f384159i);
            java.lang.String str4 = this.f384160m;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            return g17 + b36.f.e(8, this.f384161n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.qp qpVar = (r45.qp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qpVar.f384154d = aVar2.i(intValue);
                return 0;
            case 2:
                qpVar.f384155e = aVar2.g(intValue);
                return 0;
            case 3:
                qpVar.f384156f = aVar2.k(intValue);
                return 0;
            case 4:
                qpVar.f384157g.add(aVar2.k(intValue));
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.xp xpVar = new r45.xp();
                    if (bArr2 != null && bArr2.length > 0) {
                        xpVar.parseFrom(bArr2);
                    }
                    qpVar.f384158h.add(xpVar);
                }
                return 0;
            case 6:
                qpVar.f384159i = aVar2.g(intValue);
                return 0;
            case 7:
                qpVar.f384160m = aVar2.k(intValue);
                return 0;
            case 8:
                qpVar.f384161n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f384154d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BusinessType", valueOf, false);
            eVar.d(jSONObject, "ContinueFlag", java.lang.Integer.valueOf(this.f384155e), false);
            eVar.d(jSONObject, "Title", this.f384156f, false);
            eVar.d(jSONObject, "KeyWordList", this.f384157g, false);
            eVar.d(jSONObject, "ItemList", this.f384158h, false);
            eVar.d(jSONObject, "TotalCount", java.lang.Integer.valueOf(this.f384159i), false);
            eVar.d(jSONObject, "SearchID", this.f384160m, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f384161n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
