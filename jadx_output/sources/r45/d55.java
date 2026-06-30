package r45;

/* loaded from: classes2.dex */
public class d55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.f55 f372132d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e55 f372133e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d55)) {
            return false;
        }
        r45.d55 d55Var = (r45.d55) fVar;
        return n51.f.a(this.f372132d, d55Var.f372132d) && n51.f.a(this.f372133e, d55Var.f372133e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.f55 f55Var = this.f372132d;
            if (f55Var != null) {
                fVar.i(1, f55Var.computeSize());
                this.f372132d.writeFields(fVar);
            }
            r45.e55 e55Var = this.f372133e;
            if (e55Var != null) {
                fVar.i(2, e55Var.computeSize());
                this.f372133e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.f55 f55Var2 = this.f372132d;
            int i18 = f55Var2 != null ? 0 + b36.f.i(1, f55Var2.computeSize()) : 0;
            r45.e55 e55Var2 = this.f372133e;
            return e55Var2 != null ? i18 + b36.f.i(2, e55Var2.computeSize()) : i18;
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
        r45.d55 d55Var = (r45.d55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.f55 f55Var3 = new r45.f55();
                if (bArr != null && bArr.length > 0) {
                    f55Var3.parseFrom(bArr);
                }
                d55Var.f372132d = f55Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.e55 e55Var3 = new r45.e55();
            if (bArr2 != null && bArr2.length > 0) {
                e55Var3.parseFrom(bArr2);
            }
            d55Var.f372133e = e55Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.f55 f55Var = this.f372132d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ShowInfo", f55Var, false);
            eVar.d(jSONObject, "ActionInfo", this.f372133e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
