package ze5;

/* loaded from: classes9.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f471947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.i7 f471948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, l15.c cVar, ze5.i7 i7Var) {
        super(1);
        this.f471945d = f9Var;
        this.f471946e = dVar;
        this.f471947f = cVar;
        this.f471948g = i7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        v05.a aVar;
        android.widget.ImageView it = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.setVisibility(0);
        com.tencent.mm.storage.f9 f9Var = this.f471945d;
        java.lang.String str = null;
        if (com.tencent.mm.ui.chatting.viewitems.s1.a(f9Var, f9Var.z0())) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(this.f471946e.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            l15.c cVar = this.f471947f;
            v05.b k17 = cVar.k();
            java.lang.String string = k17 != null ? k17.getString(k17.f432315e + 14) : null;
            if (string == null || string.length() == 0) {
                it.setVisibility(8);
            }
            if (string != null && !r26.i0.y(string, "http", false)) {
                it.setImageBitmap(com.tencent.mm.graphics.e.c(string));
            }
            this.f471948g.getClass();
            o11.f fVar = new o11.f();
            fVar.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
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
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                v05.b k18 = cVar.k();
                if (k18 != null && (aVar = (v05.a) k18.getCustom(k18.f432315e + 8)) != null) {
                    str = aVar.A();
                }
            } else {
                str = string;
            }
            b19.h(str, it, fVar.a());
        } else {
            it.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
