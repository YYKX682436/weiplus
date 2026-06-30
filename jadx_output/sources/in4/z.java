package in4;

/* loaded from: classes8.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog f292999d;

    public z(com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog) {
        this.f292999d = topStoryCommentFloatDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f292999d;
        if (topStoryCommentFloatDialog.getVisibility() == 0) {
            topStoryCommentFloatDialog.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
