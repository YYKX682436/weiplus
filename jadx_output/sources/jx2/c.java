package jx2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.k f302403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.h f302405f;

    public c(jx2.k kVar, android.content.Context context, jx2.h hVar) {
        this.f302403d = kVar;
        this.f302404e = context;
        this.f302405f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jx2.k kVar = this.f302403d;
        ((jx2.l) kVar).f302438c.c();
        java.lang.String string = ((jx2.l) kVar).f302436a.getString(com.tencent.mm.R.string.ck6);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.h(this.f302404e, string);
        yz5.a aVar = this.f302405f.f302430k;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
