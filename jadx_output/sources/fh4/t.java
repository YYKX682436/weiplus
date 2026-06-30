package fh4;

/* loaded from: classes3.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262707d;

    public t(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262707d = talkRoomUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI = this.f262707d;
        talkRoomUI.getClass();
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) c01.d9.b().p().l(144641, null), 0) <= 0) {
            com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(talkRoomUI, com.tencent.mm.R.style.f494794wg);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.cxu, (android.view.ViewGroup) null);
            linearLayout.setMinimumWidth(10000);
            android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.h5h);
            k2Var.setCanceledOnTouchOutside(true);
            k2Var.setOnDismissListener(new fh4.a0(talkRoomUI));
            k2Var.setCancelable(false);
            button.setOnClickListener(new fh4.h(talkRoomUI, k2Var));
            k2Var.setContentView(linearLayout);
            k2Var.show();
            z17 = true;
        }
        if (!z17) {
            talkRoomUI.onBackPressed();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
