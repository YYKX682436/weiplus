package nl5;

/* loaded from: classes13.dex */
public final class p0 implements android.view.ActionMode.Callback {
    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(item, "item");
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.ui.yk.a("SelectableEditTextHelper", "mDisableCallback", new java.lang.Object[0]);
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode mode, android.view.Menu menu) {
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(menu, "menu");
        return false;
    }
}
