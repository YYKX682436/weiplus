package r45;

/* loaded from: classes4.dex */
public class dh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372463d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372464e;

    /* renamed from: f, reason: collision with root package name */
    public int f372465f;

    /* renamed from: g, reason: collision with root package name */
    public int f372466g;

    /* renamed from: h, reason: collision with root package name */
    public int f372467h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372468i;

    /* renamed from: m, reason: collision with root package name */
    public int f372469m = 180;

    /* renamed from: n, reason: collision with root package name */
    public long f372470n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dh0)) {
            return false;
        }
        r45.dh0 dh0Var = (r45.dh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372463d), java.lang.Integer.valueOf(dh0Var.f372463d)) && n51.f.a(java.lang.Boolean.valueOf(this.f372464e), java.lang.Boolean.valueOf(dh0Var.f372464e)) && n51.f.a(java.lang.Integer.valueOf(this.f372465f), java.lang.Integer.valueOf(dh0Var.f372465f)) && n51.f.a(java.lang.Integer.valueOf(this.f372466g), java.lang.Integer.valueOf(dh0Var.f372466g)) && n51.f.a(java.lang.Integer.valueOf(this.f372467h), java.lang.Integer.valueOf(dh0Var.f372467h)) && n51.f.a(this.f372468i, dh0Var.f372468i) && n51.f.a(java.lang.Integer.valueOf(this.f372469m), java.lang.Integer.valueOf(dh0Var.f372469m)) && n51.f.a(java.lang.Long.valueOf(this.f372470n), java.lang.Long.valueOf(dh0Var.f372470n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372463d);
            fVar.a(2, this.f372464e);
            fVar.e(3, this.f372465f);
            fVar.e(4, this.f372466g);
            fVar.e(5, this.f372467h);
            java.lang.String str = this.f372468i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f372469m);
            fVar.h(8, this.f372470n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372463d) + 0 + b36.f.a(2, this.f372464e) + b36.f.e(3, this.f372465f) + b36.f.e(4, this.f372466g) + b36.f.e(5, this.f372467h);
            java.lang.String str2 = this.f372468i;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            return e17 + b36.f.e(7, this.f372469m) + b36.f.h(8, this.f372470n);
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
        r45.dh0 dh0Var = (r45.dh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dh0Var.f372463d = aVar2.g(intValue);
                return 0;
            case 2:
                dh0Var.f372464e = aVar2.c(intValue);
                return 0;
            case 3:
                dh0Var.f372465f = aVar2.g(intValue);
                return 0;
            case 4:
                dh0Var.f372466g = aVar2.g(intValue);
                return 0;
            case 5:
                dh0Var.f372467h = aVar2.g(intValue);
                return 0;
            case 6:
                dh0Var.f372468i = aVar2.k(intValue);
                return 0;
            case 7:
                dh0Var.f372469m = aVar2.g(intValue);
                return 0;
            case 8:
                dh0Var.f372470n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372463d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "control_flag", valueOf, false);
            eVar.d(jSONObject, "is_control_group", java.lang.Boolean.valueOf(this.f372464e), false);
            eVar.d(jSONObject, "control_group_flag", java.lang.Integer.valueOf(this.f372465f), false);
            eVar.d(jSONObject, "show_card_flag", java.lang.Integer.valueOf(this.f372466g), false);
            eVar.d(jSONObject, "lift_read_area_size", java.lang.Integer.valueOf(this.f372467h), false);
            eVar.d(jSONObject, "history_box_wording", this.f372468i, false);
            eVar.d(jSONObject, "outbox_keep_pos_time", java.lang.Integer.valueOf(this.f372469m), false);
            eVar.d(jSONObject, "resort_scene_bit_switch", java.lang.Long.valueOf(this.f372470n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
