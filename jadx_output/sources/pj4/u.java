package pj4;

/* loaded from: classes8.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355300d;

    /* renamed from: e, reason: collision with root package name */
    public long f355301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355302f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.u)) {
            return false;
        }
        pj4.u uVar = (pj4.u) fVar;
        return n51.f.a(this.f355300d, uVar.f355300d) && n51.f.a(java.lang.Long.valueOf(this.f355301e), java.lang.Long.valueOf(uVar.f355301e)) && n51.f.a(this.f355302f, uVar.f355302f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355300d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f355301e);
            java.lang.String str2 = this.f355302f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f355300d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f355301e);
            java.lang.String str4 = this.f355302f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        pj4.u uVar = (pj4.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f355300d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f355301e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        uVar.f355302f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355300d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "iconId", str, false);
            eVar.d(jSONObject, "postTime", java.lang.Long.valueOf(this.f355301e), false);
            eVar.d(jSONObject, "statusDesc", this.f355302f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
