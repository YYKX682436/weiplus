package l72;

/* loaded from: classes14.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.i f316846d;

    public g(l72.i iVar) {
        this.f316846d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "click retry");
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316846d.f316852h.f316853a;
        int i17 = com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.f100173J;
        faceActionUI.getClass();
        k72.u.B.b(false);
        n72.q qVar = faceActionUI.f100193z;
        if (qVar != null) {
            qVar.c();
        }
        faceActionUI.f100175e.setVisibility(8);
        faceActionUI.f100177g.setVisibility(8);
        faceActionUI.f100174d.setVisibility(0);
        faceActionUI.V6();
        k72.u.B.c(faceActionUI);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
