package r45;

/* loaded from: classes11.dex */
public class yn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391243d;

    /* renamed from: e, reason: collision with root package name */
    public long f391244e;

    /* renamed from: f, reason: collision with root package name */
    public long f391245f;

    /* renamed from: g, reason: collision with root package name */
    public long f391246g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yn6)) {
            return false;
        }
        r45.yn6 yn6Var = (r45.yn6) fVar;
        return n51.f.a(this.f391243d, yn6Var.f391243d) && n51.f.a(java.lang.Long.valueOf(this.f391244e), java.lang.Long.valueOf(yn6Var.f391244e)) && n51.f.a(java.lang.Long.valueOf(this.f391245f), java.lang.Long.valueOf(yn6Var.f391245f)) && n51.f.a(java.lang.Long.valueOf(this.f391246g), java.lang.Long.valueOf(yn6Var.f391246g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391243d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f391244e);
            fVar.h(3, this.f391245f);
            fVar.h(4, this.f391246g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f391243d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f391244e) + b36.f.h(3, this.f391245f) + b36.f.h(4, this.f391246g);
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
        r45.yn6 yn6Var = (r45.yn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yn6Var.f391243d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yn6Var.f391244e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            yn6Var.f391245f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yn6Var.f391246g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f391243d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "mediaId", str, false);
            eVar.d(jSONObject, "preloadOffset", java.lang.Long.valueOf(this.f391244e), false);
            eVar.d(jSONObject, "preloadPercent", java.lang.Long.valueOf(this.f391245f), false);
            eVar.d(jSONObject, "videoSize", java.lang.Long.valueOf(this.f391246g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
