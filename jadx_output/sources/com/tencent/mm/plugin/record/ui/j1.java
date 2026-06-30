package com.tencent.mm.plugin.record.ui;

/* loaded from: classes3.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f155422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.k1 f155424f;

    public j1(com.tencent.mm.plugin.record.ui.k1 k1Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f155424f = k1Var;
        this.f155422d = bitmap;
        this.f155423e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.record.ui.k1 k1Var = this.f155424f;
        android.widget.ImageView imageView = (android.widget.ImageView) k1Var.f155430d.findViewById(com.tencent.mm.R.id.f487566p12);
        imageView.setImageBitmap(this.f155422d);
        imageView.setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(k1Var.f155430d.getContext(), intent, new com.tencent.mm.vfs.r6(this.f155423e), "video/*", false);
        try {
            com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = k1Var.f155430d;
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, recordMsgFileUI.getString(com.tencent.mm.R.string.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recordMsgFileUI, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$7$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            recordMsgFileUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(recordMsgFileUI, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$7$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgFileUI", "startActivity fail, activity not found");
            db5.e1.i(k1Var.f155430d.getContext(), com.tencent.mm.R.string.cbm, com.tencent.mm.R.string.cbn);
        }
    }
}
