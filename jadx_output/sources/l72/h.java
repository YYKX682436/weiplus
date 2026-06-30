package l72;

/* loaded from: classes14.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.i f316847d;

    public h(l72.i iVar) {
        this.f316847d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "click finish");
        l72.i iVar = this.f316847d;
        iVar.f316852h.f316853a.T6("fail", iVar.f316850f, "", iVar.f316851g);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
