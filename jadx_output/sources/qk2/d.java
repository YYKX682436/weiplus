package qk2;

/* loaded from: classes3.dex */
public abstract class d extends qk2.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f364424g;

    /* renamed from: h, reason: collision with root package name */
    public final int f364425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f364424g = "MoreActionCustomItem";
        this.f364425h = -1;
    }

    public static /* synthetic */ void s(qk2.d dVar, com.tencent.mm.plugin.finder.view.e3 e3Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addButton");
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        dVar.r(e3Var, num);
    }

    @Override // qk2.f
    public boolean o() {
        return n();
    }

    public final void r(com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        if (h() && zl2.r4.F1(this.f364427a.f356074b)) {
            boolean z17 = ((mm2.n0) this.f364427a.f356074b.a(mm2.n0.class)).f329273r;
            java.lang.String str = this.f364424g;
            java.lang.String str2 = "skip add " + getClass().getSimpleName() + ": blocked by coLive phase1 switch, isInviteeAnchor=" + z17 + ", allowCoLiveInitiator=false";
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str, str2, null);
            return;
        }
        int i18 = this.f364425h;
        if (i18 != -1 && !re2.b.b(i18)) {
            java.lang.String str3 = this.f364424g;
            java.lang.String str4 = "skip add " + getClass().getSimpleName() + ": blocked by invitee perm gate, itemId=" + this.f364425h;
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str3, str4, null);
            return;
        }
        if (!o()) {
            java.lang.String str5 = this.f364424g;
            java.lang.String str6 = "add item " + getClass().getName() + " failed as it is not enabled";
            int i27 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str5, str6, null);
            return;
        }
        t(this.f364427a, bottomSheet, num);
        ll2.e eVar = ll2.e.f319133a;
        eVar.j(i(), false);
        java.lang.Integer u17 = u();
        if (u17 != null) {
            int intValue = u17.intValue();
            android.content.Context context = bottomSheet.f131959f.getContext();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
            if (appCompatActivity == null) {
                return;
            }
            ll2.e.l(eVar, appCompatActivity, i(), bottomSheet.f131959f.findViewById(intValue), null, null, 24, null);
        }
    }

    public abstract void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 e3Var, java.lang.Integer num);

    public java.lang.Integer u() {
        return null;
    }

    public final void v(java.lang.String itemName, android.view.View root, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        kotlin.jvm.internal.o.g(itemName, "itemName");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(mMSwitchBtn, "switch");
        mMSwitchBtn.setContentDescription(mMSwitchBtn.f211363x ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.efy, itemName) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.efx, itemName));
    }
}
