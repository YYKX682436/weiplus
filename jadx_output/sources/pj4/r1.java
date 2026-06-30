package pj4;

/* loaded from: classes8.dex */
public class r1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public pj4.q1 f355274d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f355275e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.r1)) {
            return false;
        }
        pj4.r1 r1Var = (pj4.r1) fVar;
        return n51.f.a(this.f355274d, r1Var.f355274d) && n51.f.a(this.f355275e, r1Var.f355275e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355275e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            pj4.q1 q1Var = this.f355274d;
            if (q1Var != null) {
                fVar.i(1, q1Var.computeSize());
                this.f355274d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            pj4.q1 q1Var2 = this.f355274d;
            return (q1Var2 != null ? 0 + b36.f.i(1, q1Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
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
        pj4.r1 r1Var = (pj4.r1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                pj4.q1 q1Var3 = new pj4.q1();
                if (bArr2 != null && bArr2.length > 0) {
                    q1Var3.parseFrom(bArr2);
                }
                r1Var.f355274d = q1Var3;
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
            pj4.o1 o1Var = new pj4.o1();
            if (bArr3 != null && bArr3.length > 0) {
                o1Var.parseFrom(bArr3);
            }
            r1Var.f355275e.add(o1Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            pj4.q1 q1Var = this.f355274d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "iconGroup", q1Var, false);
            eVar.d(jSONObject, "icons", this.f355275e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
