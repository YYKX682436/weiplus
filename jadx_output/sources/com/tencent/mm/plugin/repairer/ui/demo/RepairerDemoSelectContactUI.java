package com.tencent.mm.plugin.repairer.ui.demo;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerDemoSelectContactUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f158074e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f158075d = jz5.h.b(new yw3.c1(this));

    public final em.x2 U6() {
        return (em.x2) ((jz5.n) this.f158075d).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cfk;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        if (i17 == 1 || i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "selectUsernames " + intent.getStringExtra("Select_Conv_User"));
        }
        if (i17 == 3) {
            java.lang.String stringExtra = intent.getStringExtra("select_chatrooms");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            if (!(!f07.isEmpty())) {
                f07 = null;
            }
            if (f07 != null) {
                java.util.Iterator it = f07.iterator();
                while (it.hasNext()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "selectUsername " + ((java.lang.String) it.next()));
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new yw3.r0(this));
        em.x2 U6 = U6();
        if (U6.f254919c == null) {
            U6.f254919c = (android.widget.Button) U6.f254917a.findViewById(com.tencent.mm.R.id.nge);
        }
        U6.f254919c.setOnClickListener(new yw3.t0(this));
        em.x2 U62 = U6();
        if (U62.f254923g == null) {
            U62.f254923g = (android.widget.Button) U62.f254917a.findViewById(com.tencent.mm.R.id.ngd);
        }
        U62.f254923g.setOnClickListener(new yw3.v0(this));
        em.x2 U63 = U6();
        if (U63.f254921e == null) {
            U63.f254921e = (android.widget.Button) U63.f254917a.findViewById(com.tencent.mm.R.id.ngu);
        }
        U63.f254921e.setOnClickListener(new yw3.w0(this));
        em.x2 U64 = U6();
        if (U64.f254920d == null) {
            U64.f254920d = (android.widget.Button) U64.f254917a.findViewById(com.tencent.mm.R.id.f487093nh1);
        }
        U64.f254920d.setOnClickListener(new yw3.x0(this));
        em.x2 U65 = U6();
        if (U65.f254918b == null) {
            U65.f254918b = (android.widget.Button) U65.f254917a.findViewById(com.tencent.mm.R.id.ngg);
        }
        U65.f254918b.setOnClickListener(new yw3.y0(this));
        em.x2 U66 = U6();
        if (U66.f254924h == null) {
            U66.f254924h = (android.widget.Button) U66.f254917a.findViewById(com.tencent.mm.R.id.ngs);
        }
        U66.f254924h.setOnClickListener(new yw3.z0(this));
        em.x2 U67 = U6();
        if (U67.f254922f == null) {
            U67.f254922f = (android.widget.Button) U67.f254917a.findViewById(com.tencent.mm.R.id.dbc);
        }
        U67.f254922f.setOnClickListener(new yw3.b1(this));
    }
}
