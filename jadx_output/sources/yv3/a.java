package yv3;

/* loaded from: classes5.dex */
public final class a extends sr.e {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f466207d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f466208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, android.view.ViewGroup parent, boolean z17) {
        super(context, parent, z17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f466207d = z17;
        this.f411392c.setBackgroundColor(i65.a.d(context, com.tencent.mm.R.color.f478915ko));
    }

    @Override // sr.e
    public void a() {
        this.f411392c.animate().translationY(r0.getLayoutParams().height).withEndAction(new sr.d(this));
        yz5.l lVar = this.f466208e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }

    public void b(boolean z17) {
        if (!z17) {
            a();
            return;
        }
        int c17 = com.tencent.mm.ui.bl.c(this.f411390a);
        com.tencent.mm.api.SmileyPanel smileyPanel = this.f411392c;
        smileyPanel.setPadding(0, 0, 0, c17);
        this.f411391b.setVisibility(0);
        smileyPanel.setVisibility(0);
        smileyPanel.animate().translationY(0.0f).start();
        yz5.l lVar = this.f466208e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
