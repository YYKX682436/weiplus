package gk0;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk0.s f272454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g75.z f272455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk0.w f272456f;

    public u(gk0.s sVar, g75.z zVar, gk0.w wVar) {
        this.f272454d = sVar;
        this.f272455e = zVar;
        this.f272456f = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        gk0.s sVar = this.f272454d;
        android.widget.ImageView imageView = (android.widget.ImageView) sVar.f272453d.get();
        if (imageView != null) {
            if (!kotlin.jvm.internal.o.b(imageView.getTag(com.tencent.mm.R.id.h9z), sVar.f272451b)) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageBitmap(sVar.f272452c);
            }
        }
        java.util.Map map = (java.util.Map) this.f272455e.d("Common_ImageViewRefMap");
        if (map != null) {
            java.util.List list = (java.util.List) map.get(sVar.f272451b);
            java.lang.String str = sVar.f272451b;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ((d75.c) it.next()).get();
                    if (imageView2 != null) {
                        if (!kotlin.jvm.internal.o.b(imageView2.getTag(com.tencent.mm.R.id.h9z), str)) {
                            imageView2 = null;
                        }
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(sVar.f272452c);
                        }
                    }
                }
            }
        }
        this.f272456f.a(new gk0.t());
    }
}
