package uj3;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f428378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428379e;

    public w(uj3.z zVar, java.lang.String str) {
        this.f428378d = zVar;
        this.f428379e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uj3.z zVar = this.f428378d;
        android.widget.RelativeLayout relativeLayout = zVar.f428394a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = zVar.f428403j;
        java.lang.Long l17 = null;
        sb6.append(context != null ? context.getString(com.tencent.mm.R.string.b6r) : null);
        sb6.append(',');
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f428379e;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        sb6.append(n17 != null ? n17.P0() : null);
        relativeLayout.setContentDescription(sb6.toString());
        if (kotlin.jvm.internal.o.b(zVar.f428401h, str)) {
            return;
        }
        if (str != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            l17 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        zVar.f428402i = l17;
        zVar.f428400g = str;
        zVar.f428401h = str;
        zVar.f428402i = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
    }
}
