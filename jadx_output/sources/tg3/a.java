package tg3;

/* loaded from: classes.dex */
public abstract class a extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public long f419180d;

    public a(int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f419180d = -1L;
    }

    public abstract void a(android.view.View view);

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/messenger/api/AvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = this.f419180d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 > 1000) {
            super.onClick(view);
            a(view);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
            setIsPressed(false);
        }
        this.f419180d = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/plugin/messenger/api/AvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
