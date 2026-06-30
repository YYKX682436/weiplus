package pj4;

/* loaded from: classes8.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355322d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f355323e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f355324f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355325g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355326h;

    /* renamed from: i, reason: collision with root package name */
    public int f355327i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.x)) {
            return false;
        }
        pj4.x xVar = (pj4.x) fVar;
        return n51.f.a(this.f355322d, xVar.f355322d) && n51.f.a(this.f355323e, xVar.f355323e) && n51.f.a(java.lang.Integer.valueOf(this.f355324f), java.lang.Integer.valueOf(xVar.f355324f)) && n51.f.a(this.f355325g, xVar.f355325g) && n51.f.a(this.f355326h, xVar.f355326h) && n51.f.a(java.lang.Integer.valueOf(this.f355327i), java.lang.Integer.valueOf(xVar.f355327i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355323e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355322d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f355324f);
            java.lang.String str2 = this.f355325g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f355326h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f355327i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f355322d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f355324f);
            java.lang.String str5 = this.f355325g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f355326h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.e(6, this.f355327i);
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
        pj4.x xVar = (pj4.x) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xVar.f355322d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    pj4.g0 g0Var = new pj4.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var.parseFrom(bArr2);
                    }
                    xVar.f355323e.add(g0Var);
                }
                return 0;
            case 3:
                xVar.f355324f = aVar2.g(intValue);
                return 0;
            case 4:
                xVar.f355325g = aVar2.k(intValue);
                return 0;
            case 5:
                xVar.f355326h = aVar2.k(intValue);
                return 0;
            case 6:
                xVar.f355327i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355322d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "iconId", str, false);
            eVar.d(jSONObject, "iconActions", this.f355323e, false);
            eVar.d(jSONObject, "character_set_type", java.lang.Integer.valueOf(this.f355324f), false);
            eVar.d(jSONObject, "cluster_id", this.f355325g, false);
            eVar.d(jSONObject, "cluster_present_type", this.f355326h, false);
            eVar.d(jSONObject, "cluster_present_version", java.lang.Integer.valueOf(this.f355327i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
