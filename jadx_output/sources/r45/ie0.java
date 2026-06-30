package r45;

/* loaded from: classes8.dex */
public class ie0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376961d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376962e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376963f;

    /* renamed from: g, reason: collision with root package name */
    public int f376964g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ie0)) {
            return false;
        }
        r45.ie0 ie0Var = (r45.ie0) fVar;
        return n51.f.a(this.f376961d, ie0Var.f376961d) && n51.f.a(this.f376962e, ie0Var.f376962e) && n51.f.a(this.f376963f, ie0Var.f376963f) && n51.f.a(java.lang.Integer.valueOf(this.f376964g), java.lang.Integer.valueOf(ie0Var.f376964g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376961d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376962e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376963f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f376964g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f376961d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f376962e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f376963f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f376964g);
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
        r45.ie0 ie0Var = (r45.ie0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ie0Var.f376961d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ie0Var.f376962e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ie0Var.f376963f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ie0Var.f376964g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f376961d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "model_id", str, false);
            eVar.d(jSONObject, "sn", this.f376962e, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f376963f, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f376964g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
