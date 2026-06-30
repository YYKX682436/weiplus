package hr3;

/* loaded from: classes11.dex */
public class c1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283437d;

    public c1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283437d = contactInfoUI;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2;
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283437d;
        contactInfoUI.V6(i27 - i18);
        int b17 = bi4.e.b(contactInfoUI.getContext(), view);
        androidx.appcompat.app.AppCompatActivity activity = contactInfoUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        boolean X6 = ((uj4.e) zVar.a(activity).a(uj4.e.class)).X6();
        if (contactInfoUI.E != b17 && X6 && contactInfoUI.R != null && (pullDownListView2 = contactInfoUI.f153666s) != null) {
            contactInfoUI.E = b17;
            int i39 = bi4.e.a(contactInfoUI)[1];
            pullDownListView2.f212150f = true;
            pullDownListView2.A = b17;
            pullDownListView2.f212151g = false;
            pullDownListView2.B = i39;
            contactInfoUI.f153666s.setTranslationListener(new hr3.d1(contactInfoUI, b17));
            androidx.appcompat.app.AppCompatActivity activity2 = contactInfoUI.getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((uj4.e) zVar.a(activity2).a(uj4.e.class)).W6(contactInfoUI.E);
        }
        bi4.i0 Z6 = contactInfoUI.Z6();
        if (Z6 == null || (pullDownListView = contactInfoUI.f153666s) == null || pullDownListView.f212147J) {
            return;
        }
        Z6.W(true);
    }
}
