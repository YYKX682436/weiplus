package ze5;

/* loaded from: classes9.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v05.b f472069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, v05.b bVar) {
        super(1);
        this.f472067d = f9Var;
        this.f472068e = dVar;
        this.f472069f = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView it = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.storage.f9 f9Var = this.f472067d;
        boolean a17 = com.tencent.mm.ui.chatting.viewitems.s1.a(f9Var, f9Var.z0());
        yb5.d dVar = this.f472068e;
        if (a17) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(dVar.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            o11.f fVar = new o11.f();
            fVar.f342092p = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.picture_filled, it.getLayoutParams().width, it.getLayoutParams().height, dVar.g().getColor(com.tencent.mm.R.color.FG_4), dVar.g().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_4), 0.625f));
            fVar.f342101y = com.tencent.mm.ui.chatting.viewitems.j1.k();
            fVar.f342079c = true;
            fVar.f342083g = tv.a.a();
            fVar.A = new r35.n0(0);
            fVar.B = new r35.w(0);
            int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
            int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
            fVar.f342086j = b17;
            fVar.f342087k = b18;
            fVar.f342077a = true;
            fVar.f342096t = true;
            fVar.f342097u = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
            n11.a b19 = n11.a.b();
            v05.b bVar = this.f472069f;
            java.lang.String string = bVar.getString(bVar.f432315e + 14);
            if (r26.n0.N(string)) {
                v05.a aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8);
                string = aVar != null ? aVar.A() : null;
            }
            b19.h(string, it, fVar.a());
        } else {
            it.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
