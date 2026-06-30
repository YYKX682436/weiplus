package s61;

/* loaded from: classes8.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.o0 f403369d;

    public m0(s61.o0 o0Var) {
        this.f403369d = o0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI = this.f403369d.f403381d;
        for (int i18 = 0; i18 < recommendFriendUI.f73163e.a().length; i18++) {
            r45.n04 n04Var = new r45.n04();
            java.lang.String str = recommendFriendUI.f73163e.a()[i18];
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            n04Var.f380976h = str;
            n04Var.f380977i = recommendFriendUI.f73168m;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(22, n04Var));
            r61.v0 v0Var = new r61.v0();
            v0Var.f392968a = recommendFriendUI.f73163e.a()[i18];
            v0Var.f392969b = recommendFriendUI.f73168m;
            v0Var.f392970c = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Ni().n0(v0Var);
        }
        db5.e1.m(recommendFriendUI.getContext(), com.tencent.mm.R.string.g28, com.tencent.mm.R.string.f490573yv, new s61.s0(recommendFriendUI));
    }
}
