package z63;

/* loaded from: classes14.dex */
public class m implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public y9.i f470424d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f470425e;

    /* renamed from: f, reason: collision with root package name */
    public int f470426f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f470427g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomDatePicker f470428h;

    /* renamed from: i, reason: collision with root package name */
    public z63.l f470429i;

    public m(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bis, null);
        this.f470425e = inflate;
        this.f470428h = (com.tencent.mm.ui.widget.picker.CustomDatePicker) inflate.findViewById(com.tencent.mm.R.id.cqo);
        ((android.widget.Button) this.f470425e.findViewById(com.tencent.mm.R.id.khs)).setOnClickListener(new z63.h(this));
        ((android.widget.Button) this.f470425e.findViewById(com.tencent.mm.R.id.b5i)).setOnClickListener(new z63.i(this));
        y9.i iVar = new y9.i(context, 0);
        this.f470424d = iVar;
        iVar.setContentView(this.f470425e);
        this.f470424d.setOnCancelListener(new z63.j(this));
        this.f470424d.setOnDismissListener(new z63.k(this));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f470425e.getLayoutParams();
        layoutParams.height = i65.a.b(context, qf1.f.CTRL_INDEX);
        this.f470425e.setLayoutParams(layoutParams);
        this.f470426f = i65.a.b(context, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f470425e.getParent());
        this.f470427g = A;
        if (A != null) {
            A.C(this.f470426f);
            this.f470427g.f44443p = false;
        }
    }

    public static void a(z63.m mVar, boolean z17, int i17, int i18, int i19) {
        z63.l lVar = mVar.f470429i;
        if (lVar != null) {
            z63.o0 o0Var = (z63.o0) lVar;
            if (z17) {
                java.util.Locale locale = java.util.Locale.US;
                com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "group solitaire time :%s", java.lang.String.format(locale, "%04d-%02d-%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                z63.p0 p0Var = o0Var.f470435a;
                com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = p0Var.f470437d;
                java.lang.String format = java.lang.String.format(locale, "%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                int i27 = com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.U;
                groupSolitatireEditUI.U6(format);
                p0Var.f470437d.Y6(1);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
