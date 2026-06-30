package dr1;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dr1.a f242584a = new dr1.a();

    public final void a(int i17, int i18, long j17, java.lang.String latestDigest) {
        kotlin.jvm.internal.o.g(latestDigest, "latestDigest");
        if (i18 <= 0) {
            return;
        }
        if (!d()) {
            com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", "[bumpGreetHolder] greet box disabled, skip. serviceType=" + i17);
            return;
        }
        hr1.t f17 = f(i17);
        hr1.e c17 = c(i17);
        if (c17.t0()) {
            c17.field_unReadCount += i18;
            c17.field_readStatus = 0;
            c17.field_updateTime = java.lang.Math.max(c17.field_updateTime, j17);
            c17.field_digest = latestDigest;
            f17.replace(c17, true);
            com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", "[bumpGreetHolder] serviceType=" + i17 + " delta=" + i18 + " unReadCount=" + c17.field_unReadCount);
        }
    }

    public final void b(int i17) {
        java.lang.String str = i17 == 5 ? "bizphotofansgreetholder@picfansmsg" : "bizfansgreetholder@bizfansmsg";
        f(i17).m(str, false);
        com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", "[clearHolderRedDot] serviceType=" + i17 + " sessionId=" + str);
    }

    public final hr1.e c(int i17) {
        hr1.e eVar;
        java.lang.String str = i17 == 5 ? "bizphotofansgreetholder@picfansmsg" : "bizfansgreetholder@bizfansmsg";
        hr1.e z07 = i17 == 5 ? yq1.u0.Vi().z0(str) : yq1.u0.Di().z0(str);
        if (z07.t0()) {
            return z07;
        }
        if (!d()) {
            com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", "[getOrCreateHolder] greet box disabled, skip create. serviceType=" + i17);
            return z07;
        }
        if (i17 == 5) {
            nr1.d dVar = nr1.f.f339140e;
            eVar = new hr1.e(nr1.f.f339147o);
        } else {
            hr1.g gVar = hr1.i.f283349e;
            eVar = new hr1.e(hr1.i.f283351g);
        }
        eVar.field_sessionId = str;
        eVar.field_talker = str;
        eVar.field_selfBiz = f242584a.g(i17);
        eVar.field_type = 2;
        eVar.field_placedFlag = 50L;
        eVar.field_unReadCount = 0;
        eVar.field_readStatus = 1;
        if (i17 == 5) {
            yq1.u0.Vi().replace(eVar, true);
        } else {
            yq1.u0.Di().replace(eVar, true);
        }
        com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", "[getOrCreateHolder] created greet holder for serviceType=" + i17);
        return eVar;
    }

    public final boolean d() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_greet_box_enable, 0) == 1;
    }

    public final void e(int i17) {
        if (!d()) {
            com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", "[rebuildGreetHolder] greet box disabled, skip. serviceType=" + i17);
            return;
        }
        hr1.t f17 = f(i17);
        java.lang.String g17 = g(i17);
        int y17 = f17.y(g17);
        hr1.e n17 = f17.n(g17);
        hr1.e c17 = c(i17);
        if (c17.t0()) {
            c17.field_unReadCount = y17;
            c17.field_readStatus = y17 > 0 ? 0 : 1;
            if (n17 != null) {
                c17.field_updateTime = n17.field_updateTime;
                java.lang.String str = n17.field_digest;
                c17.field_digest = str != null ? str : "";
            } else {
                c17.field_digest = "";
                c17.field_updateTime = 0L;
            }
            f17.replace(c17, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[rebuildGreetHolder] serviceType=");
            sb6.append(i17);
            sb6.append(" selfBiz=");
            sb6.append(g17);
            sb6.append(" totalUnread=");
            sb6.append(y17);
            sb6.append(" latestSession=");
            sb6.append(n17 != null ? n17.field_sessionId : null);
            sb6.append(" latestDigest=");
            sb6.append(n17 != null ? n17.field_digest : null);
            sb6.append(" latestUpdateTime=");
            sb6.append(n17 != null ? java.lang.Long.valueOf(n17.field_updateTime) : null);
            sb6.append(" holderDigest=");
            sb6.append(c17.field_digest);
            sb6.append(" holderUpdateTime=");
            sb6.append(c17.field_updateTime);
            com.tencent.mars.xlog.Log.i("BizFans.GreetHolderHelper", sb6.toString());
        }
    }

    public final hr1.t f(int i17) {
        if (i17 == 5) {
            nr1.f Vi = yq1.u0.Vi();
            kotlin.jvm.internal.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
            return Vi;
        }
        hr1.i Di = yq1.u0.Di();
        kotlin.jvm.internal.o.f(Di, "getBizFansConversationStorage(...)");
        return Di;
    }

    public final java.lang.String g(int i17) {
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            return jr1.j.c(((ox.r) d0Var).Bi(2).c());
        }
        rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr2 = tk.s.f419870d;
        return jr1.j.a(((ox.r) d0Var2).Bi(1).c());
    }
}
