package gz2;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gz2.c f277728a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f277729b;

    /* renamed from: c, reason: collision with root package name */
    public static r45.el0 f277730c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f277731d;

    static {
        gz2.c cVar = new gz2.c();
        f277728a = cVar;
        f277730c = cVar.b();
        f277731d = "";
        com.tencent.mm.app.w.INSTANCE.a(new gz2.a());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context).registerActivityLifecycleCallbacks(new gz2.b());
    }

    public static final void a(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        r45.dm0 f17 = f277728a.f(scene);
        if (f17 == null) {
            return;
        }
        f17.set(1, java.lang.Integer.valueOf(f17.getInteger(1) + 1));
    }

    public static final void e(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        r45.dm0 f17 = f277728a.f(scene);
        if (f17 == null) {
            return;
        }
        f17.set(2, java.lang.Integer.valueOf(f17.getInteger(2) + 1));
    }

    public final r45.el0 b() {
        r45.el0 el0Var = new r45.el0();
        el0Var.set(0, new r45.dm0());
        el0Var.set(2, new r45.dm0());
        el0Var.set(1, new r45.dm0());
        return el0Var;
    }

    public final void c(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        r45.dm0 f17 = f(scene);
        if (f17 != null && f17.getLong(4) == 0) {
            f17.set(4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    public final void d(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        r45.dm0 f17 = f(scene);
        if (f17 != null && f17.getLong(4) > 0) {
            f17.set(3, java.lang.Integer.valueOf(f17.getInteger(3) + ((int) ((java.lang.System.currentTimeMillis() - f17.getLong(4)) / 1000))));
            f17.set(4, 0L);
        }
    }

    public final r45.dm0 f(java.lang.String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1274447834) {
            if (hashCode != 114040) {
                if (hashCode == 3322092 && str.equals("live")) {
                    return (r45.dm0) f277730c.getCustom(2);
                }
            } else if (str.equals("sns")) {
                return (r45.dm0) f277730c.getCustom(0);
            }
        } else if (str.equals("finder")) {
            return (r45.dm0) f277730c.getCustom(1);
        }
        return null;
    }

    public final r45.el0 g(int i17) {
        r45.el0 el0Var = f277730c;
        el0Var.set(3, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance");
        r45.dm0 dm0Var = (r45.dm0) el0Var.getCustom(1);
        if (dm0Var != null) {
            dm0Var.set(0, java.lang.Integer.valueOf(I0 == null ? 0 : 1));
        }
        r45.f03 I02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveEntrance");
        r45.dm0 dm0Var2 = (r45.dm0) el0Var.getCustom(2);
        if (dm0Var2 != null) {
            dm0Var2.set(0, java.lang.Integer.valueOf(I02 == null ? 0 : 1));
        }
        r45.dm0 dm0Var3 = (r45.dm0) el0Var.getCustom(0);
        if (dm0Var3 != null) {
            dm0Var3.set(0, java.lang.Integer.valueOf(f277729b ? 1 : 0));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[take#");
        sb6.append(i17);
        sb6.append("] ");
        sb6.append(el0Var.getInteger(3));
        sb6.append(" sns=");
        r45.dm0 dm0Var4 = (r45.dm0) el0Var.getCustom(0);
        sb6.append(dm0Var4 != null ? gz2.d.a(dm0Var4) : null);
        sb6.append(" live=");
        r45.dm0 dm0Var5 = (r45.dm0) el0Var.getCustom(2);
        sb6.append(dm0Var5 != null ? gz2.d.a(dm0Var5) : null);
        sb6.append(" finder=");
        r45.dm0 dm0Var6 = (r45.dm0) el0Var.getCustom(1);
        sb6.append(dm0Var6 != null ? gz2.d.a(dm0Var6) : null);
        com.tencent.stubs.logger.Log.i("FindMoreFriendEntranceExpose", sb6.toString());
        r45.el0 b17 = b();
        r45.dm0 dm0Var7 = (r45.dm0) b17.getCustom(0);
        if (dm0Var7 != null) {
            r45.dm0 dm0Var8 = (r45.dm0) f277730c.getCustom(0);
            dm0Var7.set(4, java.lang.Long.valueOf(dm0Var8 != null ? dm0Var8.getLong(4) : 0L));
        }
        r45.dm0 dm0Var9 = (r45.dm0) b17.getCustom(1);
        if (dm0Var9 != null) {
            r45.dm0 dm0Var10 = (r45.dm0) f277730c.getCustom(1);
            dm0Var9.set(4, java.lang.Long.valueOf(dm0Var10 != null ? dm0Var10.getLong(4) : 0L));
        }
        r45.dm0 dm0Var11 = (r45.dm0) b17.getCustom(2);
        if (dm0Var11 != null) {
            r45.dm0 dm0Var12 = (r45.dm0) f277730c.getCustom(2);
            dm0Var11.set(4, java.lang.Long.valueOf(dm0Var12 != null ? dm0Var12.getLong(4) : 0L));
        }
        f277730c = b17;
        return el0Var;
    }
}
