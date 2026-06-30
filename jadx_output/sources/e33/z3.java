package e33;

/* loaded from: classes10.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.a4 f247564e;

    public z3(e33.a4 a4Var, java.lang.String str) {
        this.f247564e = a4Var;
        this.f247563d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        e33.a4 a4Var = this.f247564e;
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = a4Var.f247121c;
        e33.v2 v2Var = imagePreviewUI.f138579e;
        java.util.ArrayList arrayList = imagePreviewUI.f138583g;
        java.util.ArrayList arrayList2 = v2Var.f247501i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        v2Var.h();
        v2Var.notifyDataSetChanged();
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI2 = a4Var.f247121c;
        e33.h5 h5Var = (e33.h5) imagePreviewUI2.f138581f.getAdapter();
        java.util.ArrayList arrayList3 = imagePreviewUI2.f138583g;
        java.util.ArrayList arrayList4 = h5Var.f247260h;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        h5Var.notifyDataSetChanged();
        imagePreviewUI2.f138591m.clear();
        imagePreviewUI2.f138591m.addAll(a4Var.f247119a);
        imagePreviewUI2.Q1.Y0(imagePreviewUI2.e7());
        imagePreviewUI2.f138603w.setText(imagePreviewUI2.getContext().getString(com.tencent.mm.R.string.f492182fj0));
        if (t21.d3.s() && (((i17 = imagePreviewUI2.L) == 3 || i17 == 16) && imagePreviewUI2.f138597q)) {
            imagePreviewUI2.s7();
        } else {
            imagePreviewUI2.f138604x.setVisibility(8);
        }
        if (imagePreviewUI2.f138591m.contains(j33.d0.g(this.f247563d))) {
            return;
        }
        imagePreviewUI2.D.performClick();
    }
}
