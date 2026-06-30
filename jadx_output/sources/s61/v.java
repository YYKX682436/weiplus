package s61;

/* loaded from: classes15.dex */
public class v implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI f403394d;

    public v(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        this.f403394d = findMContactInviteUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        bb5.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        r61.n0 n0Var = this.f403394d.f73135f;
        if (n0Var != null && (gVar = n0Var.f392917o) != null) {
            gVar.c(motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
