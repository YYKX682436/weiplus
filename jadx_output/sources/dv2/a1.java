package dv2;

/* loaded from: classes2.dex */
public final class a1 extends com.tencent.mm.ui.component.UIComponent implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f243806d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f243807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f243808f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f243809g;

    /* renamed from: h, reason: collision with root package name */
    public aw2.n f243810h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f243811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = true;
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.c1() != 1 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Cb).getValue()).r()).intValue() != 1) {
            z17 = false;
        }
        this.f243806d = z17;
        this.f243807e = new java.util.ArrayList();
        this.f243808f = "";
    }

    public static final int O6(dv2.a1 a1Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        a1Var.getClass();
        int t17 = linearLayoutManager.t();
        com.tencent.mars.xlog.Log.i("FinderPostRedPackCoverUIC", "[findFirstCompletelyVisibleItemPosition] pos:" + t17);
        if (t17 < 0) {
            return 0;
        }
        return t17;
    }

    public final r45.m66 P6(int i17) {
        r45.m66 m66Var = new r45.m66();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJump_id("abcdefg");
        finderJumpInfo.setBusiness_type(8);
        java.util.LinkedList<r45.wf6> linkedList = new java.util.LinkedList<>();
        r45.wf6 wf6Var = new r45.wf6();
        wf6Var.set(2, 15);
        wf6Var.set(1, 1);
        r45.v50 v50Var = new r45.v50();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.wf6 wf6Var2 = new r45.wf6();
        wf6Var2.set(2, 0);
        r45.iw4 iw4Var = new r45.iw4();
        iw4Var.set(0, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_red_33083e7d0307413dbeac8f9cdd22ba66.png");
        iw4Var.set(1, "领取红包封面");
        wf6Var2.set(3, iw4Var);
        linkedList2.add(wf6Var2);
        r45.wf6 wf6Var3 = new r45.wf6();
        wf6Var3.set(2, 5);
        wf6Var3.set(11, 5);
        r45.su suVar = new r45.su();
        suVar.set(0, "https://mmcomm.qpic.cn/wx_redskin/srAemkSSszmqgpIypB1o8wY0ENmzDLb2BIzhJugRaAKMsoTAAxawbYUX3xfjouQK/");
        suVar.set(1, "领取wo购物日记的红包封面");
        suVar.set(2, "23123人已领取");
        suVar.set(4, "领取");
        suVar.set(8, "#FFFFFF");
        suVar.set(7, "#282828");
        wf6Var3.set(8, suVar);
        linkedList2.add(wf6Var3);
        v50Var.set(0, linkedList2);
        wf6Var.set(24, v50Var);
        linkedList.add(wf6Var);
        finderJumpInfo.setStyle(linkedList);
        m66Var.set(3, finderJumpInfo);
        m66Var.set(0, "https://mmcomm.qpic.cn/wx_redskin/srAemkSSszmqgpIypB1o8wY0ENmzDLb2BIzhJugRaAKMsoTAAxawbYUX3xfjouQK/");
        m66Var.set(1, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_red_33083e7d0307413dbeac8f9cdd22ba66.png");
        m66Var.set(2, java.lang.Integer.valueOf(i17));
        return m66Var;
    }

    public final void Q6(com.tencent.mm.plugin.finder.storage.FinderItem item) {
        java.util.LinkedList<r45.wf6> style;
        r45.wf6 wf6Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = true;
        if (!(this.f243806d && (this.f243807e.isEmpty() ^ true))) {
            com.tencent.mars.xlog.Log.i("FinderPostRedPackCoverUIC", "onEnterPreviewUI disable");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f243809g;
        if (finderJumpInfo == null || (style = finderJumpInfo.getStyle()) == null || (wf6Var = (r45.wf6) kz5.n0.Z(style)) == null) {
            return;
        }
        int integer = wf6Var.getInteger(1);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if ((activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null) == null) {
            return;
        }
        item.getExtReading().set(3, 0);
        item.getExtReading().set(0, "");
        item.getExtReading().set(1, "");
        long expectId = item.getExpectId();
        if (item.getFeedObject().getAdFlag() == 0) {
            item.getFeedObject().setAdFlag(4);
        }
        java.lang.String jump_id = finderJumpInfo.getJump_id();
        if (jump_id != null && jump_id.length() != 0) {
            z17 = false;
        }
        if (z17) {
            finderJumpInfo.setJump_id(expectId + "_business_type_" + finderJumpInfo.getBusiness_type());
        }
        androidx.lifecycle.j0 W6 = ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).W6(expectId, 62, item.getDupFlag());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(finderJumpInfo);
        xc2.t tVar = new xc2.t(62, expectId, integer, linkedList, false, null, 48, null);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(tVar);
        W6.postValue(hashSet);
    }

    public final void R6() {
        if (!this.f243806d) {
            com.tencent.mars.xlog.Log.i("FinderPostRedPackCoverUIC", "request red pack cover is disable");
            return;
        }
        java.lang.String e17 = xy2.c.e(getActivity());
        pq5.g l17 = new db2.i2(e17).l();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) activity);
        l17.K(new dv2.v0(e17, this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        R6();
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        if (this.f243807e.isEmpty()) {
            R6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        boolean z17 = true;
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.c1() != 1 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Cb).getValue()).r()).intValue() != 1) {
            z17 = false;
        }
        this.f243806d = z17;
        this.f243807e = new java.util.ArrayList();
        this.f243808f = "";
    }
}
