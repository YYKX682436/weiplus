package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class lf extends oa.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.tf f174060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(androidx.viewpager.widget.ViewPager viewPager, com.tencent.mm.plugin.textstatus.ui.tf tfVar) {
        super(viewPager);
        this.f174060e = tfVar;
    }

    @Override // oa.l, oa.c
    public void l4(oa.i iVar) {
        int i17 = iVar != null ? iVar.f343782e : -1;
        com.tencent.mm.plugin.textstatus.ui.tf tfVar = this.f174060e;
        if (i17 == 0) {
            tfVar.f174331m = iVar != null ? com.tencent.mm.plugin.textstatus.ui.tf.O6(tfVar, iVar) : 0;
        } else if (i17 == 1) {
            tfVar.f174330i = iVar != null ? com.tencent.mm.plugin.textstatus.ui.tf.O6(tfVar, iVar) : 0;
        }
        if (iVar != null) {
            com.tencent.mm.plugin.textstatus.ui.tf.P6(tfVar, iVar, false);
        }
        tfVar.T6(iVar != null ? iVar.f343782e : -1);
        if ((iVar != null ? iVar.f343782e : -1) == 1) {
            ni4.x.f337776d.o();
        }
        tfVar.U6(iVar != null ? iVar.f343782e : -1);
    }

    @Override // oa.l, oa.c
    public void u1(oa.i tab) {
        int O6;
        int i17;
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f343799d.setCurrentItem(tab.f343782e);
        int i18 = tab.f343782e;
        com.tencent.mm.plugin.textstatus.ui.tf tfVar = this.f174060e;
        if (!tfVar.f174328g) {
            if (i18 == 0) {
                O6 = com.tencent.mm.plugin.textstatus.ui.tf.O6(tfVar, tab);
                i17 = tfVar.f174330i;
            } else if (i18 != 1) {
                O6 = 0;
                i17 = 0;
            } else {
                i17 = com.tencent.mm.plugin.textstatus.ui.tf.O6(tfVar, tab);
                O6 = tfVar.f174331m;
            }
            android.app.Activity context = tfVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.m.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            hi4.m mVar = (hi4.m) a17;
            hi4.m.O6(mVar, tab.f343782e == 0 ? 2 : 3, O6, i17, 0, 8, null);
            mVar.f281558e++;
        }
        com.tencent.mm.plugin.textstatus.ui.tf.P6(tfVar, tab, true);
    }
}
