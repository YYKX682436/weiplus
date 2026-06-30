package yt3;

/* loaded from: classes10.dex */
public class s3 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f465667d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465668e;

    /* renamed from: f, reason: collision with root package name */
    public int f465669f;

    public s3(com.tencent.mm.ui.widget.imageview.WeImageView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465667d = view;
        this.f465668e = status;
        view.setOnClickListener(this);
        view.setIconColor(-1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordClosePlugin", "RecordClosePlugin close");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f465667d;
        if (weImageView.getContext() instanceof com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) {
            android.content.Context context = weImageView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Z6();
        }
        ju3.d0.k(this.f465668e, ju3.c0.f301889n, null, 2, null);
        nu3.i iVar = nu3.i.f340218a;
        iVar.d(3);
        iVar.b(3);
        iVar.i(this.f465669f);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setVisibility(int i17) {
        this.f465667d.setVisibility(i17);
    }
}
