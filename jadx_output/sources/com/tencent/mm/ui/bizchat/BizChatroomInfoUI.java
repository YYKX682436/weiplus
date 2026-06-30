package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class BizChatroomInfoUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0, r01.w2 {
    public static final /* synthetic */ int H = 0;
    public int B;
    public r01.m C;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f197937e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.preference.SignaturePreference f197938f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f197939g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f197940h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f197941i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f197942m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f197944o;

    /* renamed from: p, reason: collision with root package name */
    public long f197945p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f197946q;

    /* renamed from: s, reason: collision with root package name */
    public int f197948s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f197950u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197951v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f197952w;

    /* renamed from: x, reason: collision with root package name */
    public int f197953x;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f197936d = null;

    /* renamed from: n, reason: collision with root package name */
    public android.content.SharedPreferences f197943n = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197947r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f197949t = false;

    /* renamed from: y, reason: collision with root package name */
    public s01.h f197954y = null;

    /* renamed from: z, reason: collision with root package name */
    public s01.a0 f197955z = null;
    public s01.a0 A = null;
    public final com.tencent.mm.pluginsdk.ui.b0 D = new com.tencent.mm.pluginsdk.ui.b0(new hb5.t0(this));
    public boolean E = false;
    public boolean F = false;
    public final s01.l G = new hb5.s0(this);

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j53 j53Var;
        com.tencent.mm.protobuf.f fVar;
        android.app.ProgressDialog progressDialog = this.f197936d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f197936d = null;
        }
        if (m1Var.getType() != 1355) {
            if (m1Var.getType() == 1356) {
                if (i17 != 0) {
                    V6();
                    return;
                }
                return;
            } else {
                if (m1Var.getType() != 1353 || i17 < 0 || this.f197955z == null) {
                    return;
                }
                this.f197955z = r01.q3.Vi().y0(this.f197955z.field_userId);
                onDataChanged();
                return;
            }
        }
        s01.g0 g0Var = (s01.g0) m1Var;
        r45.v90 H2 = g0Var.H();
        com.tencent.mm.modelbase.o oVar = g0Var.f401874e;
        r45.u90 u90Var = (oVar == null || (fVar = oVar.f70710a.f70684a) == null) ? null : (r45.u90) fVar;
        if (i17 < 0 || H2 == null || (j53Var = H2.f388000e) == null || j53Var.f377592d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatroomInfoUI", "onBizChatSceneEnd createBizChatInfo failed, resCode=%d", java.lang.Integer.valueOf(i17));
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.i3x), 0).show();
            return;
        }
        s01.h D0 = r01.q3.Ui().D0(H2.f388000e.f377592d.f383085d);
        if (D0 == null) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.i3x), 0).show();
            return;
        }
        if (this.B == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
            intent.putExtra("Contact_User", u90Var.f387151d);
            intent.putExtra("biz_chat_chat_id", D0.field_bizChatLocalId);
            j45.l.u(this, ".ui.bizchat.BizChatConversationUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.addFlags(67108864);
        intent2.putExtra("Chat_User", u90Var.f387151d);
        intent2.putExtra("key_biz_chat_id", D0.field_bizChatLocalId);
        intent2.putExtra("finish_direct", true);
        intent2.putExtra("key_need_send_video", false);
        intent2.putExtra("key_is_biz_chat", true);
        intent2.setClass(this, com.tencent.mm.ui.chatting.ChattingUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatroomInfoUI", "onBizChatSceneEnd", "(ILcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/bizchat/BizChatroomInfoUI", "onBizChatSceneEnd", "(ILcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "dealModChatNameFail reset bizChatName");
        s01.h hVar = this.f197954y;
        hVar.field_chatName = this.f197946q;
        hVar.field_bitFlag = this.f197953x;
        this.f197950u = hVar.t0(1);
        this.f197951v = this.f197954y.t0(8);
        this.f197952w = this.f197954y.t0(16);
        r01.q3.Ui().P0(this.f197954y);
        boolean z17 = this.f197952w;
        if (z17) {
            r01.q3.aj().i1(this.f197954y.field_bizChatLocalId);
        } else if (!z17) {
            r01.q3.aj().k1(this.f197954y.field_bizChatLocalId);
        }
        android.content.SharedPreferences.Editor edit = this.f197943n.edit();
        s01.g aj6 = r01.q3.aj();
        edit.putBoolean("room_placed_to_the_top", aj6.f1(aj6.J0(this.f197954y.field_bizChatLocalId))).commit();
        a7();
        Y6();
        Z6();
        c7();
        dp.a.makeText(this, getString(com.tencent.mm.R.string.i3y), 0).show();
    }

    public final void W6(boolean z17, int i17) {
        s01.h hVar = this.f197954y;
        int i18 = hVar.field_bitFlag;
        this.f197953x = i18;
        this.f197946q = hVar.field_chatName;
        if (this.f197949t) {
            if (z17) {
                hVar.field_bitFlag = i18 | i17;
            } else {
                hVar.field_bitFlag = (~i17) & i18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "dealSetMute:bitFlag %s", java.lang.Integer.valueOf(hVar.field_bitFlag));
            r01.q3.Ui().P0(this.f197954y);
        } else {
            if (z17) {
                s01.a0 a0Var = this.f197955z;
                a0Var.field_bitFlag = i17 | a0Var.field_bitFlag;
            } else {
                s01.a0 a0Var2 = this.f197955z;
                a0Var2.field_bitFlag = (~i17) & a0Var2.field_bitFlag;
            }
            r01.q3.Vi().J0(this.f197955z);
            this.f197954y.field_bitFlag = this.f197955z.field_bitFlag;
            r01.q3.Ui().P0(this.f197954y);
        }
        r45.pj pjVar = new r45.pj();
        s01.h hVar2 = this.f197954y;
        pjVar.f383085d = hVar2.field_bizChatServId;
        pjVar.f383090i = hVar2.field_bitFlag;
        r01.q3.Ni().n(this.f197954y.field_brandUserName, pjVar, this);
    }

    public final void X6(r45.tj tjVar, r45.tj tjVar2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "updateBizChatMemberList()");
        java.lang.String string = getString(tjVar == null ? com.tencent.mm.R.string.i4_ : com.tencent.mm.R.string.f489854dm);
        s01.y Ni = r01.q3.Ni();
        s01.h hVar = this.f197954y;
        java.lang.String str = hVar.field_brandUserName;
        java.lang.String str2 = hVar.field_bizChatServId;
        Ni.getClass();
        s01.q0 q0Var = new s01.q0(str, str2, tjVar, tjVar2, this);
        gm0.j1.n().f273288b.g(q0Var);
        this.f197936d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), string, true, true, new hb5.w0(this, q0Var));
    }

    public final void Y6() {
        if (this.f197943n == null) {
            this.f197943n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f197949t) {
            this.f197950u = this.f197954y.t0(1);
            this.f197953x = this.f197954y.field_bitFlag;
        } else {
            this.f197950u = this.f197955z.t0(1);
            this.f197953x = this.f197955z.field_bitFlag;
        }
        if (this.f197950u) {
            setTitleMuteIconVisibility(0);
            if (this.f197940h != null) {
                this.f197943n.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            setTitleMuteIconVisibility(8);
            if (this.f197940h != null) {
                this.f197943n.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f197937e).notifyDataSetChanged();
    }

    public final void Z6() {
        if (this.f197943n == null) {
            this.f197943n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f197949t) {
            this.f197952w = this.f197954y.t0(16);
            this.f197953x = this.f197954y.field_bitFlag;
        } else {
            this.f197952w = this.f197955z.t0(16);
            this.f197953x = this.f197955z.field_bitFlag;
        }
        if (this.f197941i != null) {
            this.f197943n.edit().putBoolean("room_placed_to_the_top", this.f197952w).commit();
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f197937e).notifyDataSetChanged();
    }

    public final void a7() {
        if (this.f197938f != null) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(this.f197949t ? this.f197954y.field_chatName : this.f197955z.field_userName))) {
                this.f197938f.H(getString(com.tencent.mm.R.string.i4x));
                return;
            }
            java.lang.String str = this.f197954y.field_chatName;
            if (str != null && str.length() > 50) {
                str = str.substring(0, 32);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "updateRoomName chatName:%s", str);
            com.tencent.mm.chatroom.ui.preference.SignaturePreference signaturePreference = this.f197938f;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            if (str == null || str.length() <= 0) {
                str = getString(com.tencent.mm.R.string.iy8);
            }
            ((ke0.e) xVar).getClass();
            signaturePreference.H(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final void b7() {
        java.util.LinkedList linkedList;
        if (this.f197939g != null) {
            if (this.f197949t) {
                long j17 = this.f197945p;
                java.lang.String str = s01.r.f401924a;
                linkedList = r01.q3.Ui().z0(j17).w0();
            } else {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.add(this.f197954y.field_bizChatServId);
                linkedList = linkedList2;
            }
            if (linkedList != null) {
                this.f197948s = linkedList.size();
            } else {
                this.f197948s = 0;
            }
            if (this.f197948s <= 1) {
                com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f197939g;
                contactListExpandPreference.T(true);
                contactListExpandPreference.V(false);
            } else {
                com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f197939g;
                contactListExpandPreference2.T(true);
                contactListExpandPreference2.V(this.f197947r);
            }
            r01.m mVar = this.C;
            if (mVar != null && mVar.field_hide_mod_chat_member) {
                com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f197939g;
                contactListExpandPreference3.T(false);
                contactListExpandPreference3.V(false);
            }
            this.f197939g.O(this.f197944o, linkedList, true);
        }
    }

    public final void c7() {
        if (this.f197943n == null) {
            this.f197943n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f197949t) {
            this.f197951v = this.f197954y.t0(8);
            this.f197953x = this.f197954y.field_bitFlag;
        } else {
            this.f197951v = this.f197955z.t0(8);
            this.f197953x = this.f197955z.field_bitFlag;
        }
        if (this.f197951v) {
            if (this.f197942m != null) {
                this.f197943n.edit().putBoolean("room_save_to_contact", true).commit();
            }
        } else if (this.f197942m != null) {
            this.f197943n.edit().putBoolean("room_save_to_contact", false).commit();
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f197937e).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.b(this, getListView(), sharedPreferences);
    }

    public final void d7() {
        if (!this.f197949t) {
            setMMTitle(getString(com.tencent.mm.R.string.i78));
            return;
        }
        int h17 = s01.r.h(this.f197945p);
        this.f197948s = h17;
        if (h17 == 0) {
            setMMTitle(getString(com.tencent.mm.R.string.i78));
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.f492133fc0, getString(com.tencent.mm.R.string.i78), java.lang.Integer.valueOf(this.f197948s)));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494836j;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f197937e = getPreferenceScreen();
        s01.h hVar = this.f197954y;
        java.lang.String str = hVar.field_ownerUserId;
        this.f197948s = hVar.w0().size();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f197947r = false;
        } else {
            this.f197947r = str.equals(r01.q3.Vi().z0(this.f197944o));
        }
        qk.o b17 = r01.q3.cj().b1(this.f197944o);
        this.C = r01.q3.bj().y0(b17.y0());
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "getMainBrandAttr father %s", b17.y0());
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197937e).h("roominfo_contact_anchor");
        this.f197939g = contactListExpandPreference;
        contactListExpandPreference.R(this.f197937e, contactListExpandPreference.f197780q);
        this.f197938f = (com.tencent.mm.chatroom.ui.preference.SignaturePreference) ((com.tencent.mm.ui.base.preference.h0) this.f197937e).h("room_name");
        this.f197940h = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197937e).h("room_notify_new_msg");
        this.f197941i = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197937e).h("room_placed_to_the_top");
        this.f197942m = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f197937e).h("room_save_to_contact");
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f197939g;
        boolean z17 = this.f197949t;
        lz.f fVar = contactListExpandPreference2.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.f369297p = z17;
        }
        boolean z18 = this.f197947r;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.f369296o = z18;
        }
        if (z18) {
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(true);
        } else {
            contactListExpandPreference2.T(true);
            contactListExpandPreference2.V(false);
        }
        r01.m mVar = this.C;
        if (mVar != null && mVar.field_hide_mod_chat_member) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = this.f197939g;
            contactListExpandPreference3.T(false);
            contactListExpandPreference3.V(false);
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference4 = this.f197939g;
        java.lang.String str2 = this.f197954y.field_ownerUserId;
        lz.f fVar2 = contactListExpandPreference4.M;
        if (fVar2 != null) {
            ((r35.u1) fVar2).f369274f.D = str2;
        }
        if (fVar2 != null) {
            ((r35.u1) fVar2).f369274f.getClass();
        }
        lz.f fVar3 = this.f197939g.M;
        if (fVar3 != null) {
            ((r35.u1) fVar3).f369273e = false;
        }
        if (!this.f197949t) {
            ((com.tencent.mm.ui.base.preference.h0) this.f197937e).m("room_save_to_contact", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197937e).m("room_name", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f197937e).m("room_del_quit", true);
        }
        c7();
        Z6();
        Y6();
        if (this.f197939g != null) {
            android.widget.ListView listView = getListView();
            com.tencent.mm.pluginsdk.ui.b0 b0Var = this.D;
            listView.setOnScrollListener(b0Var);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference5 = this.f197939g;
            lz.f fVar4 = contactListExpandPreference5.M;
            if (fVar4 != null) {
                ((r35.u1) fVar4).f369274f.f369303v = b0Var;
            }
            contactListExpandPreference5.Z(new hb5.x0(this));
        }
        setBackBtn(new hb5.y0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.bizchat.BizChatroomInfoUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        s01.a0 y07;
        s01.h hVar;
        super.onCreate(bundle);
        s01.m Ui = r01.q3.Ui();
        Ui.f401901e.a(this.G, android.os.Looper.getMainLooper());
        this.B = getIntent().getIntExtra("key_biz_chat_info_from_scene", -1);
        this.f197944o = getIntent().getStringExtra("Chat_User");
        this.f197945p = getIntent().getLongExtra("key_biz_chat_id", -1L);
        s01.h z07 = r01.q3.Ui().z0(this.f197945p);
        this.f197954y = z07;
        this.f197946q = z07.field_chatName;
        boolean o17 = s01.r.o(z07.field_bizChatServId);
        this.f197949t = o17;
        if (!o17) {
            this.f197955z = r01.q3.Vi().y0(this.f197954y.field_bizChatServId);
        }
        s01.d0 Vi = r01.q3.Vi();
        java.lang.String str = this.f197944o;
        if (str == null) {
            Vi.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo brandUserName is null");
        } else {
            java.lang.String z08 = Vi.z0(str);
            if (z08 != null) {
                y07 = Vi.y0(z08);
                this.A = y07;
                initView();
                hVar = this.f197954y;
                if (hVar != null || hVar.field_bizChatServId == null || this.f197944o == null) {
                    return;
                }
                if (!hVar.y0()) {
                    r01.q3.Ni().i(this.f197954y.field_bizChatServId, this.f197944o, this);
                    return;
                }
                s01.y Ni = r01.q3.Ni();
                java.lang.String str2 = this.f197954y.field_bizChatServId;
                java.lang.String str3 = this.f197944o;
                Ni.getClass();
                gm0.j1.n().f273288b.g(new s01.h0(str2, str3, true));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo myUserIdString is null");
        }
        y07 = null;
        this.A = y07;
        initView();
        hVar = this.f197954y;
        if (hVar != null) {
        }
    }

    public final void onDataChanged() {
        if (this.f197939g != null) {
            a7();
            d7();
            Y6();
            b7();
            c7();
            Z6();
            this.f197939g.s();
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f197937e).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        zg5.a.b();
        zg5.a.b();
        s01.m Ui = r01.q3.Ui();
        s01.l lVar = this.G;
        l75.v0 v0Var = Ui.f401901e;
        if (v0Var != null) {
            v0Var.j(lVar);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("room_name")) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(this.f197949t ? this.f197954y.field_chatName : this.f197955z.field_userName) ^ true ? this.f197954y.field_chatName : "";
            db5.e1.N(getContext(), getString(com.tencent.mm.R.string.i5m), str2, "", 32, new hb5.z0(this, str2));
            return false;
        }
        if (str.equals("room_notify_new_msg")) {
            boolean z17 = !this.f197950u;
            this.f197950u = z17;
            W6(z17, 1);
            Y6();
            return false;
        }
        if (!str.equals("room_placed_to_the_top")) {
            if (str.equals("room_del_quit")) {
                db5.e1.u(getContext(), getString(com.tencent.mm.R.string.bo8), "", new hb5.a1(this), null);
                return false;
            }
            if (!str.equals("room_save_to_contact")) {
                return false;
            }
            boolean z18 = !this.f197951v;
            this.f197951v = z18;
            W6(z18, 8);
            c7();
            return false;
        }
        boolean z19 = !this.f197952w;
        this.f197952w = z19;
        W6(z19, 16);
        if (this.f197952w) {
            r01.q3.aj().i1(this.f197954y.field_bizChatLocalId);
        } else {
            r01.q3.aj().k1(this.f197954y.field_bizChatLocalId);
        }
        boolean z27 = this.f197952w;
        qn.e eVar = qn.e.f364886a;
        if (z27) {
            eVar.b(this.f197946q, qn.d.f364883f, qn.b.f364873e);
            return false;
        }
        eVar.b(this.f197946q, qn.d.f364882e, qn.b.f364873e);
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        a7();
        d7();
        Y6();
        Z6();
        c7();
        b7();
        ((com.tencent.mm.ui.base.preference.h0) this.f197937e).notifyDataSetChanged();
        super.onResume();
        if (this.E) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            int o17 = ((com.tencent.mm.ui.base.preference.h0) this.f197937e).o(stringExtra);
            setSelection(o17 - 3);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new hb5.u0(this, o17), 10L);
        }
        this.E = true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], scene is null", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        this.f197948s = s01.r.h(this.f197945p);
        android.app.ProgressDialog progressDialog = this.f197936d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(this, null, null);
        } else if (i17 == 0 && i18 == 0) {
            m1Var.getType();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatroomInfoUI", "willen onSceneEnd err:Network not ok");
            V6();
        }
    }
}
