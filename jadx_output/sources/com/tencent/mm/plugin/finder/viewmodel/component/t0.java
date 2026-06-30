package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t0 extends com.tencent.mm.ui.component.UIComponent implements zy2.q5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f135951d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f135952e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f135953f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f135954g;

    static {
        jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.q0.f135642d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135951d = new java.util.HashMap();
    }

    public final void O6(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, r45.ib ibVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135953f;
        boolean z17 = false;
        if (baseFinderFeed != null && baseFinderFeed.getItemId() == feed.getItemId()) {
            z17 = true;
        }
        if (z17) {
            holder.j();
            kotlinx.coroutines.r2 r2Var = this.f135952e;
            kotlinx.coroutines.r2 r2Var2 = null;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.y0 y0Var = holder.f293120d;
            if (y0Var != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                r2Var2 = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.viewmodel.component.r0(ibVar, feed, this, holder, null), 2, null);
            }
            this.f135952e = r2Var2;
        }
    }

    public final boolean P6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.ggt);
        if (!(findViewById instanceof android.widget.TextView)) {
            findViewById = null;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        if (textView != null && textView.getVisibility() == 0) {
            java.lang.Object tag = textView != null ? textView.getTag(com.tencent.mm.R.id.tb_) : null;
            if (kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final void Q6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.lifecycle.j0 Q6 = ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).Q6(feed.getItemId());
        com.tencent.mm.plugin.finder.viewmodel.component.s0 s0Var = new com.tencent.mm.plugin.finder.viewmodel.component.s0(feed, this, holder);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        pm0.v.y(Q6, (com.tencent.mm.ui.MMActivity) context, s0Var);
        this.f135951d.put(java.lang.Integer.valueOf(holder.hashCode()), s0Var);
    }
}
