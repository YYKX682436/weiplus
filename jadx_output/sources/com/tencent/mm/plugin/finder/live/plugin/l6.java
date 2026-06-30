package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f113350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f113351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var, boolean z17) {
        super(0);
        this.f113350d = v6Var;
        this.f113351e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f113350d;
        boolean z17 = this.f113351e;
        v6Var.B = z17;
        android.widget.TextView textView = v6Var.f114669r;
        android.widget.ImageView imageView = v6Var.f114668q;
        com.tencent.mm.view.MMPAGView mMPAGView = v6Var.f114670s;
        if (z17) {
            imageView.setVisibility(4);
            textView.setVisibility(8);
            android.view.View view = v6Var.f114672u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$changeApplaudMode$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$changeApplaudMode$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMPAGView.setVisibility(0);
            if (!mMPAGView.f()) {
                ym5.l2 l2Var = ym5.l2.f463424a;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463326w));
                com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = this.f113350d;
                com.tencent.mm.plugin.finder.live.util.y.m(v6Var2, null, null, new com.tencent.mm.plugin.finder.live.plugin.j6(v6Var2, null), 3, null);
            }
            pm0.v.V(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, new com.tencent.mm.plugin.finder.live.plugin.k6(v6Var));
        } else {
            imageView.setVisibility(0);
            textView.setVisibility(0);
            mMPAGView.setVisibility(8);
            mMPAGView.n();
            v6Var.A = java.lang.System.currentTimeMillis();
        }
        return jz5.f0.f302826a;
    }
}
