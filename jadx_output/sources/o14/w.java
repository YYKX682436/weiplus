package o14;

/* loaded from: classes9.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI f342323d;

    public w(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI) {
        this.f342323d = fixToolsUplogUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI = this.f342323d;
        fixToolsUplogUI.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = ((java.lang.System.currentTimeMillis() / 86400000) * 86400000) + 57600000;
        long j17 = currentTimeMillis - 1;
        long j18 = currentTimeMillis - 691200000;
        if (j18 <= 0) {
            j18 = 0;
        }
        calendar.setTimeInMillis(j18);
        calendar2.setTimeInMillis(j17);
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(fixToolsUplogUI.getContext());
        oVar.f212307n = new o14.a0(fixToolsUplogUI, j17);
        oVar.d(calendar2.get(1), calendar2.get(2) + 1, calendar2.get(5));
        oVar.f(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        oVar.e(calendar2.get(1), calendar2.get(2) + 1, calendar2.get(5));
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
