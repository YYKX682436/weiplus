package z63;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public y9.i f470405a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f470406b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f470407c;

    /* renamed from: d, reason: collision with root package name */
    public int f470408d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f470409e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f470410f;

    /* renamed from: g, reason: collision with root package name */
    public z63.f f470411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470412h;

    public g(android.content.Context context) {
        this.f470407c = context;
        this.f470406b = android.view.View.inflate(context, com.tencent.mm.R.layout.bio, null);
        y9.i iVar = new y9.i(context, 0);
        this.f470405a = iVar;
        iVar.setContentView(this.f470406b);
        this.f470405a.setOnDismissListener(new z63.c(this));
        this.f470410f = (android.widget.TextView) this.f470406b.findViewById(com.tencent.mm.R.id.ku_);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f470406b.getLayoutParams();
        layoutParams.height = i65.a.b(context, 250);
        this.f470406b.setLayoutParams(layoutParams);
        this.f470408d = i65.a.b(context, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f470406b.getParent());
        this.f470409e = A;
        if (A != null) {
            A.C(this.f470408d);
            this.f470409e.f44443p = false;
        }
        ((android.widget.Button) this.f470406b.findViewById(com.tencent.mm.R.id.khs)).setOnClickListener(new z63.d(this));
        ((android.widget.Button) this.f470406b.findViewById(com.tencent.mm.R.id.b5i)).setOnClickListener(new z63.e(this));
    }

    public void a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (str == null || str.length() <= 0) {
            android.content.Context context = this.f470407c;
            db5.e1.L(context, false, context.getString(com.tencent.mm.R.string.fsf), context.getString(com.tencent.mm.R.string.fsf), context.getString(com.tencent.mm.R.string.fsg), context.getString(com.tencent.mm.R.string.f490347sg), new z63.a(this), new z63.b(this), com.tencent.mm.R.color.f479206su, com.tencent.mm.R.color.f479206su);
            return;
        }
        this.f470412h = str;
        this.f470410f.setText(str);
        y9.i iVar = this.f470405a;
        if (iVar != null) {
            iVar.show();
        }
    }
}
