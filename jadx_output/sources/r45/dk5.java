package r45;

/* loaded from: classes2.dex */
public class dk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372539e;

    /* renamed from: f, reason: collision with root package name */
    public int f372540f;

    /* renamed from: g, reason: collision with root package name */
    public int f372541g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372542h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dk5)) {
            return false;
        }
        r45.dk5 dk5Var = (r45.dk5) fVar;
        return n51.f.a(this.f372538d, dk5Var.f372538d) && n51.f.a(this.f372539e, dk5Var.f372539e) && n51.f.a(java.lang.Integer.valueOf(this.f372540f), java.lang.Integer.valueOf(dk5Var.f372540f)) && n51.f.a(java.lang.Integer.valueOf(this.f372541g), java.lang.Integer.valueOf(dk5Var.f372541g)) && n51.f.a(this.f372542h, dk5Var.f372542h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372538d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372539e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372540f);
            fVar.e(4, this.f372541g);
            java.lang.String str3 = this.f372542h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372538d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f372539e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f372540f) + b36.f.e(4, this.f372541g);
            java.lang.String str6 = this.f372542h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.dk5 dk5Var = (r45.dk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dk5Var.f372538d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dk5Var.f372539e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dk5Var.f372540f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            dk5Var.f372541g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dk5Var.f372542h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f372538d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Summary", str, false);
            eVar.d(jSONObject, "RedPointMsgId", this.f372539e, false);
            eVar.d(jSONObject, "RedPointInvalidTime", java.lang.Integer.valueOf(this.f372540f), false);
            eVar.d(jSONObject, "NoCache", java.lang.Integer.valueOf(this.f372541g), false);
            eVar.d(jSONObject, "CallBackStr", this.f372542h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
