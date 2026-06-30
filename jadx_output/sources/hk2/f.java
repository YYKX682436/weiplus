package hk2;

/* loaded from: classes3.dex */
public final class f implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs2.m0 f281887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f281889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f281891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f281892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp.i f281893g;

    public f(xs2.m0 m0Var, java.lang.String str, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, int i17, boolean z17, gk2.e eVar, wp.i iVar) {
        this.f281887a = m0Var;
        this.f281888b = str;
        this.f281889c = f0Var;
        this.f281890d = i17;
        this.f281891e = z17;
        this.f281892f = eVar;
        this.f281893g = iVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        xs2.m0 m0Var = this.f281887a;
        java.lang.Object tag = m0Var.f456352d.getTag();
        java.lang.String str = this.f281888b;
        boolean b17 = kotlin.jvm.internal.o.b(tag, str);
        android.view.View view = m0Var.f456352d;
        if (!b17) {
            com.tencent.mars.xlog.Log.e("DanmakuItemGift", "loadGift error tag:" + view.getTag() + ",request id:" + str);
            return;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.i("DanmakuItemGift", "loadGift resource is null!");
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), bitmap);
        jz5.g gVar = hk2.j.f281904a;
        jz5.g gVar2 = hk2.j.f281904a;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        int i17 = this.f281890d;
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f281889c;
        f0Var.c(wVar, i17, i17 + 1, 33);
        m0Var.f456356h.setText(f0Var);
        if (this.f281891e) {
            mm2.j2 j2Var = (mm2.j2) this.f281892f.a(mm2.j2.class);
            wp.i obj2 = this.f281893g;
            kotlin.jvm.internal.o.g(obj2, "obj");
            ((kotlinx.coroutines.flow.q2) j2Var.f329178z).e(obj2);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
