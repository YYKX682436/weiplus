package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f121288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, r45.h32 h32Var, com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        super(1);
        this.f121287d = str;
        this.f121288e = h32Var;
        this.f121289f = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberPreviewHeaderUIC", "#showNoticeBigCardDialog onClickPay result=" + booleanValue);
        if (booleanValue) {
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.zb zbVar = (c61.zb) c17;
            java.lang.String str = this.f121287d;
            r45.h32 h32Var = this.f121288e;
            java.lang.String string = h32Var.getString(4);
            if (string == null) {
                string = "";
            }
            com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121289f;
            android.app.Activity context = c0Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            gm0.j1.d().g(c61.zb.x3(zbVar, str, string, 1, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), null, 301, null, null, null, null, null, null, null, 8144, null));
            h32Var.set(1, 0);
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string2 = h32Var.getString(4);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String str2 = this.f121287d;
            if (((b92.d1) zbVar2).bj(str2, string2) == null) {
                c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                java.lang.String string3 = h32Var.getString(4);
                if (string3 == null) {
                    string3 = "";
                }
                ((b92.d1) zbVar3).Ai(str2, string3, h32Var);
            } else {
                c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
                java.lang.String string4 = h32Var.getString(4);
                if (string4 == null) {
                    string4 = "";
                }
                r45.h32 bj6 = ((b92.d1) zbVar4).bj(str2, string4);
                if (bj6 != null) {
                    bj6.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
                }
            }
            androidx.appcompat.app.AppCompatActivity activity = c0Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((te2.e4) ((zy2.g8) zVar.a(activity).c(zy2.g8.class))).f417974d.M0(str2);
            db5.t7.m(c0Var.getContext(), c0Var.getString(com.tencent.mm.R.string.gyq));
        }
        return jz5.f0.f302826a;
    }
}
