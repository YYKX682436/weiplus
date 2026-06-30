package gd2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f270562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f270563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gd2.x xVar, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        super(0);
        this.f270562d = xVar;
        this.f270563e = scanTranslationResultEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gd2.x xVar = this.f270562d;
        int i17 = xVar.f270570g;
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = this.f270563e;
        if (i17 == scanTranslationResultEvent.f54739g.f6400a) {
            xVar.c();
            am.ct ctVar = scanTranslationResultEvent.f54739g;
            boolean z17 = ctVar.f6402c;
            com.tencent.mm.ui.MMActivity mMActivity = xVar.f270564a;
            if (!z17) {
                db5.e1.G(mMActivity, mMActivity.getString(com.tencent.mm.R.string.iaw), "", false, null);
            } else if (com.tencent.mm.vfs.w6.j(ctVar.f6403d)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("original_file_path", xVar.f270571h);
                intent.putExtra("translate_source", ctVar.f6401b);
                intent.setClassName(mMActivity, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                com.tencent.mm.ui.MMActivity mMActivity2 = xVar.f270564a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mMActivity2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "handleTranslationResultEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mMActivity2, "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "handleTranslationResultEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.tencent.mars.xlog.Log.w("FinderCommentImageTransAndOcrLogic", "trans result path %s not exist!", ctVar.f6403d);
            }
            xVar.f270570g = 0;
            xVar.f270571h = null;
        }
        return jz5.f0.f302826a;
    }
}
