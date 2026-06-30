package com.tencent.mm.plugin.welab.ui;

@gm0.a2
/* loaded from: classes15.dex */
public class WelabMainUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f188099q = new zy4.j();

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f188101e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f188102f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f188103g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f188104h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f188105i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f188106m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f188107n;

    /* renamed from: d, reason: collision with root package name */
    public boolean f188100d = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Comparator f188108o = new zy4.k(this);

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f188109p = new zy4.l(this);

    public final void T6(yy4.a aVar, android.widget.LinearLayout linearLayout) {
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) getLayoutInflater().inflate(com.tencent.mm.R.layout.d_9, (android.view.ViewGroup) linearLayout, false);
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout2.findViewById(com.tencent.mm.R.id.f487342od0);
        android.widget.ImageView imageView2 = (android.widget.ImageView) linearLayout2.findViewById(com.tencent.mm.R.id.a19);
        android.widget.TextView textView = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.obc);
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.ns9);
        android.widget.TextView textView3 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.oq7);
        if (az4.h.f16179c.a(aVar)) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            rn3.i.Di().k(new zy4.m(imageView, textView3, aVar, linearLayout2));
        }
        n11.a b17 = n11.a.b();
        java.lang.String u07 = aVar.u0("field_ThumbUrl");
        sy4.m mVar = sy4.m.f413884c;
        b17.h(u07, imageView2, mVar.f413886b);
        textView.setText(mVar.a(aVar));
        textView2.setText(aVar.u0("field_Desc"));
        linearLayout2.setTag(aVar);
        linearLayout2.setOnClickListener(this.f188109p);
        linearLayout.addView(linearLayout2);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d_a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.l_a);
        setTitleDividerColor(com.tencent.mm.R.color.aaw);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aav));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        this.f188101e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ki9);
        this.f188103g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ki_);
        this.f188102f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.njd);
        this.f188104h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.nje);
        this.f188105i = findViewById(com.tencent.mm.R.id.l5f);
        this.f188106m = findViewById(com.tencent.mm.R.id.kbt);
        this.f188105i.setOnClickListener(new zy4.h(this));
        setBackBtn(new zy4.i(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setIsDarkActionbarBg(true);
        hideActionbarLine();
        if (getIntent() != null) {
            this.f188100d = getIntent().getIntExtra("para_from_with_red_point", 0) == 1;
            this.f188107n = getIntent().getStringArrayListExtra("key_exclude_apps");
        }
        initView();
        az4.h hVar = az4.h.f16179c;
        hVar.getClass();
        com.tencent.mm.sdk.platformtools.x2.d().edit().putBoolean("key_has_enter_welab", true).commit();
        hVar.c();
        sy4.r.a("", 1, this.f188100d);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f188103g.removeAllViews();
        this.f188104h.removeAllViews();
        java.util.List d17 = sy4.m.f413884c.d();
        java.util.ArrayList arrayList = (java.util.ArrayList) d17;
        boolean isEmpty = arrayList.isEmpty();
        java.util.Comparator comparator = this.f188108o;
        if (isEmpty) {
            this.f188101e.setVisibility(8);
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yy4.a aVar = (yy4.a) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_LabsAppId) && this.f188107n.contains(aVar.field_LabsAppId)) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                this.f188101e.setVisibility(8);
            } else {
                this.f188101e.setVisibility(0);
                java.util.Collections.sort(d17, comparator);
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    T6((yy4.a) it6.next(), this.f188103g);
                }
                this.f188103g.getChildCount();
            }
        }
        java.util.List y07 = sy4.m.f413884c.c().y0();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) y07;
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            yy4.a aVar2 = (yy4.a) it7.next();
            long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) - aVar2.field_endtime;
            sy4.m mVar = sy4.m.f413884c;
            if (currentTimeMillis >= 2592000 || "labs1de6f3".equals(aVar2.field_LabsAppId)) {
                it7.remove();
                mVar.c().delete(aVar2, new java.lang.String[0]);
            } else if (aVar2.w0() && aVar2.field_Switch != 3) {
                aVar2.field_Switch = 3;
                mVar.c().update(aVar2, new java.lang.String[0]);
            } else if (aVar2.field_Switch != 3) {
                it7.remove();
            }
        }
        com.tencent.mars.xlog.Log.i("WelabMgr", "stopped lab %s", y07.toString());
        if (arrayList2.isEmpty()) {
            this.f188102f.setVisibility(8);
        } else {
            this.f188102f.setVisibility(0);
            java.util.Collections.sort(y07, comparator);
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                T6((yy4.a) it8.next(), this.f188104h);
            }
            this.f188104h.getChildCount();
        }
        if (this.f188101e.getVisibility() == 0 || this.f188102f.getVisibility() == 0) {
            android.view.View view = this.f188106m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f188106m;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
