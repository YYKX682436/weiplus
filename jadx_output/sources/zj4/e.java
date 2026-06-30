package zj4;

/* loaded from: classes11.dex */
public final class e extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f473342d;

    /* renamed from: e, reason: collision with root package name */
    public qj4.k f473343e;

    /* renamed from: f, reason: collision with root package name */
    public final iy1.c f473344f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f473345g;

    /* renamed from: h, reason: collision with root package name */
    public qj4.h f473346h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f473347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f473342d = "MicroMsg.TextStatusPublishIconPickerReportUIC";
        this.f473343e = qj4.k.f363924g;
        this.f473344f = iy1.c.StatusPublishIconPickerPage;
        this.f473345g = jz5.h.b(new zj4.d(this));
        this.f473346h = new qj4.h(0, 0, 0, null, null, 31, null);
        this.f473347i = new java.util.LinkedList();
    }

    public final com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2) {
            return (com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2) activity;
        }
        return null;
    }

    public final bi4.d1 P6() {
        jz5.g gVar = this.f473345g;
        if (((bi4.d1) ((jz5.n) gVar).getValue()) != null) {
            return (bi4.d1) ((jz5.n) gVar).getValue();
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 O6 = O6();
        if (O6 != null) {
            return O6.f173544n;
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View tvOk;
        dy1.r rVar;
        android.widget.TextView tvInputTips;
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar2 != null) {
            cy1.a aVar = (cy1.a) rVar2;
            aVar.Zj(getActivity(), this.f473344f.f295859d);
            aVar.ik(getActivity(), 12, 33629);
            aVar.Ai(getActivity(), new zj4.a(this));
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 O6 = O6();
        if (O6 != null) {
            android.view.View a76 = O6.a7();
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(a76, "status_page_x");
            dy1.r ik6 = aVar2.ik(a76, 40, 33629);
            bi4.d1 P6 = P6();
            kz5.q0 q0Var = kz5.q0.f314001d;
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str = P6 != null ? P6.G : null;
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("status_clipostid", str);
            java.lang.String str2 = P6 != null ? P6.f354941h : null;
            lVarArr[1] = new jz5.l("status_sessionid", str2 != null ? str2 : "");
            java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), q0Var);
            m17.toString();
            ((cy1.a) ik6).gk(a76, m17);
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 O62 = O6();
        if (O62 != null && (tvInputTips = O62.b7().getTvInputTips()) != null) {
            cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar3.pk(tvInputTips, "fill_in_status_word_button");
            aVar3.ik(tvInputTips, 32, 33629);
            aVar3.Ai(getActivity(), new zj4.b(this));
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 O63 = O6();
        if (O63 == null || (tvOk = O63.b7().getTvOk()) == null || (rVar = (dy1.r) i95.n0.c(dy1.r.class)) == null) {
            return;
        }
        cy1.a aVar4 = (cy1.a) rVar;
        aVar4.pk(tvOk, "custom_status_panel_confirm_btn");
        aVar4.Vj(tvOk, 160, new zj4.c(this));
    }
}
