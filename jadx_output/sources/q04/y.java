package q04;

@j95.b
/* loaded from: classes12.dex */
public final class y extends i95.w implements xs.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f359410d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final u04.f f359411e = new u04.f(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f359412f = new q04.u(this);

    /* renamed from: g, reason: collision with root package name */
    public final q04.w f359413g = new q04.w(this);

    public final void Ai() {
        java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("recovery_storage").u("recovery_data_id", "");
        int o17 = com.tencent.mm.sdk.platformtools.o4.M("recovery_storage").o("recovery_data_type", -1);
        kotlin.jvm.internal.o.d(u17);
        if ((u17.length() == 0) || o17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "checkIsNeedRecovery id or type is empty");
        } else {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ai(o17, u17, r45.x60.class, q04.v.f359406a);
        }
    }

    public boolean Bi(java.lang.String id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        java.util.HashMap hashMap = this.f359410d;
        hashMap.remove(id6);
        if (hashMap.isEmpty()) {
            u04.f fVar = this.f359411e;
            fVar.f423481b.removeCallbacks(fVar.f423482c);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "unregisterRecoveryObserver, id: " + id6 + ", type: " + i17);
        Ai();
        return true;
    }

    public boolean Di(java.lang.String id6, int i17, r45.x60 protoBuf) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(protoBuf, "protoBuf");
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(i17, id6, protoBuf, new q04.x(id6, i17));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q04.y.onAccountInitialized(android.content.Context):void");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "onAccountReleased");
        if (u04.d.f423476b) {
            this.f359412f.dead();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "onCreate");
    }

    public boolean wi(java.lang.String id6, int i17, o04.p recoveryDataCallback) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(recoveryDataCallback, "recoveryDataCallback");
        u04.d dVar = u04.d.f423475a;
        if (!u04.d.f423476b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "registerRecoveryObserver, not enable recovery");
            return false;
        }
        java.util.HashMap hashMap = this.f359410d;
        if (hashMap.containsKey(id6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "registerRecoveryObserver, id already exist");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "registerRecoveryObserver, id: " + id6 + ", type: " + i17);
        hashMap.put(id6, new q04.t(id6, i17, recoveryDataCallback));
        this.f359413g.a();
        this.f359411e.a();
        return true;
    }
}
