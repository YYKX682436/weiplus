package fh4;

/* loaded from: classes3.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f262697d;

    public h(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f262697d = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f262697d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
