package x83;

/* loaded from: classes.dex */
public abstract class b extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public long f452551d;

    public b(int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f452551d = -1L;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/model/KidsWatchAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        long j17 = this.f452551d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 > 1000) {
            super.onClick(widget);
            int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
            com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = ((z83.h) this).f470740e;
            kidsWatchRegGetInfoUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "click law link");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", kidsWatchRegGetInfoUI.getString(com.tencent.mm.R.string.gb_, com.tencent.mm.sdk.platformtools.m2.d()));
            j45.l.j(kidsWatchRegGetInfoUI, "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
            setIsPressed(false);
        }
        this.f452551d = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/model/KidsWatchAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
