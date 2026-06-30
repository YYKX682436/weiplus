package pj4;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355337d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355338e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355339f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f355340g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.y)) {
            return false;
        }
        pj4.y yVar = (pj4.y) fVar;
        return n51.f.a(this.f355337d, yVar.f355337d) && n51.f.a(this.f355338e, yVar.f355338e) && n51.f.a(this.f355339f, yVar.f355339f) && n51.f.a(this.f355340g, yVar.f355340g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355340g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355337d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355338e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f355339f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f355337d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f355338e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f355339f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 1, linkedList);
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
        pj4.y yVar = (pj4.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f355337d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yVar.f355338e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yVar.f355339f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yVar.f355340g.add(aVar2.k(intValue));
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355337d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "status_id", str, false);
            eVar.d(jSONObject, "status_word", this.f355338e, false);
            eVar.d(jSONObject, "status_description", this.f355339f, false);
            eVar.d(jSONObject, "status_tags", this.f355340g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
