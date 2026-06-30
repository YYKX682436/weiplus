package pj4;

/* loaded from: classes4.dex */
public class s0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f355279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355280e;

    /* renamed from: f, reason: collision with root package name */
    public long f355281f;

    /* renamed from: g, reason: collision with root package name */
    public int f355282g;

    /* renamed from: h, reason: collision with root package name */
    public int f355283h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355284i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f355285m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.s0)) {
            return false;
        }
        pj4.s0 s0Var = (pj4.s0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f355279d), java.lang.Long.valueOf(s0Var.f355279d)) && n51.f.a(this.f355280e, s0Var.f355280e) && n51.f.a(java.lang.Long.valueOf(this.f355281f), java.lang.Long.valueOf(s0Var.f355281f)) && n51.f.a(java.lang.Integer.valueOf(this.f355282g), java.lang.Integer.valueOf(s0Var.f355282g)) && n51.f.a(java.lang.Integer.valueOf(this.f355283h), java.lang.Integer.valueOf(s0Var.f355283h)) && n51.f.a(this.f355284i, s0Var.f355284i) && n51.f.a(this.f355285m, s0Var.f355285m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355285m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f355279d);
            java.lang.String str = this.f355280e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f355281f);
            fVar.e(4, this.f355282g);
            fVar.e(5, this.f355283h);
            java.lang.String str2 = this.f355284i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f355279d) + 0;
            java.lang.String str3 = this.f355280e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int h18 = h17 + b36.f.h(3, this.f355281f) + b36.f.e(4, this.f355282g) + b36.f.e(5, this.f355283h);
            java.lang.String str4 = this.f355284i;
            if (str4 != null) {
                h18 += b36.f.j(6, str4);
            }
            return h18 + b36.f.g(7, 8, linkedList);
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
        pj4.s0 s0Var = (pj4.s0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s0Var.f355279d = aVar2.i(intValue);
                return 0;
            case 2:
                s0Var.f355280e = aVar2.k(intValue);
                return 0;
            case 3:
                s0Var.f355281f = aVar2.i(intValue);
                return 0;
            case 4:
                s0Var.f355282g = aVar2.g(intValue);
                return 0;
            case 5:
                s0Var.f355283h = aVar2.g(intValue);
                return 0;
            case 6:
                s0Var.f355284i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    pj4.t0 t0Var = new pj4.t0();
                    if (bArr2 != null && bArr2.length > 0) {
                        t0Var.parseFrom(bArr2);
                    }
                    s0Var.f355285m.add(t0Var);
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f355279d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "uid", valueOf, false);
            eVar.d(jSONObject, "sub_id", this.f355280e, false);
            eVar.d(jSONObject, "version", java.lang.Long.valueOf(this.f355281f), false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f355282g), false);
            eVar.d(jSONObject, "update_time", java.lang.Integer.valueOf(this.f355283h), false);
            eVar.d(jSONObject, "description", this.f355284i, false);
            eVar.d(jSONObject, "templates", this.f355285m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
