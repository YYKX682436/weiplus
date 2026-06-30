package vv4;

/* loaded from: classes11.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(0);
        this.f440470d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f440470d.getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        java.lang.Object a17 = ok5.d.a(intent, "ui_status");
        if (kotlin.jvm.internal.m0.f(a17, 2)) {
            return (yz5.p) a17;
        }
        return null;
    }
}
