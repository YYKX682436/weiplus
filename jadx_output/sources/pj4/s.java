package pj4;

/* loaded from: classes2.dex */
public class s extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f355276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f355277e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355278f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.s)) {
            return false;
        }
        pj4.s sVar = (pj4.s) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f355276d), java.lang.Long.valueOf(sVar.f355276d)) && n51.f.a(java.lang.Boolean.valueOf(this.f355277e), java.lang.Boolean.valueOf(sVar.f355277e)) && n51.f.a(java.lang.Boolean.valueOf(this.f355278f), java.lang.Boolean.valueOf(sVar.f355278f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f355276d);
            fVar.a(2, this.f355277e);
            fVar.a(3, this.f355278f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f355276d) + 0 + b36.f.a(2, this.f355277e) + b36.f.a(3, this.f355278f);
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
        pj4.s sVar = (pj4.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sVar.f355276d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            sVar.f355277e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        sVar.f355278f = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f355276d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "version", valueOf, false);
            eVar.d(jSONObject, "hb_is_empty", java.lang.Boolean.valueOf(this.f355277e), false);
            eVar.d(jSONObject, "self_recv_hb", java.lang.Boolean.valueOf(this.f355278f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
