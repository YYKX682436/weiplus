package o;

/* loaded from: classes15.dex */
public class b extends androidx.appcompat.widget.f1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView f341688p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f341688p = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.f1
    public o.k0 b() {
        androidx.appcompat.widget.i iVar;
        o.c cVar = this.f341688p.f9269o;
        if (cVar == null || (iVar = ((androidx.appcompat.widget.j) cVar).f9613a.B) == null) {
            return null;
        }
        return iVar.a();
    }

    @Override // androidx.appcompat.widget.f1
    public boolean c() {
        o.k0 b17;
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = this.f341688p;
        o.q qVar = actionMenuItemView.f9267m;
        return qVar != null && qVar.c(actionMenuItemView.f9264g) && (b17 = b()) != null && b17.isShowing();
    }
}
