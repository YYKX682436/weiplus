package df2;

/* loaded from: classes3.dex */
public final class rt implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f231267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f231269d;

    public rt(int i17, r45.h32 h32Var, java.lang.String str, df2.wt wtVar) {
        this.f231266a = i17;
        this.f231267b = h32Var;
        this.f231268c = str;
        this.f231269d = wtVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiBack: errCode=");
        sb6.append(fVar.f70616b);
        sb6.append(", errType=");
        sb6.append(fVar.f70615a);
        sb6.append(", opType=");
        int i17 = this.f231266a;
        sb6.append(i17);
        sb6.append(", noticeId=");
        r45.h32 h32Var = this.f231267b;
        sb6.append(h32Var.getString(4));
        sb6.append(", anchorUsername=");
        java.lang.String str = this.f231268c;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", sb6.toString());
        int i18 = fVar.f70616b;
        df2.wt wtVar = this.f231269d;
        if (i18 != 0 || fVar.f70615a != 0) {
            db5.t7.makeText(wtVar.O6(), com.tencent.mm.R.string.msg_net_error, 0).show();
            return jz5.f0.f302826a;
        }
        h32Var.set(1, java.lang.Integer.valueOf(i17 == 1 ? 0 : 1));
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.lang.String string = h32Var.getString(4);
        if (string == null) {
            string = "";
        }
        r45.h32 e17 = i1Var.e(str, string);
        if (e17 != null) {
            e17.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
        } else {
            java.lang.String string2 = h32Var.getString(4);
            if (string2 != null) {
                i1Var.a(str, string2, h32Var);
            }
        }
        if (i17 == 1) {
            wtVar.p7(true);
            android.content.Context O6 = wtVar.O6();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
            e4Var.f211776c = wtVar.O6().getString(com.tencent.mm.R.string.e0j);
            return e4Var.c();
        }
        wtVar.p7(false);
        android.content.Context O62 = wtVar.O6();
        int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(O62);
        e4Var2.b(com.tencent.mm.R.raw.icons_outlined_done);
        e4Var2.f211776c = wtVar.O6().getString(com.tencent.mm.R.string.mo8);
        return e4Var2.c();
    }
}
