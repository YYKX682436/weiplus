package yr3;

/* loaded from: classes11.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.k6 f465071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.c1 f465072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f465073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f465074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f465075h;

    public x0(qk.k6 k6Var, yr3.c1 c1Var, r45.o5 o5Var, bw5.v70 v70Var, boolean z17, bw5.lp0 lp0Var) {
        this.f465071d = k6Var;
        this.f465072e = c1Var;
        this.f465073f = v70Var;
        this.f465074g = z17;
        this.f465075h = lp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.jk.f209011a.a();
        yr3.c1 c1Var = this.f465072e;
        qk.k6 audioService = this.f465071d;
        if (audioService != null) {
            kotlin.jvm.internal.o.f(audioService, "$audioService");
            bw5.lp0 tingItem = this.f465075h;
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            bw5.v70 v70Var = this.f465073f;
            if (this.f465074g) {
                c1Var.getClass();
                qk.k6.Xg(audioService, null, v70Var.getListenId(), null, null, 13, null);
            } else if (qk.k6.hi(audioService, c1Var.f464756u, null, v70Var.getListenId(), null, null, 26, null)) {
                qk.k6.Hb(audioService, null, v70Var.getListenId(), null, null, 13, null);
            } else {
                java.lang.String str = c1Var.f464756u;
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                ((rk4.a) audioService).Ui(str, tingItem, new il4.e(null, 0, 1212, true, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_Profile, false, 25165811, null));
            }
        } else {
            com.tencent.mars.xlog.Log.w(c1Var.f464744f, "audioService is null, cannot play audio");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
