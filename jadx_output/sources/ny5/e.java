package ny5;

/* loaded from: classes10.dex */
public final class e implements ny5.a {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f341480a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tme.karaoke.lib_singreverb.ReverbNativeBridge f341481b = new com.tme.karaoke.lib_singreverb.ReverbNativeBridge();

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f341482c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f341483d;

    public e(yz5.l lVar) {
        this.f341480a = lVar;
    }

    public boolean a(ny5.c type) {
        boolean z17;
        kotlin.jvm.internal.o.g(type, "type");
        com.tme.karaoke.lib_singreverb.ReverbNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singreverb.ReverbNativeBridge.loadRet;
        return z17 && this.f341481b.setReverbId(type.f341477d);
    }
}
