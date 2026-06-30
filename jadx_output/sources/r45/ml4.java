package r45;

/* loaded from: classes8.dex */
public class ml4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380626d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f380627e;

    /* renamed from: f, reason: collision with root package name */
    public int f380628f;

    /* renamed from: g, reason: collision with root package name */
    public int f380629g;

    /* renamed from: h, reason: collision with root package name */
    public int f380630h;

    /* renamed from: i, reason: collision with root package name */
    public int f380631i;

    /* renamed from: m, reason: collision with root package name */
    public int f380632m;

    /* renamed from: n, reason: collision with root package name */
    public long f380633n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380634o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ml4)) {
            return false;
        }
        r45.ml4 ml4Var = (r45.ml4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380626d), java.lang.Integer.valueOf(ml4Var.f380626d)) && n51.f.a(this.f380627e, ml4Var.f380627e) && n51.f.a(java.lang.Integer.valueOf(this.f380628f), java.lang.Integer.valueOf(ml4Var.f380628f)) && n51.f.a(java.lang.Integer.valueOf(this.f380629g), java.lang.Integer.valueOf(ml4Var.f380629g)) && n51.f.a(java.lang.Integer.valueOf(this.f380630h), java.lang.Integer.valueOf(ml4Var.f380630h)) && n51.f.a(java.lang.Integer.valueOf(this.f380631i), java.lang.Integer.valueOf(ml4Var.f380631i)) && n51.f.a(java.lang.Integer.valueOf(this.f380632m), java.lang.Integer.valueOf(ml4Var.f380632m)) && n51.f.a(java.lang.Long.valueOf(this.f380633n), java.lang.Long.valueOf(ml4Var.f380633n)) && n51.f.a(this.f380634o, ml4Var.f380634o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380626d);
            r45.du5 du5Var = this.f380627e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f380627e.writeFields(fVar);
            }
            fVar.e(3, this.f380628f);
            fVar.e(4, this.f380629g);
            fVar.e(5, this.f380630h);
            fVar.e(6, this.f380631i);
            fVar.e(7, this.f380632m);
            fVar.h(8, this.f380633n);
            java.lang.String str = this.f380634o;
            if (str != null) {
                fVar.j(9, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380626d) + 0;
            r45.du5 du5Var2 = this.f380627e;
            if (du5Var2 != null) {
                e17 += b36.f.i(2, du5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f380628f) + b36.f.e(4, this.f380629g) + b36.f.e(5, this.f380630h) + b36.f.e(6, this.f380631i) + b36.f.e(7, this.f380632m) + b36.f.h(8, this.f380633n);
            java.lang.String str2 = this.f380634o;
            return str2 != null ? e18 + b36.f.j(9, str2) : e18;
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
        r45.ml4 ml4Var = (r45.ml4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ml4Var.f380626d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    ml4Var.f380627e = du5Var3;
                }
                return 0;
            case 3:
                ml4Var.f380628f = aVar2.g(intValue);
                return 0;
            case 4:
                ml4Var.f380629g = aVar2.g(intValue);
                return 0;
            case 5:
                ml4Var.f380630h = aVar2.g(intValue);
                return 0;
            case 6:
                ml4Var.f380631i = aVar2.g(intValue);
                return 0;
            case 7:
                ml4Var.f380632m = aVar2.g(intValue);
                return 0;
            case 8:
                ml4Var.f380633n = aVar2.i(intValue);
                return 0;
            case 9:
                ml4Var.f380634o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f380626d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "ToUserName", this.f380627e, false);
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f380628f), false);
            eVar.d(jSONObject, "ClientMsgId", java.lang.Integer.valueOf(this.f380629g), false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f380630h), false);
            eVar.d(jSONObject, "ServerTime", java.lang.Integer.valueOf(this.f380631i), false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f380632m), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f380633n), false);
            eVar.d(jSONObject, "MsgSource", this.f380634o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
