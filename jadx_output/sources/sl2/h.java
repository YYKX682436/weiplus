package sl2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final sl2.h f409251a = new sl2.h();

    /* JADX WARN: Removed duplicated region for block: B:15:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r45.g92 r23, android.content.Context r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sl2.h.a(r45.g92, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(java.lang.String feedId, r45.nw1 liveInfo) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveTeenModeUtil", "checkAllowTeenModePlay feedId:" + feedId + ", liveId:" + pm0.v.u(liveInfo.getLong(0)) + ", permissionFlag:" + liveInfo.getLong(61));
        if ((liveInfo.getLong(61) & 1) > 0) {
            com.tencent.mars.xlog.Log.i("Finder.LiveTeenModeUtil", "checkAllowTeenModePlay true");
            return true;
        }
        boolean kf6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(9, "finderlive_feedId_".concat(feedId));
        com.tencent.mars.xlog.Log.i("Finder.LiveTeenModeUtil", "checkAllowTeenModePlay hasAuthorization:" + kf6);
        return kf6;
    }

    public final boolean c(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.nw1 liveInfo = finderObject != null ? finderObject.getLiveInfo() : null;
        if (finderObject == null || liveInfo == null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveTeenModeUtil", "interceptLiveAndSendAuth isTeenMode but finderObject/liveInfo empty, return");
            return true;
        }
        sl2.h hVar = f409251a;
        if (hVar.b(pm0.v.u(finderObject.getId()), liveInfo)) {
            return false;
        }
        long id6 = finderObject.getId();
        java.lang.String u17 = ot0.q.u(((b92.s2) ((zy2.db) i95.n0.c(zy2.db.class))).Ai(finderObject), null, null);
        kotlin.jvm.internal.o.d(u17);
        hVar.d(context, id6, u17, null);
        com.tencent.mars.xlog.Log.i("Finder.LiveTeenModeUtil", "interceptLiveAndSendAuth jumpToAuthorization");
        return true;
    }

    public final void d(android.content.Context context, long j17, java.lang.String authContent, java.lang.String str) {
        r45.g92 g92Var;
        r45.g92 g92Var2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authContent, "authContent");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(authContent);
        zy2.c cVar = v17 != null ? (zy2.c) v17.y(zy2.c.class) : null;
        java.lang.String str2 = "<fromusr>" + c01.z1.r() + "</fromusr><type>49</type><content>" + com.tencent.mm.sdk.platformtools.t8.p(authContent) + "</content>";
        kotlin.jvm.internal.o.f(str2, "toString(...)");
        java.lang.String concat = "finderlive_feedId_".concat(pm0.v.u(j17));
        if (!(context instanceof android.app.Activity)) {
            uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.egc);
            android.content.res.Resources resources = context.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (str == null) {
                str = (cVar == null || (g92Var = cVar.f477359b) == null) ? null : g92Var.getString(4);
                if (str == null) {
                    str = "";
                }
            }
            objArr[0] = str;
            c0Var.Kf(context, 9, concat, string, resources.getString(com.tencent.mm.R.string.egb, objArr), str2);
            return;
        }
        uh4.c0 c0Var2 = (uh4.c0) i95.n0.c(uh4.c0.class);
        android.app.Activity activity = (android.app.Activity) context;
        java.lang.String string2 = activity.getResources().getString(com.tencent.mm.R.string.egc);
        android.content.res.Resources resources2 = activity.getResources();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        if (str == null) {
            str = (cVar == null || (g92Var2 = cVar.f477359b) == null) ? null : g92Var2.getString(4);
            if (str == null) {
                str = "";
            }
        }
        objArr2[0] = str;
        c0Var2.ed(activity, 9, concat, string2, resources2.getString(com.tencent.mm.R.string.egb, objArr2), str2);
    }
}
