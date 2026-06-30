package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d20 extends ob2.a {

    /* renamed from: u, reason: collision with root package name */
    public int f126621u;

    public d20() {
        super(259200, "视频url过期时长（秒）", null, null, 12, null);
        this.f126621u = -1;
    }

    @Override // lb2.j
    public java.lang.Object r() {
        if (this.f126621u == -1) {
            this.f126621u = ((java.lang.Number) super.r()).intValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderFakeConfig", "KEEP_URL_VALID_TIME=" + this.f126621u);
        }
        return java.lang.Integer.valueOf(this.f126621u);
    }
}
