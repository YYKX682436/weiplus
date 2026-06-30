package e33;

/* loaded from: classes3.dex */
public class t3 extends androidx.recyclerview.widget.p2 {
    public t3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479866hf);
        int i17 = dimension / 2;
        rect.left = i17;
        rect.bottom = dimension;
        rect.top = dimension;
        rect.right = i17;
    }
}
