package jf;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f299333e;

    public h(android.content.Context context, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f299332d = context;
        this.f299333e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f299332d, "renderer: auto", 0).show();
        this.f299333e.t3().l0();
    }
}
