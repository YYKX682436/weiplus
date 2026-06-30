package pk2;

/* loaded from: classes3.dex */
public final class eb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(pk2.o9 o9Var) {
        super(1);
        this.f355719d = o9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        pk2.o9 o9Var = this.f355719d;
        o9Var.d(list);
        df2.od odVar = (df2.od) o9Var.e(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_ShareLive);
        }
        if (list != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.Iterator it = list.iterator();
            java.lang.String str = "";
            while (it.hasNext()) {
                str = str + ((java.lang.String) it.next()) + ';';
            }
            if (r26.i0.o(str, ";", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            jSONObject.put("type", "1");
            jSONObject.put(dm.i4.COL_USERNAME, str);
            jSONObject.put("share_scene", java.lang.String.valueOf(zl2.r4.f473950a.Z0()));
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328362m, jSONObject.toString(), null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
