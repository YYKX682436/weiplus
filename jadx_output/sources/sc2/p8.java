package sc2;

/* loaded from: classes2.dex */
public final class p8 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406152w = "Finder.CarouselCardObserver";

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f406153x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());

    /* renamed from: y, reason: collision with root package name */
    public boolean f406154y;

    public final void G(android.view.View view, xc2.p0 p0Var, java.lang.String str) {
        r45.av avVar;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f406153x;
        java.lang.Object obj = null;
        n3Var.removeCallbacksAndMessages(null);
        boolean z17 = this.f406154y;
        java.lang.String str2 = this.f406152w;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str2, "checkLoopCard: cancel loop isFocus=false, source=" + str);
            return;
        }
        java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.wf6) next).getInteger(2) == 21) {
                obj = next;
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (avVar = (r45.av) wf6Var.getCustom(29)) == null) {
            return;
        }
        if (avVar.getInteger(5) > 0) {
            n3Var.postDelayed(new sc2.e8(view, this, str, avVar, p0Var), avVar.getInteger(5));
        }
        com.tencent.mars.xlog.Log.i(str2, "checkLoopCard: source=" + str + ", carousel_time=" + avVar.getInteger(5));
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406152w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.tencent.mm.plugin.finder.feed.component.FinderJumperCarouselCardObserver$onBindView$1$2] */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed r24, in5.s0 r25, android.view.View r26, xc2.p0 r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.p8.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        this.f406154y = true;
        G(jumpView, infoEx, "onJumpViewFocus");
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        this.f406154y = false;
        this.f406153x.removeCallbacksAndMessages(null);
    }

    @Override // ad2.h
    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.x(jumpView, infoEx);
        this.f406154y = false;
        this.f406153x.removeCallbacksAndMessages(null);
    }
}
