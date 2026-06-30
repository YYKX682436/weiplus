package jy;

/* loaded from: classes14.dex */
public class k extends jy.d implements wx.g1 {

    /* renamed from: f, reason: collision with root package name */
    public final jy.m f302465f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f302466g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f302467h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f302468i;

    /* renamed from: m, reason: collision with root package name */
    public hy.a0 f302469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jy.m screenInfo) {
        super(new jy.q(null, null, false, false));
        java.lang.String str;
        kotlin.jvm.internal.o.g(screenInfo, "screenInfo");
        this.f302465f = screenInfo;
        this.f302466g = "ChatBot.BaseScreenViewModel";
        this.f302467h = jz5.h.b(jy.e.f302458d);
        this.f302468i = jz5.h.b(jy.f.f302459d);
        com.tencent.wechat.aff.chatbot.d0 roomInfo = screenInfo.f302470a;
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        com.tencent.mars.xlog.Log.i("ChatBot.BaseScreenViewModel", "startAISession roomInfo:" + roomInfo);
        jy.q qVar = (jy.q) N6();
        boolean[] zArr = roomInfo.f216144n;
        P6(jy.q.a(qVar, zArr[5] ? roomInfo.f216141h : "", zArr[4] ? roomInfo.f216140g : "", false, false, 12, null));
        com.tencent.wechat.aff.chatbot.i iVar = new com.tencent.wechat.aff.chatbot.i();
        iVar.f216254m = roomInfo.b();
        boolean[] zArr2 = iVar.f216264w;
        zArr2[7] = true;
        iVar.f216253i = c01.id.c();
        zArr2[6] = true;
        iVar.f216248d = (java.lang.String) gm0.j1.u().c().l(4, null);
        zArr2[1] = true;
        iVar.f216255n = (java.lang.String) gm0.j1.u().c().l(2, null);
        zArr2[8] = true;
        iVar.f216249e = com.eclipsesource.mmv8.Platform.ANDROID;
        zArr2[2] = true;
        ly.h hVar = ly.h.f322182a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        iVar.f216251g = java.lang.String.valueOf(hVar.a(context, true));
        zArr2[4] = true;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "1.0.0";
        }
        iVar.f216250f = str;
        zArr2[3] = true;
        iVar.f216252h = false;
        zArr2[5] = true;
        java.util.LinkedList linkedList = roomInfo.f216139f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                iVar.f216257p.add(((com.tencent.wechat.aff.chatbot.a0) it.next()).b());
            }
        }
        java.util.LinkedList linkedList2 = roomInfo.f216139f;
        if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
            com.tencent.wechat.aff.chatbot.a0 a0Var = (com.tencent.wechat.aff.chatbot.a0) linkedList2.get(0);
            iVar.f216256o = a0Var != null ? a0Var.b() : null;
            zArr2[9] = true;
        }
        iVar.f216261t = screenInfo.f302471b;
        zArr2[16] = true;
        iVar.f216258q = iVar.b() + '_' + iVar.c();
        zArr2[11] = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chatbot_");
        sb6.append(iVar.f216253i);
        iVar.f216260s = sb6.toString();
        zArr2[14] = true;
        com.tencent.wechat.aff.chatbot.z2 z2Var = new com.tencent.wechat.aff.chatbot.z2();
        z2Var.f216584d = com.tencent.wechat.aff.chatbot.l2.MSG_VOIP_WELCOME;
        z2Var.Q[1] = true;
        hy.b0 b0Var = hy.b0.f285728a;
        java.util.Optional of6 = java.util.Optional.of(iVar);
        java.util.Optional of7 = java.util.Optional.of(z2Var);
        kotlin.jvm.internal.o.f(of7, "of(...)");
        hy.a0 e17 = b0Var.e("", of6, of7, iVar.b(), iVar.getSessionId(), zArr2[16] ? iVar.f216261t : com.tencent.wechat.aff.chatbot.w.ChatBotOpenScene_Unknown, java.util.Optional.of(roomInfo));
        com.tencent.mars.xlog.Log.i("ChatBot.BaseScreenViewModel", "startSession complete session=" + e17);
        this.f302469m = e17;
        if (e17 != null) {
            e17.b(this);
        }
    }

    @Override // wx.g1
    public void J6(com.tencent.wechat.aff.chatbot.j jVar) {
        com.tencent.mars.xlog.Log.i(this.f302466g, "onTTSBegin");
        P6(jy.q.a((jy.q) N6(), null, null, true, false, 11, null));
        ((gy.c) ((jz5.n) this.f302467h).getValue()).e();
    }

    @Override // wx.g1
    public void R9() {
        com.tencent.mars.xlog.Log.i(this.f302466g, "onCallEnd");
    }

    @Override // jy.l
    public void V2(jy.r rVar, jy.s sVar) {
        jy.p event = (jy.p) rVar;
        jy.q state = (jy.q) sVar;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(state, "state");
        boolean z17 = event instanceof jy.n;
        com.tencent.wechat.aff.chatbot.x1 x1Var = com.tencent.wechat.aff.chatbot.x1.ResponseState_Voice;
        jz5.g gVar = this.f302468i;
        jy.m mVar = this.f302465f;
        java.lang.String str = this.f302466g;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startRecording");
            ((gy.g) ((jz5.n) gVar).getValue()).h();
            hy.a0 a0Var = this.f302469m;
            if (a0Var != null) {
                a0Var.e(mVar.f302470a.b(), true, mVar.f302472c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), jy.i.f302463d);
                return;
            }
            return;
        }
        if (event instanceof jy.o) {
            com.tencent.mars.xlog.Log.i(str, "stopRecording");
            ((gy.g) ((jz5.n) gVar).getValue()).j();
            hy.a0 a0Var2 = this.f302469m;
            if (a0Var2 != null) {
                a0Var2.e(mVar.f302470a.b(), false, mVar.f302472c, 0, false, false, new byte[0], false, x1Var, new java.util.ArrayList(), jy.j.f302464d);
            }
        }
    }

    @Override // wx.g1
    public void X8() {
        com.tencent.mars.xlog.Log.i(this.f302466g, "onTalkSucc");
    }

    @Override // wx.g1
    public void Yb(com.tencent.wechat.aff.chatbot.j jVar) {
        com.tencent.mars.xlog.Log.i(this.f302466g, "onTTSEnd");
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), kotlinx.coroutines.q1.f310568a, null, new jy.h(this, null), 2, null);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        hy.a0 a0Var = this.f302469m;
        if (a0Var != null) {
            a0Var.d(this);
        }
        super.onCleared();
        java.lang.String str = this.f302466g;
        com.tencent.mars.xlog.Log.i(str, "onCleared");
        com.tencent.mars.xlog.Log.i(str, "destroyVoIPSession");
        hy.a0 a0Var2 = this.f302469m;
        if (a0Var2 != null) {
            a0Var2.c(com.tencent.wechat.aff.chatbot.d3.HANGUP_REASON_MANUAL, new jy.g(this));
        }
        this.f302469m = null;
        gy.c cVar = (gy.c) ((jz5.n) this.f302467h).getValue();
        cVar.f();
        cVar.f277465b.release();
        ((gy.g) ((jz5.n) this.f302468i).getValue()).d();
    }
}
