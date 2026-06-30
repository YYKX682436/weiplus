package r45;

/* loaded from: classes2.dex */
public class qf1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383928d;

    /* renamed from: e, reason: collision with root package name */
    public long f383929e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383930f;

    /* renamed from: g, reason: collision with root package name */
    public int f383931g;

    /* renamed from: h, reason: collision with root package name */
    public long f383932h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf1)) {
            return false;
        }
        r45.qf1 qf1Var = (r45.qf1) fVar;
        return n51.f.a(this.f383928d, qf1Var.f383928d) && n51.f.a(java.lang.Long.valueOf(this.f383929e), java.lang.Long.valueOf(qf1Var.f383929e)) && n51.f.a(this.f383930f, qf1Var.f383930f) && n51.f.a(java.lang.Integer.valueOf(this.f383931g), java.lang.Integer.valueOf(qf1Var.f383931g)) && n51.f.a(java.lang.Long.valueOf(this.f383932h), java.lang.Long.valueOf(qf1Var.f383932h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383928d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f383929e);
            java.lang.String str2 = this.f383930f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f383931g);
            fVar.h(5, this.f383932h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383928d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f383929e);
            java.lang.String str4 = this.f383930f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f383931g) + b36.f.h(5, this.f383932h);
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
        r45.qf1 qf1Var = (r45.qf1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qf1Var.f383928d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qf1Var.f383929e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            qf1Var.f383930f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qf1Var.f383931g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qf1Var.f383932h = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f383928d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Nickname", str, false);
            eVar.d(jSONObject, "UpdateTime", java.lang.Long.valueOf(this.f383929e), false);
            eVar.d(jSONObject, "HeadImgUrl", this.f383930f, false);
            eVar.d(jSONObject, "SpamFlag", java.lang.Integer.valueOf(this.f383931g), false);
            eVar.d(jSONObject, "DeleteTime", java.lang.Long.valueOf(this.f383932h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
