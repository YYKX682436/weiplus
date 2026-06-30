package wo1;

/* loaded from: classes3.dex */
public final class z0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public long f448060d;

    /* renamed from: e, reason: collision with root package name */
    public final int f448061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f448062f;

    public z0(wo1.a1 a1Var, yz5.a aVar) {
        this.f448062f = aVar;
        this.f448061e = a1Var.getContext().getColor(com.tencent.mm.R.color.Link_100);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$setHintAndClickableStr$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f448060d < 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$setHintAndClickableStr$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f448060d = currentTimeMillis;
        this.f448062f.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$setHintAndClickableStr$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f448061e);
    }
}
