package yw;

/* loaded from: classes9.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f466263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(java.lang.ref.WeakReference weakReference, java.lang.String str, com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        super(1);
        this.f466263d = weakReference;
        this.f466264e = str;
        this.f466265f = bizShareInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.vfs.w6.j(str)) {
            java.lang.ref.WeakReference weakReference = this.f466263d;
            if (weakReference.get() != null) {
                yw.q2 q2Var = yw.q2.f466434a;
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) weakReference.get();
                kotlin.jvm.internal.o.d(str);
                com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(this.f466265f.getImgUrl());
                kotlin.jvm.internal.o.d(mMActivity);
                androidx.appcompat.app.AppCompatActivity context = mMActivity.getContext();
                java.lang.String str2 = this.f466264e;
                yw.e2 e2Var = new yw.e2(str2, context, str);
                android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
                ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).getClass();
                r35.i1 i1Var = new r35.i1(context);
                i1Var.l(str2);
                i1Var.g(java.lang.Boolean.TRUE);
                i1Var.j(com.tencent.mm.R.string.f490551ya);
                i1Var.d(i07, 3);
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.i27);
                i65.a.b(context, (int) (i65.a.q(context) * 20.0f));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    i1Var.f369135b.f211821b.f211709a = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, string.toString());
                }
                i1Var.a(e2Var);
                i1Var.k();
            }
        }
        return jz5.f0.f302826a;
    }
}
