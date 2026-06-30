package m04;

/* loaded from: classes12.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.search.ui.FTSInfoUI f322555d;

    public c(com.tencent.mm.plugin.search.ui.FTSInfoUI fTSInfoUI) {
        this.f322555d = fTSInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/search/ui/FTSInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.search.ui.FTSInfoUI fTSInfoUI = this.f322555d;
        if (fTSInfoUI.f160044i == null) {
            fTSInfoUI.f160044i = db5.e1.Q(fTSInfoUI, "", fTSInfoUI.getString(com.tencent.mm.R.string.ggc), true, true, new m04.b(this));
        }
        com.tencent.mm.plugin.search.ui.FTSInfoUI fTSInfoUI2 = this.f322555d;
        fTSInfoUI2.f160044i.show();
        p13.u uVar = new p13.u();
        uVar.f351140b = 65526;
        uVar.f351151m = fTSInfoUI2;
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar);
        yj0.a.h(this, "com/tencent/mm/plugin/search/ui/FTSInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
