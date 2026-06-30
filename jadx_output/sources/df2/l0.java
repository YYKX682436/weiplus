package df2;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f230616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f230617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f230618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f230619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(v65.n nVar, com.tencent.mm.modelbase.f fVar, df2.v0 v0Var, boolean z17) {
        super(0);
        this.f230616d = nVar;
        this.f230617e = fVar;
        this.f230618f = v0Var;
        this.f230619g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ix0 ix0Var;
        com.tencent.mm.modelbase.f fVar = this.f230617e;
        this.f230616d.a(java.lang.Boolean.valueOf(xg2.g.e(fVar)));
        if (xg2.g.e(fVar)) {
            boolean z17 = true;
            java.util.Iterator it = ((r45.m02) fVar.f70618d).getList(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    ix0Var = null;
                    break;
                }
                ix0Var = (r45.ix0) it.next();
                if (ix0Var.getInteger(0) == 15) {
                    break;
                }
            }
            if (ix0Var != null) {
                int integer = ix0Var.getInteger(1);
                df2.v0 v0Var = this.f230618f;
                if (integer == 0) {
                    com.tencent.mm.protobuf.g byteString = ix0Var.getByteString(3);
                    if (byteString != null) {
                        com.tencent.mm.protobuf.g gVar = byteString.f192156a.length > 0 ? byteString : null;
                        if (gVar != null) {
                            r45.z02 z02Var = new r45.z02();
                            z02Var.parseFrom(gVar.g());
                            com.tencent.mars.xlog.Log.i("FinderLiveEditCoverController", "#executeUpload finally done. new remain: " + z02Var.getInteger(0));
                            ((mm2.f1) v0Var.business(mm2.f1.class)).f329020f = z02Var;
                            v0Var.f231572m = c01.id.c();
                            if (this.f230619g) {
                                db5.t7.h(v0Var.N6(), v0Var.O6().getResources().getString(com.tencent.mm.R.string.f491767e65));
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("element", 6);
                            jSONObject.put("type", 1);
                            jSONObject.put("sub_element", 7);
                            jSONObject.put("sub_type", 4);
                            java.lang.String str = v0Var.f231573n;
                            if (str != null && str.length() != 0) {
                                z17 = false;
                            }
                            if (!z17) {
                                jSONObject.put("ai_msg_id", v0Var.f231573n);
                            }
                            i95.m c17 = i95.n0.c(ml2.j0.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                        }
                    }
                } else {
                    db5.t7.g(v0Var.O6(), ix0Var.getString(2));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
