package uo2;

/* loaded from: classes2.dex */
public abstract class m0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: b, reason: collision with root package name */
    public static final uo2.l0 f429633b = new uo2.l0(null);

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f429634a;

    public void a(java.lang.Object obj) {
    }

    public abstract boolean b(long j17, int i17);

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (kotlin.jvm.internal.o.b(str, "getEditingAudioUrl")) {
            return b(j17, i17);
        }
        if (!kotlin.jvm.internal.o.b(str, "finishMusicOriginInfo")) {
            return false;
        }
        a(obj);
        return false;
    }
}
