package jy0;

/* loaded from: classes.dex */
public final class a implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f302480d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f302481e;

    public a(java.lang.Object obj, yz5.l action) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(action, "action");
        this.f302480d = action;
        this.f302481e = new java.lang.ref.WeakReference(obj);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f302480d.invoke(this.f302481e.get());
    }
}
