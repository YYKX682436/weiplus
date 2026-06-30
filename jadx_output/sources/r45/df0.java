package r45;

/* loaded from: classes4.dex */
public class df0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372372d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ef0 f372373e;

    /* renamed from: f, reason: collision with root package name */
    public int f372374f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ef0 f372375g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.df0)) {
            return false;
        }
        r45.df0 df0Var = (r45.df0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372372d), java.lang.Integer.valueOf(df0Var.f372372d)) && n51.f.a(this.f372373e, df0Var.f372373e) && n51.f.a(java.lang.Integer.valueOf(this.f372374f), java.lang.Integer.valueOf(df0Var.f372374f)) && n51.f.a(this.f372375g, df0Var.f372375g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372372d);
            r45.ef0 ef0Var = this.f372373e;
            if (ef0Var != null) {
                fVar.i(2, ef0Var.computeSize());
                this.f372373e.writeFields(fVar);
            }
            fVar.e(3, this.f372374f);
            r45.ef0 ef0Var2 = this.f372375g;
            if (ef0Var2 != null) {
                fVar.i(4, ef0Var2.computeSize());
                this.f372375g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372372d) + 0;
            r45.ef0 ef0Var3 = this.f372373e;
            if (ef0Var3 != null) {
                e17 += b36.f.i(2, ef0Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f372374f);
            r45.ef0 ef0Var4 = this.f372375g;
            return ef0Var4 != null ? e18 + b36.f.i(4, ef0Var4.computeSize()) : e18;
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
        r45.df0 df0Var = (r45.df0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            df0Var.f372372d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ef0 ef0Var5 = new r45.ef0();
                if (bArr != null && bArr.length > 0) {
                    ef0Var5.parseFrom(bArr);
                }
                df0Var.f372373e = ef0Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            df0Var.f372374f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ef0 ef0Var6 = new r45.ef0();
            if (bArr2 != null && bArr2.length > 0) {
                ef0Var6.parseFrom(bArr2);
            }
            df0Var.f372375g = ef0Var6;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372372d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "NightSetting", valueOf, false);
            eVar.d(jSONObject, "NightTime", this.f372373e, false);
            eVar.d(jSONObject, "AllDaySetting", java.lang.Integer.valueOf(this.f372374f), false);
            eVar.d(jSONObject, "AllDayTime", this.f372375g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
