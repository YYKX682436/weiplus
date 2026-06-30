package com.tencent.mm.ui.chatting;

@pk.b(pk.a.NAVIGATION_BAR)
@gm0.a2
/* loaded from: classes11.dex */
public class ChattingUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f198253t = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChattingUIFragment f198254h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout f198256m;

    /* renamed from: r, reason: collision with root package name */
    public vj5.k f198261r;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f198255i = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: n, reason: collision with root package name */
    public al5.r f198257n = al5.r.f6005e;

    /* renamed from: o, reason: collision with root package name */
    public final al5.q f198258o = al5.q.f5989e;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f198259p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f198260q = 0;

    /* renamed from: s, reason: collision with root package name */
    public final m3.i f198262s = new com.tencent.mm.ui.chatting.q8(this);

    public static int e7(com.tencent.mm.storage.z3 z3Var, yb5.d dVar) {
        if (z3Var == null || dVar == null) {
            return -1;
        }
        java.lang.String d17 = z3Var.d1();
        if ("notification_messages".equals(d17) || "notifymessage".equals(d17) || "schedule_message".equals(d17) || "schedule_message".equals(d17)) {
            return 0;
        }
        boolean k27 = z3Var.k2();
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        if (!k27) {
            if (cVar.a(sb5.s.class) == null || !((sb5.s) cVar.a(sb5.s.class)).u()) {
                return dVar.C() ? c01.e2.R(d17) ? 10 : 7 : com.tencent.mm.storage.z3.m4(d17) ? 9 : 6;
            }
            return 8;
        }
        sb5.f fVar = (sb5.f) cVar.a(sb5.f.class);
        if (fVar == null) {
            return -1;
        }
        com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
        return aVar.f198753r ? aVar.f198754s ? 2 : 1 : z3Var.m2() ? 4 : 5;
    }

    public static int f7(int i17, yb5.d dVar) {
        if (dVar == null) {
            return 0;
        }
        boolean r07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).r0();
        switch (i17) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
                return r07 ? 1 : 2;
            case 3:
            case 8:
            default:
                return 0;
        }
    }

    public com.tencent.mm.ui.chatting.ChattingUIFragment c7() {
        return new com.tencent.mm.ui.chatting.ChattingUIFragment(true);
    }

    /* renamed from: d7 */
    public boolean getF202802v() {
        return ((com.tencent.mm.ui.chatting.q8) this.f198262s).get() != null;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f198254h;
        if (chattingUIFragment == null || !chattingUIFragment.onKeyDown(keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f198254h;
        if (chattingUIFragment != null && chattingUIFragment.f198152f.f460708c.a(sb5.p1.class) != null && ((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) this.f198254h.f198152f.f460708c.a(sb5.p1.class))).f198977e && !((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) this.f198254h.f198152f.f460708c.a(sb5.p1.class))).f198978f) {
            int m07 = ((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) this.f198254h.f198152f.f460708c.a(sb5.p1.class))).m0();
            getIntent().putExtra("select_record_msg_num", m07);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198254h.f198152f.f460708c.a(sb5.z.class))).W;
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (copyOnWriteArraySet != null) {
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
                    arrayList.add(msgIdTalker.f149480d + "");
                    long j18 = msgIdTalker.f149480d;
                    if (j18 < j17) {
                        j17 = j18;
                    }
                }
                getIntent().putStringArrayListExtra("key_selected_record_msg_list", arrayList);
                getIntent().putExtra("select_record_min_msg_id", j17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI", "select record msg %s", java.lang.Integer.valueOf(m07));
            setResult(-1, getIntent());
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            hashSet.addAll(importUIComponents);
        }
        hashSet.add(la5.c0.class);
        hashSet.add(la5.m.class);
        hashSet.add(la5.u.class);
        hashSet.add(cd0.b.class);
        hashSet.add(la5.w.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isCallSuperOnSaveInstanceState() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_opt_saveinstance, true) && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f198254h.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.ui.chatting.q8 q8Var = (com.tencent.mm.ui.chatting.q8) this.f198262s;
        if (q8Var.get() != null) {
            ((com.tencent.mm.ui.chatting.db) q8Var.get()).d7();
        }
        if (fp.e0.e() || u75.e.a() || fp.e0.f()) {
            com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent = new com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent();
            boolean contains = configuration.toString().contains("mWindowingMode=100");
            am.am amVar = oPPOFloatWindowModeChangedEvent.f54555g;
            amVar.f6163a = contains;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", java.lang.Boolean.valueOf(amVar.f6163a));
            oPPOFloatWindowModeChangedEvent.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.ChattingUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m3.i iVar = this.f198262s;
        if (((com.tencent.mm.ui.chatting.q8) iVar).get() != null) {
            ((com.tencent.mm.ui.chatting.db) ((com.tencent.mm.ui.chatting.q8) iVar).get()).a7();
        }
        vj5.n.b(this).f(this.f198261r);
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (com.tencent.mm.ui.bk.y()) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63527m = false;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI", "chatting onRequestPermissionsResult");
        this.f198254h.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((os.a) ((ps.e) i95.n0.c(ps.e.class))).getClass();
        if (com.tencent.mm.plugin.ai.data.business.tools_mp.a.f74654d.a()) {
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
        if (com.tencent.mm.ui.bk.y()) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63527m = true;
        }
        sb5.e1 e1Var = (sb5.e1) this.f198254h.f198152f.f460708c.a(sb5.e1.class);
        if (e1Var != null) {
            this.f198260q = ((com.tencent.mm.ui.chatting.component.ah) e1Var).f198624f;
        }
        int e76 = e7(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f198259p, true), this.f198254h.f198152f);
        if (e76 == 6) {
            cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Single);
            aVar.Rj(this, iy1.a.SingleChat);
            aVar.dk(this, "ChattingUI_Single");
            return;
        }
        if (e76 == 7) {
            cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Group);
            aVar2.Rj(this, iy1.a.GroupChat);
            aVar2.dk(this, "ChattingUI_Group");
            return;
        }
        if (e76 == 9) {
            cy1.a aVar3 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseSingle);
            aVar3.Rj(this, iy1.a.EnterpriseSingle);
            aVar3.dk(this, "ChattingUI_EnterpriseSingle");
            return;
        }
        if (e76 == 10) {
            cy1.a aVar4 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseGroup);
            aVar4.Rj(this, iy1.a.EnterpriseGroup);
            aVar4.dk(this, "ChattingUI_EnterpriseGroup");
            return;
        }
        if (e76 == 4 || e76 == 5) {
            cy1.a aVar5 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Service);
            aVar5.Rj(this, iy1.a.ServiceChat);
            aVar5.dk(this, "ChattingUI_Service");
            return;
        }
        if (e76 == 0) {
            cy1.a aVar6 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_NotifyMessages);
            aVar6.Rj(this, iy1.a.ServiceNotification);
            aVar6.dk(this, "ChattingUI_NotifyMessages");
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        m3.i iVar = this.f198262s;
        if (((com.tencent.mm.ui.chatting.q8) iVar).get() != null) {
            i17 = ((com.tencent.mm.ui.chatting.db) ((com.tencent.mm.ui.chatting.q8) iVar).get()).e7(i17);
        }
        super.setRequestedOrientation(i17);
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (intent != null && intent.getComponent() != null) {
            com.tencent.mm.ui.tools.sd.f210742a.a(intent.getComponent().getClassName());
        }
        super.startActivityForResult(intent, i17, bundle);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        if (((com.tencent.mm.ui.chatting.q8) this.f198262s).get() != null) {
            return false;
        }
        return super.supportNavigationSwipeBack();
    }
}
