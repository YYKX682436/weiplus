package r45;

/* loaded from: classes2.dex */
public class fp2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374503d;

    /* renamed from: e, reason: collision with root package name */
    public int f374504e;

    /* renamed from: f, reason: collision with root package name */
    public int f374505f;

    /* renamed from: g, reason: collision with root package name */
    public int f374506g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fp2)) {
            return false;
        }
        r45.fp2 fp2Var = (r45.fp2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374503d), java.lang.Integer.valueOf(fp2Var.f374503d)) && n51.f.a(java.lang.Integer.valueOf(this.f374504e), java.lang.Integer.valueOf(fp2Var.f374504e)) && n51.f.a(java.lang.Integer.valueOf(this.f374505f), java.lang.Integer.valueOf(fp2Var.f374505f)) && n51.f.a(java.lang.Integer.valueOf(this.f374506g), java.lang.Integer.valueOf(fp2Var.f374506g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -683514325:
                            if (next.equals("quick_swipe_down_interval")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 203503683:
                            if (next.equals("quick_swipe_down_cnt")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 585453120:
                            if (next.equals("before_finwatch_interval")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1558718385:
                            if (next.equals("swipe_down_cnt")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f374503d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f374504e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f374505f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f374506g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374503d);
            fVar.e(2, this.f374504e);
            fVar.e(3, this.f374505f);
            fVar.e(4, this.f374506g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f374503d) + 0 + b36.f.e(2, this.f374504e) + b36.f.e(3, this.f374505f) + b36.f.e(4, this.f374506g);
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
        r45.fp2 fp2Var = (r45.fp2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fp2Var.f374503d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fp2Var.f374504e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            fp2Var.f374505f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fp2Var.f374506g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f374503d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "swipe_down_cnt", valueOf, true);
            eVar.d(jSONObject, "quick_swipe_down_cnt", java.lang.Integer.valueOf(this.f374504e), true);
            eVar.d(jSONObject, "quick_swipe_down_interval", java.lang.Integer.valueOf(this.f374505f), true);
            eVar.d(jSONObject, "before_finwatch_interval", java.lang.Integer.valueOf(this.f374506g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
