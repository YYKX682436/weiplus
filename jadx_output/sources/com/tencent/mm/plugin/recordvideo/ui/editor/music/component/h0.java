package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public class h0 extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b {

    /* renamed from: h, reason: collision with root package name */
    public final int[] f156234h;

    /* renamed from: i, reason: collision with root package name */
    public final int f156235i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f156236m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f156237n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f156238o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment f156239p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f156240q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.viewpager.widget.ViewPager.OnPageChangeListener f156241r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, int[] tabTypeArray, int i17, yz5.l fragmentCreator) {
        super(parent, status);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(tabTypeArray, "tabTypeArray");
        kotlin.jvm.internal.o.g(fragmentCreator, "fragmentCreator");
        this.f156234h = tabTypeArray;
        this.f156235i = i17;
        this.f156236m = fragmentCreator;
        this.f156237n = "MicroMsg.MusicPagerComponent[" + hashCode() + ']';
        this.f156238o = new java.util.ArrayList();
        this.f156240q = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f0(this, parent));
        this.f156241r = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.g0(this, status);
    }

    @Override // fv3.b
    public void m() {
        java.util.ArrayList arrayList;
        int[] tabTypeArray = this.f156234h;
        kotlin.jvm.internal.o.g(tabTypeArray, "tabTypeArray");
        int length = tabTypeArray.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f156238o;
            if (i17 >= length) {
                break;
            }
            int i27 = tabTypeArray[i17];
            int i28 = i18 + 1;
            com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment musicPickerDataFragment = (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment) this.f156236m.invoke(java.lang.Integer.valueOf(i27));
            com.tencent.mars.xlog.Log.i(this.f156237n, "initViewPager index:" + i18 + " type:" + i27 + " fragment:" + musicPickerDataFragment);
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i27), musicPickerDataFragment));
            if (i27 == this.f156235i) {
                this.f156239p = musicPickerDataFragment;
                i19 = i18;
            }
            i17++;
            i18 = i28;
        }
        androidx.viewpager.widget.ViewPager q17 = q();
        if (q17 != null) {
            android.content.Context context = this.f156168g;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.fragment.app.FragmentManager supportFragmentManager = ((androidx.appcompat.app.AppCompatActivity) context).getSupportFragmentManager();
            kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment) ((jz5.l) it.next()).f302834e);
            }
            q17.setAdapter(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l0(supportFragmentManager, arrayList2));
        }
        androidx.viewpager.widget.ViewPager q18 = q();
        if (q18 != null) {
            q18.setOffscreenPageLimit(tabTypeArray.length - 1);
        }
        androidx.viewpager.widget.ViewPager q19 = q();
        if (q19 != null) {
            q19.addOnPageChangeListener(this.f156241r);
        }
        if (i19 >= 0) {
            q().setCurrentItem(i19);
        }
    }

    public final androidx.fragment.app.Fragment o(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f156238o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.l) obj).f302833d).intValue() == i17) {
                break;
            }
        }
        jz5.l lVar = (jz5.l) obj;
        if (lVar != null) {
            return (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment) lVar.f302834e;
        }
        return null;
    }

    public final androidx.viewpager.widget.ViewPager q() {
        return (androidx.viewpager.widget.ViewPager) ((jz5.n) this.f156240q).getValue();
    }

    public void r(int i17) {
    }
}
