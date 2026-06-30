package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f172374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$1 f172375e;

    public a(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$1 gestureGalleryTransAndOcrLogic$1, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f172375e = gestureGalleryTransAndOcrLogic$1;
        this.f172374d = scanTranslationResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f172375e.f172183d.f172385c == this.f172374d.f54739g.f6400a) {
            this.f172375e.f172183d.e();
            com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = this.f172374d;
            if (scanTranslationResultEvent.f54739g.f6402c) {
                com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.f172375e.f172183d;
                jVar.getClass();
                boolean j17 = com.tencent.mm.vfs.w6.j(scanTranslationResultEvent.f54739g.f6403d);
                am.ct ctVar = scanTranslationResultEvent.f54739g;
                if (j17) {
                    com.tencent.mm.plugin.subapp.ui.gallery.i iVar = jVar.f172387e;
                    if (iVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GestureGalleryTransLogic", "transCallback is null");
                    } else {
                        java.lang.String str = ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) iVar).f172194g;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("original_file_path", str);
                        intent.putExtra("translate_source", ctVar.f6401b);
                        intent.setClassName(jVar.f172388f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                        com.tencent.mm.ui.MMActivity mMActivity = jVar.f172388f;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "handleTranslationReusltEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(mMActivity, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "handleTranslationReusltEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        jVar.f172388f.finish();
                        jVar.f172388f.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GestureGalleryTransLogic", "trans result path %s not exist!", ctVar.f6403d);
                }
            }
            this.f172375e.f172183d.f172385c = 0;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f172375e.f172183d.f172388f;
            db5.e1.G(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.iaw), "", false, null);
        }
    }
}
