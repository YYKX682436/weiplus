package m34;

/* loaded from: classes3.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m34.j f323353e;

    public h(m34.j jVar, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f323353e = jVar;
        this.f323352d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.j jVar = this.f323353e;
        ((android.widget.ImageView) jVar.f323355d.findViewById(com.tencent.mm.R.id.f487566p12)).setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(jVar.f323355d.getContext(), intent, new com.tencent.mm.vfs.r6(this.f323352d), "video/*", false);
        try {
            android.content.Context context = jVar.f323355d.getContext();
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, jVar.f323355d.getContext().getString(com.tencent.mm.R.string.f490597zj));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoPopupHelper", "startActivity fail, activity not found");
            db5.e1.i(jVar.f323355d.getContext(), com.tencent.mm.R.string.h_1, com.tencent.mm.R.string.h_2);
        }
    }
}
