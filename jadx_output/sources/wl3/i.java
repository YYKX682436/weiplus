package wl3;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar f447067d;

    public i(com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar) {
        this.f447067d = musicMainSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = this.f447067d;
        ii0.a aVar = musicMainSeekBar.f150826g;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("seekBarBinding");
            throw null;
        }
        aVar.f291610c.getHitRect(rect);
        if (motionEvent.getY() < rect.top - 500 || motionEvent.getY() > rect.bottom + 500) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        float height = rect.top + (rect.height() / 2);
        float x17 = motionEvent.getX() - rect.left;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x17 < 0.0f ? 0.0f : x17 > ((float) rect.width()) ? rect.width() : x17, height, motionEvent.getMetaState());
        ii0.a aVar2 = musicMainSeekBar.f150826g;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("seekBarBinding");
            throw null;
        }
        boolean onTouchEvent = aVar2.f291610c.onTouchEvent(obtain);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
