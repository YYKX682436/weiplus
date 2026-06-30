package kf3;

/* loaded from: classes5.dex */
public class u implements com.tencent.mm.pluginsdk.ui.chat.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307436a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter f307437b;

    /* renamed from: c, reason: collision with root package name */
    public final kf3.t f307438c;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Vibrator f307440e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f307442g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f307443h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f307444i;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.modelbase.e1 f307446k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.modelbase.f1 f307447l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f307448m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f307449n;

    /* renamed from: d, reason: collision with root package name */
    public long f307439d = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f307441f = null;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f307445j = new com.tencent.mm.sdk.platformtools.b4(new kf3.j(this), true);

    public u(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str, java.util.List list, boolean z17) {
        kf3.k kVar = new kf3.k(this);
        this.f307446k = kVar;
        kf3.l lVar = new kf3.l(this);
        this.f307447l = lVar;
        this.f307448m = false;
        this.f307449n = new com.tencent.mm.sdk.platformtools.b4(new kf3.m(this), true);
        this.f307436a = massSendMsgUI;
        this.f307437b = chatFooter;
        this.f307442g = str;
        this.f307443h = list;
        this.f307444i = z17;
        kf3.t tVar = new kf3.t(this, massSendMsgUI);
        this.f307438c = tVar;
        tVar.f420086s = kVar;
        tVar.f420085r = lVar;
        this.f307440e = (android.os.Vibrator) massSendMsgUI.getSystemService("vibrator");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public java.lang.String a() {
        kf3.t tVar = this.f307438c;
        return tVar != null ? tVar.f307430y : "";
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void b(android.view.View view) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public long c() {
        kf3.t tVar = this.f307438c;
        if (tVar != null) {
            return tVar.c();
        }
        return 0L;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean d(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        this.f307437b.setLastText(str);
        this.f307436a.c7(new kf3.p(this, str));
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean e() {
        this.f307445j.d();
        this.f307449n.d();
        this.f307439d = -1L;
        this.f307437b.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Cancel);
        kf3.t tVar = this.f307438c;
        tVar.stop();
        w21.x0.e(null, tVar.f307430y);
        ((com.tencent.mm.booter.b) c01.d9.c()).b();
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean f(boolean z17) {
        this.f307445j.d();
        this.f307449n.d();
        this.f307439d = -1L;
        boolean stop = this.f307438c.stop();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f307437b;
        if (stop) {
            com.tencent.mm.plugin.transvoice.model.e.I.b(0);
            this.f307436a.c7(new kf3.o(this));
            chatFooter.d1(com.tencent.mm.pluginsdk.ui.chat.f5.SendVoice);
        } else {
            chatFooter.n1();
        }
        ((com.tencent.mm.booter.b) c01.d9.c()).b();
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean g() {
        this.f307445j.d();
        this.f307449n.d();
        this.f307439d = -1L;
        this.f307438c.stop();
        this.f307437b.d1(com.tencent.mm.pluginsdk.ui.chat.f5.StopRecord);
        ((com.tencent.mm.booter.b) c01.d9.c()).b();
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void h(java.lang.String str) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void i(android.view.View view, android.view.MotionEvent motionEvent) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean j() {
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean k(java.lang.String str) {
        return w21.x0.e(null, str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void l(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void m() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public r15.b n() {
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void o() {
        this.f307437b.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Cancel);
        kf3.t tVar = this.f307438c;
        tVar.stop();
        w21.x0.e(null, tVar.f307430y);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void onPause() {
        this.f307445j.d();
        this.f307449n.d();
        this.f307439d = -1L;
        kf3.t tVar = this.f307438c;
        if (!(ba5.a.f18702b && kotlin.jvm.internal.o.b(ba5.a.f18701a, tVar.f307430y))) {
            if (!(ba5.a.f18704d && kotlin.jvm.internal.o.b(ba5.a.f18703c, tVar.f307430y))) {
                tVar.stop();
            }
        }
        ((com.tencent.mm.booter.b) c01.d9.c()).b();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void onResume() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean p(java.lang.String str, int i17, com.tencent.mm.storage.f9 f9Var) {
        this.f307436a.c7(new kf3.o(this));
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean q(boolean z17) {
        boolean E = c01.d9.b().E();
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307436a;
        if (!E) {
            db5.t7.k(massSendMsgUI, null);
            return false;
        }
        iq.b.s(massSendMsgUI);
        this.f307440e.vibrate(50L);
        com.tencent.mm.plugin.transvoice.model.e eVar = com.tencent.mm.plugin.transvoice.model.e.I;
        com.tencent.mm.plugin.transvoice.model.e.I.f175377a = true;
        this.f307445j.c(100L, 100L);
        this.f307448m = false;
        this.f307449n.c(200L, 200L);
        int i17 = massSendMsgUI.getResources().getDisplayMetrics().heightPixels;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f307437b;
        chatFooter.w1(i17 - chatFooter.getHeight());
        kf3.t tVar = this.f307438c;
        tVar.g("_USER_FOR_THROWBOTTLE_", tVar.f420075h);
        tVar.f420085r = this.f307447l;
        tVar.f420086s = this.f307446k;
        ((com.tencent.mm.booter.b) c01.d9.c()).a();
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void r() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void release() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void s(android.view.View view) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void t() {
    }
}
