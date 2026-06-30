package sj3;

/* loaded from: classes8.dex */
public final class b2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408440d;

    public b2(sj3.g3 g3Var) {
        this.f408440d = g3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout d17 = this.f408440d.d();
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            d17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "selectUser: ".concat(r17));
            tj3.p pVar = (tj3.p) d17.f150363d.get(r17);
            if (pVar != null) {
                if (!(pVar.f419790i != d17.f150367h)) {
                    pVar = null;
                }
                if (pVar != null) {
                    d17.b(pVar);
                }
            }
        }
    }
}
