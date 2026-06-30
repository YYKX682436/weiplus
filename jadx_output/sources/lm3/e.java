package lm3;

/* loaded from: classes10.dex */
public final class e implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final fm3.u f319482d;

    public e(fm3.u mv6) {
        kotlin.jvm.internal.o.g(mv6, "mv");
        this.f319482d = mv6;
    }

    @Override // in5.c
    public long getItemId() {
        fm3.u uVar = this.f319482d;
        java.lang.Long l17 = uVar.f264121a;
        if (l17 != null) {
            return l17.longValue();
        }
        java.lang.Long l18 = uVar.f264123c;
        if (l18 != null) {
            return l18.longValue();
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
