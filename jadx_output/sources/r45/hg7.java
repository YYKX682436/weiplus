package r45;

/* loaded from: classes9.dex */
public class hg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376140d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f376141e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hg7)) {
            return false;
        }
        r45.hg7 hg7Var = (r45.hg7) fVar;
        return n51.f.a(this.f376140d, hg7Var.f376140d) && n51.f.a(this.f376141e, hg7Var.f376141e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376140d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f376141e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f376140d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f376141e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376141e.clear();
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
        r45.hg7 hg7Var = (r45.hg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hg7Var.f376140d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ig7 ig7Var = new r45.ig7();
            if (bArr2 != null && bArr2.length > 0) {
                ig7Var.parseFrom(bArr2);
            }
            hg7Var.f376141e.add(ig7Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f376140d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "activityName", str, false);
            eVar.d(jSONObject, "layoutList", this.f376141e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
