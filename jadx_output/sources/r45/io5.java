package r45;

/* loaded from: classes4.dex */
public class io5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377218d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377219e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377220f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377221g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io5)) {
            return false;
        }
        r45.io5 io5Var = (r45.io5) fVar;
        return n51.f.a(this.BaseRequest, io5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377218d), java.lang.Integer.valueOf(io5Var.f377218d)) && n51.f.a(this.f377219e, io5Var.f377219e) && n51.f.a(this.f377220f, io5Var.f377220f) && n51.f.a(this.f377221g, io5Var.f377221g);
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
            fVar.e(2, this.f377218d);
            fVar.g(3, 3, this.f377219e);
            com.tencent.mm.protobuf.g gVar = this.f377220f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f377221g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377218d) + b36.f.g(3, 3, this.f377219e);
            com.tencent.mm.protobuf.g gVar3 = this.f377220f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f377221g;
            return gVar4 != null ? i18 + b36.f.b(5, gVar4) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377219e.clear();
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
        r45.io5 io5Var = (r45.io5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                io5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            io5Var.f377218d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            io5Var.f377219e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 4) {
            io5Var.f377220f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        io5Var.f377221g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f377218d), false);
            eVar.d(jSONObject, "selector", this.f377219e, false);
            eVar.d(jSONObject, "cli_sync_key_buff", this.f377220f, false);
            eVar.d(jSONObject, "migrate_sync_key_buff", this.f377221g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
