package im2;

/* loaded from: classes3.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292250e = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.a6(this.f292250e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.a6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ow1 ow1Var;
        r45.td1 td1Var;
        r45.td1 td1Var2;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292249d;
        im2.h6 h6Var = this.f292250e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f292249d = 1;
            obj = im2.h6.g(h6Var, this);
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
        h6Var.getClass();
        java.lang.String str = null;
        ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Fk(l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null, true);
        ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Vi((l71Var == null || (nw1Var = (r45.nw1) l71Var.getCustom(1)) == null) ? 0L : nw1Var.getLong(0), l71Var != null ? l71Var.getInteger(32) : 0, l71Var != null ? (r45.t84) l71Var.getCustom(30) : null);
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3915x0).getValue()).r()).intValue() == 1) {
            h6Var.P = true;
        }
        if ((l71Var != null ? (r45.td1) l71Var.getCustom(8) : null) != null) {
            h6Var.P = true;
            java.lang.String string = (l71Var == null || (td1Var2 = (r45.td1) l71Var.getCustom(8)) == null) ? null : td1Var2.getString(0);
            if (l71Var != null && (td1Var = (r45.td1) l71Var.getCustom(8)) != null) {
                str = td1Var.getString(1);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "updateBg: show abnormal close page, title:" + string + ", wording:" + str);
            h6Var.Y().f410652g = string;
            h6Var.Y().f410653h = str;
            h6Var.f292363g.setText(string);
            android.widget.TextView textView = h6Var.f292364h;
            textView.setText(str);
            textView.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "is abnormal close = " + h6Var.P);
        if (l71Var != null && (ow1Var = (r45.ow1) l71Var.getCustom(40)) != null) {
            h6Var.Y().f410669x = ow1Var;
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "live_entrance_guide_info: enable_guide_page=" + ow1Var.getBoolean(0));
        }
        return l71Var;
    }
}
