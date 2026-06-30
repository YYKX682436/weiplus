package r45;

/* loaded from: classes9.dex */
public class jo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377981d;

    /* renamed from: e, reason: collision with root package name */
    public int f377982e;

    /* renamed from: f, reason: collision with root package name */
    public int f377983f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f377984g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f377985h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jo)) {
            return false;
        }
        r45.jo joVar = (r45.jo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377981d), java.lang.Integer.valueOf(joVar.f377981d)) && n51.f.a(java.lang.Integer.valueOf(this.f377982e), java.lang.Integer.valueOf(joVar.f377982e)) && n51.f.a(java.lang.Integer.valueOf(this.f377983f), java.lang.Integer.valueOf(joVar.f377983f)) && n51.f.a(this.f377984g, joVar.f377984g) && n51.f.a(this.f377985h, joVar.f377985h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377985h;
        java.util.LinkedList linkedList2 = this.f377984g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377981d);
            fVar.e(2, this.f377982e);
            fVar.e(5, this.f377983f);
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377981d) + 0 + b36.f.e(2, this.f377982e) + b36.f.e(5, this.f377983f) + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.jo joVar = (r45.jo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            joVar.f377981d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            joVar.f377982e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.io ioVar = new r45.io();
                if (bArr2 != null && bArr2.length > 0) {
                    ioVar.parseFrom(bArr2);
                }
                joVar.f377984g.add(ioVar);
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            joVar.f377983f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.io ioVar2 = new r45.io();
            if (bArr3 != null && bArr3.length > 0) {
                ioVar2.parseFrom(bArr3);
            }
            joVar.f377985h.add(ioVar2);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377981d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "LongConnectIPCount", valueOf, false);
            eVar.d(jSONObject, "ShortConnectIPCount", java.lang.Integer.valueOf(this.f377982e), false);
            eVar.d(jSONObject, "Seq", java.lang.Integer.valueOf(this.f377983f), false);
            eVar.d(jSONObject, "LongConnectIPList", this.f377984g, false);
            eVar.d(jSONObject, "ShortConnectIPList", this.f377985h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
