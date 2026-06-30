package r45;

/* loaded from: classes8.dex */
public class jn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377975d;

    /* renamed from: e, reason: collision with root package name */
    public long f377976e;

    /* renamed from: f, reason: collision with root package name */
    public int f377977f;

    /* renamed from: g, reason: collision with root package name */
    public int f377978g;

    /* renamed from: h, reason: collision with root package name */
    public int f377979h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f377980i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn6)) {
            return false;
        }
        r45.jn6 jn6Var = (r45.jn6) fVar;
        return n51.f.a(this.f377975d, jn6Var.f377975d) && n51.f.a(java.lang.Long.valueOf(this.f377976e), java.lang.Long.valueOf(jn6Var.f377976e)) && n51.f.a(java.lang.Integer.valueOf(this.f377977f), java.lang.Integer.valueOf(jn6Var.f377977f)) && n51.f.a(java.lang.Integer.valueOf(this.f377978g), java.lang.Integer.valueOf(jn6Var.f377978g)) && n51.f.a(java.lang.Integer.valueOf(this.f377979h), java.lang.Integer.valueOf(jn6Var.f377979h)) && n51.f.a(this.f377980i, jn6Var.f377980i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377975d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f377976e);
            fVar.e(3, this.f377977f);
            fVar.e(4, this.f377978g);
            fVar.e(5, this.f377979h);
            fVar.g(6, 1, this.f377980i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377975d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f377976e) + b36.f.e(3, this.f377977f) + b36.f.e(4, this.f377978g) + b36.f.e(5, this.f377979h) + b36.f.g(6, 1, this.f377980i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377980i.clear();
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
        r45.jn6 jn6Var = (r45.jn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jn6Var.f377975d = aVar2.k(intValue);
                return 0;
            case 2:
                jn6Var.f377976e = aVar2.i(intValue);
                return 0;
            case 3:
                jn6Var.f377977f = aVar2.g(intValue);
                return 0;
            case 4:
                jn6Var.f377978g = aVar2.g(intValue);
                return 0;
            case 5:
                jn6Var.f377979h = aVar2.g(intValue);
                return 0;
            case 6:
                jn6Var.f377980i.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f377975d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Content", str, false);
            eVar.d(jSONObject, "SaveTs", java.lang.Long.valueOf(this.f377976e), false);
            eVar.d(jSONObject, "DirectShowTs", java.lang.Integer.valueOf(this.f377977f), false);
            eVar.d(jSONObject, "ShowAndRefreshTs", java.lang.Integer.valueOf(this.f377978g), false);
            eVar.d(jSONObject, "Category", java.lang.Integer.valueOf(this.f377979h), false);
            eVar.d(jSONObject, "DocidList", this.f377980i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
