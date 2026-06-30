package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ej implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gj f118261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f118262b;

    public ej(com.tencent.mm.plugin.finder.live.widget.gj gjVar, org.json.JSONObject jSONObject) {
        this.f118261a = gjVar;
        this.f118262b = jSONObject;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.LinkedList list = ((r45.m02) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getRet_list(...)");
        r45.ix0 ix0Var = (r45.ix0) kz5.n0.Z(list);
        java.lang.String string = ix0Var != null ? ix0Var.getString(2) : null;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.live.widget.gj gjVar = this.f118261a;
        if (i17 != 0 || fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.i("FinderLivecommentListWidget", "errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
            db5.t7.g(gjVar.f118448i.getContext(), gjVar.f118448i.getContext().getString(com.tencent.mm.R.string.f491437d33));
        } else if (string != null) {
            gjVar.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.fj(string, gjVar));
            bm2.g3 g3Var = gjVar.f118454r;
            java.util.ArrayList arrayList = g3Var.f21908d;
            arrayList.clear();
            int i18 = g3Var.f21909e - 1;
            if (i18 >= 0) {
                int i19 = 0;
                while (true) {
                    arrayList.add("");
                    if (i19 == i18) {
                        break;
                    }
                    i19++;
                }
            }
            g3Var.notifyDataSetChanged();
        } else {
            org.json.JSONObject jSONObject = this.f118262b;
            jSONObject.put("anchor_status", "2");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328391y0, jSONObject.toString(), null, 4, null);
            boolean z17 = gjVar.f118453q;
            android.view.View view = gjVar.f118448i;
            if (z17) {
                db5.t7.h(view.getContext(), view.getContext().getString(com.tencent.mm.R.string.f491436d32));
            } else {
                db5.t7.h(view.getContext(), view.getContext().getString(com.tencent.mm.R.string.f491435d31));
            }
            gjVar.b();
        }
        return jz5.f0.f302826a;
    }
}
