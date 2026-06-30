package m31;

/* loaded from: classes9.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI f323159d;

    public k(com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI) {
        this.f323159d = bizSubscribeMsgManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f323159d.finish();
        return false;
    }
}
