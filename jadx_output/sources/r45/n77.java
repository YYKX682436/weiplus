package r45;

/* loaded from: classes2.dex */
public class n77 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f381142d;

    /* renamed from: e, reason: collision with root package name */
    public double f381143e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381144f;

    /* renamed from: g, reason: collision with root package name */
    public int f381145g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381146h;

    /* renamed from: i, reason: collision with root package name */
    public int f381147i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f381148m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n77)) {
            return false;
        }
        r45.n77 n77Var = (r45.n77) fVar;
        return n51.f.a(this.BaseRequest, n77Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f381142d), java.lang.Double.valueOf(n77Var.f381142d)) && n51.f.a(java.lang.Double.valueOf(this.f381143e), java.lang.Double.valueOf(n77Var.f381143e)) && n51.f.a(this.f381144f, n77Var.f381144f) && n51.f.a(java.lang.Integer.valueOf(this.f381145g), java.lang.Integer.valueOf(n77Var.f381145g)) && n51.f.a(this.f381146h, n77Var.f381146h) && n51.f.a(java.lang.Integer.valueOf(this.f381147i), java.lang.Integer.valueOf(n77Var.f381147i)) && n51.f.a(this.f381148m, n77Var.f381148m);
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
            fVar.c(2, this.f381142d);
            fVar.c(3, this.f381143e);
            java.lang.String str = this.f381144f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f381145g);
            java.lang.String str2 = this.f381146h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f381147i);
            fVar.g(8, 8, this.f381148m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f381142d) + b36.f.c(3, this.f381143e);
            java.lang.String str3 = this.f381144f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f381145g);
            java.lang.String str4 = this.f381146h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f381147i) + b36.f.g(8, 8, this.f381148m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381148m.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.n77 n77Var = (r45.n77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    n77Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                n77Var.f381142d = aVar2.e(intValue);
                return 0;
            case 3:
                n77Var.f381143e = aVar2.e(intValue);
                return 0;
            case 4:
                n77Var.f381144f = aVar2.k(intValue);
                return 0;
            case 5:
                n77Var.f381145g = aVar2.g(intValue);
                return 0;
            case 6:
                n77Var.f381146h = aVar2.k(intValue);
                return 0;
            case 7:
                n77Var.f381147i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.tw6 tw6Var = new r45.tw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        tw6Var.parseFrom(bArr3);
                    }
                    n77Var.f381148m.add(tw6Var);
                }
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
            eVar.d(jSONObject, "locationX", java.lang.Double.valueOf(this.f381142d), false);
            eVar.d(jSONObject, "locationY", java.lang.Double.valueOf(this.f381143e), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_NET_TYPE, this.f381144f, false);
            eVar.d(jSONObject, "h5Version", java.lang.Integer.valueOf(this.f381145g), false);
            eVar.d(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f381146h, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f381147i), false);
            eVar.d(jSONObject, "ExtReqParams", this.f381148m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
