package j53;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.background.GameFakeVideoUI f297809d;

    public e(com.tencent.mm.plugin.game.media.background.GameFakeVideoUI gameFakeVideoUI) {
        this.f297809d = gameFakeVideoUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/background/GameFakeVideoUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.game.media.background.GameFakeVideoUI gameFakeVideoUI = this.f297809d;
        gameFakeVideoUI.f140107m.d(gameFakeVideoUI.f140101d, gameFakeVideoUI.f140103f, false, new j53.h(gameFakeVideoUI), null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/media/background/GameFakeVideoUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
