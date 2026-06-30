package fh4;

/* loaded from: classes13.dex */
public class y implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh4.b0 f262710d;

    public y(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI, fh4.b0 b0Var) {
        this.f262710d = b0Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        fh4.b0 b0Var = this.f262710d;
        b0Var.getClass();
        int action = motionEvent.getAction();
        boolean z17 = true;
        if (action == 0) {
            b0Var.f262666a = motionEvent.getX();
            b0Var.f262667b = motionEvent.getY();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            b0Var.f262668c = android.os.SystemClock.elapsedRealtime();
        } else {
            if (action == 1 || action == 3) {
                float abs = java.lang.Math.abs(motionEvent.getX() - b0Var.f262666a);
                float y17 = b0Var.f262667b - motionEvent.getY();
                if (y17 >= 100.0f && y17 / abs > 2.0f) {
                    long j17 = b0Var.f262668c;
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (y17 / ((float) (android.os.SystemClock.elapsedRealtime() - j17)) > 0.6f) {
                        ((fh4.x) b0Var).f262709d.onBackPressed();
                    }
                }
            }
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
