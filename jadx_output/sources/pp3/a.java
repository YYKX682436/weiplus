package pp3;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f357467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView f357468e;

    public a(com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView avatarPatTipImageView, int[] iArr) {
        this.f357468e = avatarPatTipImageView;
        this.f357467d = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView avatarPatTipImageView = this.f357468e;
        android.view.View contentView = avatarPatTipImageView.f152895i.getContentView();
        contentView.getLocationOnScreen(iArr);
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.o_p);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = ((this.f357467d[0] + (avatarPatTipImageView.getWidth() / 2)) - iArr[0]) - (findViewById.getWidth() / 2);
        findViewById.setLayoutParams(layoutParams);
    }
}
