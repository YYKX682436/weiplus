package i53;

/* loaded from: classes.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f288768d;

    public w1(i53.a2 a2Var) {
        this.f288768d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GamePublishGalleryView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_game_haowan_text", true);
        i53.a2 a2Var = this.f288768d;
        ((android.app.Activity) a2Var.getContext()).setResult(-1, intent);
        ((android.app.Activity) a2Var.getContext()).finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
