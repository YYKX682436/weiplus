package tr2;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f421379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr2.l f421380e;

    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity, tr2.l lVar) {
        this.f421379d = appCompatActivity;
        this.f421380e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f421380e.f421401m;
        ox2.g0 g0Var = ox2.h0.f349661g;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f421379d;
        java.lang.String string = appCompatActivity.getString(com.tencent.mm.R.string.f493355om4);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ox2.h0 h0Var = new ox2.h0(appCompatActivity, iEmojiInfo, ox2.g0.a(g0Var, appCompatActivity, string, (char) 0, 0, 0, 0, 0, 0, 252, null), null, null, null, 56, null);
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview = h0Var.f349666e;
        if (centerInteractionEasterEggDarkPreview != null) {
            centerInteractionEasterEggDarkPreview.setThumbLike(true);
        }
        h0Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
