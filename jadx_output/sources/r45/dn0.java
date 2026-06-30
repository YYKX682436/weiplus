package r45;

/* loaded from: classes4.dex */
public class dn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f372588d;

    /* renamed from: e, reason: collision with root package name */
    public int f372589e;

    /* renamed from: f, reason: collision with root package name */
    public long f372590f;

    /* renamed from: g, reason: collision with root package name */
    public long f372591g;

    /* renamed from: h, reason: collision with root package name */
    public long f372592h;

    /* renamed from: i, reason: collision with root package name */
    public long f372593i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn0)) {
            return false;
        }
        r45.dn0 dn0Var = (r45.dn0) fVar;
        return n51.f.a(this.BaseRequest, dn0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f372588d), java.lang.Integer.valueOf(dn0Var.f372588d)) && n51.f.a(java.lang.Integer.valueOf(this.f372589e), java.lang.Integer.valueOf(dn0Var.f372589e)) && n51.f.a(java.lang.Long.valueOf(this.f372590f), java.lang.Long.valueOf(dn0Var.f372590f)) && n51.f.a(java.lang.Long.valueOf(this.f372591g), java.lang.Long.valueOf(dn0Var.f372591g)) && n51.f.a(java.lang.Long.valueOf(this.f372592h), java.lang.Long.valueOf(dn0Var.f372592h)) && n51.f.a(java.lang.Long.valueOf(this.f372593i), java.lang.Long.valueOf(dn0Var.f372593i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f372588d);
            fVar.e(3, this.f372589e);
            fVar.h(4, this.f372590f);
            fVar.h(5, this.f372591g);
            fVar.h(6, this.f372592h);
            fVar.h(7, this.f372593i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f372588d) + b36.f.e(3, this.f372589e) + b36.f.h(4, this.f372590f) + b36.f.h(5, this.f372591g) + b36.f.h(6, this.f372592h) + b36.f.h(7, this.f372593i);
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
        r45.dn0 dn0Var = (r45.dn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    dn0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                dn0Var.f372588d = aVar2.g(intValue);
                return 0;
            case 3:
                dn0Var.f372589e = aVar2.g(intValue);
                return 0;
            case 4:
                dn0Var.f372590f = aVar2.i(intValue);
                return 0;
            case 5:
                dn0Var.f372591g = aVar2.i(intValue);
                return 0;
            case 6:
                dn0Var.f372592h = aVar2.i(intValue);
                return 0;
            case 7:
                dn0Var.f372593i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "OpCode", java.lang.Integer.valueOf(this.f372588d), false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f372589e), false);
            eVar.d(jSONObject, "WhichExtFunctionSwitch", java.lang.Long.valueOf(this.f372590f), false);
            eVar.d(jSONObject, "ExtFunctionSwitchValue", java.lang.Long.valueOf(this.f372591g), false);
            eVar.d(jSONObject, "WhichExtFunctionSwitch2", java.lang.Long.valueOf(this.f372592h), false);
            eVar.d(jSONObject, "ExtFunctionSwitchValue2", java.lang.Long.valueOf(this.f372593i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
