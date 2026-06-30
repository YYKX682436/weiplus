package sp2;

/* loaded from: classes2.dex */
public final class c3 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f410996a;

    public c3(sp2.d3 d3Var) {
        this.f410996a = d3Var;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        sp2.d3 d3Var = this.f410996a;
        d3Var.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if (e17 == null || r26.n0.N(e17)) {
            return;
        }
        d3Var.f411016j = true;
        com.tencent.mm.ui.MMActivity mMActivity = d3Var.f411007a;
        if (!(mMActivity instanceof com.tencent.mm.ui.MMActivity)) {
            mMActivity = null;
        }
        if (mMActivity != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new sp2.s2(d3Var, mMActivity, null), 3, null);
        }
    }
}
