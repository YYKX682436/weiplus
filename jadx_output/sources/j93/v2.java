package j93;

/* loaded from: classes.dex */
public final class v2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298517d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f298518e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f298519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298520g;

    /* renamed from: h, reason: collision with root package name */
    public int f298521h;

    /* renamed from: i, reason: collision with root package name */
    public int f298522i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f298523m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f298524n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298517d = jz5.h.b(new j93.u2(this));
        this.f298518e = new java.util.ArrayList();
        this.f298519f = en1.a.a() + '_' + c01.id.c();
    }

    public final java.lang.String T6() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bottom_panel_omit_cnt", this.f298521h);
        jSONObject.put("if_extend_panel", this.f298520g ? 1 : 0);
        jSONObject.put("half_panel_omit_cnt", this.f298522i);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new j93.r2(this));
    }
}
