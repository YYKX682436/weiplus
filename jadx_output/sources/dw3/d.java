package dw3;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dw3.e f244189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dw3.e eVar) {
        super(0);
        this.f244189d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        this.f244189d.getClass();
        if (gm0.j1.b().n() && gm0.j1.b().n()) {
            str = gm0.j1.b().j() + "#editor_audio_mmkv";
        } else {
            str = "editor_audio_mmkv";
        }
        return com.tencent.mm.sdk.platformtools.o4.M(str);
    }
}
