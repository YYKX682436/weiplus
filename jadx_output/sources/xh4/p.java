package xh4;

/* loaded from: classes.dex */
public final class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f454624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454626f;

    public p(android.app.Activity activity, yz5.a aVar, yz5.a aVar2) {
        this.f454624d = activity;
        this.f454625e = aVar;
        this.f454626f = aVar2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, null, null, new xh4.o(this.f454624d, this.f454625e, this.f454626f, null), 3, null);
        }
    }
}
