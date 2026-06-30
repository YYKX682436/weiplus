package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.convert.d f121136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f121137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.member.convert.d dVar, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f121136d = dVar;
        this.f121137e = finderCommentInfo;
        this.f121138f = baseFinderFeed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object[] objArr;
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        java.lang.String str;
        r45.xk b17;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        mo2.q qVar = (mo2.q) this.f121136d;
        qVar.getClass();
        com.tencent.mm.protocal.protobuf.FinderCommentInfo item = this.f121137e;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f121138f;
        kotlin.jvm.internal.o.g(feed, "feed");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            objArr = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            objArr = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (objArr == false && (appCompatActivity = qVar.f330389f) != null) {
            long id6 = feed.getFeedObject().getId();
            java.lang.String dupFlag = feed.getFeedObject().getDupFlag();
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = id6;
            yj0Var.field_dupFlag = dupFlag;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, item);
            yj0Var.n1(0L);
            so2.y0 y0Var = new so2.y0(yj0Var);
            r45.ky0 advertisement_info = item.getAdvertisement_info();
            jz5.f0 f0Var2 = null;
            f0Var2 = null;
            if (hc2.g0.a(advertisement_info != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) advertisement_info.getCustom(5) : null) == null && !hc2.c0.a(item.getDisplayFlag()) && !kotlin.jvm.internal.o.b(item.getUsername(), qVar.f330390g)) {
                java.lang.String username = item.getUsername();
                if (username == null) {
                    username = "";
                }
                if (!com.tencent.mm.storage.z3.S3(username)) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).ql(qVar.f330389f, feed.getFeedObject().getUserName(), y0Var, qVar.f330390g, 11);
                }
            }
            r45.ky0 advertisement_info2 = item.getAdvertisement_info();
            if (advertisement_info2 == null || (str = advertisement_info2.getString(4)) == null) {
                str = "";
            }
            com.tencent.mm.protocal.protobuf.FinderContact author_contact = item.getAuthor_contact();
            if (author_contact != null && (b17 = ya2.d.b(ya2.d.h(author_contact, null, false, 3, null), false)) != null) {
                java.lang.String string = b17.getString(0);
                java.lang.String str2 = string == null ? "" : string;
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = appCompatActivity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                so2.g0.b(y0Var, appCompatActivity, str2, nyVar != null ? nyVar.f135380n : 0, feed.getFeedObject(), str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                java.lang.String username2 = item.getUsername();
                if (username2 == null) {
                    username2 = "";
                }
                so2.g0.d(y0Var, username2, appCompatActivity, str);
            }
        }
        return f0Var;
    }
}
