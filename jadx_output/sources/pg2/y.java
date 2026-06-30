package pg2;

/* loaded from: classes3.dex */
public final class y extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn0.c f354196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354197f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354198g;

    public y(nn0.c cVar, ug5.v vVar, android.graphics.Bitmap bitmap) {
        this.f354196e = cVar;
        this.f354197f = vVar;
        this.f354198g = bitmap;
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.c(animation, performer);
        android.widget.ImageView imageView = (android.widget.ImageView) performer.f427660c;
        if (imageView != null) {
            imageView.setImageBitmap(this.f354198g);
        }
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        nn0.c cVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        ug5.v vVar = this.f354197f;
        java.lang.Object d17 = vVar.d("key_player_view");
        java.lang.ref.WeakReference weakReference = d17 instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) d17 : null;
        java.lang.Object obj = weakReference != null ? weakReference.get() : null;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = obj instanceof com.tencent.rtmp.ui.TXCloudVideoView ? (com.tencent.rtmp.ui.TXCloudVideoView) obj : null;
        java.lang.Object d18 = vVar.d("key_enter_square_preview_mode");
        java.lang.Integer num = d18 instanceof java.lang.Integer ? (java.lang.Integer) d18 : null;
        int intValue = num != null ? num.intValue() : 0;
        if (tXCloudVideoView == null || (cVar = this.f354196e) == null) {
            return;
        }
        cVar.Q(intValue);
        mn0.b0.B(cVar, tXCloudVideoView, null, 2, null);
    }
}
