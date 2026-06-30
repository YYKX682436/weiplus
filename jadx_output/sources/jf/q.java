package jf;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final jf.q f299342a = new jf.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f299343b = jz5.h.b(jf.p.f299341d);

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f299343b).getValue();
    }

    public final void b(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        a().putInt("SwitchRenderLogic#".concat(appId), i17);
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("SwitchRenderLogic", "setDeafultMode:" + i17);
        a().putInt("SwitchRenderLogic#Default", i17);
    }
}
