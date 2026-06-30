package r45;

/* loaded from: classes4.dex */
public class cu4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371834d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371835e;

    /* renamed from: f, reason: collision with root package name */
    public int f371836f;

    /* renamed from: g, reason: collision with root package name */
    public int f371837g;

    /* renamed from: h, reason: collision with root package name */
    public long f371838h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cu4)) {
            return false;
        }
        r45.cu4 cu4Var = (r45.cu4) fVar;
        return n51.f.a(this.f371834d, cu4Var.f371834d) && n51.f.a(this.f371835e, cu4Var.f371835e) && n51.f.a(java.lang.Integer.valueOf(this.f371836f), java.lang.Integer.valueOf(cu4Var.f371836f)) && n51.f.a(java.lang.Integer.valueOf(this.f371837g), java.lang.Integer.valueOf(cu4Var.f371837g)) && n51.f.a(java.lang.Long.valueOf(this.f371838h), java.lang.Long.valueOf(cu4Var.f371838h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371834d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371835e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f371836f);
            fVar.e(4, this.f371837g);
            fVar.h(5, this.f371838h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f371834d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f371835e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f371836f) + b36.f.e(4, this.f371837g) + b36.f.h(5, this.f371838h);
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
        r45.cu4 cu4Var = (r45.cu4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cu4Var.f371834d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cu4Var.f371835e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            cu4Var.f371836f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            cu4Var.f371837g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cu4Var.f371838h = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f371834d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "FromUserName", str, false);
            eVar.d(jSONObject, "ToUserName", this.f371835e, false);
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f371836f), false);
            eVar.d(jSONObject, "MsgType", java.lang.Integer.valueOf(this.f371837g), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f371838h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
