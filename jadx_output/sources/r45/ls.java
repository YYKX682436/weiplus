package r45;

/* loaded from: classes8.dex */
public class ls extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379791d;

    /* renamed from: e, reason: collision with root package name */
    public int f379792e;

    /* renamed from: f, reason: collision with root package name */
    public int f379793f;

    /* renamed from: g, reason: collision with root package name */
    public int f379794g;

    /* renamed from: h, reason: collision with root package name */
    public int f379795h;

    /* renamed from: i, reason: collision with root package name */
    public int f379796i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls)) {
            return false;
        }
        r45.ls lsVar = (r45.ls) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379791d), java.lang.Integer.valueOf(lsVar.f379791d)) && n51.f.a(java.lang.Integer.valueOf(this.f379792e), java.lang.Integer.valueOf(lsVar.f379792e)) && n51.f.a(java.lang.Integer.valueOf(this.f379793f), java.lang.Integer.valueOf(lsVar.f379793f)) && n51.f.a(java.lang.Integer.valueOf(this.f379794g), java.lang.Integer.valueOf(lsVar.f379794g)) && n51.f.a(java.lang.Integer.valueOf(this.f379795h), java.lang.Integer.valueOf(lsVar.f379795h)) && n51.f.a(java.lang.Integer.valueOf(this.f379796i), java.lang.Integer.valueOf(lsVar.f379796i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379791d);
            fVar.e(2, this.f379792e);
            fVar.e(3, this.f379793f);
            fVar.e(4, this.f379794g);
            fVar.e(5, this.f379795h);
            fVar.e(6, this.f379796i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379791d) + 0 + b36.f.e(2, this.f379792e) + b36.f.e(3, this.f379793f) + b36.f.e(4, this.f379794g) + b36.f.e(5, this.f379795h) + b36.f.e(6, this.f379796i);
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
        r45.ls lsVar = (r45.ls) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lsVar.f379791d = aVar2.g(intValue);
                return 0;
            case 2:
                lsVar.f379792e = aVar2.g(intValue);
                return 0;
            case 3:
                lsVar.f379793f = aVar2.g(intValue);
                return 0;
            case 4:
                lsVar.f379794g = aVar2.g(intValue);
                return 0;
            case 5:
                lsVar.f379795h = aVar2.g(intValue);
                return 0;
            case 6:
                lsVar.f379796i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f379791d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "C2CShowErrorDelayMS", valueOf, false);
            eVar.d(jSONObject, "SNSShowErrorDelayMS", java.lang.Integer.valueOf(this.f379792e), false);
            eVar.d(jSONObject, "C2CRetryInterval", java.lang.Integer.valueOf(this.f379793f), false);
            eVar.d(jSONObject, "SNSRetryInterval", java.lang.Integer.valueOf(this.f379794g), false);
            eVar.d(jSONObject, "C2CRWTimeout", java.lang.Integer.valueOf(this.f379795h), false);
            eVar.d(jSONObject, "SNSRWTimeout", java.lang.Integer.valueOf(this.f379796i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
