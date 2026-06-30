package eg4;

/* loaded from: classes4.dex */
public class x1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI f252830d;

    public x1(com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI) {
        this.f252830d = fMessageConversationUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI = this.f252830d;
            fMessageConversationUI.f172177h = rawX;
            fMessageConversationUI.f172178i = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
