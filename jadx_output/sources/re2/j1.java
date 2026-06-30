package re2;

/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile re2.e0 f394438b;

    /* renamed from: a, reason: collision with root package name */
    public static final re2.j1 f394437a = new re2.j1();

    /* renamed from: c, reason: collision with root package name */
    public static final re2.i1 f394439c = new re2.i1();

    public final re2.e0 a() {
        java.lang.String str;
        re2.e0 y0Var;
        kotlinx.coroutines.flow.f3 f3Var;
        re2.e0 e0Var = f394438b;
        if (e0Var != null) {
            if (!e0Var.d()) {
                e0Var = null;
            }
            if (e0Var != null) {
                return e0Var;
            }
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f329265g) == null) ? null : (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
        if (!(n0Var != null && n0Var.O6()) || f50Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ensureRestoredFromSlice: skip, curLiveContext=");
            sb6.append(dk2.ef.I != null);
            sb6.append(", isInCoLiveInvitation=");
            sb6.append(n0Var != null ? java.lang.Boolean.valueOf(n0Var.O6()) : null);
            sb6.append(", info=");
            sb6.append(f50Var != null);
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", sb6.toString());
            return null;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = f50Var.f374017h;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        if (n0Var.P6(e17)) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: [Initiator] invitationId=" + f50Var.f374013d);
            y0Var = new re2.h1(f50Var.f374015f, e17);
        } else {
            if (str.length() == 0) {
                com.tencent.mars.xlog.Log.w("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: invitee but no initiator username, skip");
                return null;
            }
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: [Invitee] invitationId=" + f50Var.f374013d + ", initiator=" + str);
            y0Var = new re2.y0(str);
        }
        if (y0Var.f394389b != re2.a0.f394355d) {
            com.tencent.mars.xlog.Log.w(y0Var.c(), "restoreFrom: invalid phase=" + y0Var.f394389b);
        } else {
            com.tencent.mars.xlog.Log.i(y0Var.c(), "restoreFrom: invitationId=" + f50Var.f374013d + ", status=" + f50Var.f374014e + ", role=" + f50Var.f374019m);
            y0Var.f394390c = f50Var.f374013d;
            y0Var.f394391d = f50Var;
            y0Var.f394392e = f50Var.f374020n;
            y0Var.f394393f = f50Var.f374018i;
            y0Var.j();
            int i17 = f50Var.f374014e;
            if (i17 == 1 || i17 == 4) {
                y0Var.f394389b = re2.a0.f394357f;
            } else if (y0Var.e()) {
                y0Var.f(4);
            } else {
                y0Var.b();
            }
        }
        b(y0Var);
        re2.e0 e0Var2 = y0Var.d() ? y0Var : null;
        if (e0Var2 == null) {
            com.tencent.mars.xlog.Log.w("Finder.CoLiveTaskManager", "ensureRestoredFromSlice: restored task not alive, phase=" + y0Var.f394389b + ", invitationId=" + y0Var.f394390c);
        }
        return e0Var2;
    }

    public final void b(re2.e0 e0Var) {
        re2.e0 e0Var2 = f394438b;
        if (e0Var2 == e0Var) {
            return;
        }
        if (e0Var2 != null && e0Var2.d()) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "set: destroy old alive task, invitationId=" + e0Var2.f394390c);
            e0Var2.a();
        }
        f394438b = e0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set: invitationId=");
        sb6.append(e0Var != null ? java.lang.Long.valueOf(e0Var.f394390c) : null);
        sb6.append(", phase=");
        sb6.append(e0Var != null ? e0Var.f394389b : null);
        com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", sb6.toString());
    }
}
