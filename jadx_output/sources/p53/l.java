package p53;

/* loaded from: classes8.dex */
public class l extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameTabWidget f352065a;

    public l(com.tencent.mm.plugin.game.ui.tab.GameTabWidget gameTabWidget) {
        this.f352065a = gameTabWidget;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget.a(this.f352065a);
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget.a(this.f352065a);
    }
}
