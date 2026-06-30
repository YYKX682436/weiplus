package za3;

/* loaded from: classes15.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMHorList f470902a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f470903b;

    /* renamed from: c, reason: collision with root package name */
    public za3.a0 f470904c;

    /* renamed from: d, reason: collision with root package name */
    public int f470905d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f470906e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public za3.d0 f470907f = null;

    public e0(android.content.Context context, android.view.View view, java.lang.String str) {
        this.f470903b = context;
        this.f470902a = (com.tencent.mm.ui.base.MMHorList) view;
        java.util.LinkedList<java.lang.String> b17 = va3.j0.Ui().b(str);
        b17.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str2 : b17) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                arrayList.add(new za3.c0(this, str2));
                arrayList2.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            za3.c0 c0Var = (za3.c0) it.next();
            if (c0Var.f470896b) {
                c0Var.b();
            }
        }
        this.f470905d = i65.a.b(this.f470903b, 60);
        com.tencent.mm.ui.base.MMHorList mMHorList = this.f470902a;
        mMHorList.setOverScrollEnabled(true);
        mMHorList.setItemWidth(this.f470905d);
        mMHorList.setCenterInParent(true);
        mMHorList.setOnItemClickListener(new za3.y(this));
        za3.a0 a0Var = new za3.a0(this, arrayList);
        this.f470904c = a0Var;
        mMHorList.setAdapter((android.widget.ListAdapter) a0Var);
        b(arrayList2);
        mMHorList.invalidate();
        this.f470904c.notifyDataSetChanged();
    }

    public void a(java.lang.String str) {
        if (this.f470904c.c(str)) {
            this.f470904c.a(str).b();
            this.f470904c.notifyDataSetChanged();
            com.tencent.mm.ui.base.MMHorList mMHorList = this.f470902a;
            mMHorList.invalidate();
            if (mMHorList.getIsTouching() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            za3.a0 a0Var = this.f470904c;
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = a0Var.f470888d;
                if (i17 >= arrayList.size()) {
                    i17 = -1;
                    break;
                } else if (((za3.c0) arrayList.get(i17)).f470895a.equals(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 != -1) {
                int i18 = this.f470905d * i17;
                int currentPosition = mMHorList.getCurrentPosition();
                if (i18 >= currentPosition) {
                    int i19 = this.f470905d * 3;
                    currentPosition = i18 > currentPosition + i19 ? i18 - i19 : 0;
                }
                this.f470906e.post(new za3.z(this, i17 != 0 ? currentPosition : 0));
            }
        }
    }

    public void b(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2;
        arrayList.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        za3.a0 a0Var = this.f470904c;
        a0Var.getClass();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it = a0Var.f470888d.iterator();
        while (it.hasNext()) {
            arrayList5.add(((za3.c0) it.next()).f470895a);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            if (arrayList5.indexOf(str) == -1) {
                arrayList3.add(str);
            }
        }
        java.util.Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            java.lang.String str2 = (java.lang.String) it7.next();
            if (arrayList.indexOf(str2) == -1) {
                arrayList4.add(str2);
            }
        }
        arrayList3.size();
        arrayList4.size();
        int size = arrayList3.size();
        com.tencent.mm.ui.base.MMHorList mMHorList = this.f470902a;
        if (size > 0) {
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                java.lang.String str3 = (java.lang.String) it8.next();
                if (!this.f470904c.c(str3)) {
                    za3.c0 c0Var = new za3.c0(this, str3);
                    za3.a0 a0Var2 = this.f470904c;
                    a0Var2.f470888d.add(c0Var);
                    a0Var2.notifyDataSetChanged();
                    mMHorList.invalidate();
                }
            }
        }
        if (arrayList4.size() > 0) {
            java.util.Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                java.lang.String str4 = (java.lang.String) it9.next();
                if (this.f470904c.c(str4)) {
                    za3.a0 a0Var3 = this.f470904c;
                    int i17 = 0;
                    while (true) {
                        arrayList2 = a0Var3.f470888d;
                        if (i17 >= arrayList2.size()) {
                            i17 = -1;
                            break;
                        } else if (((za3.c0) arrayList2.get(i17)).f470895a.equals(str4)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    if (i17 != -1) {
                        arrayList2.remove(i17);
                        a0Var3.notifyDataSetChanged();
                    }
                    mMHorList.invalidate();
                }
            }
        }
    }

    public void c() {
        za3.a0 a0Var = this.f470904c;
        java.util.Iterator it = a0Var.f470888d.iterator();
        while (it.hasNext()) {
            ((za3.c0) it.next()).a();
        }
        a0Var.notifyDataSetChanged();
        this.f470902a.invalidate();
    }
}
