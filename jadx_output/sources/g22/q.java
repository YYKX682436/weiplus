package g22;

/* loaded from: classes15.dex */
public final class q implements i22.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment f267855a;

    public q(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f267855a = emojiStoreV3HomeBaseFragment;
    }

    @Override // i22.o0
    public void a(i22.m holder, int i17, i22.n0 n0Var) {
        byte[] bArr;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (n0Var == null) {
            return;
        }
        int i18 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment.C;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f267855a;
        emojiStoreV3HomeBaseFragment.m0().getClass();
        int type = n0Var.getType();
        if (type == 1) {
            i22.m0 m0Var = n0Var instanceof i22.m0 ? (i22.m0) n0Var : null;
            j12.i iVar = m0Var != null ? m0Var.f288004a : null;
            if (iVar == null) {
                com.tencent.mars.xlog.Log.i(emojiStoreV3HomeBaseFragment.f98412d, "click Failed, type:1");
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
            i22.q x17 = emojiStoreV3HomeBaseFragment.m0().x(i17);
            if (x17 != null) {
                b17.p(java.lang.String.valueOf(i17 - x17.f288010a));
                b17.f56076j = x17.f288012c;
            }
            b17.f56070d = j22.a.f297249a;
            b17.f56071e = 1;
            b17.f56072f = 3;
            b17.u(iVar.f297167b.f392128d);
            b17.q(iVar.f297167b.f392130f);
            b17.r(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(iVar.f297167b.D)));
            b17.t(java.lang.String.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(iVar.f297167b.D)));
            b17.s(com.tencent.mm.plugin.emoji.model.EmojiLogic.m(iVar.f297167b.D));
            b17.v(iVar.f297176k);
            b17.k();
            y12.m.c(emojiStoreV3HomeBaseFragment.getContext(), iVar.f297167b, false, 1, iVar.f297171f, iVar.f297170e, emojiStoreV3HomeBaseFragment.f98426u, 5, b17, false);
            return;
        }
        if (type != 6) {
            if (type == 3) {
                i22.a1 a1Var = n0Var instanceof i22.a1 ? (i22.a1) n0Var : null;
                r45.kj0 kj0Var = a1Var != null ? a1Var.f287926b : null;
                if (kj0Var != null) {
                    y12.m.f(emojiStoreV3HomeBaseFragment.getContext(), kj0Var.f378729g, kj0Var.f378727e, kj0Var.f378733n, kj0Var.f378732m, kj0Var.f378730h, a1Var.f287928d + 10000);
                    return;
                }
                return;
            }
            if (type != 4) {
                return;
            }
            i22.c1 c1Var = n0Var instanceof i22.c1 ? (i22.c1) n0Var : null;
            r45.ri0 ri0Var = c1Var != null ? c1Var.f287952a : null;
            if (ri0Var != null) {
                android.app.Activity context = emojiStoreV3HomeBaseFragment.getContext();
                if (context != null) {
                    k22.g d17 = n22.f.d(n22.f.f334290a, context, n22.m.i(ri0Var), true, null, null, null, 0, 0L, c1Var.f287953b + 10000, 0, 0L, null, null, null, null, 32504, null);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ri0Var.f384901v)) {
                        java.lang.String StoreMeaning = ri0Var.f384901v;
                        kotlin.jvm.internal.o.f(StoreMeaning, "StoreMeaning");
                        d17.d(StoreMeaning);
                    }
                }
                j22.a.e(ri0Var, 0, 3, 0L, c1Var.f287953b + 10000);
                return;
            }
            return;
        }
        i22.k0 k0Var = n0Var instanceof i22.k0 ? (i22.k0) n0Var : null;
        if (k0Var == null || (bArr = k0Var.f287996b) == null) {
            return;
        }
        android.app.Activity context2 = emojiStoreV3HomeBaseFragment.getContext();
        java.lang.String str = k0Var.f287997c;
        int i19 = k0Var.f287998d + 10000;
        if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context2);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context2, com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI.class);
        intent.putExtra("topic_name", str);
        intent.putExtra("emotion_list_buf", bArr);
        intent.putExtra("entrance_scene", i19);
        intent.putExtra("extra_ip_set_key", (java.lang.String) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3TopicEmotionList", "(Landroid/content/Context;Ljava/lang/String;[BILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3TopicEmotionList", "(Landroid/content/Context;Ljava/lang/String;[BILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // i22.p0
    public void b(i22.m holder, int i17, i22.n0 n0Var) {
        j12.i iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (n0Var != null && n0Var.getType() == 1) {
            i22.v vVar = (i22.v) holder;
            i22.m0 m0Var = n0Var instanceof i22.m0 ? (i22.m0) n0Var : null;
            if (m0Var == null || (iVar = m0Var.f288004a) == null) {
                return;
            }
            int i18 = iVar.f297171f;
            int i19 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment.C;
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f267855a;
            i22.q x17 = emojiStoreV3HomeBaseFragment.m0().x(i17);
            if (i18 == 9) {
                java.lang.String string = emojiStoreV3HomeBaseFragment.getString(com.tencent.mm.R.string.f490583z4);
                if (emojiStoreV3HomeBaseFragment.isFinishing()) {
                    com.tencent.mars.xlog.Log.i(emojiStoreV3HomeBaseFragment.f98412d, "[showLoadingDialog] activity is finished.");
                } else {
                    emojiStoreV3HomeBaseFragment.f98420o = db5.e1.Q(emojiStoreV3HomeBaseFragment.thisActivity(), emojiStoreV3HomeBaseFragment.getString(com.tencent.mm.R.string.f490573yv), string, true, true, g22.t.f267867d);
                }
            }
            if (vVar.K == null) {
                vVar.K = emojiStoreV3HomeBaseFragment.n0().f267823e;
            }
            if (vVar.f288038J == null) {
                i22.b0 b0Var = new i22.b0();
                b0Var.f287934c = emojiStoreV3HomeBaseFragment.thisActivity();
                b0Var.f287935d = vVar;
                b0Var.f287936e = emojiStoreV3HomeBaseFragment.n0().f267823e;
                b0Var.f287937f = x17 != null ? x17.f288012c : 0;
                com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
                b17.f56071e = 1;
                b17.f56070d = j22.a.f297249a;
                if (x17 != null) {
                    b17.p(java.lang.String.valueOf(i17 - x17.f288010a));
                    b17.f56076j = x17.f288012c;
                }
                b0Var.f287944m = b17;
                b0Var.f287940i = emojiStoreV3HomeBaseFragment;
                if (emojiStoreV3HomeBaseFragment.q0()) {
                    boolean z17 = com.tencent.mm.plugin.emoji.model.o.a().f97588d;
                }
                vVar.f288038J = b0Var;
            }
            i22.b0 b0Var2 = vVar.f288038J;
            emojiStoreV3HomeBaseFragment.f98421p = b0Var2;
            if (b0Var2 != null) {
                b0Var2.b();
            }
        }
    }
}
