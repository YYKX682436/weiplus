package kf3;

/* loaded from: classes5.dex */
public class y1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307465d;

    public y1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        this.f307465d = massSendMsgUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendMsgUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f307465d.f148544h;
        if (chatFooter != null) {
            chatFooter.w0(true);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
