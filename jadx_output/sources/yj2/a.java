package yj2;

/* loaded from: classes10.dex */
public final class a extends yj2.e {

    /* renamed from: q, reason: collision with root package name */
    public lj2.p f462643q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, android.content.Context context, int i18, java.lang.String coverUrl) {
        super(context, i18, coverUrl, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
    }

    @Override // yj2.e
    public void c(boolean z17) {
        super.c(z17);
        if (getScene() == 0) {
            android.widget.RelativeLayout relativeLayout = getViewBinding().f262044b.f262109a;
            kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
            this.f462643q = new lj2.p(relativeLayout);
            android.widget.TextView pkNormalNickName = getViewBinding().f262050h;
            kotlin.jvm.internal.o.f(pkNormalNickName, "pkNormalNickName");
            com.tencent.mm.ui.fk.a(pkNormalNickName);
            android.widget.ImageView pkNormalHead = getViewBinding().f262049g;
            kotlin.jvm.internal.o.f(pkNormalHead, "pkNormalHead");
            if (getMicType() != 4) {
                pkNormalNickName.setVisibility(8);
                pkNormalHead.setVisibility(8);
                return;
            }
            km2.q bindLinkMicUser = getBindLinkMicUser();
            if (bindLinkMicUser != null) {
                g(bindLinkMicUser, pkNormalHead);
                pkNormalNickName.setText(bindLinkMicUser.f309173d);
            }
            pkNormalNickName.setVisibility(0);
            pkNormalHead.setVisibility(0);
        }
    }

    @Override // yj2.e
    public void d() {
        super.d();
        pm2.a aVar = this.f462659p;
        pm2.a aVar2 = pm2.a.f356855h;
        if ((aVar != aVar2) || getScene() != 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getViewBinding().f262047e.getLayoutParams();
        layoutParams.width = this.f462659p == aVar2 ? i65.a.b(getContext(), 80) : 0;
        layoutParams.height = this.f462659p == aVar2 ? i65.a.b(getContext(), 80) : 0;
    }

    @Override // yj2.e, xh2.f
    public ai2.a getBattleResultWidgetCallback() {
        return this.f462643q;
    }
}
