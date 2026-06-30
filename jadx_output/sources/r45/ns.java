package r45;

/* loaded from: classes4.dex */
public class ns extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381634d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f381635e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ns)) {
            return false;
        }
        r45.ns nsVar = (r45.ns) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381634d), java.lang.Integer.valueOf(nsVar.f381634d)) && n51.f.a(this.f381635e, nsVar.f381635e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381634d);
            fVar.k(2, 2, this.f381635e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f381634d) + 0 + b36.f.k(2, 2, this.f381635e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381635e.clear();
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
        r45.ns nsVar = (r45.ns) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nsVar.f381634d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        byte[] bArr2 = aVar2.d(intValue).f192156a;
        d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
        kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f247596c < aVar3.f247595b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        nsVar.f381635e = linkedList;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f381634d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "PortCount", valueOf, false);
            eVar.d(jSONObject, "PortList", this.f381635e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
