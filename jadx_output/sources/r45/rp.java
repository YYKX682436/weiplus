package r45;

/* loaded from: classes2.dex */
public class rp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385067d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385068e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385069f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rp)) {
            return false;
        }
        r45.rp rpVar = (r45.rp) fVar;
        return n51.f.a(this.f385067d, rpVar.f385067d) && n51.f.a(this.f385068e, rpVar.f385068e) && n51.f.a(this.f385069f, rpVar.f385069f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385067d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385068e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385069f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f385067d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f385068e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f385069f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.rp rpVar = (r45.rp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rpVar.f385067d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            rpVar.f385068e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        rpVar.f385069f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f385067d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "IconUrl", str, false);
            eVar.d(jSONObject, "Descrption", this.f385068e, false);
            eVar.d(jSONObject, "DescFormat", this.f385069f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
