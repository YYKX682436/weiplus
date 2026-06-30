package fe2;

/* loaded from: classes3.dex */
public final class h extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f261514p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f261515q;

    /* renamed from: r, reason: collision with root package name */
    public mm2.o6 f261516r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.MMActivity context, android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f261514p = jz5.h.b(new fe2.e(context, this));
        this.f261515q = context.getIntent().getBooleanExtra("key_enter_live_param_is_from_chat_group", false);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String c17;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 234) {
            if (bundle == null || bundle.getInt("requestCode") != 16) {
                return;
            }
            boolean z17 = bundle.getBoolean("is_share_success");
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("current_group_select");
            if (z17) {
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    r6 = false;
                }
                if (!r6) {
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new fe2.f(stringArrayList, this, null), 3, null);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleShareToChatGroup: ");
            sb6.append(z17);
            sb6.append(" groupId: ");
            sb6.append(stringArrayList != null ? kz5.n0.g0(stringArrayList, ",", null, null, 0, null, null, 62, null) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxGroupHintPlugin", sb6.toString());
            return;
        }
        if (ordinal != 243) {
            return;
        }
        if ((bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW") : false) || mm2.g0.Q6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            return;
        }
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if ((xwVar == null || xwVar.e7()) ? false : true) {
            de2.h t17 = t1();
            r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f328970m.getValue();
            if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
                str = "";
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 == null) {
                c17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f491539dg4);
                kotlin.jvm.internal.o.f(c17, "getString(...)");
            } else {
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                c17 = c01.a2.c(n17, str);
                kotlin.jvm.internal.o.f(c17, "getDisplayName(...)");
            }
            t17.f229385f = c17;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isFromChatEnter: ");
            boolean z18 = this.f261515q;
            sb7.append(z18);
            sb7.append(", ");
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC;
            sb7.append(c18.r(u3Var, 0) == 0);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxGroupHintPlugin", sb7.toString());
            if (z18) {
                if (gm0.j1.u().c().r(u3Var, 0) == 0) {
                    mm2.o6 o6Var = new mm2.o6(mm2.p6.f329355h, new fe2.b(this), new fe2.c(this), null, 8, null);
                    pm0.v.X(new mm2.r6((mm2.w6) P0(mm2.w6.class), o6Var));
                    this.f261516r = o6Var;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final de2.h t1() {
        return (de2.h) ((jz5.n) this.f261514p).getValue();
    }
}
