package mh5;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f326495a = new java.util.HashMap(100);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wp0.b a(com.tencent.mm.storage.f9 r23, java.lang.String r24, java.lang.String r25, android.graphics.RectF r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh5.a.a(com.tencent.mm.storage.f9, java.lang.String, java.lang.String, android.graphics.RectF):wp0.b");
    }

    public static wp0.b b(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, yb5.d dVar, android.view.View view) {
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicEmojiUtils", "hy: not valid msgId");
            return null;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (!z17) {
            return a(Li, str2, str3, null);
        }
        android.graphics.RectF d17 = d(Li, str2, z18, dVar, view);
        if (z18 && d17 == null) {
            return null;
        }
        return a(Li, str2, str3, d17);
    }

    public static java.util.List c(yb5.d dVar, boolean z17) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        sb5.z zVar;
        int firstVisiblePosition;
        int lastVisiblePosition;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicEmojiUtils", "hy: chatting context lost");
            return null;
        }
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
        if (!(baseChattingUIFragment instanceof com.tencent.mm.ui.chatting.ChattingUIFragment) || (zVar = (chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) baseChattingUIFragment).f198268s) == null || (lastVisiblePosition = chattingUIFragment.C0().getLastVisiblePosition()) <= (firstVisiblePosition = chattingUIFragment.getFirstVisiblePosition())) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        int i17 = 0;
        for (int i18 = 0; i18 <= lastVisiblePosition - firstVisiblePosition; i18++) {
            android.view.View childAt = chattingUIFragment.C0().getChildAt(i18);
            if (childAt instanceof android.view.ViewGroup) {
                java.lang.Object tag = childAt.getTag();
                if (tag instanceof com.tencent.mm.ui.chatting.viewitems.g0) {
                    com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) zVar).getItem((i18 + firstVisiblePosition) - i17);
                    if (item != null) {
                        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = (com.tencent.mm.ui.chatting.viewitems.g0) tag;
                        if (g0Var.getMainContainerView() != null) {
                            arrayList.add(new android.util.Pair(item, g0Var));
                            if (z17) {
                                android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
                                android.view.View mainContainerView = g0Var.getMainContainerView();
                                ((android.view.ViewGroup) viewGroup.getParent()).setClipToPadding(false);
                                ((android.view.ViewGroup) viewGroup.getParent()).setClipChildren(false);
                                while (mainContainerView != viewGroup) {
                                    mainContainerView = (android.view.View) mainContainerView.getParent();
                                    if (mainContainerView instanceof android.view.ViewGroup) {
                                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) mainContainerView;
                                        viewGroup2.setClipChildren(false);
                                        viewGroup2.setClipToPadding(false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i17++;
        }
        return arrayList;
    }

    public static android.graphics.RectF d(com.tencent.mm.storage.f9 f9Var, java.lang.String animKey, boolean z17, yb5.d dVar, android.view.View view) {
        int[] iArr;
        int width;
        int height;
        android.view.View O0 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).O0(f9Var.getMsgId());
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = O0 != null ? (com.tencent.mm.ui.chatting.viewitems.g0) O0.getTag() : null;
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicEmojiUtils", "hy: msg item not found!");
            return null;
        }
        int[] iArr2 = new int[2];
        if (view == null) {
            iArr2[1] = 0;
            iArr2[0] = 0;
        } else {
            view.getLocationInWindow(iArr2);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(animKey)) {
            android.view.View mainContainerView = g0Var.getMainContainerView();
            if (mainContainerView == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEmojiUtils", "hy: not having main view");
                return null;
            }
            iArr = new int[2];
            mainContainerView.getLocationInWindow(iArr);
            width = mainContainerView.getWidth();
            height = mainContainerView.getHeight();
        } else {
            xq.b bVar = ((com.tencent.mm.ui.chatting.component.ta) ((sb5.p0) dVar.f460708c.a(sb5.p0.class))).f199989x;
            long msgId = f9Var.getMsgId();
            com.tencent.mm.ui.chatting.component.sa saVar = (com.tencent.mm.ui.chatting.component.sa) bVar;
            saVar.getClass();
            kotlin.jvm.internal.o.g(animKey, "animKey");
            android.graphics.RectF rectF = new android.graphics.RectF();
            android.view.View b17 = saVar.b(msgId);
            if (b17 != null) {
                com.tencent.mm.ui.widget.MMNeat7extView a17 = saVar.a(b17, animKey);
                if ((a17 != null ? a17.getLayout() : null) != null) {
                    android.graphics.RectF a18 = xq.a.f455969a.a(a17);
                    int[] iArr3 = new int[2];
                    a17.getLocationInWindow(iArr3);
                    int i17 = iArr3[0];
                    int i18 = iArr3[1];
                    rectF.set(a18);
                    rectF.offset(i17 + a17.getPaddingLeft(), i18 + a17.getPaddingTop());
                } else {
                    com.tencent.mars.xlog.Log.i(saVar.f199932b.f199973e, "updateView: no layout");
                }
            }
            iArr = new int[]{(int) rectF.left, (int) rectF.top};
            width = (int) rectF.width();
            height = (int) rectF.height();
        }
        if (z17) {
            android.graphics.Point point = new android.graphics.Point(view.getWidth(), view.getHeight());
            int i19 = iArr2[0];
            int i27 = iArr2[1];
            android.graphics.Rect rect = new android.graphics.Rect(i19, i27, point.x + i19, point.y + i27);
            int i28 = iArr[0];
            int i29 = iArr[1];
            if (!new android.graphics.Rect(i28, i29, width + i28, height + i29).intersect(rect)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicEmojiUtils", "hy: main view not in the window location");
                return null;
            }
        }
        if (iArr.length < 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicEmojiUtils", "hy: window or view lost");
            return null;
        }
        float f17 = iArr[0] - iArr2[0];
        float f18 = iArr[1] - iArr2[1];
        return new android.graphics.RectF(f17, f18, width + f17, height + f18);
    }
}
