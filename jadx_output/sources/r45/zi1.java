package r45;

/* loaded from: classes4.dex */
public class zi1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f392083d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qm1 f392084e;

    /* renamed from: f, reason: collision with root package name */
    public int f392085f;

    /* renamed from: g, reason: collision with root package name */
    public int f392086g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f392087h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f392088i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392089m;

    /* renamed from: n, reason: collision with root package name */
    public int f392090n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi1)) {
            return false;
        }
        r45.zi1 zi1Var = (r45.zi1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f392083d), java.lang.Long.valueOf(zi1Var.f392083d)) && n51.f.a(this.f392084e, zi1Var.f392084e) && n51.f.a(java.lang.Integer.valueOf(this.f392085f), java.lang.Integer.valueOf(zi1Var.f392085f)) && n51.f.a(java.lang.Integer.valueOf(this.f392086g), java.lang.Integer.valueOf(zi1Var.f392086g)) && n51.f.a(java.lang.Boolean.valueOf(this.f392087h), java.lang.Boolean.valueOf(zi1Var.f392087h)) && n51.f.a(java.lang.Boolean.valueOf(this.f392088i), java.lang.Boolean.valueOf(zi1Var.f392088i)) && n51.f.a(this.f392089m, zi1Var.f392089m) && n51.f.a(java.lang.Integer.valueOf(this.f392090n), java.lang.Integer.valueOf(zi1Var.f392090n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f392083d);
            r45.qm1 qm1Var = this.f392084e;
            if (qm1Var != null) {
                fVar.i(2, qm1Var.computeSize());
                this.f392084e.writeFields(fVar);
            }
            fVar.e(3, this.f392085f);
            fVar.e(4, this.f392086g);
            fVar.a(5, this.f392087h);
            fVar.a(6, this.f392088i);
            java.lang.String str = this.f392089m;
            if (str != null) {
                fVar.j(10, str);
            }
            fVar.e(11, this.f392090n);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f392083d) + 0;
            r45.qm1 qm1Var2 = this.f392084e;
            if (qm1Var2 != null) {
                h17 += b36.f.i(2, qm1Var2.computeSize());
            }
            int e17 = h17 + b36.f.e(3, this.f392085f) + b36.f.e(4, this.f392086g) + b36.f.a(5, this.f392087h) + b36.f.a(6, this.f392088i);
            java.lang.String str2 = this.f392089m;
            if (str2 != null) {
                e17 += b36.f.j(10, str2);
            }
            return e17 + b36.f.e(11, this.f392090n);
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
        r45.zi1 zi1Var = (r45.zi1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 10) {
            zi1Var.f392089m = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 11) {
            zi1Var.f392090n = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                zi1Var.f392083d = aVar2.i(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qm1 qm1Var3 = new r45.qm1();
                    if (bArr != null && bArr.length > 0) {
                        qm1Var3.parseFrom(bArr);
                    }
                    zi1Var.f392084e = qm1Var3;
                }
                return 0;
            case 3:
                zi1Var.f392085f = aVar2.g(intValue);
                return 0;
            case 4:
                zi1Var.f392086g = aVar2.g(intValue);
                return 0;
            case 5:
                zi1Var.f392087h = aVar2.c(intValue);
                return 0;
            case 6:
                zi1Var.f392088i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f392083d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "msg_seq", valueOf, false);
            eVar.d(jSONObject, "box_id", this.f392084e, false);
            eVar.d(jSONObject, "op_type", java.lang.Integer.valueOf(this.f392085f), false);
            eVar.d(jSONObject, "total_like_num", java.lang.Integer.valueOf(this.f392086g), false);
            eVar.d(jSONObject, "is_show_like_num", java.lang.Boolean.valueOf(this.f392087h), false);
            eVar.d(jSONObject, "is_self_like", java.lang.Boolean.valueOf(this.f392088i), false);
            eVar.d(jSONObject, "local_cli_msg_id", this.f392089m, false);
            eVar.d(jSONObject, "original_comment_msg_type", java.lang.Integer.valueOf(this.f392090n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
