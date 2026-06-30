package z63;

/* loaded from: classes14.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.m f470415d;

    public h(z63.m mVar) {
        this.f470415d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z63.m mVar = this.f470415d;
        z63.m.a(mVar, true, mVar.f470428h.getYear(), mVar.f470428h.getMonth(), mVar.f470428h.getDayOfMonth());
        y9.i iVar = mVar.f470424d;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
