package r45;

/* loaded from: classes4.dex */
public class uf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vf7 f387341d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f387342e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf7)) {
            return false;
        }
        r45.uf7 uf7Var = (r45.uf7) fVar;
        return n51.f.a(this.f387341d, uf7Var.f387341d) && n51.f.a(this.f387342e, uf7Var.f387342e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387342e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vf7 vf7Var = this.f387341d;
            if (vf7Var != null) {
                fVar.i(1, vf7Var.computeSize());
                this.f387341d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.vf7 vf7Var2 = this.f387341d;
            return (vf7Var2 != null ? 0 + b36.f.i(1, vf7Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
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
        r45.uf7 uf7Var = (r45.uf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.vf7 vf7Var3 = new r45.vf7();
                if (bArr2 != null && bArr2.length > 0) {
                    vf7Var3.parseFrom(bArr2);
                }
                uf7Var.f387341d = vf7Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.vf7 vf7Var4 = new r45.vf7();
            if (bArr3 != null && bArr3.length > 0) {
                vf7Var4.parseFrom(bArr3);
            }
            uf7Var.f387342e.add(vf7Var4);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.vf7 vf7Var = this.f387341d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "wxa_item", vf7Var, false);
            eVar.d(jSONObject, "plugin_item_list", this.f387342e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
