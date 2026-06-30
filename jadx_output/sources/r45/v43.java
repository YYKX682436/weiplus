package r45;

/* loaded from: classes4.dex */
public class v43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387869d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f387870e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f387871f;

    /* renamed from: g, reason: collision with root package name */
    public int f387872g;

    /* renamed from: h, reason: collision with root package name */
    public int f387873h;

    /* renamed from: i, reason: collision with root package name */
    public int f387874i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387875m;

    /* renamed from: n, reason: collision with root package name */
    public long f387876n;

    /* renamed from: o, reason: collision with root package name */
    public int f387877o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v43)) {
            return false;
        }
        r45.v43 v43Var = (r45.v43) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387869d), java.lang.Integer.valueOf(v43Var.f387869d)) && n51.f.a(this.f387870e, v43Var.f387870e) && n51.f.a(this.f387871f, v43Var.f387871f) && n51.f.a(java.lang.Integer.valueOf(this.f387872g), java.lang.Integer.valueOf(v43Var.f387872g)) && n51.f.a(java.lang.Integer.valueOf(this.f387873h), java.lang.Integer.valueOf(v43Var.f387873h)) && n51.f.a(java.lang.Integer.valueOf(this.f387874i), java.lang.Integer.valueOf(v43Var.f387874i)) && n51.f.a(this.f387875m, v43Var.f387875m) && n51.f.a(java.lang.Long.valueOf(this.f387876n), java.lang.Long.valueOf(v43Var.f387876n)) && n51.f.a(java.lang.Integer.valueOf(this.f387877o), java.lang.Integer.valueOf(v43Var.f387877o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387869d);
            r45.du5 du5Var = this.f387870e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f387870e.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f387871f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f387871f.writeFields(fVar);
            }
            fVar.e(4, this.f387872g);
            fVar.e(5, this.f387873h);
            fVar.e(6, this.f387874i);
            java.lang.String str = this.f387875m;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.h(8, this.f387876n);
            fVar.e(9, this.f387877o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387869d) + 0;
            r45.du5 du5Var3 = this.f387870e;
            if (du5Var3 != null) {
                e17 += b36.f.i(2, du5Var3.computeSize());
            }
            r45.du5 du5Var4 = this.f387871f;
            if (du5Var4 != null) {
                e17 += b36.f.i(3, du5Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f387872g) + b36.f.e(5, this.f387873h) + b36.f.e(6, this.f387874i);
            java.lang.String str2 = this.f387875m;
            if (str2 != null) {
                e18 += b36.f.j(7, str2);
            }
            return e18 + b36.f.h(8, this.f387876n) + b36.f.e(9, this.f387877o);
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
        r45.v43 v43Var = (r45.v43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v43Var.f387869d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var5.b(bArr);
                    }
                    v43Var.f387870e = du5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var6.b(bArr2);
                    }
                    v43Var.f387871f = du5Var6;
                }
                return 0;
            case 4:
                v43Var.f387872g = aVar2.g(intValue);
                return 0;
            case 5:
                v43Var.f387873h = aVar2.g(intValue);
                return 0;
            case 6:
                v43Var.f387874i = aVar2.g(intValue);
                return 0;
            case 7:
                v43Var.f387875m = aVar2.k(intValue);
                return 0;
            case 8:
                v43Var.f387876n = aVar2.i(intValue);
                return 0;
            case 9:
                v43Var.f387877o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f387869d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "MsgId", valueOf, false);
            eVar.d(jSONObject, "FromUserName", this.f387870e, false);
            eVar.d(jSONObject, "ToUserName", this.f387871f, false);
            eVar.d(jSONObject, "MsgType", java.lang.Integer.valueOf(this.f387872g), false);
            eVar.d(jSONObject, "AppMsgInnerType", java.lang.Integer.valueOf(this.f387873h), false);
            eVar.d(jSONObject, "CreateTime", java.lang.Integer.valueOf(this.f387874i), false);
            eVar.d(jSONObject, "MsgSource", this.f387875m, false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f387876n), false);
            eVar.d(jSONObject, "MsgSeq", java.lang.Integer.valueOf(this.f387877o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
