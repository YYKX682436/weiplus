package k14;

/* loaded from: classes.dex */
public abstract class l0 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public long f303358d;

    public l0(int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f303358d = -1L;
    }

    public abstract void a(android.view.View view);

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/model/SettingsAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        long j17 = this.f303358d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 > 1000) {
            super.onClick(widget);
            a(widget);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingsAvoidDuplicatedPressableSpan", "hy: too often click");
            setIsPressed(false);
        }
        this.f303358d = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/model/SettingsAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
