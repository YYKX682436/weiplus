package rb5;

/* loaded from: classes11.dex */
public class f implements db5.x8 {

    /* renamed from: a, reason: collision with root package name */
    public long f393867a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rb5.l f393868b;

    public f(rb5.l lVar) {
        this.f393868b = lVar;
    }

    @Override // db5.x8
    public void a() {
        rb5.l lVar = this.f393868b;
        if (lVar.f393884h == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(lVar.f393880d, com.tencent.mm.ui.uc.f211078a);
            lVar.f393884h = loadAnimation;
            loadAnimation.setAnimationListener(new rb5.d(this));
        }
        lVar.f393885i.setOndispatchDraw(new rb5.e(this));
        android.view.View view = lVar.f393882f.getView();
        com.tencent.mm.ui.base.OnLayoutChangedLinearLayout onLayoutChangedLinearLayout = view != null ? (com.tencent.mm.ui.base.OnLayoutChangedLinearLayout) view.findViewById(com.tencent.mm.R.id.bkb) : null;
        java.util.Objects.requireNonNull(onLayoutChangedLinearLayout);
        onLayoutChangedLinearLayout.f197686d = null;
        com.tencent.mars.xlog.Log.i("ChattingCompat", "klem CHATTING ONLAYOUT ");
    }
}
