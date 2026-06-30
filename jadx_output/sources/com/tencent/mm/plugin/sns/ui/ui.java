package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ui extends com.tencent.mm.plugin.sns.ui.widget.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f170582a;

    public ui(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f170582a = snsHeader;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.a3, com.tencent.mm.plugin.sns.ui.widget.y2
    public void b(boolean z17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
            return;
        }
        float f17 = -i18;
        float f18 = 1.0f;
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f170582a;
        com.tencent.mm.plugin.sns.ui.widget.c3 b17 = com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader);
        b17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i19 = b17.f171099c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        float f19 = (f17 * 1.0f) / i19;
        if (f19 <= 1.0f) {
            f18 = 0.0f;
            if (f19 >= 0.0f) {
                f18 = f19;
            }
        }
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f167165d.f168192i;
        snsCoverContainerLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        float f27 = snsCoverContainerLayout.f164003i;
        float f28 = snsCoverContainerLayout.f164004m;
        float f29 = ((f27 - f28) * f18) + f28;
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f163999e;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.setTranslationY(f29);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.ui.SnsHeader.a(snsHeader, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.a3, com.tencent.mm.plugin.sns.ui.widget.y2
    public void c(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsHeader", "onOpenStateChange: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f170582a;
        if (i17 == 0) {
            snsHeader.f167165d.f168192i.a();
            com.tencent.mm.plugin.sns.ui.SnsHeader.a(snsHeader, 0.0f);
        } else if (i17 == 1) {
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f167165d.f168192i;
            snsCoverContainerLayout.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + snsCoverContainerLayout.hashCode() + "] onPostOpen");
            snsCoverContainerLayout.f164002h.f434167a = false;
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f163999e;
            if (absSnsBackPreview != null) {
                absSnsBackPreview.onPostOpen();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.tencent.mm.plugin.sns.ui.SnsHeader.a(snsHeader, 1.0f);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout2 = snsHeader.f167165d.f168192i;
            snsCoverContainerLayout2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + snsCoverContainerLayout2.hashCode() + "] onPreOpen");
            android.view.View view = snsCoverContainerLayout2.f164001g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPreOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPreOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview2 = snsCoverContainerLayout2.f163999e;
            if (absSnsBackPreview2 != null) {
                absSnsBackPreview2.onPreOpen();
            }
            snsCoverContainerLayout2.coverReporter.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("coverVibrate", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                ((android.os.Vibrator) snsHeader.f167170i.getSystemService("vibrator")).vibrate(10L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("coverVibrate", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCoverPreOpen", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            if (snsHeader.f167182x != null) {
                snsHeader.f167182x.animate().translationY(-r6.getHeight()).start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCoverPreOpen", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else if (i17 == 3) {
            snsHeader.f167165d.f168192i.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.view.View view2 = snsHeader.f167182x;
            if (view2 != null) {
                view2.animate().translationY(0.0f).start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
    }
}
