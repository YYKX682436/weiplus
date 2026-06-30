package r45;

/* loaded from: classes11.dex */
public class fh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374338d;

    /* renamed from: e, reason: collision with root package name */
    public int f374339e;

    /* renamed from: f, reason: collision with root package name */
    public int f374340f;

    /* renamed from: g, reason: collision with root package name */
    public int f374341g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f374342h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f374343i;

    /* renamed from: m, reason: collision with root package name */
    public int f374344m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f374345n;

    /* renamed from: o, reason: collision with root package name */
    public int f374346o;

    /* renamed from: p, reason: collision with root package name */
    public int f374347p;

    /* renamed from: q, reason: collision with root package name */
    public int f374348q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh0)) {
            return false;
        }
        r45.fh0 fh0Var = (r45.fh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374338d), java.lang.Integer.valueOf(fh0Var.f374338d)) && n51.f.a(java.lang.Integer.valueOf(this.f374339e), java.lang.Integer.valueOf(fh0Var.f374339e)) && n51.f.a(java.lang.Integer.valueOf(this.f374340f), java.lang.Integer.valueOf(fh0Var.f374340f)) && n51.f.a(java.lang.Integer.valueOf(this.f374341g), java.lang.Integer.valueOf(fh0Var.f374341g)) && n51.f.a(java.lang.Boolean.valueOf(this.f374342h), java.lang.Boolean.valueOf(fh0Var.f374342h)) && n51.f.a(java.lang.Boolean.valueOf(this.f374343i), java.lang.Boolean.valueOf(fh0Var.f374343i)) && n51.f.a(java.lang.Integer.valueOf(this.f374344m), java.lang.Integer.valueOf(fh0Var.f374344m)) && n51.f.a(java.lang.Boolean.valueOf(this.f374345n), java.lang.Boolean.valueOf(fh0Var.f374345n)) && n51.f.a(java.lang.Integer.valueOf(this.f374346o), java.lang.Integer.valueOf(fh0Var.f374346o)) && n51.f.a(java.lang.Integer.valueOf(this.f374347p), java.lang.Integer.valueOf(fh0Var.f374347p)) && n51.f.a(java.lang.Integer.valueOf(this.f374348q), java.lang.Integer.valueOf(fh0Var.f374348q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374338d);
            fVar.e(2, this.f374339e);
            fVar.e(3, this.f374340f);
            fVar.e(4, this.f374341g);
            fVar.a(6, this.f374342h);
            fVar.a(7, this.f374343i);
            fVar.e(8, this.f374344m);
            fVar.a(9, this.f374345n);
            fVar.e(10, this.f374346o);
            fVar.e(11, this.f374347p);
            fVar.e(12, this.f374348q);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f374338d) + 0 + b36.f.e(2, this.f374339e) + b36.f.e(3, this.f374340f) + b36.f.e(4, this.f374341g) + b36.f.a(6, this.f374342h) + b36.f.a(7, this.f374343i) + b36.f.e(8, this.f374344m) + b36.f.a(9, this.f374345n) + b36.f.e(10, this.f374346o) + b36.f.e(11, this.f374347p) + b36.f.e(12, this.f374348q);
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
        r45.fh0 fh0Var = (r45.fh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fh0Var.f374338d = aVar2.g(intValue);
                return 0;
            case 2:
                fh0Var.f374339e = aVar2.g(intValue);
                return 0;
            case 3:
                fh0Var.f374340f = aVar2.g(intValue);
                return 0;
            case 4:
                fh0Var.f374341g = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                fh0Var.f374342h = aVar2.c(intValue);
                return 0;
            case 7:
                fh0Var.f374343i = aVar2.c(intValue);
                return 0;
            case 8:
                fh0Var.f374344m = aVar2.g(intValue);
                return 0;
            case 9:
                fh0Var.f374345n = aVar2.c(intValue);
                return 0;
            case 10:
                fh0Var.f374346o = aVar2.g(intValue);
                return 0;
            case 11:
                fh0Var.f374347p = aVar2.g(intValue);
                return 0;
            case 12:
                fh0Var.f374348q = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f374338d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "abstract_type", valueOf, false);
            eVar.d(jSONObject, "display_type", java.lang.Integer.valueOf(this.f374339e), false);
            eVar.d(jSONObject, "display_count", java.lang.Integer.valueOf(this.f374340f), false);
            eVar.d(jSONObject, "notify_keep_time", java.lang.Integer.valueOf(this.f374341g), false);
            eVar.d(jSONObject, "allow_notify_keep_for_android", java.lang.Boolean.valueOf(this.f374342h), false);
            eVar.d(jSONObject, "allow_notify_unpin", java.lang.Boolean.valueOf(this.f374343i), false);
            eVar.d(jSONObject, "notify_unpin_time", java.lang.Integer.valueOf(this.f374344m), false);
            eVar.d(jSONObject, "enable_notify_parity", java.lang.Boolean.valueOf(this.f374345n), false);
            eVar.d(jSONObject, "fold_type", java.lang.Integer.valueOf(this.f374346o), false);
            eVar.d(jSONObject, "weak_level_open", java.lang.Integer.valueOf(this.f374347p), false);
            eVar.d(jSONObject, "weak_level_v2_open", java.lang.Integer.valueOf(this.f374348q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
