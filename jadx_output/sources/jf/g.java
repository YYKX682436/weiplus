package jf;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f299331e;

    public g(android.content.Context context, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f299330d = context;
        this.f299331e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f299330d, "renderer: auto", 0).show();
        this.f299331e.t3().l0();
    }
}
