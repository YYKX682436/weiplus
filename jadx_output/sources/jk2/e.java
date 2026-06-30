package jk2;

/* loaded from: classes3.dex */
public final class e extends jk2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jk2.a plugin, r45.zd2 guideData) {
        super(plugin, guideData);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(guideData, "guideData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        if ((r0 != null && r0.r2()) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // jk2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jk2.e.a():boolean");
    }

    @Override // jk2.j
    public java.lang.String e() {
        return "FollowGuide";
    }

    @Override // jk2.j
    public void i() {
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ((df2.wv) this.f300069a).f231723a.f291099e;
        qo0.c liveStatus = ubVar != null ? ubVar.getLiveStatus() : null;
        if (liveStatus != null) {
            liveStatus.statusChange(qo0.b.D4, null);
        }
    }
}
