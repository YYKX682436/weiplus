package ol4;

/* loaded from: classes11.dex */
public final class c implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346151d;

    public c(ol4.q qVar) {
        this.f346151d = qVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public final void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        ll4.a aVar;
        ol4.q qVar = this.f346151d;
        if (i17 < 1000) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
            bw5.lp0 lp0Var = qVar.f346183e;
            if (lp0Var == null) {
                kotlin.jvm.internal.o.o("mPlayingItem");
                throw null;
            }
            sb6.append(lp0Var.c().f27457i);
            sb6.append(", isPrepared: ");
            bw5.lp0 lp0Var2 = qVar.f346183e;
            if (lp0Var2 == null) {
                kotlin.jvm.internal.o.o("mPlayingItem");
                throw null;
            }
            sb6.append(lp0Var2.c().A);
            sb6.append(", title: ");
            bw5.lp0 lp0Var3 = qVar.f346183e;
            if (lp0Var3 == null) {
                kotlin.jvm.internal.o.o("mPlayingItem");
                throw null;
            }
            sb6.append(lp0Var3.d().getTitle());
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i(qVar.f346197s, "OnInfoListener, what:" + i17 + ", arg1:" + j17 + ", arg2:" + j18 + ", extraObject:" + obj + ' ' + sb7);
        }
        if (i17 != 200) {
            if (i17 == 201 && (aVar = qVar.f346182d) != null) {
                ll4.a.a(aVar, 8, null, 2, null);
                return;
            }
            return;
        }
        ll4.a aVar2 = qVar.f346182d;
        if (aVar2 != null) {
            ll4.a.a(aVar2, 7, null, 2, null);
        }
    }
}
