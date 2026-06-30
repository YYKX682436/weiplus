package r45;

/* loaded from: classes2.dex */
public class zp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f392259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392260e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp)) {
            return false;
        }
        r45.zp zpVar = (r45.zp) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f392259d), java.lang.Long.valueOf(zpVar.f392259d)) && n51.f.a(this.f392260e, zpVar.f392260e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f392259d);
            java.lang.String str = this.f392260e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f392259d) + 0;
            java.lang.String str2 = this.f392260e;
            return str2 != null ? h17 + b36.f.j(2, str2) : h17;
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
        r45.zp zpVar = (r45.zp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zpVar.f392259d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        zpVar.f392260e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f392259d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Id", valueOf, false);
            eVar.d(jSONObject, "ObjectDesc", this.f392260e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
