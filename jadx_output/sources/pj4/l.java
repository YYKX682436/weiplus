package pj4;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355162d;

    /* renamed from: e, reason: collision with root package name */
    public long f355163e;

    /* renamed from: f, reason: collision with root package name */
    public int f355164f;

    /* renamed from: g, reason: collision with root package name */
    public long f355165g;

    /* renamed from: h, reason: collision with root package name */
    public int f355166h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f355167i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f355168m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.l)) {
            return false;
        }
        pj4.l lVar = (pj4.l) fVar;
        return n51.f.a(this.f355162d, lVar.f355162d) && n51.f.a(java.lang.Long.valueOf(this.f355163e), java.lang.Long.valueOf(lVar.f355163e)) && n51.f.a(java.lang.Integer.valueOf(this.f355164f), java.lang.Integer.valueOf(lVar.f355164f)) && n51.f.a(java.lang.Long.valueOf(this.f355165g), java.lang.Long.valueOf(lVar.f355165g)) && n51.f.a(java.lang.Integer.valueOf(this.f355166h), java.lang.Integer.valueOf(lVar.f355166h)) && n51.f.a(this.f355167i, lVar.f355167i) && n51.f.a(this.f355168m, lVar.f355168m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355168m;
        java.util.LinkedList linkedList2 = this.f355167i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355162d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f355163e);
            fVar.e(3, this.f355164f);
            fVar.h(4, this.f355165g);
            fVar.e(5, this.f355166h);
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f355162d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f355163e) + b36.f.e(3, this.f355164f) + b36.f.h(4, this.f355165g) + b36.f.e(5, this.f355166h) + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 1, linkedList);
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
        pj4.l lVar = (pj4.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f355162d = aVar2.k(intValue);
                return 0;
            case 2:
                lVar.f355163e = aVar2.i(intValue);
                return 0;
            case 3:
                lVar.f355164f = aVar2.g(intValue);
                return 0;
            case 4:
                lVar.f355165g = aVar2.i(intValue);
                return 0;
            case 5:
                lVar.f355166h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    pj4.k kVar = new pj4.k();
                    if (bArr2 != null && bArr2.length > 0) {
                        kVar.parseFrom(bArr2);
                    }
                    lVar.f355167i.add(kVar);
                }
                return 0;
            case 7:
                lVar.f355168m.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355162d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "hb_id", str, false);
            eVar.d(jSONObject, "total_amt", java.lang.Long.valueOf(this.f355163e), false);
            eVar.d(jSONObject, "total_num", java.lang.Integer.valueOf(this.f355164f), false);
            eVar.d(jSONObject, "recv_amt", java.lang.Long.valueOf(this.f355165g), false);
            eVar.d(jSONObject, "recv_num", java.lang.Integer.valueOf(this.f355166h), false);
            eVar.d(jSONObject, "recv_records", this.f355167i, false);
            eVar.d(jSONObject, "exclusive_username", this.f355168m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
