package lb2;

/* loaded from: classes5.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f317731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lb2.j f317733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f317734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f317735h;

    public g(android.widget.EditText editText, android.content.Context context, lb2.j jVar, java.lang.Object obj, int i17) {
        this.f317731d = editText;
        this.f317732e = context;
        this.f317733f = jVar;
        this.f317734g = obj;
        this.f317735h = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Object obj;
        lb2.j jVar = this.f317733f;
        java.lang.String obj2 = r26.n0.u0(this.f317731d.getText().toString()).toString();
        boolean z17 = obj2.length() == 0;
        android.content.Context context = this.f317732e;
        if (z17) {
            db5.t7.makeText(context, "输入值不能为空", 0).show();
            return;
        }
        try {
            java.lang.Object obj3 = jVar.f317739g;
            if (obj3 instanceof java.lang.Integer) {
                obj = java.lang.Integer.valueOf(java.lang.Integer.parseInt(obj2));
            } else if (obj3 instanceof java.lang.Long) {
                obj = java.lang.Long.valueOf(java.lang.Long.parseLong(obj2));
            } else if (obj3 instanceof java.lang.Float) {
                obj = java.lang.Float.valueOf(java.lang.Float.parseFloat(obj2));
            } else {
                obj = obj2;
                if (!(obj3 instanceof java.lang.String)) {
                    kotlin.jvm.internal.o.d(obj3);
                    db5.t7.makeText(context, "不支持的类型: ".concat(obj3.getClass().getSimpleName()), 0).show();
                    return;
                }
            }
            java.lang.Object obj4 = obj;
            if (kotlin.jvm.internal.o.b(obj4, this.f317734g)) {
                return;
            }
            java.util.ArrayList arrayList = jVar.f317741i;
            int i18 = this.f317735h;
            if (arrayList != null) {
            }
            java.util.ArrayList arrayList2 = jVar.f317741i;
            if (arrayList2 != null) {
                arrayList2.add(new mb2.a(obj4, "自定义:" + obj4, null, 4, null));
            }
            jVar.i(i18);
            yz5.a aVar = jVar.f317747r;
            if (aVar != null) {
                aVar.invoke();
            }
        } catch (java.lang.ClassCastException e17) {
            db5.t7.makeText(context, "类型错误: " + e17.getMessage(), 0).show();
        }
    }
}
