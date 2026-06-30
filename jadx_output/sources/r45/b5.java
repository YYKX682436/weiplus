package r45;

/* loaded from: classes9.dex */
public class b5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.d74 f370529d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.b5) && n51.f.a(this.f370529d, ((r45.b5) fVar).f370529d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.d74 d74Var = this.f370529d;
            if (d74Var != null) {
                fVar.i(1, d74Var.computeSize());
                this.f370529d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.d74 d74Var2 = this.f370529d;
            if (d74Var2 != null) {
                return 0 + b36.f.i(1, d74Var2.computeSize());
            }
            return 0;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.b5 b5Var = (r45.b5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.d74 d74Var3 = new r45.d74();
            if (bArr != null && bArr.length > 0) {
                d74Var3.parseFrom(bArr);
            }
            b5Var.f370529d = d74Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "LinkedinContactItem", this.f370529d, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
