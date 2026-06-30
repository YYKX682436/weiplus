package tr2;

/* loaded from: classes5.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr2.l f421382a;

    public g(tr2.l lVar) {
        this.f421382a = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        tr2.l lVar = this.f421382a;
        android.view.ViewParent parent = lVar.f421400l.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(lVar.f421400l);
        }
    }
}
