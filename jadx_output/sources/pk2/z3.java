package pk2;

/* loaded from: classes3.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.b4 f356420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f356421g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(boolean z17, pk2.o9 o9Var, pk2.b4 b4Var, v65.n nVar, android.view.View view) {
        super(2);
        this.f356418d = z17;
        this.f356419e = o9Var;
        this.f356420f = b4Var;
        this.f356421g = nVar;
        this.f356422h = view;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.cv2 cv2Var = (r45.cv2) obj2;
        pk2.o9 o9Var = this.f356419e;
        boolean z17 = this.f356418d;
        kotlin.jvm.internal.o.d(z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dht) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dhp));
        boolean z18 = false;
        if (booleanValue) {
            pk2.b4 b4Var = this.f356420f;
            if (!z17) {
                b4Var.getClass();
                kotlin.jvm.internal.o.g(o9Var, "<this>");
                r45.i82 i82Var = (r45.i82) ((mm2.f7) o9Var.c(mm2.f7.class)).f329058f.getValue();
                if (i82Var != null && i82Var.getBoolean(0)) {
                    z18 = true;
                }
                if (z18) {
                    ((mm2.f7) o9Var.c(mm2.f7.class)).f329061i.postValue(new mm2.z6());
                }
            }
            android.view.View view = this.f356422h;
            ym5.a1.f(new pk2.w3(o9Var, z17, view));
            ym5.a1.f(new pk2.x3(b4Var, o9Var, view, z17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.H : ml2.t1.I, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(b4Var.n() ? ml2.s1.f327916f : ml2.s1.f327915e), null, null, null, null, false, 124, null);
            if (o9Var.f356076c == 1) {
                if (b4Var.n()) {
                    java.lang.Integer num = 1;
                    int i17 = z17 ? 2 : 3;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("element", 6);
                    if (num != null) {
                        num.intValue();
                        jSONObject.put("type", num.intValue());
                    }
                    jSONObject.put("sub_element", 3);
                    jSONObject.put("sub_type", i17);
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                    i95.m c19 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c19;
                    ml2.z4 z4Var = ml2.z4.f328394z;
                    ml2.g2[] g2VarArr = ml2.g2.f327477d;
                    zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(z17 ? 2 : 1), null, 4, null);
                } else {
                    java.lang.Integer num2 = 1;
                    int i18 = z17 ? 2 : 3;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("element", 6);
                    if (num2 != null) {
                        num2.intValue();
                        jSONObject2.put("type", num2.intValue());
                    }
                    jSONObject2.put("sub_element", 3);
                    jSONObject2.put("sub_type", i18);
                    i95.m c27 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c27, "getService(...)");
                    zy2.zb zbVar2 = (zy2.zb) c27;
                    ml2.c1 c1Var = ml2.c1.f327325e;
                    zy2.zb.j5(zbVar2, 37L, jSONObject2.toString(), null, 4, null);
                    i95.m c28 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c28, "getService(...)");
                    zy2.zb zbVar3 = (zy2.zb) c28;
                    ml2.c2[] c2VarArr = ml2.c2.f327330d;
                    zy2.zb.j5(zbVar3, 16L, java.lang.String.valueOf(z17 ? 2 : 1), null, 4, null);
                }
            }
        } else if (z17 && cv2Var != null && (string = cv2Var.getString(2)) != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
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
                textView2.setText(string);
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
                textView2.setTextSize(15.0f);
                z2Var.j(textView2);
                z2Var.F = new pk2.y3(z2Var);
                z2Var.C();
            }
        }
        this.f356421g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
