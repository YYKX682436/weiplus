package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class q3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f121900e;

    public q3(r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f121900e = contextObj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(vp2.e0 r21, in5.s0 r22, android.view.View r23, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3 r24) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3.n(vp2.e0, in5.s0, android.view.View, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3):void");
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6x;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        r45.h32 h32Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.h32 h32Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.String username;
        vp2.e0 item = (vp2.e0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hkh);
        mn2.g1 g1Var = mn2.g1.f329975a;
        r45.oa2 oa2Var = item.f438917d;
        if (imageView != null) {
            r45.h32 h32Var3 = (r45.h32) oa2Var.getCustom(0);
            java.lang.String string = h32Var3 != null ? h32Var3.getString(2) : null;
            if (string == null || string.length() == 0) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1);
                string = finderContact3 != null ? finderContact3.getHeadUrl() : null;
            }
            if (string == null || string.length() == 0) {
                imageView.setImageDrawable(null);
            } else {
                g1Var.e().c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1);
            if (finderContact4 != null && (username = finderContact4.getUsername()) != null) {
                if (!(username.length() > 0)) {
                    username = null;
                }
                if (username != null) {
                    imageView.setOnClickListener(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.n3(this, holder, username));
                }
            }
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hln);
        if (imageView2 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1);
            java.lang.String headUrl = finderContact5 != null ? finderContact5.getHeadUrl() : null;
            if (headUrl != null) {
                if (!(headUrl.length() > 0)) {
                    headUrl = null;
                }
                if (headUrl != null) {
                    g1Var.a().c(new mn2.n(headUrl, null, 2, null), imageView2, g1Var.h(mn2.f1.f329957h));
                }
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ooe);
        if (textView != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1);
            textView.setText(finderContact6 != null ? finderContact6.getNickname() : null);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hkc);
        if (imageView3 != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1)) != null) {
            com.tencent.mm.protocal.protobuf.FinderAuthInfo e17 = ya2.d.e(ya2.d.a(finderContact2, false));
            com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = e17 == null ? finderContact2.getAuthInfo() : e17;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f460511a, imageView3, authInfo, 0, 4, null);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f487432om4);
        if (textView2 != null && (h32Var2 = (r45.h32) oa2Var.getCustom(0)) != null) {
            textView2.setText(zl2.q4.t(zl2.q4.f473933a, h32Var2, com.tencent.mm.R.string.csf, false, false, false, 20, null));
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.om7);
        if (textView3 != null) {
            r45.h32 h32Var4 = (r45.h32) oa2Var.getCustom(0);
            textView3.setText(h32Var4 != null ? h32Var4.getString(3) : null);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.hmz);
        if (p17 != null) {
            n(item, holder, p17, this);
            p17.setOnClickListener(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.o3(item, this, holder, i17, p17));
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.hmz);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(p18, "live_square_notice");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[0] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[1] = new jz5.l("live_label_type", java.lang.Integer.valueOf(item.f438918e.f374125d));
        lVarArr[2] = new jz5.l("finder_username", (oa2Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1)) == null) ? null : finderContact.getUsername());
        lVarArr[3] = new jz5.l("live_room_type", java.lang.Integer.valueOf(i18));
        if (oa2Var == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null || (str = h32Var.getString(4)) == null) {
            str = "";
        }
        lVarArr[4] = new jz5.l("live_notice_id", str);
        ((cy1.a) rVar).gk(p18, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(p18, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p3(item, holder));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(p18, 40, 25388);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
