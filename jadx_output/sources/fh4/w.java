package fh4;

/* loaded from: classes15.dex */
public class w implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.ui.TalkRoomUI f262708d;

    public w(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI) {
        this.f262708d = talkRoomUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI = this.f262708d;
        if (action == 0) {
            talkRoomUI.I = com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.O6(talkRoomUI, motionEvent);
            if (talkRoomUI.I) {
                talkRoomUI.f172460h.setImageResource(com.tencent.mm.R.drawable.bnv);
                com.tencent.mm.sdk.platformtools.v5.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493318jq2, new fh4.u(this));
                talkRoomUI.f172471v = 1;
                talkRoomUI.Q6();
                com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "micBtn pressed down");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                talkRoomUI.K = android.os.SystemClock.elapsedRealtime();
                dh4.l.Di().t();
                talkRoomUI.R6();
            }
        } else if ((action == 1 || (action == 2 ? talkRoomUI.I && !com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.O6(talkRoomUI, motionEvent) : action == 3)) && talkRoomUI.I) {
            talkRoomUI.I = false;
            if (talkRoomUI.f172471v == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "cancel during seize-success prepare time");
                talkRoomUI.L.d();
                talkRoomUI.f172473x.d();
            }
            talkRoomUI.f172460h.setImageResource(com.tencent.mm.R.drawable.bnu);
            talkRoomUI.f172471v = 0;
            talkRoomUI.Q6();
            talkRoomUI.A.d();
            dh4.l.Di().o();
            com.tencent.mm.sdk.platformtools.v5.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493321jq5, new fh4.v(this));
            talkRoomUI.R6();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
