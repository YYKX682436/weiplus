package i53;

/* loaded from: classes9.dex */
public class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.m3 f288566d;

    public e3(i53.m3 m3Var) {
        this.f288566d = m3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameVideoDownloadPerform$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f288566d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameVideoDownloadPerform$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
