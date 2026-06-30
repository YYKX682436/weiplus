package th5;

/* loaded from: classes12.dex */
public final class d extends rf3.u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mf3.p apiCenter) {
        super(apiCenter);
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f395009v = new th5.c(this);
    }

    @Override // rf3.u, sf3.l
    public void f(sf3.k state, sf3.g param, mf3.w level) {
        mf3.k kVar;
        mf3.k kVar2;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(level, "level");
        mf3.s sVar = this.f326110m;
        java.lang.String str = null;
        java.lang.String id6 = (sVar == null || (kVar2 = sVar.f326117a) == null) ? null : kVar2.getId();
        java.lang.String str2 = param.f407388b;
        if (!kotlin.jvm.internal.o.b(str2, id6)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged apply abort. callback id: ");
            sb6.append(str2);
            sb6.append(", bind id: ");
            mf3.s sVar2 = this.f326110m;
            if (sVar2 != null && (kVar = sVar2.f326117a) != null) {
                str = kVar.getId();
            }
            sb6.append(str);
            P(sb6.toString(), new java.lang.Object[0]);
            return;
        }
        Q("onImageStateChanged: id:" + str2 + " path:" + param.c() + ", state: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            V(param);
            return;
        }
        if (ordinal == 2) {
            if (level != mf3.w.f326129e) {
                V(param);
                return;
            }
            return;
        }
        if (ordinal == 3) {
            U(param);
            Q("onImageParserSuccess, start preScan: " + param.c(), new java.lang.Object[0]);
            Y(param.c());
            return;
        }
        if (ordinal == 4) {
            java.lang.String string = K().getString(com.tencent.mm.R.string.p_u);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            W(string, param);
        } else {
            if (ordinal == 5) {
                U(param);
                return;
            }
            java.lang.String string2 = K().getString(com.tencent.mm.R.string.fjg);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            rf3.u.X(this, string2, null, 2, null);
        }
    }

    @Override // rf3.u, ml5.g
    public void onScroll(float f17, float f18) {
        com.tencent.mm.plugin.media.view.SampleHDImageView c17 = S().c();
        float translationX = c17.getTranslationX() + f17;
        float translationY = c17.getTranslationY() + f18;
        c17.setTranslationX(0.0f);
        c17.setTranslationY(0.0f);
        jz5.l B = c17.B(translationX, translationY);
        c17.setTranslationX(c17.getTranslationX() + ((java.lang.Number) B.f302833d).floatValue());
        c17.setTranslationY(c17.getTranslationY() + ((java.lang.Number) B.f302834e).floatValue());
    }
}
