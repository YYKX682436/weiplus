package yf2;

/* loaded from: classes3.dex */
public final class f2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.id f461692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f461693c;

    public f2(yf2.i2 i2Var, com.tencent.mm.plugin.finder.live.widget.id idVar, int i17) {
        this.f461691a = i2Var;
        this.f461692b = idVar;
        this.f461693c = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str;
        df2.tc tcVar;
        android.content.Intent intent;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.LinkedList list = ((r45.m02) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getRet_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.ix0) obj2).getInteger(0) == 19) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        int integer = ix0Var != null ? ix0Var.getInteger(1) : 0;
        if (ix0Var == null || (str = ix0Var.getString(2)) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("FinderStartLiveTopicCoverController", "CgiFinderLiveModBasicInfo errType:" + fVar.f70615a + " errCode:" + fVar.f70616b + ", errMsg:" + fVar.f70617c + ", retCode=" + integer + ", retMsg=" + str);
        int i17 = fVar.f70615a;
        yf2.i2 i2Var = this.f461691a;
        if (i17 != 0 || fVar.f70616b != 0 || integer != 0) {
            if (str.length() == 0) {
                str = i2Var.O6().getString(com.tencent.mm.R.string.dc_);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.h(i2Var.O6(), str);
            return jz5.f0.f302826a;
        }
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) i2Var.business(mm2.g1.class)).f329076q;
        com.tencent.mm.plugin.finder.live.widget.id idVar = this.f461692b;
        ((kotlinx.coroutines.flow.h3) j2Var).k(idVar.f118668b);
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) i2Var.business(mm2.g1.class)).f329077r).k(idVar.f118669c);
        com.tencent.mm.ui.MMActivity N6 = i2Var.N6();
        java.lang.String str2 = idVar.f118668b;
        if (N6 != null && (intent = N6.getIntent()) != null) {
            intent.putExtra("DESC", str2);
        }
        android.view.View view = i2Var.f461722r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$showEdit$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$showEdit$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f461693c > 0 && (tcVar = (df2.tc) i2Var.controller(df2.tc.class)) != null) {
            df2.tc.Z6(tcVar, this.f461693c, null, java.lang.String.valueOf(str2.length()), str2.toString(), 2, null);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.x) i2Var.business(mm2.x.class)).f329523i);
        int intValue = valueOf.intValue();
        if (!(intValue > 0 && str2.length() < intValue)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue2 = valueOf.intValue();
        df2.tc tcVar2 = (df2.tc) i2Var.controller(df2.tc.class);
        if (tcVar2 != null) {
            df2.tc.Z6(tcVar2, 4, null, null, null, 14, null);
        }
        android.content.Context O6 = i2Var.O6();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        e4Var.f211776c = i2Var.O6().getString(com.tencent.mm.R.string.m7z, java.lang.String.valueOf(intValue2));
        return e4Var.c();
    }
}
