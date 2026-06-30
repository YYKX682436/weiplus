package wu;

/* loaded from: classes9.dex */
public final class n1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = (com.tencent.mm.plugin.ting.widget.MusicView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (musicView == null) {
            return;
        }
        hu.f fVar = this.f449610e;
        java.lang.String d17 = vu.a.d(item, fVar.q(), fVar.n(), fVar.p());
        s15.h hVar = item.f284997e;
        kotlin.jvm.internal.o.g(hVar, "<this>");
        v05.b bVar = new v05.b();
        java.lang.String U = hVar.U();
        int i19 = bVar.f368365d;
        bVar.set(i19 + 9, U);
        java.lang.String S = hVar.S();
        int i27 = bVar.f432315e;
        bVar.set(i27 + 2, S);
        bVar.set(i27 + 0, hVar.T());
        bVar.set(i27 + 3, hVar.T());
        bVar.set(i27 + 46, hVar.J());
        bVar.set(i27 + 47, hVar.K());
        int i28 = hVar.f303422d;
        bVar.set(i19 + 2, hVar.getString(i28 + 0));
        bVar.set(i19 + 3, hVar.getString(i28 + 1));
        bVar.set(i27 + 10, 3);
        bVar.set(i27 + 14, hVar.getString(i28 + 12));
        bVar.set(i19 + 0, hVar.getAppId());
        int i29 = i28 + 2;
        if (hVar.getInteger(i29) == 32) {
            bVar.set(i19 + 6, 92);
        } else if (hVar.getInteger(i29) == 21) {
            bVar.set(i19 + 6, 76);
        }
        l15.c cVar = new l15.c();
        cVar.q(bVar);
        ff0.y yVar = (ff0.y) i95.n0.c(ff0.y.class);
        v05.b k17 = cVar.k();
        ((r35.g4) yVar).getClass();
        musicView.c(r35.f4.a(d17, k17));
        musicView.setOnClickListener(new wu.m1(this, item));
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        q(view, item);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = new com.tencent.mm.plugin.ting.widget.MusicView(context);
        musicView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(musicView, i65.a.h(containerView.getContext(), com.tencent.mm.R.dimen.amc), -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r38, hu.b r39) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.n1.q(android.view.View, hu.b):void");
    }
}
