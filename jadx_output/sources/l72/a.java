package l72;

/* loaded from: classes14.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.b f316833d;

    public a(l72.b bVar) {
        this.f316833d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "click finish");
        this.f316833d.f316835d.T6("fail", 90016, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
