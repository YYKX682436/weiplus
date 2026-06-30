package wn4;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn4.f f447529d;

    public a(wn4.f fVar) {
        this.f447529d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k3p), 0).show();
        wn4.x.b();
        java.lang.Integer packageType = this.f447529d.f447538d.f142410f;
        kotlin.jvm.internal.o.f(packageType, "packageType");
        w73.f.i(10, packageType.intValue(), 101);
    }
}
