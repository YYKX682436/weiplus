package w23;

/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f442596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment f442597e;

    public a(com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment galleryPickerFragment) {
        this.f442597e = galleryPickerFragment;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.aaq);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f442596d = paint;
        paint.setColor(color);
        paint.setStrokeWidth(6.4f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int v07 = parent.v0(view);
        if (v07 % 4 == 0) {
            outRect.left = 4;
        }
        outRect.right = 4;
        outRect.bottom = 4;
        boolean z17 = false;
        if (v07 >= 0 && v07 < 4) {
            z17 = true;
        }
        if (z17) {
            outRect.top = 4;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        this.f442597e.getClass();
        androidx.recyclerview.widget.k3 p07 = parent.p0(0);
        android.view.View view = p07 != null ? p07.itemView : null;
        if (view != null) {
            c17.drawRect(new android.graphics.Rect(view.getLeft() + 2, view.getTop() + 2, view.getRight() - 2, view.getBottom() - 2), this.f442596d);
        }
        super.onDraw(c17, parent, state);
    }
}
