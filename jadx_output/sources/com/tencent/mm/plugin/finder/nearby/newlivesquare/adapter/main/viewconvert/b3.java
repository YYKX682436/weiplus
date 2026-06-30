package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class b3 extends in5.r {
    public b3(sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6u;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.b0 item = (vp2.b0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        n(holder);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z2 z2Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z2(this);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ho6);
        if (textView != null) {
            textView.setText(item.f438907d);
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a3 a3Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a3(holder, this);
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(a3Var);
        }
        z2Var.f122060b = a3Var;
        holder.f293124h = z2Var;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("LivingTitleConvert", "#onViewRecycled holder=" + holder);
        n(holder);
    }

    public final void n(in5.s0 s0Var) {
        java.lang.Object obj = s0Var.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z2)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z2 z2Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z2) obj;
            kotlinx.coroutines.z0.e(z2Var.f122059a, null, 1, null);
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = z2Var.f122060b;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f293124h = null;
    }
}
