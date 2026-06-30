package w1;

/* loaded from: classes14.dex */
public final class a extends android.view.ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final w1.b f441955a;

    public a(w1.b callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f441955a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f441955a.a(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.f441955a.b(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f441955a.getClass();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        d1.g gVar = this.f441955a.f441956a;
        if (rect != null) {
            rect.set((int) gVar.f225629a, (int) gVar.f225630b, (int) gVar.f225631c, (int) gVar.f225632d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.f441955a.getClass();
        return false;
    }
}
