package mm2;

/* loaded from: classes3.dex */
public final class n0 extends mm2.e {
    public static volatile boolean A6;

    /* renamed from: u, reason: collision with root package name */
    public static volatile r45.f50 f329260u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile r45.e50 f329261v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile r45.a84 f329262w;

    /* renamed from: x, reason: collision with root package name */
    public static volatile int f329263x;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329264f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329265g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329266h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329267i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329268m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329269n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329270o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329271p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f329272q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f329273r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f329274s;

    /* renamed from: t, reason: collision with root package name */
    public volatile mm2.m0 f329275t;

    /* renamed from: z6, reason: collision with root package name */
    public volatile boolean f329276z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(null);
        this.f329264f = a17;
        this.f329265g = kotlinx.coroutines.flow.l.b(a17);
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(null);
        this.f329266h = a18;
        this.f329267i = kotlinx.coroutines.flow.l.b(a18);
        kotlinx.coroutines.flow.j2 a19 = kotlinx.coroutines.flow.i3.a(null);
        this.f329268m = a19;
        this.f329269n = kotlinx.coroutines.flow.l.b(a19);
        kotlinx.coroutines.flow.j2 a27 = kotlinx.coroutines.flow.i3.a(null);
        this.f329270o = a27;
        this.f329271p = kotlinx.coroutines.flow.l.b(a27);
        this.f329275t = mm2.m0.f329230d;
        r45.f50 f50Var = f329260u;
        f329260u = null;
        if (f50Var != null) {
            com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "consume pending invitation info on init, invitationId=" + f50Var.f374013d + ", status=" + f50Var.f374014e);
            ((kotlinx.coroutines.flow.h3) a17).k(f50Var);
            java.lang.String str = f50Var.f374020n;
            if (str != null) {
                str = str.length() > 0 ? str : null;
                if (str != null) {
                    ((kotlinx.coroutines.flow.h3) a18).k(str);
                }
            }
        }
        r45.e50 e50Var = f329261v;
        f329261v = null;
        if (e50Var != null) {
            com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "consume pending anchor permission on init");
            R6(e50Var);
        }
        r45.a84 a84Var = f329262w;
        f329262w = null;
        if (a84Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consume pending co author info on init, url=");
            java.lang.String string = a84Var.getString(0);
            sb6.append(string != null ? r26.p0.E0(string, 80) : null);
            com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", sb6.toString());
            S6(a84Var);
        }
        int i17 = f329263x;
        f329263x = 0;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        valueOf = valueOf.intValue() > 0 ? valueOf : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "consume pending max invitee count on init, count=" + intValue);
            this.f329272q = intValue;
        }
        boolean z17 = A6;
        A6 = false;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean bool = valueOf2.booleanValue() ? valueOf2 : null;
        if (bool != null) {
            bool.booleanValue();
            com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "consume pending onlySupportInitiatorSettlement on init");
            this.f329276z6 = true;
        }
    }

    public final void N6() {
        com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "clearInvitation");
        ((kotlinx.coroutines.flow.h3) this.f329264f).k(null);
        ((kotlinx.coroutines.flow.h3) this.f329266h).k(null);
        this.f329275t = mm2.m0.f329230d;
    }

    public final boolean O6() {
        r45.f50 f50Var = (r45.f50) ((kotlinx.coroutines.flow.h3) this.f329264f).getValue();
        if (f50Var == null || f50Var.f374013d == 0) {
            return false;
        }
        int i17 = f50Var.f374014e;
        if (i17 != 0 && i17 != 2 && i17 != 3) {
            com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "isInCoLiveInvitation=false, status=" + i17);
            return false;
        }
        long j17 = f50Var.f374018i;
        if (j17 <= 0 || java.lang.System.currentTimeMillis() < j17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", "isInCoLiveInvitation=false, expired");
        return false;
    }

    public final boolean P6(java.lang.String myFinderUsername) {
        kotlin.jvm.internal.o.g(myFinderUsername, "myFinderUsername");
        r45.f50 f50Var = (r45.f50) ((kotlinx.coroutines.flow.h3) this.f329264f).getValue();
        if (f50Var == null) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = f50Var.f374017h;
        java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
        return !(username == null || username.length() == 0) ? kotlin.jvm.internal.o.b(username, myFinderUsername) : f50Var.f374019m == 0;
    }

    public final boolean Q6(java.lang.String myFinderUsername) {
        kotlin.jvm.internal.o.g(myFinderUsername, "myFinderUsername");
        if (O6()) {
            return !P6(myFinderUsername);
        }
        return false;
    }

    public final void R6(r45.e50 e50Var) {
        boolean z17 = e50Var != null && e50Var.getBoolean(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAnchorPermission: hasField=");
        sb6.append(e50Var != null);
        sb6.append(", isInviteeAnchor=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", sb6.toString());
        ((kotlinx.coroutines.flow.h3) this.f329268m).k(e50Var);
        this.f329273r = z17;
    }

    public final void S6(r45.a84 a84Var) {
        java.util.LinkedList list;
        java.lang.String string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCoAuthorInfo: hasField=");
        sb6.append(a84Var != null);
        sb6.append(", url=");
        java.lang.Integer num = null;
        sb6.append((a84Var == null || (string = a84Var.getString(0)) == null) ? null : r26.p0.E0(string, 80));
        sb6.append(", contactCount=");
        if (a84Var != null && (list = a84Var.getList(1)) != null) {
            num = java.lang.Integer.valueOf(list.size());
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", sb6.toString());
        ((kotlinx.coroutines.flow.h3) this.f329270o).k(a84Var);
    }

    public final void T6(r45.f50 f50Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFromTask: invitationId=");
        java.lang.Integer num = null;
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f374013d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? java.lang.Integer.valueOf(f50Var.f374014e) : null);
        sb6.append(", inviteeCount=");
        if (f50Var != null && (linkedList = f50Var.f374016g) != null) {
            num = java.lang.Integer.valueOf(linkedList.size());
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("LiveCoLiveSlice", sb6.toString());
        ((kotlinx.coroutines.flow.h3) this.f329264f).k(f50Var);
        ((kotlinx.coroutines.flow.h3) this.f329266h).k(str);
    }
}
