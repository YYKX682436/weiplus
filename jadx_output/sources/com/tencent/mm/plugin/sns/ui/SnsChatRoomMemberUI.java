package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class SnsChatRoomMemberUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f166838s = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f166841f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166842g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166843h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166844i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f166845m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f166846n;

    /* renamed from: p, reason: collision with root package name */
    public vg3.x3 f166848p;

    /* renamed from: r, reason: collision with root package name */
    public int f166850r;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.GridView f166839d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.kf f166840e = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f166847o = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public boolean f166849q = false;

    public static java.lang.String T6(com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI, com.tencent.mm.storage.a3 a3Var, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        snsChatRoomMemberUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (a3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            str2 = "";
        } else {
            java.lang.String z07 = a3Var.z0(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            str2 = z07;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return str2;
    }

    public final int U6(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            return 0;
        }
        int width = (int) ((((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - (context.getResources().getDimension(com.tencent.mm.R.dimen.f479876hp) * 1.0f)) / ((int) ((context.getResources().getDimension(com.tencent.mm.R.dimen.f479884hx) * 2.0f) + context.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3))));
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsChatRoomMemberUI", "[getWrapColNum] :%s", java.lang.Integer.valueOf(width));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return width;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return com.tencent.mm.R.layout.cqx;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        super.onConfigurationChanged(configuration);
        this.f166839d.setNumColumns(U6(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        super.onCreate(bundle);
        this.f166848p = (vg3.x3) gm0.j1.s(vg3.x3.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        this.f166842g = getIntent().getStringExtra("RoomInfo_Id");
        this.f166845m = getIntent().getStringExtra("room_name");
        this.f166843h = getIntent().getStringExtra("Add_address_titile");
        int i17 = 0;
        getIntent().getIntExtra("room_member_count", 0);
        this.f166850r = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f166849q = getIntent().getBooleanExtra("filter_open_im", false);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f166842g);
        this.f166841f = z07;
        if (z07 != null) {
            this.f166844i = z07.field_roomowner;
            this.f166846n = c01.z1.r().equals(this.f166844i);
        }
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.tencent.mm.R.id.f487018n72);
        this.f166839d = gridView;
        gridView.setNumColumns(U6(this));
        this.f166839d.setColumnWidth(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479876hp));
        com.tencent.mm.plugin.sns.ui.kf kfVar = new com.tencent.mm.plugin.sns.ui.kf(this, this, this.f166841f, this.f166842g, null, this.f166844i);
        this.f166840e = kfVar;
        this.f166839d.setAdapter((android.widget.ListAdapter) kfVar);
        com.tencent.mm.plugin.sns.ui.kf kfVar2 = this.f166840e;
        com.tencent.mm.plugin.sns.ui.ff ffVar = new com.tencent.mm.plugin.sns.ui.ff(this);
        kfVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMemberItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        kfVar2.f169629f = ffVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMemberItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.f166842g;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        java.util.List list = this.f166847o;
        if (m17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        } else {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.clear();
            while (true) {
                java.util.LinkedList linkedList = (java.util.LinkedList) m17;
                if (i17 >= linkedList.size()) {
                    break;
                }
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) this.f166848p).Bi().n((java.lang.String) linkedList.get(i17), true);
                java.lang.String d17 = n17.d1();
                if ((!this.f166849q || android.text.TextUtils.isEmpty(d17) || !d17.contains("@openim")) && n17.r2() && !c01.z1.J(n17.d1())) {
                    if (this.f166841f.L0(n17.d1())) {
                        arrayList.add(new com.tencent.mm.plugin.sns.ui.Cif(1, n17, 3));
                    } else if (this.f166841f.G0(n17.d1())) {
                        arrayList.add(new com.tencent.mm.plugin.sns.ui.Cif(1, n17, 2));
                    } else {
                        arrayList.add(new com.tencent.mm.plugin.sns.ui.Cif(1, n17, 1));
                    }
                }
                i17++;
            }
            java.util.Collections.sort(list, new com.tencent.mm.plugin.sns.ui.gf(this));
            this.f166840e.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        }
        setMMTitle(this.f166843h + "(" + ((java.util.ArrayList) list).size() + ")");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        setBackBtn(new com.tencent.mm.plugin.sns.ui.hf(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
    }
}
