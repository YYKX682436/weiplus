package jf;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f299327e;

    public e(android.content.Context context, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f299326d = context;
        this.f299327e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f299326d, "renderer: webview", 0).show();
        this.f299327e.t3().l0();
    }
}
