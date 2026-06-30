package r45;

/* loaded from: classes2.dex */
public class qh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383996e;

    /* renamed from: f, reason: collision with root package name */
    public long f383997f;

    /* renamed from: g, reason: collision with root package name */
    public long f383998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383999h;

    /* renamed from: i, reason: collision with root package name */
    public int f384000i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh4)) {
            return false;
        }
        r45.qh4 qh4Var = (r45.qh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383995d), java.lang.Integer.valueOf(qh4Var.f383995d)) && n51.f.a(this.f383996e, qh4Var.f383996e) && n51.f.a(java.lang.Long.valueOf(this.f383997f), java.lang.Long.valueOf(qh4Var.f383997f)) && n51.f.a(java.lang.Long.valueOf(this.f383998g), java.lang.Long.valueOf(qh4Var.f383998g)) && n51.f.a(this.f383999h, qh4Var.f383999h) && n51.f.a(java.lang.Integer.valueOf(this.f384000i), java.lang.Integer.valueOf(qh4Var.f384000i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383995d);
            java.lang.String str = this.f383996e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f383997f);
            fVar.h(4, this.f383998g);
            java.lang.String str2 = this.f383999h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f384000i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383995d) + 0;
            java.lang.String str3 = this.f383996e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int h17 = e17 + b36.f.h(3, this.f383997f) + b36.f.h(4, this.f383998g);
            java.lang.String str4 = this.f383999h;
            if (str4 != null) {
                h17 += b36.f.j(5, str4);
            }
            return h17 + b36.f.e(6, this.f384000i);
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
        r45.qh4 qh4Var = (r45.qh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qh4Var.f383995d = aVar2.g(intValue);
                return 0;
            case 2:
                qh4Var.f383996e = aVar2.k(intValue);
                return 0;
            case 3:
                qh4Var.f383997f = aVar2.i(intValue);
                return 0;
            case 4:
                qh4Var.f383998g = aVar2.i(intValue);
                return 0;
            case 5:
                qh4Var.f383999h = aVar2.k(intValue);
                return 0;
            case 6:
                qh4Var.f384000i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f383995d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, valueOf, false);
            eVar.d(jSONObject, "Json", this.f383996e, false);
            eVar.d(jSONObject, "CacheSecond", java.lang.Long.valueOf(this.f383997f), false);
            eVar.d(jSONObject, "LastCacheSecond", java.lang.Long.valueOf(this.f383998g), false);
            eVar.d(jSONObject, "SearchID", this.f383999h, false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f384000i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
