package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class SnsLabelContactListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f206561d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.contact.mb f206562e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f206563f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f206564g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f206565h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f206566i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.contact.SnsLabelContactListUI.ReturnSnsObjectDetailEventListener f206567m;

    /* loaded from: classes4.dex */
    public class ReturnSnsObjectDetailEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent> {
        public ReturnSnsObjectDetailEventListener() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = -1656522510;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent) {
            com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent2 = returnSnsObjectDetailEvent;
            if (!(returnSnsObjectDetailEvent2 instanceof com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent)) {
                return false;
            }
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = returnSnsObjectDetailEvent2.f54711g.f6185a;
            com.tencent.mm.ui.contact.SnsLabelContactListUI snsLabelContactListUI = com.tencent.mm.ui.contact.SnsLabelContactListUI.this;
            snsLabelContactListUI.f206566i = snsObject;
            if (snsObject != null) {
                snsLabelContactListUI.T6();
                snsLabelContactListUI.initView();
            } else {
                snsLabelContactListUI.initView();
                db5.e1.t(snsLabelContactListUI, snsLabelContactListUI.getString(com.tencent.mm.R.string.f493213jb4), "", new com.tencent.mm.ui.contact.nb(this));
            }
            return true;
        }
    }

    public final void T6() {
        int i17 = this.f206566i.ExtFlag;
        if ((i17 & 1) == 0) {
            return;
        }
        int i18 = i17 & 2;
        java.util.ArrayList arrayList = this.f206563f;
        if (i18 > 0) {
            this.f206565h = getString(com.tencent.mm.R.string.f493210jb1);
            java.util.Iterator<r45.du5> it = this.f206566i.BlackList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f372756d);
            }
            return;
        }
        if ((i17 & 4) > 0) {
            this.f206565h = getString(com.tencent.mm.R.string.f493211jb2);
            java.util.Iterator<r45.du5> it6 = this.f206566i.GroupUser.iterator();
            while (it6.hasNext()) {
                arrayList.add(it6.next().f372756d);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487985db;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(this.f206565h);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f206561d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484222df4)).setVisibility(8);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482748mx);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f206561d.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        ((android.view.View) this.f206561d.getParent()).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.ui.contact.kb(this));
        showOptionMenu(false);
        java.util.ArrayList arrayList3 = this.f206563f;
        if (arrayList3 == null || arrayList3.size() == 0) {
            return;
        }
        com.tencent.mm.ui.contact.mb mbVar = new com.tencent.mm.ui.contact.mb(this, arrayList3);
        this.f206562e = mbVar;
        this.f206561d.setAdapter((android.widget.ListAdapter) mbVar);
        this.f206561d.setVisibility(0);
        this.f206561d.setOnItemClickListener(new com.tencent.mm.ui.contact.lb(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<r45.du5> linkedList;
        java.util.LinkedList<r45.du5> linkedList2;
        super.onCreate(bundle);
        com.tencent.mm.ui.contact.SnsLabelContactListUI.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener = new com.tencent.mm.ui.contact.SnsLabelContactListUI.ReturnSnsObjectDetailEventListener();
        this.f206567m = returnSnsObjectDetailEventListener;
        returnSnsObjectDetailEventListener.alive();
        int intExtra = getIntent().getIntExtra("sns_label_sns_info", -1);
        this.f206564g = intExtra;
        if (intExtra == -1) {
            finish();
            return;
        }
        com.tencent.mm.autogen.events.GetSnsObjectDetailEvent getSnsObjectDetailEvent = new com.tencent.mm.autogen.events.GetSnsObjectDetailEvent();
        getSnsObjectDetailEvent.f54410g.f7247a = this.f206564g;
        getSnsObjectDetailEvent.e();
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = getSnsObjectDetailEvent.f54411h.f7347a;
        this.f206566i = snsObject;
        if (snsObject != null) {
            if (snsObject.ExtFlag != 3 || (linkedList2 = snsObject.BlackList) == null || linkedList2.size() <= 0) {
                com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f206566i;
                if (snsObject2.ExtFlag != 5 || (linkedList = snsObject2.GroupUser) == null || linkedList.size() <= 0) {
                    return;
                }
            }
            T6();
            initView();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f206567m.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.contact.mb mbVar = this.f206562e;
        if (mbVar != null) {
            mbVar.notifyDataSetChanged();
        }
    }
}
