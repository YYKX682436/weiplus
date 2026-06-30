package om2;

/* loaded from: classes10.dex */
public final class g extends mm2.e {
    public final kotlinx.coroutines.flow.f3 A;
    public final kotlinx.coroutines.flow.j2 B;
    public final kotlinx.coroutines.flow.j2 C;
    public final kotlinx.coroutines.flow.f3 D;
    public final kotlinx.coroutines.flow.j2 E;
    public final kotlinx.coroutines.flow.f3 F;
    public final kotlinx.coroutines.flow.j2 G;
    public final kotlinx.coroutines.flow.f3 H;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f346302f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f346303g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f346304h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f346305i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f346306m;

    /* renamed from: n, reason: collision with root package name */
    public om2.i f346307n;

    /* renamed from: o, reason: collision with root package name */
    public om2.s f346308o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x84 f346309p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f346310q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f346311r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f346312s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f346313t;

    /* renamed from: u, reason: collision with root package name */
    public int f346314u;

    /* renamed from: v, reason: collision with root package name */
    public long f346315v;

    /* renamed from: w, reason: collision with root package name */
    public int f346316w;

    /* renamed from: x, reason: collision with root package name */
    public int f346317x;

    /* renamed from: y, reason: collision with root package name */
    public int f346318y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f346319z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new om2.v());
        this.f346302f = a17;
        this.f346303g = a17;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(10, 0, null, 6, null);
        this.f346304h = b17;
        this.f346305i = b17;
        this.f346306m = "";
        java.util.List _dispatchSongList = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f346310q = _dispatchSongList;
        kotlin.jvm.internal.o.f(_dispatchSongList, "_dispatchSongList");
        this.f346311r = _dispatchSongList;
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(null);
        this.f346312s = a18;
        this.f346313t = a18;
        kotlinx.coroutines.flow.j2 a19 = kotlinx.coroutines.flow.i3.a(null);
        this.f346319z = a19;
        this.A = a19;
        this.B = kotlinx.coroutines.flow.i3.a(null);
        kotlinx.coroutines.flow.j2 a27 = kotlinx.coroutines.flow.i3.a(null);
        this.C = a27;
        this.D = a27;
        kotlinx.coroutines.flow.j2 a28 = kotlinx.coroutines.flow.i3.a(new jz5.l(0, 0));
        this.E = a28;
        this.F = a28;
        kotlinx.coroutines.flow.j2 a29 = kotlinx.coroutines.flow.i3.a(null);
        this.G = a29;
        this.H = a29;
    }

    public final boolean N6(java.util.LinkedList list) {
        kotlin.jvm.internal.o.g(list, "list");
        if (list.size() >= 2) {
            r45.yx1 yx1Var = (r45.yx1) kz5.n0.a0(list, 0);
            r45.yx1 yx1Var2 = (r45.yx1) kz5.n0.a0(list, 1);
            if (yx1Var != null && yx1Var2 != null && !kotlin.jvm.internal.o.b(yx1Var.f391469r, yx1Var2.f391469r) && kotlin.jvm.internal.o.b(yx1Var2.f391469r, ((mm2.c1) business(mm2.c1.class)).m8())) {
                pm0.v.X(om2.f.f346301d);
                return true;
            }
        }
        return false;
    }

    public final void O6(om2.a state) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("LiveKTVSingSlice", "emitAnchorOptionState: " + state.f346268a);
        ((kotlinx.coroutines.flow.h3) this.f346312s).k(state);
    }

    public final void P6(om2.d0 newState, boolean z17) {
        kotlin.jvm.internal.o.g(newState, "newState");
        kotlinx.coroutines.flow.j2 j2Var = this.f346302f;
        om2.d0 d0Var = (om2.d0) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
        if (d0Var == null) {
            ((kotlinx.coroutines.flow.h3) j2Var).k(newState);
            return;
        }
        if (d0Var.getClass() != newState.getClass()) {
            ((kotlinx.coroutines.flow.h3) j2Var).k(newState);
            return;
        }
        if (!z17) {
            if (!(newState.a(d0Var))) {
                return;
            }
        }
        ((kotlinx.coroutines.flow.h3) j2Var).k(newState);
    }

    public final r45.yx1 Q6() {
        java.util.List list = this.f346311r;
        if (list != null) {
            return (r45.yx1) kz5.n0.a0(list, 0);
        }
        return null;
    }

    public final om2.i R6() {
        return this.f346307n;
    }

    public final boolean S6() {
        r45.yx1 Q6 = Q6();
        java.lang.String str = Q6 != null ? Q6.f391469r : null;
        if (str == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(str, ((mm2.c1) business(mm2.c1.class)).m8());
    }

    public final boolean T6(r45.yx1 yx1Var) {
        return kotlin.jvm.internal.o.b(yx1Var != null ? yx1Var.f391469r : null, ((mm2.c1) business(mm2.c1.class)).m8());
    }

    public final void U6(int i17) {
        if (i17 == 0) {
            this.f346318y = 600;
        } else {
            this.f346318y = i17;
        }
        com.tencent.mars.xlog.Log.i("LiveKTVSingSlice", "update stayTrtcRoomTimeAfterStopSinging: " + this.f346318y + " value: " + i17);
    }

    public final void V6(java.lang.String source, java.util.LinkedList list, int i17) {
        r45.ay1 ay1Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(list, "list");
        if (this.f346314u > i17) {
            com.tencent.mars.xlog.Log.e("LiveKTVSingSlice", "updateDispatchSongList version invalid, source : " + source + " version: " + i17 + " firstSongVersion: " + this.f346314u);
            return;
        }
        if (!((mm2.e1) business(mm2.e1.class)).b7()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDispatchSongList no ktv mode: ");
            r45.q12 q12Var = ((mm2.e1) business(mm2.e1.class)).f328989s;
            sb6.append(q12Var != null ? java.lang.Integer.valueOf(q12Var.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.e("LiveKTVSingSlice", sb6.toString());
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.yx1 yx1Var = (r45.yx1) it.next();
            kotlin.jvm.internal.o.g(yx1Var, "<this>");
            java.lang.String str = yx1Var.f391458d;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            yx1Var.f391458d = str;
            java.lang.String str3 = yx1Var.f391459e;
            if (str3 == null) {
                str3 = "";
            }
            yx1Var.f391459e = str3;
            java.lang.String str4 = yx1Var.f391467p;
            if (str4 == null) {
                str4 = "";
            }
            yx1Var.f391467p = str4;
            java.lang.String str5 = yx1Var.f391469r;
            if (str5 != null) {
                str2 = str5;
            }
            yx1Var.f391469r = str2;
        }
        if (i17 != this.f346314u) {
            N6(list);
        }
        java.util.List list2 = this.f346310q;
        list2.clear();
        list2.addAll(list);
        this.f346314u = i17;
        ((kotlinx.coroutines.flow.h3) this.f346319z).k(list);
        om2.i iVar = this.f346307n;
        int i18 = 0;
        if (iVar != null) {
            r45.yx1 yx1Var2 = (r45.yx1) kz5.n0.Z(list);
            r45.ia4 ia4Var = iVar.f346323c;
            if (yx1Var2 != null) {
                java.lang.String str6 = yx1Var2.f391459e;
                r45.yx1 yx1Var3 = iVar.f346321a;
                if (!kotlin.jvm.internal.o.b(str6, yx1Var3 != null ? yx1Var3.f391459e : null) && ia4Var != null) {
                    ia4Var.f376874i = 4;
                }
            }
            if (ia4Var != null && ia4Var.f376874i == 4) {
                iVar.a(yx1Var2);
            } else {
                iVar.f346331k = null;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateDispatchSongList source: ");
        sb7.append(source);
        sb7.append(" dispatchVersion: ");
        sb7.append(this.f346314u);
        sb7.append(", infoList: ");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append("songList size: " + list.size() + " value = \n ");
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.yx1 yx1Var4 = (r45.yx1) obj;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(" index: ");
            sb9.append(i18);
            sb9.append(" info: ");
            kotlin.jvm.internal.o.g(yx1Var4, "<this>");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[song_mid: ");
            sb10.append(yx1Var4.f391458d);
            sb10.append(" unique_id: ");
            sb10.append(yx1Var4.f391459e);
            sb10.append(" mic_sdk_user_id: ");
            sb10.append(yx1Var4.f391469r);
            sb10.append(" song_name: ");
            r45.by1 by1Var = yx1Var4.f391466o;
            sb10.append((by1Var == null || (ay1Var = by1Var.f371143d) == null) ? null : ay1Var.f370351e);
            sb10.append(" resource_info: ");
            r45.by1 by1Var2 = yx1Var4.f391466o;
            sb10.append(by1Var2 != null ? by1Var2.f371144e : null);
            sb10.append(" ]");
            sb9.append(sb10.toString());
            sb9.append(" \n");
            sb8.append(sb9.toString());
            i18 = i19;
        }
        java.lang.String sb11 = sb8.toString();
        kotlin.jvm.internal.o.f(sb11, "toString(...)");
        sb7.append(sb11);
        sb7.append(' ');
        com.tencent.mars.xlog.Log.i("LiveKTVSingSlice", sb7.toString());
    }

    public final void W6(java.lang.String source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("LiveKTVSingSlice", "updateSongListVersion source: " + source + " new: " + j17 + " songListVersion: " + this.f346315v);
        if (this.f346315v < j17) {
            this.f346315v = j17;
        }
    }

    public final void X6(java.lang.String source, r45.qx1 qx1Var) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(source, "source");
        ((kotlinx.coroutines.flow.h3) this.B).k(qx1Var);
        W6("updateWaitPlayerList", qx1Var != null ? qx1Var.f384334f : -1L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWaitPlayerList source: ");
        sb6.append(source);
        sb6.append(" waitList: ");
        sb6.append((qx1Var == null || (linkedList = qx1Var.f384333e) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        sb6.append(" all: ");
        sb6.append(qx1Var != null ? java.lang.Integer.valueOf(qx1Var.f384332d) : null);
        sb6.append(" version: ");
        sb6.append(qx1Var != null ? java.lang.Long.valueOf(qx1Var.f384334f) : null);
        com.tencent.mars.xlog.Log.i("LiveKTVSingSlice", sb6.toString());
    }

    public final void Y6(java.lang.String source, int i17, int i18) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f346316w = i17;
        this.f346317x = i18;
        ((kotlinx.coroutines.flow.h3) this.E).k(new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        com.tencent.mars.xlog.Log.i("LiveKTVSingSlice", "updateWaitSongCount source: " + source + " selfToSingSize: " + i17 + " totalToSingSize: " + i18);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f346309p = null;
        ((kotlinx.coroutines.flow.h3) this.f346312s).k(null);
        ((kotlinx.coroutines.flow.h3) this.f346319z).k(null);
        this.f346310q.clear();
        this.f346307n = null;
        this.f346308o = null;
        ((kotlinx.coroutines.flow.h3) this.f346302f).k(null);
        ((kotlinx.coroutines.flow.h3) this.B).k(null);
        ((kotlinx.coroutines.flow.h3) this.C).k(null);
        ((kotlinx.coroutines.flow.h3) this.E).k(new jz5.l(0, 0));
        this.f346314u = 0;
        this.f346315v = 0L;
        this.f346316w = 0;
        this.f346317x = 0;
        U6(0);
        this.f346306m = "";
    }
}
