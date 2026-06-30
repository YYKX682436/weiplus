package tw2;

/* loaded from: classes2.dex */
public final class g implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb5.e f422470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f422471b;

    public g(eb5.e eVar, r45.mb4 mb4Var) {
        this.f422470a = eVar;
        this.f422471b = mb4Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        long a17 = hq.d.a();
        eb5.e eVar = this.f422470a;
        eVar.itemView.setTag(com.tencent.mm.R.id.teh, java.lang.Long.valueOf(a17));
        android.view.View view = eVar.itemView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f422471b;
        sb6.append(mb4Var.getString(1));
        sb6.append(mb4Var.getString(19));
        view.setTag(com.tencent.mm.R.id.tei, sb6.toString());
        if (bitmap != null) {
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent preloadProcessChangeEvent = new com.tencent.mm.autogen.events.PreloadProcessChangeEvent();
            int k17 = (int) com.tencent.mm.vfs.w6.k(((mn2.h3) aVar.f293573a).getPath());
            java.lang.String string = mb4Var.getString(9);
            am.so soVar = preloadProcessChangeEvent.f54625g;
            soVar.f7914a = string;
            soVar.f7916c = 2;
            soVar.f7917d = k17;
            preloadProcessChangeEvent.e();
            com.tencent.mars.xlog.Log.i("Finder.ImageBannerAdapter", mb4Var.getString(9) + " [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] fileLength=" + com.tencent.mm.sdk.platformtools.t8.f0(k17) + " allocationByteCount=" + com.tencent.mm.sdk.platformtools.t8.f0(bitmap.getAllocationByteCount()));
        }
    }
}
