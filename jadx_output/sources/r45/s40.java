package r45;

/* loaded from: classes4.dex */
public class s40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385491d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385492e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s40)) {
            return false;
        }
        r45.s40 s40Var = (r45.s40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385491d), java.lang.Integer.valueOf(s40Var.f385491d)) && n51.f.a(this.f385492e, s40Var.f385492e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385492e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385491d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f385491d) + 0 + b36.f.g(2, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.s40 s40Var = (r45.s40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s40Var.f385491d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.r40 r40Var = new r45.r40();
            if (bArr2 != null && bArr2.length > 0) {
                r40Var.parseFrom(bArr2);
            }
            s40Var.f385492e.add(r40Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f385491d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ClipboardOperationCount", valueOf, false);
            eVar.d(jSONObject, "ClipboardOperationList", this.f385492e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
