package sc2;

/* loaded from: classes2.dex */
public final class b4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405780w = "Finder.FeedAdCommonJumperObserver";

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405780w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 2) {
                break;
            }
        }
        java.lang.String r17 = xc2.y2.f453343a.r((r45.wf6) obj);
        kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
        return !com.tencent.mm.sdk.platformtools.t8.K0(l(r17, r0.s(r3, r6)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0451  */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object] */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed r22, in5.s0 r23, android.view.View r24, xc2.p0 r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.b4.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }
}
