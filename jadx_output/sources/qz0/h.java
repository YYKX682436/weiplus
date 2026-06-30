package qz0;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.test.TemplateTestUI f367825d;

    public h(com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI) {
        this.f367825d = templateTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_template/test/TemplateTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        new android.content.Intent().putExtra("key_can_select_video_and_pic", false);
        com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI = this.f367825d;
        j45.l.n(templateTestUI, "gallery", ".ui.GalleryEntryUI", templateTestUI.getIntent(), 1);
        yj0.a.h(this, "com/tencent/mm/mj_template/test/TemplateTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
