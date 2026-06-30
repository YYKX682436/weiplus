package yt3;

/* loaded from: classes5.dex */
public final class i extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f465486f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f465487g;

    /* renamed from: h, reason: collision with root package name */
    public hk0.u0 f465488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup parent, android.widget.ImageView view, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465486f = view;
        this.f465487g = jz5.h.b(new yt3.f(parent));
        view.setOnClickListener(this);
        view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_sticker, -1));
    }

    public final yv3.a A() {
        return (yv3.a) ((jz5.n) this.f465487g).getValue();
    }

    public final void B() {
        if (!(A().f466208e != null)) {
            A().f466208e = new yt3.g(this);
            yv3.a A = A();
            yt3.h hVar = new yt3.h(this);
            A.getClass();
            qk.v9 d17 = qk.w9.d();
            d17.f364351a = hVar;
            A.f411392c.setCallback(d17);
            dw3.f0 f0Var = dw3.f0.f244206a;
            yv3.a panel = A();
            kotlin.jvm.internal.o.g(panel, "panel");
            com.tencent.mars.xlog.Log.i(dw3.f0.f244208c, "add panel  " + panel);
            dw3.f0.f244207b.add(panel);
        }
        A().b(true);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (!(A().f411391b.getVisibility() == 0)) {
            return false;
        }
        A().b(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddEmojiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        B();
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_CLICK_EMOJI_COUNT_INT", 0, 2, null);
        iVar.b(4);
        iVar.d(6);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddEmojiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void release() {
        A().f411392c.a();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465486f.setVisibility(i17);
    }

    public final void z() {
        yv3.a A = A();
        com.tencent.mm.api.SmileyPanel smileyPanel = A.f411392c;
        smileyPanel.setTalkerName("");
        smileyPanel.setShowSearch(true);
        smileyPanel.setHideSearchJumpMoreEntrance(true);
        smileyPanel.setSearchDialogForceDarkMode(A.f466207d);
    }
}
