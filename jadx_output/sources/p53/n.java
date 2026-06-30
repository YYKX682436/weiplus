package p53;

/* loaded from: classes8.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p53.u f352067d;

    public n(p53.u uVar) {
        this.f352067d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/tab/RichGameTabWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.game.ui.tab.RichGameTabWidget$OpenUrlData(this.f352067d.f352079h.f141155h.f323791h), p53.r.class, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/tab/RichGameTabWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
