package r45;

/* loaded from: classes8.dex */
public class fn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374469d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bz2 f374470e;

    /* renamed from: f, reason: collision with root package name */
    public r45.f03 f374471f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vs2 f374472g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fn6)) {
            return false;
        }
        r45.fn6 fn6Var = (r45.fn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374469d), java.lang.Integer.valueOf(fn6Var.f374469d)) && n51.f.a(this.f374470e, fn6Var.f374470e) && n51.f.a(this.f374471f, fn6Var.f374471f) && n51.f.a(this.f374472g, fn6Var.f374472g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374469d);
            r45.bz2 bz2Var = this.f374470e;
            if (bz2Var != null) {
                fVar.i(2, bz2Var.computeSize());
                this.f374470e.writeFields(fVar);
            }
            r45.f03 f03Var = this.f374471f;
            if (f03Var != null) {
                fVar.i(3, f03Var.computeSize());
                this.f374471f.writeFields(fVar);
            }
            r45.vs2 vs2Var = this.f374472g;
            if (vs2Var != null) {
                fVar.i(4, vs2Var.computeSize());
                this.f374472g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374469d) + 0;
            r45.bz2 bz2Var2 = this.f374470e;
            if (bz2Var2 != null) {
                e17 += b36.f.i(2, bz2Var2.computeSize());
            }
            r45.f03 f03Var2 = this.f374471f;
            if (f03Var2 != null) {
                e17 += b36.f.i(3, f03Var2.computeSize());
            }
            r45.vs2 vs2Var2 = this.f374472g;
            return vs2Var2 != null ? e17 + b36.f.i(4, vs2Var2.computeSize()) : e17;
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
        r45.fn6 fn6Var = (r45.fn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fn6Var.f374469d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.bz2 bz2Var3 = new r45.bz2();
                if (bArr != null && bArr.length > 0) {
                    bz2Var3.parseFrom(bArr);
                }
                fn6Var.f374470e = bz2Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.f03 f03Var3 = new r45.f03();
                if (bArr2 != null && bArr2.length > 0) {
                    f03Var3.parseFrom(bArr2);
                }
                fn6Var.f374471f = f03Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.vs2 vs2Var3 = new r45.vs2();
            if (bArr3 != null && bArr3.length > 0) {
                vs2Var3.parseFrom(bArr3);
            }
            fn6Var.f374472g = vs2Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f374469d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "category", valueOf, false);
            eVar.d(jSONObject, "tipsShowInfo", this.f374470e, false);
            eVar.d(jSONObject, "showInfo", this.f374471f, false);
            eVar.d(jSONObject, "ctrlInfo", this.f374472g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
