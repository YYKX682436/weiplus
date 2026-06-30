package r45;

/* loaded from: classes2.dex */
public class xq extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f390327d;

    /* renamed from: e, reason: collision with root package name */
    public int f390328e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq)) {
            return false;
        }
        r45.xq xqVar = (r45.xq) fVar;
        return n51.f.a(this.BaseRequest, xqVar.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f390327d), java.lang.Long.valueOf(xqVar.f390327d)) && n51.f.a(java.lang.Integer.valueOf(this.f390328e), java.lang.Integer.valueOf(xqVar.f390328e));
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
            fVar.h(2, this.f390327d);
            fVar.e(3, this.f390328e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f390327d) + b36.f.e(3, this.f390328e);
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
        r45.xq xqVar = (r45.xq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                xqVar.f390327d = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            xqVar.f390328e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            xqVar.BaseRequest = heVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "synckey_value", java.lang.Long.valueOf(this.f390327d), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f390328e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
