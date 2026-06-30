package r45;

/* loaded from: classes4.dex */
public class p53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382761d;

    /* renamed from: e, reason: collision with root package name */
    public int f382762e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f382763f;

    /* renamed from: g, reason: collision with root package name */
    public int f382764g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p53)) {
            return false;
        }
        r45.p53 p53Var = (r45.p53) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382761d), java.lang.Integer.valueOf(p53Var.f382761d)) && n51.f.a(java.lang.Integer.valueOf(this.f382762e), java.lang.Integer.valueOf(p53Var.f382762e)) && n51.f.a(this.f382763f, p53Var.f382763f) && n51.f.a(java.lang.Integer.valueOf(this.f382764g), java.lang.Integer.valueOf(p53Var.f382764g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382761d);
            fVar.e(2, this.f382762e);
            r45.cu5 cu5Var = this.f382763f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f382763f.writeFields(fVar);
            }
            fVar.e(4, this.f382764g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382761d) + 0 + b36.f.e(2, this.f382762e);
            r45.cu5 cu5Var2 = this.f382763f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(4, this.f382764g);
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
        r45.p53 p53Var = (r45.p53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p53Var.f382761d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p53Var.f382762e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            p53Var.f382764g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            p53Var.f382763f = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f382761d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "FunctionId", valueOf, false);
            eVar.d(jSONObject, "SwitchValue", java.lang.Integer.valueOf(this.f382762e), false);
            eVar.d(jSONObject, "Ticket", this.f382763f, false);
            eVar.d(jSONObject, "TicketType", java.lang.Integer.valueOf(this.f382764g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
