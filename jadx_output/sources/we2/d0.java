package we2;

/* loaded from: classes3.dex */
public final class d0 extends we2.x {
    public d0(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        jz5.f0 f0Var;
        r45.i82 i82Var;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        boolean z17 = false;
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var == null) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.w("WishBannerInterceptor", "checkLiveClose return by curLiveData == null");
        } else {
            r45.nw1 nw1Var = (r45.nw1) r71Var.getCustom(3);
            if (nw1Var == null || (i82Var = (r45.i82) nw1Var.getCustom(48)) == null) {
                f0Var = null;
            } else {
                com.tencent.mars.xlog.Log.i("WishBannerInterceptor", "checkWishBanner enable_flag: " + i82Var.getBoolean(0) + ", cur: " + i82Var.getLong(2) + " target: " + i82Var.getLong(1) + " size " + i82Var.getList(5).size() + "} wishId: " + i82Var.getString(6));
                ((mm2.f7) eVar.a(mm2.f7.class)).f329058f.postValue(i82Var);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                ((mm2.f7) eVar.a(mm2.f7.class)).f329058f.postValue(new r45.i82());
            }
            z17 = true;
        }
        return !z17;
    }
}
