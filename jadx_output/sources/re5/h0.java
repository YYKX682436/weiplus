package re5;

/* loaded from: classes12.dex */
public class h0 extends fg3.v {

    /* renamed from: z, reason: collision with root package name */
    public final mf3.p f394576z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mf3.p apiCenter) {
        super(apiCenter);
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f394576z = apiCenter;
    }

    @Override // fg3.v, mf3.e, mf3.n
    public mf3.p G() {
        return this.f394576z;
    }

    @Override // fg3.v, ig3.d
    public void I(ig3.c state) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(state, "state");
        gg3.c cVar = this.f262463w;
        if (cVar != null) {
            if (state == ig3.c.f291422m) {
                fg3.h hVar = (fg3.h) this.f394576z.a(fg3.h.class);
                if (hVar != null) {
                    hVar.s(true);
                }
                android.content.Context K = K();
                pf5.z zVar = pf5.z.f353948a;
                if (!(K instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((re5.x) zVar.a((androidx.appcompat.app.AppCompatActivity) K).a(re5.x.class)).V6(true, cVar);
            } else {
                fg3.h hVar2 = (fg3.h) g(fg3.h.class);
                if (hVar2 != null) {
                    hVar2.s(false);
                }
                android.content.Context K2 = K();
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(K2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((re5.x) zVar2.a((androidx.appcompat.app.AppCompatActivity) K2).a(re5.x.class)).V6(false, cVar);
                super.I(state);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.I(state);
        }
    }
}
