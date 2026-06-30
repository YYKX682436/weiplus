package ed2;

/* loaded from: classes2.dex */
public final class b implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.i f251255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.c f251256e;

    public b(ed2.i iVar, ed2.c cVar) {
        this.f251255d = iVar;
        this.f251256e = cVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f251255d.f251269e = null;
        yz5.a aVar = this.f251256e.f251259c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
