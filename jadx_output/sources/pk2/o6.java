package pk2;

/* loaded from: classes3.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.q6 f356065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f356066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356067h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(boolean z17, pk2.o9 o9Var, pk2.q6 q6Var, v65.n nVar, android.view.View view) {
        super(2);
        this.f356063d = z17;
        this.f356064e = o9Var;
        this.f356065f = q6Var;
        this.f356066g = nVar;
        this.f356067h = view;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.cv2 cv2Var = (r45.cv2) obj2;
        pk2.o9 o9Var = this.f356064e;
        boolean z17 = this.f356063d;
        java.lang.String string2 = z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dht) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dhp);
        kotlin.jvm.internal.o.d(string2);
        if (booleanValue) {
            pk2.q6 q6Var = this.f356065f;
            if (!z17) {
                q6Var.getClass();
                kotlin.jvm.internal.o.g(o9Var, "<this>");
                r45.i82 i82Var = (r45.i82) ((mm2.f7) o9Var.c(mm2.f7.class)).f329058f.getValue();
                if (i82Var != null && i82Var.getBoolean(0)) {
                    ((mm2.f7) o9Var.c(mm2.f7.class)).f329061i.postValue(new mm2.z6());
                }
            }
            if (!z17) {
                db5.t7.h(o9Var.f356078d, string2);
            }
            android.view.View view = this.f356067h;
            ym5.a1.f(new pk2.l6(q6Var, z17, view));
            ym5.a1.f(new pk2.m6(o9Var, view, z17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.H : ml2.t1.I, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            if (z17) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.rj((ml2.r0) c18, 8, null, 2, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.rj((ml2.r0) c19, 7, null, 2, null);
            }
        } else if (z17 && cv2Var != null && (string = cv2Var.getString(2)) != null) {
            java.lang.String str = string.length() > 0 ? string : null;
            if (str != null) {
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(o9Var.f356078d, 2, 2, true, true);
                z2Var.y(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490454vi));
                z2Var.x(6);
                com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
                android.widget.TextView textView = new android.widget.TextView(mMActivity);
                textView.setPaddingRelative((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz), 0, 0, 0);
                textView.setText(com.tencent.mm.R.string.dxc);
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
                textView.setTextSize(17.0f);
                z2Var.s(textView);
                android.widget.TextView textView2 = new android.widget.TextView(mMActivity);
                textView2.setText(str);
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
                textView2.setTextSize(15.0f);
                z2Var.j(textView2);
                z2Var.F = new pk2.n6(z2Var);
                z2Var.C();
            }
        }
        this.f356066g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
