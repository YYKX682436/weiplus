package za3;

/* loaded from: classes15.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470895a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f470896b = false;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f470897c;

    /* renamed from: d, reason: collision with root package name */
    public final za3.b0 f470898d;

    public c0(za3.e0 e0Var, java.lang.String str) {
        this.f470895a = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareHeaderAvatarViewMgr", "init HeaderAvatar, username can't not be null");
            return;
        }
        za3.b0 b0Var = new za3.b0(this);
        this.f470898d = b0Var;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((android.view.LayoutInflater) e0Var.f470903b.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.bsq, (android.view.ViewGroup) null);
        b0Var.f470890a = relativeLayout;
        b0Var.f470891b = (android.widget.ImageView) relativeLayout.findViewById(com.tencent.mm.R.id.a9m);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(b0Var.f470891b, str);
        b0Var.f470890a.setTag(str);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.f470897c = layoutParams;
        android.content.Context context = e0Var.f470903b;
        layoutParams.leftMargin = com.tencent.mm.sdk.platformtools.j.d(context, 5.0f);
        this.f470897c.rightMargin = com.tencent.mm.sdk.platformtools.j.d(context, 5.0f);
        this.f470897c.gravity = 17;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareHeaderAvatarViewMgr", "exitTalking, username=%s", this.f470895a);
        za3.b0 b0Var = this.f470898d;
        b0Var.f470890a.setBackgroundResource(com.tencent.mm.R.drawable.bjg);
        b0Var.f470890a.invalidate();
        this.f470896b = false;
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareHeaderAvatarViewMgr", "setTalking, username=%s", this.f470895a);
        za3.b0 b0Var = this.f470898d;
        b0Var.f470890a.setBackgroundResource(com.tencent.mm.R.drawable.bjh);
        b0Var.f470890a.invalidate();
        this.f470896b = true;
    }
}
