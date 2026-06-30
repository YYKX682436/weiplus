package zt;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final zt.n f475552a = new zt.n();

    public final void a(s15.h recordDataItem, android.graphics.Bitmap bitmap, android.widget.ImageView imgView) {
        o70.f aj6;
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        kotlin.jvm.internal.o.g(imgView, "imgView");
        int i17 = recordDataItem.f303422d;
        if (recordDataItem.getInteger(i17 + 2) == 2 || recordDataItem.getInteger(i17 + 2) == 4) {
            if (recordDataItem.getThumbWidth() == 0 || recordDataItem.getThumbHeight() == 0) {
                aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
            } else {
                aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(recordDataItem.getThumbWidth(), recordDataItem.getThumbHeight());
            }
            android.view.ViewGroup.LayoutParams layoutParams = imgView.getLayoutParams();
            layoutParams.width = aj6.f343231a;
            layoutParams.height = aj6.f343232b;
            imgView.setLayoutParams(layoutParams);
        }
    }
}
