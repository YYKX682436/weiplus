package xc5;

/* loaded from: classes3.dex */
public final class x1 extends lf3.o implements lf3.j {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f453586d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.a4 f453587e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f453588f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f453589g;

    /* renamed from: h, reason: collision with root package name */
    public lf3.i f453590h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f453587e = new com.tencent.mm.ui.tools.a4();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    @Override // lf3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E2(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.x1.E2(android.view.View):void");
    }

    @Override // lf3.j
    public void N3(lf3.i iVar) {
        this.f453590h = iVar;
    }

    @Override // lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.ejd;
    }

    public final java.lang.String V6() {
        mf3.k V6;
        sf3.g e17;
        xc5.a aVar = (xc5.a) U6(xc5.a.class);
        if (aVar == null || (V6 = ((xc5.d) aVar).V6()) == null || (e17 = V6.e()) == null) {
            return null;
        }
        sf3.g b17 = e17.b(sf3.m.f407403e);
        sf3.m mVar = b17.f407391e;
        sf3.m mVar2 = sf3.m.f407402d;
        if (mVar != mVar2) {
            return b17.c();
        }
        sf3.g b18 = e17.b(sf3.m.f407404f, sf3.m.f407406h);
        if (b18.f407391e != mVar2) {
            return b18.c();
        }
        return null;
    }

    public final void W6(android.view.View view, android.view.View view2, yz5.a aVar) {
        view2.animate().setDuration(200L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(0.0f).setListener(new xc5.s1(this)).start();
        view.animate().setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(0.0f).setUpdateListener(new xc5.t1(this)).setListener(new xc5.u1(aVar)).start();
    }

    @Override // lf3.j
    public void d3(float f17) {
        android.view.View view = this.f453586d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        lf3.i iVar = this.f453590h;
        if (iVar != null) {
            ((yh5.e) iVar).V6(f17);
        }
    }

    @Override // lf3.j
    public void m6(android.view.View contentView, int i17, int i18) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        if (this.f453588f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPageAni", "enter: already running");
            return;
        }
        android.view.View view = this.f453586d;
        if (view == null) {
            return;
        }
        this.f453588f = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().setDuration(200L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(1.0f).setListener(null).start();
        contentView.animate().setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(1.0f).setListener(new xc5.r1(this)).start();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.tzq);
        if (findViewById == null) {
            return false;
        }
        E2(findViewById);
        return true;
    }

    @Override // lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f453586d = contentView.findViewById(com.tencent.mm.R.id.ght);
    }
}
