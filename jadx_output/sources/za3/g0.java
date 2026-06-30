package za3;

/* loaded from: classes15.dex */
public class g0 implements za3.d0, za3.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f470912a;

    /* renamed from: b, reason: collision with root package name */
    public za3.e0 f470913b;

    /* renamed from: c, reason: collision with root package name */
    public za3.i0 f470914c;

    /* renamed from: g, reason: collision with root package name */
    public final ab3.h f470918g;

    /* renamed from: h, reason: collision with root package name */
    public za3.f0 f470919h;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470916e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f470917f = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f470915d = new java.util.ArrayList();

    public g0(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, java.lang.String str, ab3.h hVar) {
        this.f470912a = view;
        this.f470918g = hVar;
        za3.e0 e0Var = new za3.e0(context, view, str);
        this.f470913b = e0Var;
        e0Var.f470907f = this;
        this.f470914c = new za3.i0(context, viewGroup, str);
        java.util.Iterator it = va3.j0.Ui().b(str).iterator();
        while (it.hasNext()) {
            this.f470915d.add((java.lang.String) it.next());
        }
    }

    public void a(java.lang.String str) {
        com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint;
        com.tencent.mm.plugin.location_soso.ViewManager viewManager;
        if (this.f470917f) {
            return;
        }
        this.f470916e = str;
        za3.e0 e0Var = this.f470913b;
        e0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareHeaderAvatarViewMgr", "onCurMemberChange, username=%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e0Var.c();
        } else {
            e0Var.c();
            e0Var.a(str);
        }
        za3.i0 i0Var = this.f470914c;
        java.lang.String str2 = this.f470916e;
        i0Var.getClass();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mm.sdk.platformtools.n3 n3Var = i0Var.f470941l;
        if (K0) {
            i0Var.f470939j = false;
            n3Var.removeMessages(10);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 10;
            n3Var.sendMessage(obtain);
            i0Var.b(true);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c01.a2.e(str2))) {
                i0Var.f470939j = true;
                n3Var.removeMessages(5);
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.what = 5;
                obtain2.obj = str2;
                n3Var.sendMessageAtFrontOfQueue(obtain2);
            }
            i0Var.b(true);
        }
        java.lang.Object viewByItag = this.f470918g.getViewByItag(this.f470916e);
        if (!(viewByItag instanceof com.tencent.mm.plugin.location.ui.impl.TrackPoint) || (viewManager = (trackPoint = (com.tencent.mm.plugin.location.ui.impl.TrackPoint) viewByItag).f144721p) == null) {
            return;
        }
        viewManager.setMarker2Top(trackPoint.f144713e);
        viewManager.setMarker2Top(trackPoint.f144714f);
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareHeaderMgr", "onMyselfFinishTalking");
        za3.e0 e0Var = this.f470913b;
        java.lang.String r17 = c01.z1.r();
        if (e0Var.f470904c.c(r17)) {
            e0Var.f470904c.a(r17).a();
            e0Var.f470904c.notifyDataSetChanged();
            e0Var.f470902a.invalidate();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f470914c.f470941l;
        n3Var.removeMessages(9);
        n3Var.removeMessages(10);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 9;
        n3Var.sendMessage(obtain);
        this.f470916e = "";
        this.f470917f = false;
    }
}
