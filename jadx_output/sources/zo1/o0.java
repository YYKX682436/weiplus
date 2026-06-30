package zo1;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474712d;

    public o0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        this.f474712d = checkPackageContentUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474712d;
        zo1.w wVar = checkPackageContentUI.f92807p;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.x()) {
            zo1.w wVar2 = checkPackageContentUI.f92807p;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("conversationAdapter");
                throw null;
            }
            java.util.Iterator it = wVar2.f474805e.iterator();
            while (it.hasNext()) {
                ((zo1.s) it.next()).f474762c = false;
            }
            wVar2.f474806f = 0;
            yz5.a aVar = wVar2.f474807g;
            if (aVar != null) {
                aVar.invoke();
            }
            wVar2.notifyDataSetChanged();
            android.widget.TextView textView = checkPackageContentUI.f92804m;
            if (textView == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView.setText(com.tencent.mm.R.string.f490681a75);
        } else {
            zo1.w wVar3 = checkPackageContentUI.f92807p;
            if (wVar3 == null) {
                kotlin.jvm.internal.o.o("conversationAdapter");
                throw null;
            }
            java.util.Iterator it6 = wVar3.f474805e.iterator();
            while (it6.hasNext()) {
                ((zo1.s) it6.next()).f474762c = true;
            }
            wVar3.f474806f = wVar3.f474805e.size();
            yz5.a aVar2 = wVar3.f474807g;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            wVar3.notifyDataSetChanged();
            android.widget.TextView textView2 = checkPackageContentUI.f92804m;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView2.setText(com.tencent.mm.R.string.a76);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
