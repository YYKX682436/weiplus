package fa3;

/* loaded from: classes10.dex */
public class h implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260759d;

    public h(fa3.b bVar) {
        this.f260759d = bVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/camera/LiteAppCameraManager$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f260759d.f260724j.a(motionEvent);
        yj0.a.i(false, this, "com/tencent/mm/plugin/lite/media/camera/LiteAppCameraManager$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
