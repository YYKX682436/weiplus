package mm1;

@j95.b(dependencies = {e70.q.class})
/* loaded from: classes11.dex */
public final class f0 extends i95.w implements rv.k2 {

    /* renamed from: d, reason: collision with root package name */
    public mm1.b0 f328660d;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
    
        if (kotlin.jvm.internal.o.b(r2.d().getListenId(), r5.d().getListenId()) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0139, code lost:
    
        if (kotlin.jvm.internal.o.b(r2.b(), r5.b()) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void wi(mm1.f0 r9, b66.a r10, il4.e r11, int r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm1.f0.wi(mm1.f0, b66.a, il4.e, int):void");
    }

    public qk.ia Ai() {
        return qk.ia.f364169e.a(tm1.h.f420470a.b().i());
    }

    public rv.j2 Bi() {
        if (this.f328660d == null) {
            this.f328660d = new mm1.b0();
        }
        mm1.b0 b0Var = this.f328660d;
        kotlin.jvm.internal.o.d(b0Var);
        return b0Var;
    }

    public boolean Di() {
        return Ai() == qk.ia.f364171g || Ai() == qk.ia.f364172h;
    }

    public final boolean Ni(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("audio");
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        if (audioManager == null) {
            return false;
        }
        int ringerMode = audioManager.getRingerMode();
        if (ringerMode == 2) {
            if (audioManager.getStreamVolume(3) != 0) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "isMuteOrVolumeZero: STREAM_MUSIC volume is 0");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "isMuteOrVolumeZero: ringerMode=" + ringerMode + " (SILENT=0, VIBRATE=1, NORMAL=2)");
        return true;
    }

    public boolean Ri() {
        return Ai() == qk.ia.f364173i;
    }

    public boolean Ui(java.lang.String str) {
        b66.n b17 = tm1.h.f420470a.b();
        if (!Ri()) {
            return false;
        }
        bw5.lp0 g17 = ((b66.q) b17).g();
        return kotlin.jvm.internal.o.b(g17 != null ? g17.b() : null, str);
    }

    public boolean Vi(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        b66.n b17 = tm1.h.f420470a.b();
        if (!Di()) {
            return false;
        }
        bw5.lp0 g17 = ((b66.q) b17).g();
        return kotlin.jvm.internal.o.b(g17 != null ? g17.b() : null, id6);
    }

    public void Zi(bw5.lp0 item, il4.e ext) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ext, "ext");
        if (ext.f292106c == 0) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizAudioServicesImpl", "play with fromScene 0", new java.lang.Object[0]);
        }
        pm0.v.X(new mm1.c0(this, item, ext));
    }

    public void aj(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        kotlin.jvm.internal.o.g(ext, "ext");
        if (lp0Var != null && list == null && o50Var == null && pp0Var == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizAudioServicesImpl", "playWithCategory with only tingItem, fallback to playItem", new java.lang.Object[0]);
            Zi(lp0Var, ext);
            return;
        }
        if (ext.f292106c == 0) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizAudioServicesImpl", "playWithCategory with fromScene 0", new java.lang.Object[0]);
        }
        if (lp0Var == null && list == null && o50Var == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizAudioServicesImpl", "playWithCategory with invalid params", new java.lang.Object[0]);
        } else {
            pm0.v.X(new mm1.d0(list, lp0Var, o50Var, pp0Var, ext, this));
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioServicesImpl", "TingServicesImpl init");
        synchronized (mm1.f0.class) {
            com.tencent.wechat.iam.biz.p.f217765b.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioServicesImpl", "setInitialized");
        }
    }
}
