package r45;

/* loaded from: classes4.dex */
public class vf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388193d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388194e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388195f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f388196g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vf7)) {
            return false;
        }
        r45.vf7 vf7Var = (r45.vf7) fVar;
        return n51.f.a(this.f388193d, vf7Var.f388193d) && n51.f.a(this.f388194e, vf7Var.f388194e) && n51.f.a(this.f388195f, vf7Var.f388195f) && n51.f.a(this.f388196g, vf7Var.f388196g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388196g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388193d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388194e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388195f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f388193d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f388194e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f388195f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 8, linkedList);
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
        r45.vf7 vf7Var = (r45.vf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vf7Var.f388193d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vf7Var.f388194e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            vf7Var.f388195f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.kv5 kv5Var = new r45.kv5();
            if (bArr2 != null && bArr2.length > 0) {
                kv5Var.parseFrom(bArr2);
            }
            vf7Var.f388196g.add(kv5Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f388193d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "appid", str, false);
            eVar.d(jSONObject, "nick_name", this.f388194e, false);
            eVar.d(jSONObject, "icon_url", this.f388195f, false);
            eVar.d(jSONObject, "scope_item_list", this.f388196g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
