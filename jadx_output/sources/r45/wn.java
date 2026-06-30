package r45;

/* loaded from: classes4.dex */
public class wn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ch1 f389302d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389303e;

    /* renamed from: f, reason: collision with root package name */
    public int f389304f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f389305g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f389306h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wn)) {
            return false;
        }
        r45.wn wnVar = (r45.wn) fVar;
        return n51.f.a(this.f389302d, wnVar.f389302d) && n51.f.a(java.lang.Boolean.valueOf(this.f389303e), java.lang.Boolean.valueOf(wnVar.f389303e)) && n51.f.a(java.lang.Integer.valueOf(this.f389304f), java.lang.Integer.valueOf(wnVar.f389304f)) && n51.f.a(java.lang.Boolean.valueOf(this.f389305g), java.lang.Boolean.valueOf(wnVar.f389305g)) && n51.f.a(java.lang.Boolean.valueOf(this.f389306h), java.lang.Boolean.valueOf(wnVar.f389306h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ch1 ch1Var = this.f389302d;
            if (ch1Var != null) {
                fVar.i(1, ch1Var.computeSize());
                this.f389302d.writeFields(fVar);
            }
            fVar.a(2, this.f389303e);
            fVar.e(3, this.f389304f);
            fVar.a(4, this.f389305g);
            fVar.a(5, this.f389306h);
            return 0;
        }
        if (i17 == 1) {
            r45.ch1 ch1Var2 = this.f389302d;
            return (ch1Var2 != null ? 0 + b36.f.i(1, ch1Var2.computeSize()) : 0) + b36.f.a(2, this.f389303e) + b36.f.e(3, this.f389304f) + b36.f.a(4, this.f389305g) + b36.f.a(5, this.f389306h);
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
        r45.wn wnVar = (r45.wn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ch1 ch1Var3 = new r45.ch1();
                if (bArr != null && bArr.length > 0) {
                    ch1Var3.parseFrom(bArr);
                }
                wnVar.f389302d = ch1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            wnVar.f389303e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            wnVar.f389304f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wnVar.f389305g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wnVar.f389306h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ch1 ch1Var = this.f389302d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, ya.b.SOURCE, ch1Var, false);
            eVar.d(jSONObject, "isLocal", java.lang.Boolean.valueOf(this.f389303e), false);
            eVar.d(jSONObject, "likeCount", java.lang.Integer.valueOf(this.f389304f), false);
            eVar.d(jSONObject, "selfLike", java.lang.Boolean.valueOf(this.f389305g), false);
            eVar.d(jSONObject, "selfOp", java.lang.Boolean.valueOf(this.f389306h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
