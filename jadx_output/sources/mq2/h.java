package mq2;

/* loaded from: classes15.dex */
public final class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f330736d;

    /* renamed from: e, reason: collision with root package name */
    public bb5.g f330737e;

    /* renamed from: f, reason: collision with root package name */
    public bb5.e f330738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330739g;

    public h(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f330739g = nearbyPersonV1UIC;
        this.f330736d = context;
        this.f330737e = new bb5.g(15, mq2.d.f330726a);
    }

    public final void a(android.widget.ImageView imageView, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("NearbyPersonUIC", "setImgBmp url is empty");
            return;
        }
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = g83.a.a();
        fVar.f342078b = true;
        fVar.f342095s = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f330739g.f122098p.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.b64) ((java.util.LinkedList) this.f330739g.f122098p).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0384  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq2.h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
