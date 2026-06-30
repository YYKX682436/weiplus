package com.tencent.mm.ui.transmit;

/* loaded from: classes11.dex */
public class MMCreateChatroomUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f210950J = 0;
    public java.util.List C;
    public boolean D;
    public int E;
    public dk5.s0 F;
    public dk5.u0 G;
    public boolean H;
    public boolean I;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            dk5.s0 s0Var = this.F;
            s0Var.f234868q.remove(str);
            java.util.Iterator it = ((java.util.ArrayList) s0Var.f234867p).iterator();
            while (it.hasNext()) {
                dk5.r0 r0Var = (dk5.r0) it.next();
                if (str.equals(r0Var.f234844g)) {
                    r0Var.f234844g = null;
                }
            }
            s0Var.notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        if (this.F == null) {
            this.F = new dk5.s0(this, null, true, true, this.C, this.A);
        }
        return this.F;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        if (this.G == null) {
            this.G = new dk5.u0(this, this.A);
        }
        return this.G;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getString(com.tencent.mm.R.string.iga);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        dk5.s0 s0Var = this.F;
        dk5.u0 u0Var = this.G;
        p13.v vVar = u0Var.f234925q;
        java.lang.String str = u0Var.f234924p;
        s0Var.getClass();
        if (vVar.f351160e.size() != 1 || !((p13.y) vVar.f351160e.get(0)).f351187e.equals("no_result\u200b")) {
            dk5.r0 r0Var = new dk5.r0(s0Var, null);
            r0Var.f234843f = vVar.f351160e;
            r0Var.f234839b = vVar.f351159d;
            r0Var.f234838a = str;
            ((java.util.ArrayList) s0Var.f234867p).add(r0Var);
            com.tencent.mm.ui.contact.l4 l4Var = s0Var.f207076d;
            int headerViewsCount = i17 - l4Var.O3().getHeaderViewsCount();
            if (headerViewsCount >= 3) {
                vVar.f351160e.add(0, (p13.y) vVar.f351160e.remove(headerViewsCount));
                i17 = l4Var.O3().getHeaderViewsCount();
            }
            s0Var.v();
            l4Var.O3().post(new dk5.q0(s0Var, r0Var.f234840c + i17 + 1));
        }
        Y6();
        X6();
        hideVKB();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        dk5.s0 s0Var = this.F;
        for (java.lang.String str : s0Var.f234865n) {
            p13.u uVar = new p13.u();
            uVar.f351152n = s0Var.f234869r;
            uVar.f351151m = s0Var.f234870s;
            uVar.f351141c = str;
            uVar.f351150l = r13.b.f368602d;
            uVar.f351145g = new int[]{131072};
            uVar.f351148j.add("filehelper");
            uVar.f351148j.add(c01.z1.r());
            uVar.f351148j.addAll(com.tencent.mm.ui.contact.i5.c());
            p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            s0Var.f234866o = arrayList;
            arrayList.add(sj6);
        }
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new dk5.v0(this), null, com.tencent.mm.ui.fb.GREEN);
        x7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.C = getIntent().getStringArrayListExtra("query_phrase_list");
        this.D = getIntent().getBooleanExtra("go_to_chatroom_direct", false);
        this.E = getIntent().getIntExtra("scene_from", 0);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean k7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.F.k();
        if (!this.H && this.E == 3) {
            java.util.Set set = com.tencent.mm.plugin.fts.ui.x2.f138375a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13970, 0);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        dk5.r0 r0Var;
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        dk5.s0 s0Var = this.F;
        java.lang.String str = ((com.tencent.mm.ui.contact.item.u) dVar).C.f351187e;
        int i17 = dVar.f206833b;
        if (!s0Var.f234868q.contains(str)) {
            return false;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) s0Var.f234867p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                r0Var = null;
                break;
            }
            r0Var = (dk5.r0) arrayList.get(size);
            if (i17 >= r0Var.f234840c) {
                break;
            }
        }
        return (r0Var == null || str.equals(r0Var.f234844g)) ? false : true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        dk5.s0 s0Var = this.F;
        return s0Var.f234868q.contains(((com.tencent.mm.ui.contact.item.u) dVar).C.f351187e);
    }

    public final void w7(com.tencent.mm.roomsdk.model.factory.a aVar) {
        aVar.f192248d = new dk5.w0(this, aVar);
        aVar.c(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492388gb2), true, true, new dk5.x0(this, aVar));
    }

    public void x7() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.F.t();
        if (arrayList.size() <= 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1) + "(" + arrayList.size() + ")");
        if (arrayList.size() > 1) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }

    public final java.util.List y7(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!gm0.j1.a() || list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        return linkedList;
    }
}
