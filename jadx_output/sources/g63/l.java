package g63;

/* loaded from: classes8.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z53.i f269137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f269138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f269139c;

    public l(z53.i iVar, boolean z17, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f269137a = iVar;
        this.f269138b = z17;
        this.f269139c = adapterContextMenuInfo;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        c01.w9.h(this.f269137a.field_sessionId, new g63.k(this.f269138b, this.f269139c));
        return null;
    }
}
