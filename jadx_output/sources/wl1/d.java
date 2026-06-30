package wl1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl1.h f447036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wl1.h hVar, java.lang.String str) {
        super(0);
        this.f447036d = hVar;
        this.f447037e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f447036d.f447043c;
        java.lang.String str = this.f447037e;
        mMWebView.evaluateJavascript(str, new wl1.c(str));
        return jz5.f0.f302826a;
    }
}
