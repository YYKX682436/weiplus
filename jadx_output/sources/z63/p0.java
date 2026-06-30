package z63;

/* loaded from: classes14.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470437d;

    public p0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470437d = groupSolitatireEditUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.U;
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470437d;
        groupSolitatireEditUI.d7();
        android.view.View view2 = groupSolitatireEditUI.f142233v;
        if ((view2 instanceof com.tencent.mm.ui.widget.MMEditText) && (view2.getParent() instanceof android.widget.RelativeLayout)) {
            ((android.widget.RelativeLayout) groupSolitatireEditUI.f142233v.getParent()).setTag(1);
        }
        z63.m mVar = new z63.m(groupSolitatireEditUI);
        com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker2 = mVar.f470428h;
        int year = customDatePicker2 != null ? customDatePicker2.getYear() : 0;
        com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker3 = mVar.f470428h;
        int month = customDatePicker3 != null ? customDatePicker3.getMonth() : 0;
        com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker4 = mVar.f470428h;
        int dayOfMonth = customDatePicker4 != null ? customDatePicker4.getDayOfMonth() : 0;
        mVar.f470429i = new z63.o0(this);
        if (year >= 0 && month >= 0 && dayOfMonth >= 0 && (customDatePicker = mVar.f470428h) != null) {
            int max = java.lang.Math.max(month - 1, 0);
            com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) customDatePicker.f212239d;
            x0Var.d(year, max, dayOfMonth);
            x0Var.i();
            x0Var.h();
            customDatePicker.b();
        }
        java.util.Locale locale = java.util.Locale.US;
        java.util.Calendar calendar = java.util.Calendar.getInstance(locale);
        calendar.set(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION, 0, 1);
        com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker5 = mVar.f470428h;
        if (customDatePicker5 != null) {
            customDatePicker5.setMinDate(calendar.getTimeInMillis());
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale);
        calendar2.set(2029, 11, 31);
        com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker6 = mVar.f470428h;
        if (customDatePicker6 != null) {
            customDatePicker6.setMaxDate(calendar2.getTimeInMillis());
        }
        if (mVar.f470424d != null) {
            com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker7 = mVar.f470428h;
            if (customDatePicker7 != null) {
                customDatePicker7.b();
            }
            mVar.f470424d.show();
        }
        groupSolitatireEditUI.Y6(0);
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
