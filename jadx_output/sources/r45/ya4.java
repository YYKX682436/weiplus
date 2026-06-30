package r45;

/* loaded from: classes8.dex */
public class ya4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390926d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f390927e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ya4)) {
            return false;
        }
        r45.ya4 ya4Var = (r45.ya4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390926d), java.lang.Integer.valueOf(ya4Var.f390926d)) && n51.f.a(this.f390927e, ya4Var.f390927e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390926d);
            fVar.g(2, 8, this.f390927e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390926d) + 0 + b36.f.g(2, 8, this.f390927e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f390927e.clear();
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
        r45.ya4 ya4Var = (r45.ya4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ya4Var.f390926d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.az azVar = new r45.az();
            if (bArr2 != null && bArr2.length > 0) {
                azVar.parseFrom(bArr2);
            }
            ya4Var.f390927e.add(azVar);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f390926d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "WatchMemberCount", valueOf, false);
            eVar.d(jSONObject, "WatchMembers", this.f390927e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
