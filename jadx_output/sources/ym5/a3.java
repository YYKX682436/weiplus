package ym5;

/* loaded from: classes15.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.PhotoView f463194d;

    public a3(com.tencent.mm.view.PhotoView photoView) {
        this.f463194d = photoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.view.PhotoView photoView = this.f463194d;
        android.view.View.OnClickListener onClickListener = photoView.f213392r;
        if (onClickListener != null) {
            onClickListener.onClick(photoView);
        }
    }
}
