package zk3;

/* loaded from: classes8.dex */
public class a extends pk3.h {
    public a(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 1;
    }

    @Override // pk3.b
    public boolean Mb(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2) {
        return (multiTaskInfo2 != null && android.text.TextUtils.equals(multiTaskInfo2.field_id, multiTaskInfo.field_id) && multiTaskInfo.field_type == multiTaskInfo2.field_type) ? false : true;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, r45.fr4 fr4Var, java.lang.Object obj) {
        t04.a aVar;
        r45.n8 n8Var = new r45.n8();
        try {
            n8Var.parseFrom(multiTaskInfo.field_data);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandMultiTaskUIC", e17, "onMultiTaskItemClick exception:%s", e17.getMessage());
        }
        if (obj instanceof com.tencent.mm.plugin.multitask.model.MultiTaskInfo) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj;
            if (android.text.TextUtils.equals(multiTaskInfo.field_id, multiTaskInfo2.field_id) && multiTaskInfo.field_type == multiTaskInfo2.field_type) {
                zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(getActivity());
                if (Ai != null) {
                    ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).h7(true);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMultiTaskUIC", "not find IMultiTaskUIC");
                    return;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMultiTaskUIC", "extra instanceof MultiTaskInfo fail.");
        }
        com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData parcelableMultiTaskData = new com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData();
        r45.w60 w60Var = new r45.w60();
        parcelableMultiTaskData.f74958d = w60Var;
        w60Var.set(3, bm5.f1.a());
        parcelableMultiTaskData.f74958d.set(0, fr4Var);
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            ((md0.e) eVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            if (context instanceof com.tencent.mm.ui.component.UIComponentActivity) {
                aVar = (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).wi(view.getContext(), 5);
                if (kr4Var instanceof r45.kr4) {
                    parcelableMultiTaskData.f74958d.set(1, kr4Var.getString(0));
                }
            }
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = n8Var.getString(1);
        b1Var.f317014b = n8Var.getString(0);
        b1Var.f317016c = n8Var.getInteger(2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiTaskUIC", "onMultiTaskItemClick username:%s,appid:%s,versionType:%d", n8Var.getString(1), n8Var.getString(0), java.lang.Integer.valueOf(n8Var.getInteger(2)));
        b1Var.O = parcelableMultiTaskData;
        b1Var.f317032k = 1187;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.activity, b1Var);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }

    @Override // pk3.b
    public void p9(o75.c cVar) {
    }

    public a(androidx.fragment.app.Fragment fragment) {
        super(fragment);
    }
}
