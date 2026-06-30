package tw;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tw.i f422393d;

    public a(tw.i iVar) {
        this.f422393d = iVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f422393d.getActivity().finish();
        return true;
    }
}
