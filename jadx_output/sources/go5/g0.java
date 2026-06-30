package go5;

/* loaded from: classes14.dex */
public final class g0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public int f274132a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final cv.u0 f274133b = new cv.u0(this, 4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f274134c;

    public g0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        new tq4.b(context);
        this.f274134c = true;
    }

    public final void a() {
        this.f274134c = false;
        i95.m c17 = i95.n0.c(cv.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cv.w0.f9((cv.w0) c17, 3, null, 2, null);
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        cv.v0 it = (cv.v0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "accept: AudioRouteInfo:" + it + " isRingMode:" + this.f274134c);
        int i17 = it.f222518c;
        int i18 = it.f222516a;
        if (i17 == 1) {
            er4.c cVar = new er4.c();
            cVar.f256063g = it.f222519d;
            boolean[] zArr = cVar.f256064h;
            zArr[4] = true;
            cVar.f256061e = it.a();
            zArr[2] = true;
            cVar.f256060d = er4.d.a(i18);
            zArr[1] = true;
            cVar.f256062f = true;
            zArr[3] = true;
            this.f274132a = i18;
            if (i18 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "AUDIO_DEVICE_BLUETOOTH CONNECTED");
                ((jp5.o) i95.n0.c(jp5.o.class)).Hd();
            }
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.s(cVar, new go5.d0(this, it));
            return;
        }
        if (i17 == 2) {
            er4.c cVar2 = new er4.c();
            cVar2.f256063g = it.f222519d;
            boolean[] zArr2 = cVar2.f256064h;
            zArr2[4] = true;
            cVar2.f256061e = it.a();
            zArr2[2] = true;
            cVar2.f256060d = er4.d.a(i18);
            zArr2[1] = true;
            cVar2.f256062f = false;
            zArr2[3] = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "AUDIO_DEVICE_DISCONNECTED");
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.t(cVar2, go5.f0.f274130a);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 && i18 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "AUDIO_DEVICE_BLUETOOTH ACTIVE");
                if (this.f274134c) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).Hd();
                    return;
                }
                return;
            }
            return;
        }
        er4.c cVar3 = new er4.c();
        cVar3.f256063g = it.f222519d;
        boolean[] zArr3 = cVar3.f256064h;
        zArr3[4] = true;
        cVar3.f256061e = it.a();
        zArr3[2] = true;
        cVar3.f256060d = er4.d.a(i18);
        zArr3[1] = true;
        cVar3.f256062f = false;
        zArr3[3] = true;
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.r(cVar3, go5.e0.f274129a);
    }
}
