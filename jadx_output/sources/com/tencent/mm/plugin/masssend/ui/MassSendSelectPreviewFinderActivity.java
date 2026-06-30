package com.tencent.mm.plugin.masssend.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/masssend/ui/MassSendSelectPreviewFinderActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class MassSendSelectPreviewFinderActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f148555d = jz5.h.b(new kf3.m2(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f148556e = jz5.h.b(new kf3.l2(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f148557f = jz5.h.b(new kf3.p2(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f148558g = jz5.h.b(new kf3.j2(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f148559h = jz5.h.b(new kf3.k2(this));

    /* renamed from: i, reason: collision with root package name */
    public al5.a0 f148560i;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dnd;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        al5.a0 a0Var;
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setMMTitle("");
        hideActionbarLine();
        setBackBtn(new kf3.n2(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SELECT_OBJECT");
        if (byteArrayExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendSelectPreviewFinderActivity", "finderObj bytes == null");
            finish();
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.parseFrom(byteArrayExtra);
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        ((com.tencent.mm.plugin.finder.service.s1) e6Var).getClass();
        al5.a0 a0Var2 = null;
        ya2.b2 h17 = contact != null ? ya2.d.h(contact, null, false, 3, null) : null;
        java.lang.String avatarUrl = h17 != null ? h17.getAvatarUrl() : null;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        java.lang.Object value = ((jz5.n) this.f148556e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        zy2.v8.c(lVar, (android.widget.ImageView) value, avatarUrl == null ? "" : avatarUrl, null, 4, null);
        java.lang.Object value2 = ((jz5.n) this.f148557f).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).setText(h17 != null ? h17.w0() : "");
        com.tencent.mm.protocal.protobuf.FinderAuthInfo Ai = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ai(h17);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        java.lang.Object value3 = ((jz5.n) this.f148559h).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        zy2.tb.a(m1Var, (android.widget.ImageView) value3, Ai, 0, 4, null);
        java.lang.Object value4 = ((jz5.n) this.f148558g).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.Button) value4).setOnClickListener(new kf3.o2(this));
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        pj4.j0 f17 = com.tencent.mm.plugin.finder.assist.n7.f102406a.f(finderObject);
        pj4.t tVar = new pj4.t();
        tVar.f355288d = 0;
        tVar.f355289e = 4;
        tVar.f355291g = c01.id.e();
        bi4.r0 a17 = sj4.z0.f408908a.a(f17.f355139d);
        if (a17 != null) {
            java.lang.Object value5 = ((jz5.n) this.f148555d).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            a0Var2 = a17.A1("finder@inner", (android.widget.FrameLayout) value5, f17, tVar);
        }
        this.f148560i = a0Var2;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        if ((context instanceof com.tencent.mm.ui.MMFragmentActivity) && (a0Var = this.f148560i) != null) {
            a0Var.J0((com.tencent.mm.ui.MMFragmentActivity) context);
        }
        al5.a0 a0Var3 = this.f148560i;
        if (a0Var3 == null || a0Var3.f5862d) {
            return;
        }
        a0Var3.j();
        a0Var3.h();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        al5.a0 a0Var = this.f148560i;
        if (a0Var == null || !a0Var.f5862d) {
            return;
        }
        a0Var.i();
        a0Var.g();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        al5.a0 a0Var = this.f148560i;
        if (a0Var == null || a0Var.f5862d) {
            return;
        }
        a0Var.j();
        a0Var.h();
    }
}
