package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class wp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f171332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.yp f171334f;

    public wp(com.tencent.mm.plugin.sns.ui.yp ypVar, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f171334f = ypVar;
        this.f171332d = bitmap;
        this.f171333e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$1");
        com.tencent.mm.plugin.sns.ui.yp ypVar = this.f171334f;
        android.widget.ImageView imageView = (android.widget.ImageView) ypVar.f171640d.findViewById(com.tencent.mm.R.id.f487566p12);
        if (imageView != null) {
            imageView.setImageBitmap(this.f171332d);
            imageView.setVisibility(0);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(ypVar.f171640d.getContext(), intent, new com.tencent.mm.vfs.r6(this.f171333e), "video/*", false);
        try {
            androidx.appcompat.app.AppCompatActivity context = ypVar.f171640d.getContext();
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, ypVar.f171640d.getContext().getString(com.tencent.mm.R.string.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSightPlayerUI", "startActivity fail, activity not found");
            db5.e1.i(ypVar.f171640d.getContext(), com.tencent.mm.R.string.cbm, com.tencent.mm.R.string.cbn);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$1");
    }
}
