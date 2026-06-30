package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ij0 implements ek2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jj0 f112981a;

    public ij0(com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var) {
        this.f112981a = jj0Var;
    }

    @Override // ek2.l0
    public void a(int i17, int i18, java.lang.String str, r45.gm1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var = this.f112981a;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.hj0(jj0Var, resp));
        java.lang.String str2 = jj0Var.f113117p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", musicInfo.song_id:");
        r45.d22 d22Var = jj0Var.f113123v;
        sb6.append(d22Var != null ? dk2.q.e(d22Var) : null);
        sb6.append(" musicInfo.song_name:");
        r45.d22 d22Var2 = jj0Var.f113123v;
        sb6.append(d22Var2 != null ? d22Var2.getString(1) : null);
        sb6.append(" musicInfo.singer_name:");
        r45.d22 d22Var3 = jj0Var.f113123v;
        sb6.append(d22Var3 != null ? d22Var3.getString(2) : null);
        sb6.append(" musicInfo.album_name:");
        r45.d22 d22Var4 = jj0Var.f113123v;
        sb6.append(d22Var4 != null ? d22Var4.getString(3) : null);
        sb6.append(" musicInfo.genreTv:");
        r45.d22 d22Var5 = jj0Var.f113123v;
        sb6.append(d22Var5 != null ? d22Var5.getString(5) : null);
        sb6.append(" musicInfo.public_time:");
        r45.d22 d22Var6 = jj0Var.f113123v;
        sb6.append(d22Var6 != null ? d22Var6.getString(8) : null);
        sb6.append(" musicInfo.album_pic_url:");
        r45.d22 d22Var7 = jj0Var.f113123v;
        sb6.append(d22Var7 != null ? d22Var7.getString(4) : null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
    }
}
