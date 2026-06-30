package vr1;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439577d;

    public l(vr1.o oVar) {
        this.f439577d = oVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        kotlin.jvm.internal.o.e(contextMenu, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenu");
        vr1.a[] aVarArr = vr1.a.f439543d;
        contextMenu.add(0, 1, 0, this.f439577d.getContext().getString(com.tencent.mm.R.string.ame));
    }
}
