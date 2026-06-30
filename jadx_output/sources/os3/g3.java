package os3;

/* loaded from: classes11.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI f348089d;

    public g3(com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI) {
        this.f348089d = prepareBindXMailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI = this.f348089d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(prepareBindXMailUI.f154922n) || prepareBindXMailUI.f154922n.equals(prepareBindXMailUI.f154921m)) {
            com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI.T6(prepareBindXMailUI);
        } else {
            db5.e1.u(prepareBindXMailUI, prepareBindXMailUI.getString(com.tencent.mm.R.string.bfx), "", new os3.f3(this), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
