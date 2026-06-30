package i53;

/* loaded from: classes3.dex */
public class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.i f288706d;

    public r2(i53.w2 w2Var, y9.i iVar) {
        this.f288706d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameTabGalleryView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f288706d.cancel();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameTabGalleryView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
