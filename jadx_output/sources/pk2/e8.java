package pk2;

/* loaded from: classes3.dex */
public final class e8 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355710h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355711i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355710h = helper.f356108s;
        this.f355711i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.util.ArrayList arrayList;
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.ui.MMActivity mMActivity = this.f364427a.f356078d;
        com.tencent.mm.ui.MMActivity mMActivity2 = o9Var.f356078d;
        android.content.Intent intent2 = mMActivity2.getIntent();
        java.lang.String str = o9Var.f356072a;
        if (intent2 == null) {
            com.tencent.mars.xlog.Log.i(str, "checkAnchorSplitScreen intent null");
        } else if (zl2.r4.f473950a.x1()) {
            dk2.w4 w4Var = dk2.x4.C;
            dk2.x4 a17 = w4Var.a(intent2);
            com.tencent.mm.live.api.LiveConfig liveConfig = (a17 == null || (arrayList = a17.f234318l) == null) ? null : (com.tencent.mm.live.api.LiveConfig) kz5.n0.Z(arrayList);
            if (liveConfig != null) {
                liveConfig.f68537e = ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0);
            }
            w4Var.c(intent2, a17);
        }
        ((mm2.c1) o9Var.c(mm2.c1.class)).O1 = false;
        ((mm2.c1) o9Var.c(mm2.c1.class)).f328798e5 = true;
        com.tencent.mm.ui.ee.f(mMActivity.getTaskId(), null);
        if (com.tencent.mm.ui.bk.w0()) {
            android.content.Intent intent3 = mMActivity2.getIntent();
            if (intent3 == null) {
                com.tencent.mars.xlog.Log.i(str, "checkVisitorSplitScreen intent null");
            } else {
                gk2.e eVar = gk2.e.f272471n;
                if (eVar != null) {
                    mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
                    en0.g gVar = new en0.g();
                    gVar.f255246a = 1;
                    gVar.f255248c = e1Var.f328988r.getLong(0);
                    gVar.f255262q = e1Var.f328992v;
                    gVar.f255256k = e1Var.f328983m;
                    gVar.f255251f = ((mm2.c1) e1Var.business(mm2.c1.class)).f328852o;
                    gVar.f255257l = ((mm2.c1) e1Var.business(mm2.c1.class)).V1;
                    com.tencent.mm.live.api.LiveConfig a18 = gVar.a();
                    dk2.x4 x4Var = new dk2.x4();
                    x4Var.f234318l.add(a18);
                    dk2.x4.C.c(intent3, x4Var);
                }
            }
        }
        com.tencent.mm.ui.fj.f(mMActivity, true);
        if (!com.tencent.mm.ui.bk.w0() || (intent = mMActivity.getIntent()) == null) {
            return;
        }
        intent.putExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", true);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355711i;
    }

    @Override // qk2.f
    public boolean o() {
        return com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.N(this.f364427a.f356078d.getTaskId()) || com.tencent.mm.ui.bk.w0());
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        boolean z17 = com.tencent.mm.ui.bk.z(mMActivity.getTaskId());
        int i17 = this.f355710h;
        if (z17 || com.tencent.mm.ui.fj.b(mMActivity)) {
            menu.g(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b9c), com.tencent.mm.R.raw.icons_outlined_merge);
        } else {
            menu.g(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jjg), com.tencent.mm.R.raw.icons_outlined_sperated);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f355710h;
    }
}
