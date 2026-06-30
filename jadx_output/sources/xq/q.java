package xq;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.FrameLayout f456009a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f456010b = new int[2];

    /* renamed from: c, reason: collision with root package name */
    public final xq.n f456011c = new xq.n();

    /* renamed from: d, reason: collision with root package name */
    public final xq.f f456012d = new xq.o(this);

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456013e;

    /* renamed from: f, reason: collision with root package name */
    public xq.p f456014f;

    public final boolean a(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.String b17 = xq.s.f456015a.b(msgInfo);
        boolean z17 = true;
        if (b17 == null || b17.length() == 0) {
            return false;
        }
        java.lang.String d17 = msgInfo.S2() ? n22.m.d(b17) : n22.m.o(b17);
        if (d17 != null && d17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            c(msgInfo, 0, java.lang.String.valueOf(msgInfo.getMsgId()), b17, d17);
        }
        return false;
    }

    public final int b(com.tencent.mm.storage.f9 msgInfo, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.util.List c17 = xq.s.f456015a.c(msgInfo);
        if (c17.isEmpty()) {
            return 0;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) c17;
        int size = linkedList.size();
        while (i17 < size) {
            java.lang.String str = (java.lang.String) linkedList.get(i17);
            java.lang.String d17 = n22.m.d(str);
            if (!(d17 == null || d17.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(msgInfo.getMsgId());
                sb6.append('_');
                sb6.append(i17);
                java.lang.String key = sb6.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDynamicController", "checkMatchPatMsg: " + key);
                xq.n nVar = this.f456011c;
                nVar.getClass();
                kotlin.jvm.internal.o.g(key, "key");
                java.util.Iterator it = nVar.f456007a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((xq.m) obj).f455989a, key)) {
                        break;
                    }
                }
                if (((xq.m) obj) == null) {
                    c(msgInfo, i17, key, str, d17);
                }
            }
            i17++;
        }
        return linkedList.size();
    }

    public final xq.m c(com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String emojiKey) {
        java.lang.Object obj;
        xq.f fVar;
        f9Var.getClass();
        xq.n nVar = this.f456011c;
        nVar.getClass();
        xq.m mVar = new xq.m();
        java.util.ArrayList arrayList = nVar.f456007a;
        arrayList.add(mVar);
        mVar.f455991c = f9Var.getMsgId();
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        mVar.f455990b = Q0;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        mVar.f455989a = str;
        mVar.f455992d = f9Var.getType();
        mVar.f455993e = this.f456009a;
        mVar.f456006r = this.f456012d;
        boolean z17 = false;
        if (f9Var.A0() == 1) {
            com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct();
            mVar.f456005q = animateEmojiReportStruct;
            animateEmojiReportStruct.f55125h = nr.a.f339029a ? 1 : 0;
            nr.a.f339029a = false;
        }
        com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct2 = mVar.f456005q;
        if (animateEmojiReportStruct2 != null) {
            animateEmojiReportStruct2.f55126i = animateEmojiReportStruct2.b("ChatId", this.f456013e, true);
        }
        com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct3 = mVar.f456005q;
        if (animateEmojiReportStruct3 != null) {
            animateEmojiReportStruct3.f55121d = animateEmojiReportStruct3.b("Content", str2, true);
        }
        kotlin.jvm.internal.o.g(emojiKey, "emojiKey");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDynamicController", "setPlayingKey: ".concat(emojiKey));
        java.util.Iterator it = xq.s.f456019e.f455977c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((xq.c) obj).f455971b, emojiKey)) {
                break;
            }
        }
        xq.c cVar = (xq.c) obj;
        if (cVar != null) {
            java.lang.String filePath = rr.s.f399149a.b() + cVar.f455972c;
            if (com.tencent.mm.vfs.w6.j(filePath)) {
                kotlin.jvm.internal.o.g(filePath, "filePath");
                mVar.f455999k = cVar;
                if (cVar.f455973d != null && (fVar = mVar.f456006r) != null) {
                    java.lang.String msgTalker = mVar.f455990b;
                    java.lang.String animKey = mVar.f455989a;
                    kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
                    kotlin.jvm.internal.o.g(animKey, "animKey");
                    xq.p pVar = ((xq.o) fVar).f456008a.f456014f;
                    if (pVar != null) {
                        com.tencent.mm.ui.chatting.component.ta taVar = ((com.tencent.mm.ui.chatting.component.ma) pVar).f199495a;
                        java.lang.String str3 = taVar.f199973e;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScreenEffect: msg:");
                        xq.d dVar = cVar.f455973d;
                        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f455974b) : null);
                        sb6.append(", ");
                        xq.d dVar2 = cVar.f455973d;
                        sb6.append(dVar2 != null ? java.lang.Integer.valueOf(dVar2.f455975c) : null);
                        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                        if (!taVar.f199974f) {
                            taVar.m0().prepare();
                        }
                    }
                }
                try {
                    mVar.f455997i = new com.tencent.mm.plugin.gif.u(com.tencent.mm.vfs.w6.N(filePath, 0, -1));
                    com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct4 = mVar.f456005q;
                    if (animateEmojiReportStruct4 != null) {
                        animateEmojiReportStruct4.f55123f = 1;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiAnimViewHolder", e17, "create anim", new java.lang.Object[0]);
                    if (e17 instanceof com.tencent.mm.plugin.gif.MMGIFException) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(711, 21);
                        com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct5 = mVar.f456005q;
                        if (animateEmojiReportStruct5 != null) {
                            animateEmojiReportStruct5.f55123f = 2;
                        }
                        if (animateEmojiReportStruct5 != null) {
                            animateEmojiReportStruct5.f55124g = 1;
                        }
                    }
                }
                com.tencent.mm.plugin.gif.u uVar = mVar.f455997i;
                int i18 = uVar != null ? uVar.f142207x : 1;
                if (uVar != null) {
                    uVar.Q = i18;
                }
                if (uVar != null) {
                    ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(uVar.S, 0L);
                }
                com.tencent.mm.plugin.gif.u uVar2 = mVar.f455997i;
                if (uVar2 != null) {
                    uVar2.f142190d = false;
                }
                z17 = true;
            } else {
                xq.s.f456015a.a();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDynamicController", "setPlayingKey: no config");
        }
        if (z17) {
            com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct6 = mVar.f456005q;
            if (animateEmojiReportStruct6 != null) {
                animateEmojiReportStruct6.f55122e = 1;
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct7 = mVar.f456005q;
            if (animateEmojiReportStruct7 != null) {
                animateEmojiReportStruct7.f55122e = 2;
            }
            if (animateEmojiReportStruct7 != null) {
                animateEmojiReportStruct7.k();
            }
            arrayList.remove(mVar);
        }
        return mVar;
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop: ");
        xq.n nVar = this.f456011c;
        sb6.append(nVar.f456007a.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDynamicController", sb6.toString());
        java.util.ArrayList arrayList = nVar.f456007a;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xq.m mVar = (xq.m) it.next();
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "stop: ");
            mVar.b();
        }
        arrayList.clear();
    }

    public final void e(xq.b viewProvider) {
        boolean a17;
        android.widget.FrameLayout frameLayout;
        kotlin.jvm.internal.o.g(viewProvider, "viewProvider");
        xq.n nVar = this.f456011c;
        int size = nVar.f456007a.size();
        int[] rootLocation = this.f456010b;
        if (size > 0 && (frameLayout = this.f456009a) != null) {
            frameLayout.getLocationInWindow(rootLocation);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = nVar.f456007a;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            xq.m mVar = (xq.m) it.next();
            com.tencent.mm.ui.chatting.component.sa saVar = (com.tencent.mm.ui.chatting.component.sa) viewProvider;
            android.view.View b17 = saVar.b(mVar.f455991c);
            if (b17 != null) {
                a17 = mVar.a(saVar.a(b17, mVar.f455989a));
                kotlin.jvm.internal.o.g(rootLocation, "rootLocation");
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = mVar.f455995g;
                if ((mMNeat7extView != null ? mMNeat7extView.getLayout() : null) != null) {
                    android.graphics.RectF a18 = xq.a.f455969a.a(mMNeat7extView);
                    int[] iArr = new int[2];
                    mMNeat7extView.getLocationInWindow(iArr);
                    int i17 = iArr[0] - rootLocation[0];
                    int i18 = iArr[1] - rootLocation[1];
                    boolean isEmpty = a18.isEmpty();
                    android.graphics.RectF rectF = mVar.f455998j;
                    if (isEmpty) {
                        mMNeat7extView.post(new xq.i(mMNeat7extView, mVar, i17, i18));
                        a18.set(rectF);
                    } else {
                        rectF.set(a18);
                    }
                    mVar.d(a18.centerX() + i17 + mMNeat7extView.getPaddingLeft(), a18.centerY() + i18 + mMNeat7extView.getPaddingTop(), (int) a18.width());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "updateView: no layout");
                }
            } else {
                a17 = mVar.a(null);
            }
            if (a17) {
                arrayList.add(mVar);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            xq.m holder = (xq.m) it6.next();
            kotlin.jvm.internal.o.g(holder, "holder");
            arrayList2.remove(holder);
        }
    }
}
