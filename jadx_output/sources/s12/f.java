package s12;

@j95.b
/* loaded from: classes7.dex */
public final class f extends i95.w implements xp0.f {

    /* renamed from: d, reason: collision with root package name */
    public s12.e f402129d;

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        synchronized (this) {
            rk0.c.c("MagicFinderEmojiService", "destroyBiz", new java.lang.Object[0]);
            s12.e eVar = this.f402129d;
            if (eVar != null) {
                jc3.j0 j0Var = eVar.f448375f;
                if (j0Var != null) {
                    ((rc3.w0) j0Var).destroy();
                }
                bf3.p pVar = eVar.f448376g;
                if (pVar != null) {
                    pVar.b();
                }
                eVar.f448375f = null;
                eVar.f448376g = null;
            }
            this.f402129d = null;
        }
    }
}
