package dn2;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.d0 f241882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f241883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tj1 f241884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f241885g;

    public a0(dn2.d0 d0Var, java.lang.Object obj, r45.tj1 tj1Var, kotlin.jvm.internal.h0 h0Var) {
        this.f241882d = d0Var;
        this.f241883e = obj;
        this.f241884f = tj1Var;
        this.f241885g = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeRealTimeBulletItem$getView$1$1$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            dn2.d0 r7 = r6.f241882d
            r0 = 2
            r1 = 1
            r7.e(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderObject r7 = new com.tencent.mm.protocal.protobuf.FinderObject
            r7.<init>()
            dk2.ef r0 = dk2.ef.f233372a
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.i(r2)
            mm2.c1 r0 = (mm2.c1) r0
            r2 = 0
            if (r0 == 0) goto L3d
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f328846n
            if (r0 == 0) goto L3d
            byte[] r0 = r0.toByteArray()
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 != 0) goto L42
        L40:
            r7 = r2
            goto L53
        L42:
            r7.parseFrom(r0)     // Catch: java.lang.Exception -> L46
            goto L53
        L46:
            r7 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r3 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r3, r0, r7)
            goto L40
        L53:
            r0 = 0
            if (r7 == 0) goto L5c
            com.tencent.mm.plugin.finder.storage.h90 r2 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.a(r7, r0)
        L5c:
            if (r2 != 0) goto L5f
            goto L62
        L5f:
            r2.setFriendLikeCount(r1)
        L62:
            if (r2 != 0) goto L65
            goto L87
        L65:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo
            r1.<init>()
            r45.tj1 r3 = r6.f241884f
            java.lang.String r0 = r3.getString(r0)
            r1.setUsername(r0)
            kotlin.jvm.internal.h0 r0 = r6.f241885g
            java.lang.Object r0 = r0.f310123d
            java.lang.String r0 = (java.lang.String) r0
            r1.setNickname(r0)
            r7.add(r1)
            r2.setLikeList(r7)
        L87:
            if (r2 == 0) goto L98
            java.lang.Class<c61.yb> r7 = c61.yb.class
            i95.m r7 = i95.n0.c(r7)
            c61.yb r7 = (c61.yb) r7
            java.lang.Object r0 = r6.f241883e
            c61.p2 r7 = (c61.p2) r7
            r7.Aj(r0, r2)
        L98:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeRealTimeBulletItem$getView$1$1$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.a0.onClick(android.view.View):void");
    }
}
