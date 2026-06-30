package zl3;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl3.g f474058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f474059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, zl3.g gVar, bw5.lp0 lp0Var) {
        super(0);
        this.f474057d = i17;
        this.f474058e = gVar;
        this.f474059f = lp0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.mm_foundation.FlutterMusicInfo c17;
        int i17 = this.f474057d;
        bw5.lp0 lp0Var = this.f474059f;
        zl3.g gVar = this.f474058e;
        switch (i17) {
            case 3:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi = gVar.f474070d;
                    if (musicCallbackApi != null) {
                        musicCallbackApi.onStartPlay(c17, new zl3.j(gVar));
                        break;
                    }
                }
                break;
            case 4:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi2 = gVar.f474070d;
                    if (musicCallbackApi2 != null) {
                        musicCallbackApi2.onEndedPlay(c17, new zl3.j(gVar));
                        break;
                    }
                }
                break;
            case 5:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi3 = gVar.f474070d;
                    if (musicCallbackApi3 != null) {
                        musicCallbackApi3.onPausePlay(c17, zl3.l.f474068d);
                        break;
                    }
                }
                break;
            case 6:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi4 = gVar.f474070d;
                    if (musicCallbackApi4 != null) {
                        musicCallbackApi4.onResumePlay(c17, new zl3.j(gVar));
                        break;
                    }
                }
                break;
            case 9:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi5 = gVar.f474070d;
                    if (musicCallbackApi5 != null) {
                        musicCallbackApi5.onSeeking(c17, new zl3.j(gVar));
                        break;
                    }
                }
                break;
            case 10:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi6 = gVar.f474070d;
                    if (musicCallbackApi6 != null) {
                        musicCallbackApi6.onSeeked(c17, new zl3.j(gVar));
                        break;
                    }
                }
                break;
            case 11:
                c17 = lp0Var != null ? gVar.c(lp0Var) : null;
                if (c17 == null) {
                    gVar.getClass();
                    break;
                } else {
                    com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi7 = gVar.f474070d;
                    if (musicCallbackApi7 != null) {
                        musicCallbackApi7.onStopPlay(c17, new zl3.j(gVar));
                        break;
                    }
                }
                break;
        }
        return jz5.f0.f302826a;
    }
}
