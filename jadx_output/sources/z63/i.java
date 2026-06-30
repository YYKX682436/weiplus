package z63;

/* loaded from: classes14.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.m f470417d;

    public i(z63.m mVar) {
        this.f470417d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z63.m mVar = this.f470417d;
        z63.m.a(mVar, false, 0, 0, 0);
        y9.i iVar = mVar.f470424d;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
