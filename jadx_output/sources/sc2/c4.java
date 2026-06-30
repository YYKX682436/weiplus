package sc2;

/* loaded from: classes2.dex */
public final class c4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405808w = "FeedJumperEnhanceBubbleObserver";

    public final int G(r45.ay0 ay0Var) {
        java.lang.Object m521constructorimpl;
        java.lang.String string = ay0Var != null ? com.tencent.mm.ui.bk.C() ? ay0Var.getString(1) : ay0Var.getString(0) : null;
        if (string != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(android.graphics.Color.parseColor(string)));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Integer num = (java.lang.Integer) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405808w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        java.lang.String str;
        java.lang.Object obj;
        r45.sk0 sk0Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 32) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var != null && (sk0Var = (r45.sk0) wf6Var.getCustom(41)) != null) {
            str = sk0Var.getString(2);
        }
        return !com.tencent.mm.sdk.platformtools.t8.K0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed r21, in5.s0 r22, android.view.View r23, xc2.p0 r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.c4.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }
}
