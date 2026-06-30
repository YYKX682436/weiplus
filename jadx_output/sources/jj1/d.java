package jj1;

/* loaded from: classes15.dex */
public class d implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f299968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage f299969b;

    public d(com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage wxaShareMessagePage, boolean z17) {
        this.f299969b = wxaShareMessagePage;
        this.f299968a = z17;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.u3.h(new jj1.c(this, bitmap));
    }
}
