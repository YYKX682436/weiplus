package pj4;

/* loaded from: classes8.dex */
public class f0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355038e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.f0)) {
            return false;
        }
        pj4.f0 f0Var = (pj4.f0) fVar;
        return n51.f.a(this.f355037d, f0Var.f355037d) && n51.f.a(this.f355038e, f0Var.f355038e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355037d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355038e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f355037d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f355038e;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        pj4.f0 f0Var = (pj4.f0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f0Var.f355037d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        f0Var.f355038e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355037d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "locale", str, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, this.f355038e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
