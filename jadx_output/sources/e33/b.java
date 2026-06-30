package e33;

/* loaded from: classes10.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247126d;

    public b(e33.b0 b0Var) {
        this.f247126d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        e33.r rVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Integer) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.hju);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Integer) tag2).intValue() : -1;
        if (intValue != -1 && intValue2 != -1 && (rVar = this.f247126d.L) != null) {
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = ((e33.z0) rVar).f247558a;
            if (intValue2 == 0) {
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.d7(albumPreviewUI, intValue, view, intValue2);
            } else if (intValue2 == 1) {
                albumPreviewUI.M7(intValue, view, intValue2);
            } else if (intValue2 == 4) {
                androidx.appcompat.app.AppCompatActivity activity = albumPreviewUI.getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f353948a;
                ((i33.e) zVar.a(activity).a(i33.e.class)).X6("add_photo_button");
                androidx.appcompat.app.AppCompatActivity activity2 = albumPreviewUI.getContext();
                kotlin.jvm.internal.o.g(activity2, "activity");
                i33.c0 c0Var = (i33.c0) zVar.a(activity2).a(i33.c0.class);
                int i17 = albumPreviewUI.F1;
                c0Var.getClass();
                com.tencent.mars.xlog.Log.i(c0Var.f288168f, "requestShowSystemSelectMediaUI: " + i17 + ", " + c0Var.getActivity());
                java.lang.String[] strArr = i17 != 1 ? i17 != 2 ? new java.lang.String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new java.lang.String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO"} : new java.lang.String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES"};
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                androidx.appcompat.app.AppCompatActivity activity3 = c0Var.getActivity();
                ((sb0.f) jVar).getClass();
                j35.u.l(activity3, strArr, 145);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
