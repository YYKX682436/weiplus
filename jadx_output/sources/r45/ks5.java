package r45;

/* loaded from: classes2.dex */
public class ks5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378926d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378927e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378928f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378929g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378930h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ks5)) {
            return false;
        }
        r45.ks5 ks5Var = (r45.ks5) fVar;
        return n51.f.a(this.f378926d, ks5Var.f378926d) && n51.f.a(this.f378927e, ks5Var.f378927e) && n51.f.a(this.f378928f, ks5Var.f378928f) && n51.f.a(this.f378929g, ks5Var.f378929g) && n51.f.a(this.f378930h, ks5Var.f378930h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378926d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378927e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378928f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378929g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f378930h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f378926d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f378927e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f378928f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f378929g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f378930h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.ks5 ks5Var = (r45.ks5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ks5Var.f378926d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ks5Var.f378927e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ks5Var.f378928f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ks5Var.f378929g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ks5Var.f378930h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f378926d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "DocId", str, false);
            eVar.d(jSONObject, "Title", this.f378927e, false);
            eVar.d(jSONObject, "Desc", this.f378928f, false);
            eVar.d(jSONObject, "IconUrl", this.f378929g, false);
            eVar.d(jSONObject, "Source", this.f378930h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
