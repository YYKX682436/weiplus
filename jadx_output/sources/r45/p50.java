package r45;

/* loaded from: classes8.dex */
public class p50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f382756d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382757e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382758f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382759g;

    /* renamed from: h, reason: collision with root package name */
    public r45.l50 f382760h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p50)) {
            return false;
        }
        r45.p50 p50Var = (r45.p50) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f382756d), java.lang.Long.valueOf(p50Var.f382756d)) && n51.f.a(this.f382757e, p50Var.f382757e) && n51.f.a(this.f382758f, p50Var.f382758f) && n51.f.a(this.f382759g, p50Var.f382759g) && n51.f.a(this.f382760h, p50Var.f382760h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f382756d);
            java.lang.String str = this.f382757e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382758f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382759g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.l50 l50Var = this.f382760h;
            if (l50Var != null) {
                fVar.i(5, l50Var.computeSize());
                this.f382760h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f382756d) + 0;
            java.lang.String str4 = this.f382757e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f382758f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f382759g;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            r45.l50 l50Var2 = this.f382760h;
            return l50Var2 != null ? h17 + b36.f.i(5, l50Var2.computeSize()) : h17;
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
        r45.p50 p50Var = (r45.p50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p50Var.f382756d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            p50Var.f382757e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            p50Var.f382758f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            p50Var.f382759g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l50 l50Var3 = new r45.l50();
            if (bArr != null && bArr.length > 0) {
                l50Var3.parseFrom(bArr);
            }
            p50Var.f382760h = l50Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f382756d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, valueOf, false);
            eVar.d(jSONObject, "objectBuffer", this.f382757e, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, this.f382758f, false);
            eVar.d(jSONObject, "requestId", this.f382759g, false);
            eVar.d(jSONObject, "appInfo", this.f382760h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
