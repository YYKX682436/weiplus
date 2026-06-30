package nc5;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.w f336236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f336237e;

    public v(nc5.w wVar, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f336236d = wVar;
        this.f336237e = scanTranslationResultEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nc5.w wVar = this.f336236d;
        int i17 = wVar.f336238a;
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = this.f336237e;
        am.ct ctVar = scanTranslationResultEvent.f54739g;
        if (i17 == ctVar.f6400a) {
            if (ctVar.f6402c && wVar.f336239b != null && wVar.f336240c != null) {
                if (com.tencent.mm.vfs.w6.j(ctVar.f6403d)) {
                    android.content.Intent intent = new android.content.Intent();
                    android.app.Activity activity = wVar.f336239b;
                    kotlin.jvm.internal.o.d(activity);
                    android.content.Intent className = intent.setClassName(activity, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    kotlin.jvm.internal.o.f(className, "setClassName(...)");
                    className.putExtra("original_file_path", wVar.f336241d);
                    com.tencent.mm.storage.f9 f9Var = wVar.f336240c;
                    kotlin.jvm.internal.o.d(f9Var);
                    className.putExtra("msg_id", f9Var.getMsgId());
                    com.tencent.mm.storage.f9 f9Var2 = wVar.f336240c;
                    kotlin.jvm.internal.o.d(f9Var2);
                    className.putExtra("msg_talker", f9Var2.Q0());
                    className.putExtra("translate_source", scanTranslationResultEvent.f54739g.f6401b);
                    m11.b0 b0Var = wVar.f336242e;
                    if (b0Var != null) {
                        kotlin.jvm.internal.o.d(b0Var);
                        className.putExtra("fileid", b0Var.f());
                        m11.b0 b0Var2 = wVar.f336242e;
                        kotlin.jvm.internal.o.d(b0Var2);
                        className.putExtra("aeskey", b0Var2.d());
                    }
                    android.app.Activity activity2 = wVar.f336239b;
                    kotlin.jvm.internal.o.d(activity2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(className);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1$callback$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity2, "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1$callback$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    android.app.Activity activity3 = wVar.f336239b;
                    kotlin.jvm.internal.o.d(activity3);
                    activity3.finish();
                    android.app.Activity activity4 = wVar.f336239b;
                    kotlin.jvm.internal.o.d(activity4);
                    activity4.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanTransImageUtil", "trans result path %s not exist!", scanTranslationResultEvent.f54739g.f6403d);
            }
            android.app.Activity activity5 = wVar.f336239b;
            db5.e1.G(activity5, activity5 != null ? activity5.getString(com.tencent.mm.R.string.iaw) : null, "", false, null);
        }
    }
}
