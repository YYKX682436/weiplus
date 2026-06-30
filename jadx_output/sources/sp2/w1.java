package sp2;

/* loaded from: classes2.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sp2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411255e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sp2.w1 w1Var = new sp2.w1(this.f411255e, continuation);
        w1Var.f411254d = obj;
        return w1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sp2.w1 w1Var = (sp2.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (kotlinx.coroutines.z0.h((kotlinx.coroutines.y0) this.f411254d)) {
            sp2.o2 o2Var = this.f411255e;
            com.tencent.mm.ui.MMActivity activity = o2Var.f411121a;
            r45.lp1 extInfo = o2Var.U;
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(extInfo, "extInfo");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveEntranceEducationDialogHelper", "checkShowEducationDialog");
            android.view.View inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.eit, (android.view.ViewGroup) null);
            float f17 = activity.getResources().getDisplayMetrics().density * 495.0f;
            android.view.Window window = activity.getWindow();
            android.view.View decorView = window != null ? window.getDecorView() : null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                gx2.a aVar2 = new gx2.a();
                aVar2.f277337c = f17;
                kotlin.jvm.internal.o.d(inflate);
                aVar2.f277339e = new hx2.c(inflate);
                aVar2.f277338d = new hx2.g(activity, 0, 0, 0, false, false, 62, null);
                aVar2.f277340f = new hx2.b(activity, true);
                gx2.q b17 = aVar2.b(viewGroup);
                com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate.findViewById(com.tencent.mm.R.id.q4q);
                java.lang.String string = com.tencent.mm.ui.bk.C() ? extInfo.getString(1) : extInfo.getString(0);
                if (string == null || string.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LiveEntranceEducationDialogHelper", "Education dialog image url is null or empty, loading failed");
                } else {
                    wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e));
                    kotlin.jvm.internal.o.d(mMRoundCornerImageView);
                    ((wo0.b) a17).c(mMRoundCornerImageView);
                }
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_x);
                if (textView != null) {
                    textView.setText(activity.getString(com.tencent.mm.R.string.f490454vi));
                    textView.setOnClickListener(new jk2.b(b17));
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b5w);
                if (textView2 != null) {
                    textView2.setText(activity.getString(com.tencent.mm.R.string.od6));
                    textView2.setOnClickListener(new jk2.c(activity, b17));
                }
                b17.setOnDrawerClose(new jk2.d(null));
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(b17, false, 1, null);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.f328090u3, new java.util.HashMap(), null, "135", null, null, false, 116, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
