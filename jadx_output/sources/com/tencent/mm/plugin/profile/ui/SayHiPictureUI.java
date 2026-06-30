package com.tencent.mm.plugin.profile.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/SayHiPictureUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SayHiPictureUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f153807h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f153808d = jz5.h.b(new hr3.vd(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153809e = jz5.h.b(new hr3.xd(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f153810f = jz5.h.b(new hr3.wd(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f153811g = jz5.h.b(new hr3.yd(this));

    public final com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto U6() {
        return (com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto) ((jz5.n) this.f153808d).getValue();
    }

    public final android.widget.TextView V6() {
        return (android.widget.TextView) ((jz5.n) this.f153810f).getValue();
    }

    public final android.widget.TextView W6() {
        return (android.widget.TextView) ((jz5.n) this.f153809e).getValue();
    }

    public final java.lang.String X6() {
        return (java.lang.String) ((jz5.n) this.f153811g).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emx;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.dz3 dz3Var;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ocf);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        setBackBtn(new hr3.sd(this), com.tencent.mm.R.raw.xmark_regular);
        U6().b(new hr3.td(this));
        android.widget.TextView textView = (android.widget.TextView) U6().findViewById(com.tencent.mm.R.id.d6q);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(textView);
        aVar.pk(textView, "greet_text_float");
        aVar.fk(textView, "add_username", X6());
        aVar.ik(textView, 8, 33926);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.Mj(U6().getAddPhotoLayout());
        aVar2.pk(U6().getAddPhotoLayout(), "greet_photo_float");
        aVar2.fk(U6().getAddPhotoLayout(), "add_username", X6());
        aVar2.ik(U6().getAddPhotoLayout(), 8, 33926);
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.Mj(W6());
        aVar3.pk(W6(), "greet_context_set_float");
        aVar3.fk(W6(), "add_username", X6());
        aVar3.ik(W6(), 8, 33926);
        V6().setOnClickListener(new hr3.ud(this));
        cy1.a aVar4 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar4.Mj(V6());
        aVar4.pk(V6(), "greet_send_float");
        aVar4.fk(V6(), "add_username", X6());
        aVar4.ik(V6(), 8, 33926);
        hr3.pf pfVar = (hr3.pf) component(hr3.pf.class);
        pfVar.getClass();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        pfVar.f283899r = v17;
        java.lang.String v18 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(v18)) {
            dz3Var = null;
        } else {
            dz3Var = new r45.dz3();
            try {
                dz3Var.parseFrom(j34.d.a(v18, 0));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SayHiPictureUIC", th6, "parseImgInfo() err", new java.lang.Object[0]);
            }
        }
        boolean U6 = pfVar.U6(dz3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "initCommonSayHiDirectly() called commonSayHiContent:" + java.lang.Integer.valueOf(v17.length()) + " hasPic:" + U6);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17) || U6) {
            java.lang.String e17 = ck5.f.e(v17, 100);
            java.lang.String str = e17 != null ? e17 : "";
            com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto S6 = pfVar.S6();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = pfVar.getActivity();
            float textSize = pfVar.S6().getTextSize();
            ((ke0.e) xVar).getClass();
            S6.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str, textSize));
            pfVar.S6().setSelection(str.length());
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "[initCommonSayHiDirectly] input:".concat(str));
            androidx.lifecycle.q a17 = androidx.lifecycle.z.a(pfVar.getActivity());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(a17, kotlinx.coroutines.internal.b0.f310484a, null, new hr3.ne(pfVar, dz3Var, null), 2, null);
        }
        if (r26.n0.N(v17) && !U6) {
            ((android.widget.Button) ((jz5.n) pfVar.f283892h).getValue()).setEnabled(false);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, kz5.c1.k(new jz5.l("view_id", "greet_context_setting_float"), new jz5.l("add_username", X6())), 33926);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(hr3.pf.class);
        set.add(hr3.rd.class);
    }
}
