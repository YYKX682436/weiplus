package r35;

/* loaded from: classes9.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f369175d;

    public l(r35.o oVar) {
        this.f369175d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r35.o oVar = this.f369175d;
        android.widget.ImageView imageView = (android.widget.ImageView) oVar.f369225q.getContentView().findViewById(com.tencent.mm.R.id.c_m);
        if (imageView != null) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String d17 = oVar.f369227s.d1();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(d17);
            if (a17 != null && oVar.f369227s.k2()) {
                a17 = com.tencent.mm.sdk.platformtools.x.s0(a17, false, a17.getWidth() / 2);
            }
            if (a17 == null || a17.isRecycled()) {
                return;
            }
            imageView.setImageBitmap(a17);
            imageView.setVisibility(0);
        }
    }
}
