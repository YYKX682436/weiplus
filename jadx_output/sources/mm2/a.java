package mm2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f328734a;

    /* renamed from: b, reason: collision with root package name */
    public long f328735b;

    /* renamed from: c, reason: collision with root package name */
    public long f328736c;

    public a(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f328734a = "ActionDurationModel_".concat(source);
    }

    public static /* synthetic */ void b(mm2.a aVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        aVar.a(z17);
    }

    public final void a(boolean z17) {
        boolean z18 = this.f328736c > 0;
        java.lang.String str = this.f328734a;
        if (!z18) {
            com.tencent.mars.xlog.Log.i(str, "tickEnd startTime: " + this.f328736c);
        } else {
            if (z17) {
                this.f328735b = 0L;
                return;
            }
            long c17 = c01.id.c() - this.f328736c;
            this.f328735b += c17;
            this.f328736c = 0L;
            com.tencent.mars.xlog.Log.i(str, "tickEnd duration: " + c17 + " totalDuration: " + this.f328735b);
        }
    }

    public final void c() {
        this.f328736c = c01.id.c();
        com.tencent.mars.xlog.Log.i(this.f328734a, "tickStart totalDuration: " + this.f328735b);
    }
}
