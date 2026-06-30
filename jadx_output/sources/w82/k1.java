package w82;

/* loaded from: classes.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443906e;

    public k1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView, java.lang.String str) {
        this.f443906e = favVideoView;
        this.f443905d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443906e;
        com.tencent.mm.sdk.platformtools.i1.f(favVideoView.getContext(), intent, new com.tencent.mm.vfs.r6(this.f443905d), "video/*", false);
        try {
            android.content.Context context = favVideoView.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(favVideoView.f101566d, "startActivity fail, activity not found");
            db5.e1.i(favVideoView.getContext(), com.tencent.mm.R.string.cbm, com.tencent.mm.R.string.cbn);
        }
    }
}
