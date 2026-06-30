package un;

/* loaded from: classes11.dex */
public final class g1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f429256d;

    /* renamed from: e, reason: collision with root package name */
    public int f429257e;

    /* renamed from: f, reason: collision with root package name */
    public int f429258f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f429259g;

    /* renamed from: h, reason: collision with root package name */
    public long f429260h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f429261i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f429262m;

    /* renamed from: n, reason: collision with root package name */
    public android.util.Pair f429263n;

    /* renamed from: o, reason: collision with root package name */
    public dn.h f429264o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f429265p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f429266q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f429267r;

    /* renamed from: s, reason: collision with root package name */
    public dn.h f429268s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f429269t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f429270u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f429271v;

    /* renamed from: w, reason: collision with root package name */
    public final dn.k f429272w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429256d = jz5.h.b(new un.e1(this));
        this.f429260h = -1L;
        this.f429263n = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker(-1L, ""), java.lang.Boolean.FALSE);
        this.f429267r = new java.util.ArrayList();
        this.f429269t = jz5.h.b(new un.b1(activity, this));
        this.f429270u = new java.util.HashMap();
        this.f429271v = new java.util.HashMap();
        this.f429272w = new un.a1(this);
    }

    public final java.lang.String T6() {
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        return stringExtra == null ? "" : stringExtra;
    }

    public final dn.m U6(java.lang.String str, boolean z17) {
        dn.m mVar = new dn.m();
        mVar.f241786e = true;
        mVar.f241787f = this.f429272w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String field_mediaId = kk.k.g(bytes);
        mVar.field_mediaId = field_mediaId;
        mVar.field_fullpath = str;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 0;
        mVar.field_bzScene = 0;
        java.util.HashMap hashMap = this.f429270u;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        java.lang.String field_fullpath = mVar.field_fullpath;
        kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
        hashMap.put(field_mediaId, field_fullpath);
        java.util.HashMap hashMap2 = this.f429271v;
        java.lang.String field_mediaId2 = mVar.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId2, "field_mediaId");
        java.lang.String field_mediaId3 = mVar.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId3, "field_mediaId");
        java.lang.String field_fullpath2 = mVar.field_fullpath;
        kotlin.jvm.internal.o.f(field_fullpath2, "field_fullpath");
        hashMap2.put(field_mediaId2, new un.t0(field_mediaId3, field_fullpath2, z17));
        return mVar;
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f429256d).getValue();
    }

    public final void W6(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "triggerErrorCallback errCode:%s errMsg:%s", objArr);
        this.f429262m = true;
        this.f429266q = true;
        this.f429261i = false;
        this.f429265p = false;
        X6();
        ((ku5.t0) ku5.t0.f312615d).B(new un.d1(this, str2));
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f587f;
        if (a18 > j17) {
            a17.f582a.f60372s = a18 - j17;
        }
        a14.a.a().f590i++;
    }

    public final void X6() {
        d75.b.g(new un.f1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.g1.Y6():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i17 != 10001) {
            return;
        }
        boolean z17 = false;
        int intExtra = intent.getIntExtra("select_record_msg_num", 0);
        this.f429257e = intExtra;
        this.f429258f = intExtra;
        this.f429259g = intent.getStringArrayListExtra("key_selected_record_msg_list");
        this.f429264o = null;
        this.f429268s = null;
        this.f429262m = false;
        this.f429266q = false;
        if (this.f429257e == 0) {
            this.f429261i = false;
            this.f429265p = false;
            X6();
        } else {
            this.f429261i = true;
            this.f429265p = true;
            this.f429260h = intent.getLongExtra("select_record_min_msg_id", -1L);
            rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
            int i19 = this.f429257e;
            ((qg5.p0) v0Var).getClass();
            int g17 = com.tencent.mm.ui.chatting.x3.g();
            if (1 <= g17 && g17 < i19) {
                z17 = true;
            }
            if (z17) {
                this.f429258f = com.tencent.mm.ui.chatting.x3.g();
            }
            X6();
            a14.a.a().f587f = c01.id.a();
            this.f429267r = new java.util.ArrayList(com.tencent.mm.ui.chatting.x3.f206228a.f206201a);
            android.util.Pair i27 = com.tencent.mm.ui.chatting.x3.i(getActivity(), "msginfo@fakeuser", true, T6());
            this.f429263n = i27;
            if (((java.lang.Boolean) i27.second).booleanValue()) {
                Y6();
            } else {
                ((com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((jz5.n) this.f429269t).getValue()).alive();
            }
        }
        a14.a.a().f582a.f60362i = this.f429258f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "GET_SELECT_RECORD_MSG selectMsgNum:%s actualSelectMsgNum:%s msgId:%s direct:%s", java.lang.Integer.valueOf(this.f429257e), java.lang.Integer.valueOf(this.f429258f), java.lang.Long.valueOf(((com.tencent.mm.plugin.msg.MsgIdTalker) this.f429263n.first).f149480d), this.f429263n.second);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.z3(getActivity(), new un.u0(this));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new un.z0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (((rd0.v0) i95.n0.c(rd0.v0.class)) != null) {
            com.tencent.mm.ui.chatting.x3.a();
        }
    }
}
