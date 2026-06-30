package zt;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zt.m f475549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m70.e f475550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g75.z f475551f;

    public l(zt.m mVar, m70.e eVar, g75.z zVar) {
        this.f475549d = mVar;
        this.f475550e = eVar;
        this.f475551f = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        d75.c cVar = (d75.c) this.f475549d.h().d("Common_ImageViewRef");
        if (cVar == null || (imageView = (android.widget.ImageView) cVar.get()) == null) {
            return;
        }
        java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.h9z);
        m70.e eVar = this.f475550e;
        if (!kotlin.jvm.internal.o.b(tag, eVar.f324471b)) {
            imageView = null;
        }
        if (imageView != null) {
            zt.n.f475552a.a(((zt.k) this.f475551f.i("key_record_params")).f475545b, eVar.f324472c, imageView);
            imageView.setImageBitmap(eVar.f324472c);
            imageView.setBackgroundDrawable(null);
        }
    }
}
