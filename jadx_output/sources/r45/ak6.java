package r45;

/* loaded from: classes4.dex */
public class ak6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370072d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370073e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370074f;

    /* renamed from: g, reason: collision with root package name */
    public int f370075g;

    /* renamed from: h, reason: collision with root package name */
    public int f370076h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ak6)) {
            return false;
        }
        r45.ak6 ak6Var = (r45.ak6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370072d), java.lang.Integer.valueOf(ak6Var.f370072d)) && n51.f.a(this.f370073e, ak6Var.f370073e) && n51.f.a(this.f370074f, ak6Var.f370074f) && n51.f.a(java.lang.Integer.valueOf(this.f370075g), java.lang.Integer.valueOf(ak6Var.f370075g)) && n51.f.a(java.lang.Integer.valueOf(this.f370076h), java.lang.Integer.valueOf(ak6Var.f370076h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370072d);
            com.tencent.mm.protobuf.g gVar = this.f370073e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370074f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f370075g);
            fVar.e(100, this.f370076h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370072d) + 0;
            com.tencent.mm.protobuf.g gVar3 = this.f370073e;
            if (gVar3 != null) {
                e17 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f370074f;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            return e17 + b36.f.e(4, this.f370075g) + b36.f.e(100, this.f370076h);
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
        r45.ak6 ak6Var = (r45.ak6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ak6Var.f370072d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ak6Var.f370073e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            ak6Var.f370074f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            ak6Var.f370075g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        ak6Var.f370076h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370072d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f370073e, false);
            eVar.d(jSONObject, "iconUrl", this.f370074f, false);
            eVar.d(jSONObject, "showType", java.lang.Integer.valueOf(this.f370075g), false);
            eVar.d(jSONObject, "tagType", java.lang.Integer.valueOf(this.f370076h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
