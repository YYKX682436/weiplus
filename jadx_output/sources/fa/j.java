package fa;

/* loaded from: classes15.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa.u f260625d;

    public j(fa.u uVar) {
        this.f260625d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.google.android.material.internal.NavigationMenuItemView navigationMenuItemView = (com.google.android.material.internal.NavigationMenuItemView) view;
        fa.u uVar = this.f260625d;
        fa.l lVar = uVar.f260638h;
        if (lVar != null) {
            lVar.f260628f = true;
        }
        o.u itemData = navigationMenuItemView.getItemData();
        boolean q17 = uVar.f260636f.q(itemData, uVar, 0);
        if (itemData != null && itemData.isCheckable() && q17) {
            uVar.f260638h.y(itemData);
        }
        fa.l lVar2 = uVar.f260638h;
        if (lVar2 != null) {
            lVar2.f260628f = false;
        }
        uVar.c(false);
    }
}
