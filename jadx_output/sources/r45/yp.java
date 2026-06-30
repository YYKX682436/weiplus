package r45;

/* loaded from: classes2.dex */
public class yp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391266d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391267e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f391268f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yp)) {
            return false;
        }
        r45.yp ypVar = (r45.yp) fVar;
        return n51.f.a(this.f391266d, ypVar.f391266d) && n51.f.a(this.f391267e, ypVar.f391267e) && n51.f.a(this.f391268f, ypVar.f391268f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391268f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f391266d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391267e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f391266d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f391267e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            return b17 + b36.f.g(3, 8, linkedList);
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
        r45.yp ypVar = (r45.yp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ypVar.f391266d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            ypVar.f391267e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.p06 p06Var = new r45.p06();
            if (bArr2 != null && bArr2.length > 0) {
                p06Var.parseFrom(bArr2);
            }
            ypVar.f391268f.add(p06Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.protobuf.g gVar = this.f391266d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", gVar, false);
            eVar.d(jSONObject, "ServiceUrl", this.f391267e, false);
            eVar.d(jSONObject, "ItemFieldList", this.f391268f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
