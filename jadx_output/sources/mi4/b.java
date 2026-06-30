package mi4;

/* loaded from: classes11.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingActivity f326778d;

    public b(com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingActivity textStatusGreetingActivity) {
        this.f326778d = textStatusGreetingActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f326778d.onBackPressed();
        return true;
    }
}
