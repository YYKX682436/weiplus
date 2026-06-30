package ea3;

/* loaded from: classes.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.p f250676d;

    public u(ea3.p pVar) {
        this.f250676d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f250676d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
