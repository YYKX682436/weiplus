package pj4;

/* loaded from: classes4.dex */
public class a0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354957d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354958e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f354959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f354960g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f354961h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.a0)) {
            return false;
        }
        pj4.a0 a0Var = (pj4.a0) fVar;
        return n51.f.a(this.f354957d, a0Var.f354957d) && n51.f.a(this.f354958e, a0Var.f354958e) && n51.f.a(this.f354959f, a0Var.f354959f) && n51.f.a(java.lang.Boolean.valueOf(this.f354960g), java.lang.Boolean.valueOf(a0Var.f354960g)) && n51.f.a(java.lang.Boolean.valueOf(this.f354961h), java.lang.Boolean.valueOf(a0Var.f354961h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f354957d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f354958e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f354959f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f354960g);
            fVar.a(5, this.f354961h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f354957d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f354958e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f354959f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.a(4, this.f354960g) + b36.f.a(5, this.f354961h);
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
        pj4.a0 a0Var = (pj4.a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a0Var.f354957d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            a0Var.f354958e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            a0Var.f354959f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            a0Var.f354960g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        a0Var.f354961h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f354957d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "emojiMd5", str, false);
            eVar.d(jSONObject, "cdnUrl", this.f354958e, false);
            eVar.d(jSONObject, "emojiPath", this.f354959f, false);
            eVar.d(jSONObject, "isLoadedEmoji", java.lang.Boolean.valueOf(this.f354960g), false);
            eVar.d(jSONObject, "isNeedEmoji", java.lang.Boolean.valueOf(this.f354961h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
