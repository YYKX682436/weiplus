package sm2;

/* loaded from: classes3.dex */
public final class l9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f409557a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f409558b;

    public l9(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f409557a = root;
        this.f409558b = new java.util.ArrayList();
    }

    public static void b(sm2.l9 l9Var, java.lang.Integer num, yz5.l lVar, yz5.a init, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        l9Var.getClass();
        kotlin.jvm.internal.o.g(init, "init");
        l9Var.a(new sm2.m9(null, num, init, lVar));
    }

    public static void c(sm2.l9 l9Var, int i17, java.lang.Integer num, yz5.l lVar, yz5.a init, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            num = null;
        }
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        l9Var.getClass();
        kotlin.jvm.internal.o.g(init, "init");
        l9Var.a(new sm2.m9(java.lang.Integer.valueOf(i17), num, init, lVar));
    }

    public final void a(sm2.m9 config) {
        kotlin.jvm.internal.o.g(config, "config");
        android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.Integer num = config.f409576a;
            if (num != null) {
                android.view.ViewStub viewStub = (android.view.ViewStub) this.f409557a.findViewById(num.intValue());
                if (viewStub != null) {
                    viewStub.inflate();
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) config.f409578c.invoke();
            if (lVar != null) {
                java.lang.Integer num2 = config.f409577b;
                if (num2 != null) {
                    lVar.K0(num2.intValue());
                }
                yz5.l lVar2 = config.f409579d;
                if (lVar2 != null) {
                    lVar2.invoke(lVar);
                }
                ((java.util.ArrayList) this.f409558b).add(lVar);
                android.os.SystemClock.elapsedRealtime();
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
