package mo;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f330247d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f330248e;

    /* renamed from: f, reason: collision with root package name */
    public int f330249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f330250g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof mo.b)) {
            return false;
        }
        mo.b bVar = (mo.b) fVar;
        return n51.f.a(this.f330247d, bVar.f330247d) && n51.f.a(this.f330248e, bVar.f330248e) && n51.f.a(java.lang.Integer.valueOf(this.f330249f), java.lang.Integer.valueOf(bVar.f330249f)) && n51.f.a(this.f330250g, bVar.f330250g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f330247d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f330248e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f330249f);
            java.lang.String str3 = this.f330250g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f330247d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f330248e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f330249f);
            java.lang.String str6 = this.f330250g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        mo.b bVar = (mo.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f330247d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f330248e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f330249f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        bVar.f330250g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f330247d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "userName", str, false);
            eVar.d(jSONObject, "displayName", this.f330248e, false);
            eVar.d(jSONObject, "roomFlag", java.lang.Integer.valueOf(this.f330249f), false);
            eVar.d(jSONObject, "inviterUserName", this.f330250g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
