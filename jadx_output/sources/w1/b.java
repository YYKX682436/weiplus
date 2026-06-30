package w1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public d1.g f441956a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f441957b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f441958c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f441959d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f441960e;

    public b(d1.g rect, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, int i17, kotlin.jvm.internal.i iVar) {
        rect = (i17 & 1) != 0 ? d1.g.f225628e : rect;
        aVar = (i17 & 2) != 0 ? null : aVar;
        aVar2 = (i17 & 4) != 0 ? null : aVar2;
        aVar3 = (i17 & 8) != 0 ? null : aVar3;
        aVar4 = (i17 & 16) != 0 ? null : aVar4;
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f441956a = rect;
        this.f441957b = aVar;
        this.f441958c = aVar2;
        this.f441959d = aVar3;
        this.f441960e = aVar4;
    }

    public final boolean a(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            yz5.a aVar = this.f441957b;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            yz5.a aVar2 = this.f441958c;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            yz5.a aVar3 = this.f441959d;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            yz5.a aVar4 = this.f441960e;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final boolean b(android.view.ActionMode actionMode, android.view.Menu menu) {
        if (menu == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if (actionMode == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if (this.f441957b != null) {
            menu.add(0, 0, 0, android.R.string.copy).setShowAsAction(1);
        }
        if (this.f441958c != null) {
            menu.add(0, 1, 1, android.R.string.paste).setShowAsAction(1);
        }
        if (this.f441959d != null) {
            menu.add(0, 2, 2, android.R.string.cut).setShowAsAction(1);
        }
        if (this.f441960e != null) {
            menu.add(0, 3, 3, android.R.string.selectAll).setShowAsAction(1);
        }
        return true;
    }
}
