package pj4;

/* loaded from: classes7.dex */
public class r0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355272d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.w f355273e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.r0)) {
            return false;
        }
        pj4.r0 r0Var = (pj4.r0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355272d), java.lang.Integer.valueOf(r0Var.f355272d)) && n51.f.a(this.f355273e, r0Var.f355273e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355272d);
            pj4.w wVar = this.f355273e;
            if (wVar != null) {
                fVar.i(2, wVar.computeSize());
                this.f355273e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355272d) + 0;
            pj4.w wVar2 = this.f355273e;
            return wVar2 != null ? e17 + b36.f.i(2, wVar2.computeSize()) : e17;
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
        pj4.r0 r0Var = (pj4.r0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r0Var.f355272d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            pj4.w wVar3 = new pj4.w();
            if (bArr != null && bArr.length > 0) {
                wVar3.parseFrom(bArr);
            }
            r0Var.f355273e = wVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355272d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "action", valueOf, false);
            eVar.d(jSONObject, "resSetTextStatus", this.f355273e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
