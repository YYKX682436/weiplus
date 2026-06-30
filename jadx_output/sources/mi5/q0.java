package mi5;

/* loaded from: classes9.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.s0 f326900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f326902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ se5.a f326903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mi5.s0 s0Var, com.tencent.mm.storage.f9 f9Var, l15.c cVar, se5.a aVar) {
        super(1);
        this.f326900d = s0Var;
        this.f326901e = f9Var;
        this.f326902f = cVar;
        this.f326903g = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        v05.a aVar;
        android.widget.ImageView it = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.storage.f9 f9Var = this.f326901e;
        java.lang.String thumbPath = this.f326903g.getThumbPath();
        this.f326900d.getClass();
        android.content.Context context = it.getContext();
        java.lang.String str = null;
        if (com.tencent.mm.ui.chatting.viewitems.s1.a(f9Var, f9Var != null ? f9Var.z0() : null)) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var != null ? f9Var.z0() : null, i65.a.g(context), false);
        }
        if (bitmap == null && com.tencent.mm.vfs.w6.j(thumbPath)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().n0(f9Var, thumbPath, true, i65.a.g(context), false, true);
        }
        if (bitmap == null || bitmap.isRecycled()) {
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
            l15.c cVar = this.f326902f;
            v05.b k17 = cVar.k();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(k17 != null ? k17.getString(k17.f432315e + 14) : null);
            v05.b k18 = cVar.k();
            if (K0) {
                if (k18 != null && (aVar = (v05.a) k18.getCustom(k18.f432315e + 8)) != null) {
                    str = aVar.A();
                }
            } else if (k18 != null) {
                str = k18.getString(k18.f432315e + 14);
            }
            b19.h(str, it, fVar.a());
        } else {
            it.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
