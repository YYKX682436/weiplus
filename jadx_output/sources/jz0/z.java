package jz0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f302633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(1);
        this.f302632d = maasFakeVideoPlayUIC;
        this.f302633e = appCompatActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = this.f302632d;
        if (!booleanValue) {
            maasFakeVideoPlayUIC.t("start play error");
        } else if (!maasFakeVideoPlayUIC.f69827p) {
            maasFakeVideoPlayUIC.f69827p = true;
            androidx.appcompat.app.AppCompatActivity activity = this.f302633e;
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            boolean z17 = ((jz0.k) zVar.a(activity).a(jz0.k.class)).f302594r;
            java.lang.String str = maasFakeVideoPlayUIC.f69818d;
            if (z17) {
                com.tencent.mars.xlog.Log.i(str, "first frame >> ani is end");
                jz0.k kVar = (jz0.k) zVar.a(activity).a(jz0.k.class);
                kVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "setThumbViewVisible >> 8, " + kVar.f302594r);
                if (kVar.f302594r) {
                    java.lang.Object value = ((jz5.n) kVar.f302586g).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    ((android.widget.ImageView) value).setVisibility(8);
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "first frame >> but ani is no end");
                maasFakeVideoPlayUIC.R6();
            }
        }
        g65.a aVar = (g65.a) i95.n0.c(g65.a.class);
        int i17 = maasFakeVideoPlayUIC.f69821g ? 2 : 1;
        kotlin.jvm.internal.o.d(aVar);
        g65.a.hg(aVar, 34, i17, "", 0, 0, 0, 0L, 0L, 0L, 0L, 0, null, java.lang.Boolean.valueOf(booleanValue), null, null, 28664, null);
        return jz5.f0.f302826a;
    }
}
