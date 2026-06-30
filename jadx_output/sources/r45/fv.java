package r45;

/* loaded from: classes4.dex */
public class fv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374612d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374613e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374614f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fv)) {
            return false;
        }
        r45.fv fvVar = (r45.fv) fVar;
        return n51.f.a(this.f374612d, fvVar.f374612d) && n51.f.a(this.f374613e, fvVar.f374613e) && n51.f.a(this.f374614f, fvVar.f374614f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374612d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f374613e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374614f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.tencent.mm.protobuf.g gVar3 = this.f374613e;
            if (gVar3 != null) {
                g17 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f374614f;
            return gVar4 != null ? g17 + b36.f.b(3, gVar4) : g17;
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
        r45.fv fvVar = (r45.fv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                fvVar.f374613e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            fvVar.f374614f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ev6 ev6Var = new r45.ev6();
            if (bArr2 != null && bArr2.length > 0) {
                ev6Var.parseFrom(bArr2);
            }
            fvVar.f374612d.add(ev6Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f374612d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "CdnUrlInfo", linkedList, false);
            eVar.d(jSONObject, "CoverUrl", this.f374613e, false);
            eVar.d(jSONObject, "ArticleUrl", this.f374614f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
