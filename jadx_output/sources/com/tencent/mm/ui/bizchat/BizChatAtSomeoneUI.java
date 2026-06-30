package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class BizChatAtSomeoneUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f197886o;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f197887d;

    /* renamed from: e, reason: collision with root package name */
    public hb5.e f197888e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f197889f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f197890g;

    /* renamed from: h, reason: collision with root package name */
    public s01.h f197891h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f197892i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f197893m;

    /* renamed from: n, reason: collision with root package name */
    public long f197894n;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488159ir;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String[] strArr;
        setMMTitle(this.f197893m);
        setBackBtn(new hb5.a(this));
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        this.f197892i = c9Var;
        c9Var.f210324i = new hb5.b(this);
        addSearchMenu(true, c9Var);
        this.f197887d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.bgy);
        s01.a0 a0Var = new s01.a0();
        s01.h hVar = this.f197891h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f197890g)) {
            strArr = null;
        } else {
            strArr = this.f197890g.split(";");
            java.util.Arrays.toString(strArr);
        }
        java.lang.String[] strArr2 = strArr;
        java.util.List linkedList = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f197889f)) {
            linkedList = com.tencent.mm.sdk.platformtools.t8.P1(this.f197889f.split(";"));
        }
        this.f197888e = new hb5.e(this, a0Var, hVar, strArr2, linkedList);
        this.f197887d.setOnItemClickListener(new hb5.c(this));
        this.f197887d.setAdapter((android.widget.ListAdapter) this.f197888e);
        this.f197887d.setOnScrollListener(new hb5.d(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f197889f = getIntent().getStringExtra("Block_list");
        this.f197890g = getIntent().getStringExtra("Chatroom_member_list");
        getIntent().getStringExtra("Chat_User");
        this.f197893m = getIntent().getStringExtra("Add_address_titile");
        this.f197894n = getIntent().getLongExtra("key_biz_chat_id", -1L);
        s01.h z07 = r01.q3.Ui().z0(this.f197894n);
        this.f197891h = z07;
        if (z07.field_ownerUserId.equals(c01.z1.r())) {
            f197886o = true;
        }
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f197888e.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.c9 c9Var = this.f197892i;
        if (c9Var != null) {
            c9Var.b();
        }
    }
}
