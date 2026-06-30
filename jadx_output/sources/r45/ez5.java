package r45;

/* loaded from: classes12.dex */
public class ez5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f373851e = new java.util.LinkedList();

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 522;
        lVar.f70666c = "/cgi-bin/micromsg-bin/newsendmsg";
        lVar.f70664a = this;
        lVar.f70665b = new r45.fz5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez5)) {
            return false;
        }
        r45.ez5 ez5Var = (r45.ez5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373850d), java.lang.Integer.valueOf(ez5Var.f373850d)) && n51.f.a(this.f373851e, ez5Var.f373851e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373851e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373850d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373850d) + 0 + b36.f.g(2, 8, linkedList);
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
        r45.ez5 ez5Var = (r45.ez5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ez5Var.f373850d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ll4 ll4Var = new r45.ll4();
            if (bArr2 != null && bArr2.length > 0) {
                ll4Var.parseFrom(bArr2);
            }
            ez5Var.f373851e.add(ll4Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f373850d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "List", this.f373851e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
