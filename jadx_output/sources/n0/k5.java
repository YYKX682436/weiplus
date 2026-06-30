package n0;

/* loaded from: classes16.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.p {
    public final /* synthetic */ android.view.View C;
    public final /* synthetic */ int D;
    public final /* synthetic */ android.widget.ImageView E;
    public final /* synthetic */ rx4.v0 F;
    public final /* synthetic */ rx4.u0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.view.View view, int i17, android.widget.ImageView imageView, rx4.v0 v0Var, rx4.u0 u0Var) {
        super(2);
        this.C = view;
        this.D = i17;
        this.E = imageView;
        this.F = v0Var;
        this.G = u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        android.view.View view = this.C;
        if (view.getParent() != null && bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            int i17 = this.D;
            android.widget.ImageView imageView = this.E;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = (int) (width * i17);
            layoutParams.height = i17;
            imageView.setLayoutParams(layoutParams);
            imageView.setVisibility(0);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.sh6);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483346sh4);
            rx4.v0 v0Var = this.F;
            if (v0Var.f401302c.length() > 0) {
                textView.setText(v0Var.f401302c);
            } else {
                textView.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rx4.u0 u0Var = this.G;
            view.setOnClickListener(new n0.j5(u0Var, v0Var));
            android.view.View view2 = this.C;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = u0Var.f401289p;
            if (!z17) {
                if (!z17) {
                    u0Var.f401289p = true;
                    java.lang.String str = "1|1|" + fp.s0.b("618活动入口", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "||0|" + fp.s0.b("618活动入口", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "|||banner|";
                    java.lang.String str2 = "2|78|" + fp.s0.b("618活动入口", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    android.app.Activity context = u0Var.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    rx4.h2.r7((rx4.h2) a17, vu4.a.f440239f, str2, str, u0Var.f401283g, null, 16, null);
                }
                java.lang.String str3 = v0Var.f401310k;
                if (!(str3.length() == 0)) {
                    boolean z18 = str3.length() == 0;
                    java.lang.String str4 = u0Var.f401280d;
                    if (!z18) {
                        try {
                            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).Ri(new pq.a(u0Var.getActivity()), str3, null, new rx4.q0(u0Var));
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e(str4, "tryPreloadBannerCgi failed: " + th6.getMessage(), th6);
                        }
                    }
                    if (!(str3.length() == 0)) {
                        try {
                            com.tencent.mars.xlog.Log.i(str4, "tryPreloadBannerWxa: dispatch silent preload via IEcsOpenService.open");
                            pq.a aVar = new pq.a(u0Var.getActivity());
                            bw5.h8 h8Var = aVar.f357552b;
                            bw5.g8 g8Var = new bw5.g8();
                            g8Var.f27712e = true;
                            g8Var.f27722r[2] = true;
                            h8Var.e(g8Var);
                            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).Ai(aVar, str3, new rx4.r0(u0Var));
                        } catch (java.lang.Throwable th7) {
                            com.tencent.mars.xlog.Log.e(str4, "tryPreloadBannerWxa: failed: " + th7.getMessage(), th7);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
