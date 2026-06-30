package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class p7 implements com.tencent.mm.plugin.finder.live.view.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.e2 f113839b;

    public p7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var, com.tencent.mm.plugin.finder.live.view.e2 e2Var) {
        this.f113838a = x7Var;
        this.f113839b = e2Var;
    }

    public void a(km2.q linkUser) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(linkUser, "linkUser");
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113838a;
        java.lang.String str = linkUser.f309172c;
        java.util.List list = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309172c, str)) {
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            qo0.c cVar = this.f113838a.f115036p;
            qo0.b bVar = qo0.b.M3;
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str2 = linkUser.f309172c;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", str2);
            cVar.statusChange(bVar, bundle);
            return;
        }
        r45.xn1 xn1Var = linkUser.f309187r;
        if (xn1Var == null) {
            com.tencent.mars.xlog.Log.i(this.f113838a.f115037q, "onAcceptItemClick user is null");
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var2 = this.f113838a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var.toByteArray());
        x7Var2.f115036p.statusChange(qo0.b.Y3, bundle2);
    }

    public void b(r45.xn1 xn1Var, com.tencent.mm.plugin.finder.live.view.b2 b2Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113838a;
        java.lang.String str = x7Var.f115037q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onApplyItemClick userNickName: ");
        sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (xn1Var != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var.toByteArray());
            if (b2Var != null) {
                bundle.putInt("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE", b2Var.f116200a);
                bundle.putByteArray("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE_BUFFER", b2Var.f116201b);
                bundle.putString("ARAM_FINDER_LIVE_ANCHOR_APPLY_CANDIDATE_REQUEST_ID", b2Var.f116202c);
            }
            x7Var.f115036p.statusChange(qo0.b.X3, bundle);
        }
    }

    public void c(r45.xn1 xn1Var) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        qo0.c cVar = this.f113838a.f115036p;
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        bundle.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", str);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        cVar.statusChange(bVar, bundle);
    }
}
