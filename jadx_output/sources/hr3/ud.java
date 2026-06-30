package hr3;

/* loaded from: classes9.dex */
public final class ud implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiPictureUI f284087d;

    public ud(com.tencent.mm.plugin.profile.ui.SayHiPictureUI sayHiPictureUI) {
        this.f284087d = sayHiPictureUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUI$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.profile.ui.SayHiPictureUI.f153807h;
        com.tencent.mm.plugin.profile.ui.SayHiPictureUI sayHiPictureUI = this.f284087d;
        java.lang.String X6 = sayHiPictureUI.X6();
        kotlin.jvm.internal.o.f(X6, "access$getTalkerUserName(...)");
        if (r26.n0.N(X6)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SayHiPictureUI", "talkerUserName isBlank");
            sayHiPictureUI.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUI$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String obj = sayHiPictureUI.U6().getText().toString();
        if (!r26.n0.N(obj)) {
            w11.r1 b17 = w11.s1.b(sayHiPictureUI.X6(), null, 2, null);
            b17.e(obj);
            b17.g(sayHiPictureUI.X6());
            w11.r1.d(b17, null, 1, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUI", "send text");
        }
        java.lang.String str = ((hr3.pf) sayHiPictureUI.component(hr3.pf.class)).f283898q;
        if (str != null) {
            if (r26.n0.N(str) || !com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SayHiPictureUI", "localPath isBlank or not exists");
            } else {
                k70.i0 i0Var = new k70.i0();
                i0Var.f304642a = 6;
                java.lang.String r17 = c01.z1.r();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (r17 == null) {
                    r17 = "";
                }
                java.lang.String X62 = sayHiPictureUI.X6();
                kotlin.jvm.internal.o.f(X62, "access$getTalkerUserName(...)");
                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(new r70.g(str, 0, r17, X62, i0Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUI", "send image");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUI", "send say hi finish");
        sayHiPictureUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUI$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
