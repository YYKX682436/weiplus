package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vx {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f170717a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.bs f170718b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f170719c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f170720d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout f170721e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f170722f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f170723g;

    public vx(android.content.Context context, com.tencent.mm.plugin.sns.ui.bs bsVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f170720d = false;
        this.f170717a = context;
        this.f170718b = bsVar;
        this.f170719c = frameLayout;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        this.f170720d = (r17 == 0 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_enhance_like_gallery, 2) : r17) == 2;
    }

    public boolean a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineCommentHelper", "showCommentBtn err2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
        java.lang.String str = baseViewHolder.f169268f;
        com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout snsCommentShowAbLayout = this.f170721e;
        if (snsCommentShowAbLayout != null) {
            if (snsCommentShowAbLayout.getTag() instanceof com.tencent.mm.plugin.sns.ui.ux) {
                com.tencent.mm.plugin.sns.ui.ux uxVar = (com.tencent.mm.plugin.sns.ui.ux) this.f170721e.getTag();
                if (uxVar.f170603a.equals(str)) {
                    c(uxVar.f170604b);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix closeCommentView.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
                    return true;
                }
            }
            d();
            this.f170721e = null;
        }
        android.content.Context context = this.f170717a;
        com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout snsCommentShowAbLayout2 = new com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout(context);
        this.f170721e = snsCommentShowAbLayout2;
        boolean z17 = com.tencent.mm.sdk.platformtools.l1.f192817a;
        snsCommentShowAbLayout2.setId(com.tencent.mm.R.id.f482733md);
        new android.widget.FrameLayout.LayoutParams(-1, -1);
        this.f170719c.addView(this.f170721e);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix addView(ablayout).");
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 76.0f);
        int d18 = com.tencent.mm.sdk.platformtools.j.d(context, 12.0f);
        int d19 = com.tencent.mm.sdk.platformtools.j.d(context, 16.0f);
        int d27 = com.tencent.mm.sdk.platformtools.j.d(context, 40.0f);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cqy, (android.view.ViewGroup) null);
        int b17 = i65.a.b(context, 1);
        view.getLocationInWindow(r12);
        int[] iArr = new int[2];
        this.f170721e.getLocationInWindow(iArr);
        int[] iArr2 = {0, iArr2[1] - iArr[1]};
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "addCommentView getLocationInWindow " + iArr2[0] + "  " + iArr2[1] + " height: " + b17 + " height_hardcode:" + d17);
        android.widget.AbsoluteLayout.LayoutParams layoutParams = new android.widget.AbsoluteLayout.LayoutParams(-1, -2, d18 - d19, (iArr2[1] - b17) - ((d27 / 2) - (view.getMeasuredHeight() / 2)));
        this.f170721e.setTag(new com.tencent.mm.plugin.sns.ui.ux(this, str, inflate));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        linearLayout.setHorizontalGravity(8388613);
        layoutParams.width = iArr2[0];
        linearLayout.addView(inflate, layoutParams2);
        this.f170721e.addView(linearLayout, layoutParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix addView(commentView, apar).");
        if (baseViewHolder.f169260b == 10) {
            inflate.findViewById(com.tencent.mm.R.id.f482826oz).setBackgroundResource(com.tencent.mm.R.drawable.f481842cj2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "addCommentView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "addCommentView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix comment gone.");
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.sx(this, view, inflate));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        return true;
    }

    public void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return;
        }
        java.lang.String str = ((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag()).f169268f;
        com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout snsCommentShowAbLayout = this.f170721e;
        if (snsCommentShowAbLayout != null && (snsCommentShowAbLayout.getTag() instanceof com.tencent.mm.plugin.sns.ui.ux)) {
            com.tencent.mm.plugin.sns.ui.ux uxVar = (com.tencent.mm.plugin.sns.ui.ux) this.f170721e.getTag();
            if (uxVar.f170603a.equals(str)) {
                c(uxVar.f170604b);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
    }

    public final void c(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        view.clearAnimation();
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f170718b;
        view.startAnimation(bsVar.f168049o);
        bsVar.f168049o.setAnimationListener(new com.tencent.mm.plugin.sns.ui.tx(this, view));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
    }

    public boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (this.f170721e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix removeCommentView.");
        this.f170719c.removeView(this.f170721e);
        this.f170721e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        return true;
    }
}
