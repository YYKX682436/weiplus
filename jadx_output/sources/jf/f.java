package jf;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f299329e;

    public f(android.content.Context context, com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f299328d = context;
        this.f299329e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f299328d, "renderer: skyline", 0).show();
        this.f299329e.t3().l0();
    }
}
