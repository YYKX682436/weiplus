package gx1;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.y f277332d;

    public x(gx1.y yVar) {
        this.f277332d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx1.y yVar = this.f277332d;
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) yVar.f277291d.f341332b;
        editorUI.getClass();
        qx1.q qVar = editorUI.f96500g;
        if (qVar != null) {
            qVar.d(null);
        }
        android.widget.ImageView imageView = yVar.f277304f;
        android.content.Context context = imageView.getContext();
        ix1.m mVar = (ix1.m) yVar.f277303e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.f295329r)) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(mVar.f295329r)) {
            com.tencent.mm.plugin.component.editor.f fVar = com.tencent.mm.plugin.component.editor.f.f96553d;
            gx1.v vVar = new gx1.v(this, mVar, context);
            yVar.B = vVar;
            fVar.b(vVar);
            yVar.C = com.tencent.mm.ui.widget.dialog.u3.f(imageView.getContext(), context.getString(com.tencent.mm.R.string.f490380td), true, 3, new gx1.w(this));
            fVar.c(new com.tencent.mm.plugin.component.editor.c(mVar.f295324m, false, com.tencent.mm.plugin.component.editor.a.TYPE_FILE, -1));
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", 0);
        intent.putExtra("key_detail_fav_path", mVar.f295329r);
        intent.putExtra("key_detail_fav_thumb_path", mVar.f295346s);
        intent.putExtra("key_detail_fav_video_duration", mVar.f295347t);
        intent.putExtra("key_detail_data_id", mVar.f295311a);
        intent.putExtra("key_detail_statExtStr", "");
        intent.putExtra("key_detail_fav_video_show_download_status", false);
        o72.x1.M0((android.app.Activity) imageView.getContext(), ".ui.detail.FavoriteVideoPlayUI", intent, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
