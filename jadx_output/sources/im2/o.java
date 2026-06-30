package im2;

/* loaded from: classes.dex */
public final class o implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f292460d;

    public o(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f292460d = mMActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f292460d.finish();
        return true;
    }
}
