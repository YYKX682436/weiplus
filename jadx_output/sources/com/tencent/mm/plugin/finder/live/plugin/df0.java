package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class df0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f112288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112288e = jf0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.df0(this.f112288e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.df0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.td1 td1Var;
        r45.td1 td1Var2;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112287d;
        com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var = this.f112288e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112287d = 1;
            obj = com.tencent.mm.plugin.finder.live.plugin.jf0.t1(jf0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.l71 l71Var = (r45.l71) obj;
        jf0Var.getClass();
        java.lang.String str = null;
        ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Fk(l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null, true);
        ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Vi((l71Var == null || (nw1Var = (r45.nw1) l71Var.getCustom(1)) == null) ? 0L : nw1Var.getLong(0), l71Var != null ? l71Var.getInteger(32) : 0, l71Var != null ? (r45.t84) l71Var.getCustom(30) : null);
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3915x0).getValue()).r()).intValue() == 1) {
            jf0Var.P = true;
        }
        if ((l71Var != null ? (r45.td1) l71Var.getCustom(8) : null) != null) {
            jf0Var.P = true;
            java.lang.String string = (l71Var == null || (td1Var2 = (r45.td1) l71Var.getCustom(8)) == null) ? null : td1Var2.getString(0);
            if (l71Var != null && (td1Var = (r45.td1) l71Var.getCustom(8)) != null) {
                str = td1Var.getString(1);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPlugin", "updateBg: show abnormal close page, title:" + string + ", wording:" + str);
            jf0Var.Y().f410652g = string;
            jf0Var.Y().f410653h = str;
            jf0Var.f113092r.setText(string);
            android.widget.TextView textView = jf0Var.f113093s;
            textView.setText(str);
            textView.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPlugin", "is abnormal close = " + jf0Var.P);
        return l71Var;
    }
}
