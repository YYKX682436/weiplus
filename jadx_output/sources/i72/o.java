package i72;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f289429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i72.p f289430e;

    public o(i72.p pVar, android.graphics.Bitmap bitmap) {
        this.f289430e = pVar;
        this.f289429d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        i72.p pVar = this.f289430e;
        android.view.View view = pVar.f289432e.f100134v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceDetectView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/facedetect/views/FaceDetectView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pVar.f289432e.f100134v.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(this.f289429d));
    }
}
