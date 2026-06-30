package df2;

/* loaded from: classes10.dex */
public final class ms implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230802e;

    public ms(df2.lt ltVar, android.view.ViewGroup viewGroup) {
        this.f230801d = ltVar;
        this.f230802e = viewGroup;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.getItemViewType() == 1) {
            df2.lt ltVar = this.f230801d;
            if (ltVar.f230717y.size() <= 0 || i17 == -1) {
                return;
            }
            java.util.ArrayList arrayList = ltVar.f230717y;
            java.lang.Object obj = arrayList.get(i17 % arrayList.size());
            dk2.h hVar = obj instanceof dk2.h ? (dk2.h) obj : null;
            java.lang.String str = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "onClick jump");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - ltVar.f230714v < 500) {
                com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "don't click again in 500ms");
                return;
            }
            ltVar.f230714v = currentTimeMillis;
            if (hVar != null) {
                boolean U6 = ltVar.U6();
                android.view.ViewGroup viewGroup = this.f230802e;
                if (!U6) {
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    df2.lt.Z6(ltVar, context, hVar);
                } else if (com.tencent.mm.ui.bk.d0() || zl2.r4.f473950a.x1()) {
                    android.content.Context context2 = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    df2.lt.Z6(ltVar, context2, hVar);
                } else {
                    ltVar.W6(new df2.ls(ltVar, viewGroup, hVar));
                }
            }
            ltVar.t7(ltVar.n7(hVar, 2));
            in5.c cVar = ltVar.f230710r;
            dk2.h hVar2 = cVar instanceof dk2.h ? (dk2.h) cVar : null;
            r45.bm1 bm1Var = hVar2 != null ? hVar2.f233545h : null;
            if ((bm1Var != null && bm1Var.getInteger(12) == 1) && bm1Var.getInteger(11) == 1) {
                r45.jn0 jn0Var = new r45.jn0();
                jn0Var.set(0, java.lang.Long.valueOf(((mm2.e1) ltVar.business(mm2.e1.class)).f328983m));
                jn0Var.set(2, ((mm2.e1) ltVar.business(mm2.e1.class)).f328993w);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 70);
                jSONObject.put(dm.i4.COL_ID, bm1Var.getString(0));
                jn0Var.set(3, jSONObject.toString());
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Kj(null, 18054, jn0Var);
            }
        }
    }
}
